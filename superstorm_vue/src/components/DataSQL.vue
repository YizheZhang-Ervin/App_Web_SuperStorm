<template>
	<Row
		type="flex"
		justify="space-around"
	>
		<!-- 操作 -->
		<Col
			span="4"
			class="part"
		>
		<Button @click="getAllData">重置</Button>
		<Button @click="createData">创建</Button>
		<Button @click="updateData">更新</Button>
		<Button @click="deleteData">删除</Button>
		</Col>
		<!-- 表格 -->
		<Col
			span="19"
			class="part"
		>
		<h1 class="center">Data SQL</h1>
		<Table
			stripe
			border
			:height="table.height"
			:width="table.width"
			:columns="table.tableCol"
			:data="table.tableData"
		></Table>
		<Page
			:total="pageInfo.total"
			:current="pageInfo.current"
			:page-size="pageInfo.pageSize"
			show-sizer
			show-elevator
			show-total
			class="pager"
		/>
		</Col>
	</Row>
</template>

<script>
	import { getData, processData, postData, putData, deleteData } from "../API/dataSQL";
	export default {
		name: 'DataSQL',
		data() {
			return {
				table: {
					height: parseInt(window.innerHeight || document.documentElement.clientHeight || document.body.clientHeight) * 5 / 6,
					tableCol: [
						{
							title: 'Name',
							key: 'name',
							width: 900
						},
						{
							title: 'Age',
							key: 'age',
							width: 300
						},
						{
							title: 'Address',
							key: 'address',
							width: 300
						}
					],
					tableData: [
						{
							name: 'John Brown',
							age: 18,
							address: 'New York No. 1 Lake Park',
							date: '2016-10-03'
						},
						{
							name: 'Jim Green',
							age: 24,
							address: 'London No. 1 Lake Park',
							date: '2016-10-01'
						},
						{
							name: 'Joe Black',
							age: 30,
							address: 'Sydney No. 1 Lake Park',
							date: '2016-10-02'
						},
						{
							name: 'Jon Snow',
							age: 26,
							address: 'Ottawa No. 2 Lake Park',
							date: '2016-10-04'
						},
						{
							name: 'John Brown',
							age: 18,
							address: 'New York No. 1 Lake Park',
							date: '2016-10-03'
						},
						{
							name: 'Jim Green',
							age: 24,
							address: 'London No. 1 Lake Park',
							date: '2016-10-01'
						},
						{
							name: 'Joe Black',
							age: 30,
							address: 'Sydney No. 1 Lake Park',
							date: '2016-10-02'
						},
						{
							name: 'Jon Snow',
							age: 26,
							address: 'Ottawa No. 2 Lake Park',
							date: '2016-10-04'
						},
						{
							name: 'John Brown',
							age: 18,
							address: 'New York No. 1 Lake Park',
							date: '2016-10-03'
						},
						{
							name: 'Jim Green',
							age: 24,
							address: 'London No. 1 Lake Park',
							date: '2016-10-01'
						},
						{
							name: 'Joe Black',
							age: 30,
							address: 'Sydney No. 1 Lake Park',
							date: '2016-10-02'
						},
						{
							name: 'Jon Snow',
							age: 26,
							address: 'Ottawa No. 2 Lake Park',
							date: '2016-10-04'
						},
						{
							name: 'John Brown',
							age: 18,
							address: 'New York No. 1 Lake Park',
							date: '2016-10-03'
						},
						{
							name: 'Jim Green',
							age: 24,
							address: 'London No. 1 Lake Park',
							date: '2016-10-01'
						},
						{
							name: 'Joe Black',
							age: 30,
							address: 'Sydney No. 1 Lake Park',
							date: '2016-10-02'
						},
						{
							name: 'Jon Snow',
							age: 26,
							address: 'Ottawa No. 2 Lake Park',
							date: '2016-10-04'
						},
						{
							name: 'John Brown',
							age: 18,
							address: 'New York No. 1 Lake Park',
							date: '2016-10-03'
						},
						{
							name: 'Jim Green',
							age: 24,
							address: 'London No. 1 Lake Park',
							date: '2016-10-01'
						},
						{
							name: 'Joe Black',
							age: 30,
							address: 'Sydney No. 1 Lake Park',
							date: '2016-10-02'
						},
						{
							name: 'Jon Snow',
							age: 26,
							address: 'Ottawa No. 2 Lake Park',
							date: '2016-10-04'
						},
						{
							name: 'John Brown',
							age: 18,
							address: 'New York No. 1 Lake Park',
							date: '2016-10-03'
						},
						{
							name: 'Jim Green',
							age: 24,
							address: 'London No. 1 Lake Park',
							date: '2016-10-01'
						},
						{
							name: 'Joe Black',
							age: 30,
							address: 'Sydney No. 1 Lake Park',
							date: '2016-10-02'
						},
						{
							name: 'Jon Snow',
							age: 26,
							address: 'Ottawa No. 2 Lake Park',
							date: '2016-10-04'
						},
						{
							name: 'John Brown',
							age: 18,
							address: 'New York No. 1 Lake Park',
							date: '2016-10-03'
						},
						{
							name: 'Jim Green',
							age: 24,
							address: 'London No. 1 Lake Park',
							date: '2016-10-01'
						},
						{
							name: 'Joe Black',
							age: 30,
							address: 'Sydney No. 1 Lake Park',
							date: '2016-10-02'
						},
						{
							name: 'Jon Snow',
							age: 26,
							address: 'Ottawa No. 2 Lake Park',
							date: '2016-10-04'
						}
					],
				},
				pageInfo: {
					current: 1,
					total: 1,
					pageSize: 10
				}
			}
		},
		mounted() {
			this.getAllData()
		},
		methods: {
			processData() {
				let condition = { filter: "", sort: "" }
				processData(condition).then(rsp => {
					console.log(rsp)
				})
			},
			getAllData() {
				getData().then(rsp => {
					this.table.tableCol = rsp.columns
					this.table.tableData = rsp.data
					this.$Notice.info({ title: "Succeed!", desc: "Get All Data" })
				}, () => {
					this.$Notice.error({ title: "Failed!", desc: "Get All Data" })
				})
			},
			createData() {
				let carObj = ""
				postData(carObj).then(rsp => {
					console.log(rsp)
				}, () => {
					this.$Notice.error({ title: "Failed!", desc: "Post Data" })
				})
			},
			updateData() {
				let carId = ""
				let carObj = ""
				putData(carId, carObj).then(rsp => {
					console.log(rsp)
				}, () => {
					this.$Notice.error({ title: "Failed!", desc: "Put Data" })
				})
			},
			deleteData() {
				let carId = ""
				deleteData(carId).then(rsp => {
					console.log(rsp)
				}, () => {
					this.$Notice.error({ title: "Failed!", desc: "Delete Data" })
				})
			}
		}
	}
</script>

<style scoped>
	.part {
		background-color: beige;
		min-height: 100vh;
	}
	.center {
		text-align: center;
	}
	.pager {
		text-align: right;
	}
</style>
