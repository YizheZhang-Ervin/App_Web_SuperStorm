<template>
	<Menu theme="dark" :active-name="menuActive.active" :open-names="menuActive.open"
		class="menuStyle" width="auto">
		<MenuGroup title="SuperStorm">
			<Submenu name="1">
				<template slot="title">
					<Icon type="ios-paper" />
					内容管理
				</template>
				<MenuItem name="1-1" to="table">表格</MenuItem>
				<MenuItem name="1-2" to="chart">图表</MenuItem>
			</Submenu>
			<Submenu name="2">
				<template slot="title">
					<Icon type="ios-pulse" />
					性能监控
				</template>
				<MenuItem name="2-1" to="prometheus">Prometheus</MenuItem>
				<MenuItem name="2-2" to="actuator">Actuator</MenuItem>
				<MenuItem name="2-3" to="druid">Druid</MenuItem>
			</Submenu>
			<Submenu name="3">
				<template slot="title">
					<Icon type="ios-people" />
					联系作者
				</template>
				<MenuItem name="3-1" :to="authorURL">ErvinZhang</MenuItem>
			</Submenu>
		</MenuGroup>
	</Menu>
</template>

<script>
	export default {
		name: 'NavBar',
		data() {
			return {
				authorURL: "http://ervinzhang.pythonanywhere.com",
				menuActive: { active: "1-1", open: ['1', '2', '3'] }
			}
		},
		methods: {

		}
	}
</script>

<style scoped>
	.menuStyle {
		height: 100vh;
	}
</style>
