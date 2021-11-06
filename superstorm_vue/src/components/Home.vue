<template>
	<Row>
		<!-- 导航栏 -->
		<Col span="4">
		<NavBar></NavBar>
		</Col>
		<!-- 内容栏 -->
		<Col span="20">
		<router-view></router-view>
		</Col>
	</Row>
</template>

<script>
	import NavBar from "./NavBar.vue";
	export default {
		name: 'Home',
		components: {
			NavBar
		},
		data() {
			return {
			}
		},
		methods: {

		}
	}
</script>

<style scoped>
</style>
