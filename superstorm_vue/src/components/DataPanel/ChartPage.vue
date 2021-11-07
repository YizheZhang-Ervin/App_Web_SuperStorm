<template>
	<div>
		<section class="cardOuterStyle" :style="{height:heightChart}">
			<Card v-for="(value,key) in allDataObj" :key="key" class="cardStyle">
				<div :id="'chart#'+key" class="card"></div>
			</Card>
		</section>
		<Page :total="pageInfo.total" :current="pageInfo.current" :page-size="pageInfo.pageSize"
			:page-size-opts="pageInfo.pageSizeOpts" show-sizer show-elevator show-total
			:height="heightPager" @on-change="pageChangeListener"
			@on-page-size-change="pageSizeChangeListener" class="pageStyle" />
	</div>
</template>

<script>
	import { getDataByPage } from "@/API/dataSQL";
	export default {
		name: 'ChartPage',
		data() {
			return {
				heightChart: parseInt(window.innerHeight || document.documentElement.clientHeight || document.body.clientHeight) * 19 / 20 + "px",
				heightPager: parseInt(window.innerHeight || document.documentElement.clientHeight || document.body.clientHeight) * 1 / 20,
				allData: { tableCol: this.$store.state.tableStore.tableCol, tableData: this.$store.state.tableStore.tableData },
				allDataDict: new Map(),
				allDataObj: {},
				pageInfo: {
					current: this.$store.state.pageStore.current,
					total: this.$store.state.pageStore.total,
					pageSize: this.$store.state.pageStore.pageSize,
					pageSizeOpts: this.$store.state.pageStore.pageSizeOpts
				}
			}
		},
		mounted() {
			this.getData();
		},
		methods: {
			getData() {
				// API请求
				getDataByPage(this.pageInfo).then(rsp => {
					if (rsp.status === "200" || rsp.status === 200) {
						this.$store.commit("pageStore/setPageTotal", rsp.data.total)
						// this.$store.commit("tableStore/setTableCol", rsp.col)
						this.$store.commit("tableStore/setTableData", rsp.data.list)
						this.table = { tableCol: this.$store.state.tableStore.tableCol, tableData: this.$store.state.tableStore.tableData }
						// 变换数据格式
						this.changeDataFormat()
						// 画图
						setTimeout(this.drawLine, 1000);
						// 成功提示
						this.$Notice.info({ title: "Succeed!", desc: rsp.msg })
					} else {
						this.$Notice.error({ title: "Failed!", desc: rsp.msg })
					}
				}, () => {
					this.changeDataFormat()
					setTimeout(this.drawLine, 1000);
					this.$Notice.error({ title: "Failed!", desc: "Request error" })
				})
			},
			changeDataFormat() {
				// 一个key一个list放入dict中
				Object.keys(this.allData.tableData[0]).forEach(key => {
					let temp = this.allData.tableData.map(item => item[key])
					this.allDataDict.set(key, temp)
				})
				this.allDataObj = [...this.allDataDict.entries()].reduce((obj, [key, value]) => (obj[key] = value, obj), {})
			},
			drawLine() {
				for (let key of this.allDataDict.keys()) {
					// 基于准备好的dom，初始化echarts实例
					let myChart = this.$echarts.init(document.getElementById(`chart#${key}`))
					let data = this.allDataDict.get(key)
					// 绘制图表
					myChart.setOption({
						title: { text: `${key}` },
						xAxis: {
							type: 'category',
							// splitLine: {
							// 	show: false
							// }
						},
						yAxis: {
							type: 'value',
						},
						series: [
							{
								name: 'Data',
								type: 'line',
								showSymbol: true,
								data: data
							}
						]
					});
				}

			},
			pageChangeListener(current) {
				this.$store.commit("pageStore/setPageCurrent", current)
				this.pageInfo.current = current
				this.getData()
			},
			pageSizeChangeListener(pageSize) {
				this.$store.commit("pageStore/setPageSize", pageSize)
				this.pageInfo.pageSize = pageSize
				this.getData()
			}
		}

	}
</script>

<style scoped>
	.card {
		height: 300px;
		width: 300px;
	}
	.cardStyle {
		width: 300px;
	}
	.cardOuterStyle {
		display: flex;
		justify-content: space-around;
		flex-wrap: wrap;
		overflow-y: auto;
		overflow-x: hidden;
	}
	.pageStyle {
		text-align: right;
	}
</style>
