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
	import { tableStore } from "@/DataStore/table.js"
	import { getDataByPage } from "@/API/dataSQL";
	export default {
		name: 'TablePage',
		data() {
			return {
				heightTable: parseInt(window.innerHeight || document.documentElement.clientHeight || document.body.clientHeight) * 19 / 20,
				heightPager: parseInt(window.innerHeight || document.documentElement.clientHeight || document.body.clientHeight) * 1 / 20,
				table: tableStore,
				pageInfo: {
					current: 1,
					total: 1,
					pageSize: 30,
					pageSizeOpts: [30, 60, 90, 120]
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
					this.table.tableCol = rsp.columns
					this.table.tableData = rsp.data
					// this.$Notice.info({ title: "Succeed!", desc: "Get All Data" })
					// 存入sessionStorage
					sessionStorage.setItem("tableData", JSON.stringify(this.table))
				}, () => {
					this.$Notice.error({ title: "Failed!", desc: "Get All Data" })
				})
			},
			pageChangeListener(current) {
				this.pageInfo.current = current
				this.getData()
			},
			pageSizeChangeListener(pageSize) {
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
