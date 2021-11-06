<template>
	<section class="cardOuterStyle">
		<Card v-for="(value,key) in allDataObj" :key="key" class="cardStyle">
			<div :id="'chart#'+key" class="card"></div>
		</Card>
	</section>
</template>

<script>
	import { getAllData } from "@/API/dataSQL";
	export default {
		name: 'ChartPage',
		data() {
			return {
				allData: "",
				allDataDict: new Map(),
				allDataObj: {}
			}
		},
		mounted() {
			this.getData();
		},
		methods: {
			getData() {
				// API请求
				getAllData().then(rsp => {
					// 获取所有数据
					this.allData.tableCol = rsp.columns
					this.allData.tableData = rsp.data
					// 变换数据格式
					this.changeDataFormat()
					// 画图
					setTimeout(this.drawLine, 1000);
				}, () => {
					this.allData = JSON.parse(sessionStorage.getItem("tableData"));
					this.changeDataFormat()
					// 画图
					setTimeout(this.drawLine, 1000);
					this.$Notice.error({ title: "Failed!", desc: "Get All Data" })
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
		height: 100vh;
		overflow: auto;
	}
</style>
