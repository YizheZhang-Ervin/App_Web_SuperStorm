<template>
	<section>
		<Table stripe border :columns="table.tableCol" :data="table.tableData" class="tableStyle"
			:height="heightTable">
		</Table>
		<Page :total="pageInfo.total" :current="pageInfo.current" :page-size="pageInfo.pageSize"
			:page-size-opts="pageInfo.pageSizeOpts" show-sizer show-elevator show-total
			:height="heightPager" @on-change="pageChangeListener"
			@on-page-size-change="pageSizeChangeListener" class="pageStyle" />
	</section>
</template>

<script>
	import { getDataByPage } from "@/API/dataSQL";
	export default {
		name: 'TablePage',
		data() {
			return {
				heightTable: parseInt(window.innerHeight || document.documentElement.clientHeight || document.body.clientHeight) * 19 / 20,
				heightPager: parseInt(window.innerHeight || document.documentElement.clientHeight || document.body.clientHeight) * 1 / 20,
				table: { tableCol: this.$store.state.tableStore.tableCol, tableData: this.$store.state.tableStore.tableData },
				pageInfo: {
					current: this.$store.state.pageStore.current,
					total: this.$store.state.pageStore.total,
					pageSize: this.$store.state.pageStore.pageSize,
					pageSizeOpts: this.$store.state.pageStore.pageSizeOpts
				}
			}
		},
		mounted() {
			this.getData()
		},
		methods: {
			getData() {
				// API请求
				getDataByPage(this.pageInfo).then(rsp => {
					if (rsp.status === "200" || rsp.status === 200) {
						this.$store.commit("pageStore/setPageTotal", rsp.data.total)
						this.pageInfo.total = this.$store.state.pageStore.total
						// this.$store.commit("tableStore/setTableCol", rsp.col)
						this.$store.commit("tableStore/setTableData", rsp.data.list)
						this.table = { tableCol: this.$store.state.tableStore.tableCol, tableData: this.$store.state.tableStore.tableData }
						// 成功提示
						this.$Notice.info({ title: "Succeed!", desc: rsp.msg })
					} else {
						this.$Notice.error({ title: "Failed!", desc: rsp.msg })
					}
				}, () => {
					this.$Notice.error({ title: "Failed!", desc: "Request error" })
				})
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
	.tableStyle {
		overflow: auto;
	}
	.pageStyle {
		text-align: right;
	}
</style>
