<template>
	<Layout>
		<Header class="header-part">
			<Menu
				mode="horizontal"
				theme="dark"
				:active-name="activeMenu.header"
			>
				<div class="layout-nav">
					<MenuItem name="1">
					<Icon type="md-aperture" />SuperStorm
					</MenuItem>
					<MenuItem
						name="2"
						:to="authorURL"
					>
					<Icon type="ios-snow" />Author: ErvinZhang
					</MenuItem>
				</div>
			</Menu>
		</Header>
		<Layout>
			<Sider hide-trigger>
				<Menu
					:active-name="activeMenu.siderActive"
					theme="dark"
					width="auto"
					:open-names="activeMenu.siderOpen"
				>
					<Submenu name="1">
						<template slot="title">
							<Icon type="ios-home" />
							Home
						</template>
						<MenuItem name="1-1">Table</MenuItem>
						<MenuItem name="1-2">Visualization</MenuItem>
					</Submenu>
					<Submenu name="2">
						<template slot="title">
							<Icon type="ios-hammer" />
							Tools
						</template>
						<MenuItem name="2-1">MySQL</MenuItem>
						<MenuItem name="2-2">Redis</MenuItem>
						<MenuItem name="2-3">Kafka</MenuItem>
					</Submenu>
				</Menu>
			</Sider>
			<Layout :style="{padding: '0 0px 0px'}">
				<Content :style="{padding: '2px', minHeight: '100vh', background: '#fff'}">
					<router-view></router-view>
				</Content>
			</Layout>
		</Layout>
	</Layout>
</template>

<script>
	export default {
		name: 'Home',
		data() {
			return {
				activeMenu: { header: 1, siderActive: 1, siderOpen: ["1"] },
				authorURL: "https://ervinzhang.pythonanywhere.com"
			}
		}
	}
</script>

<style scoped>
	.header-part {
		margin-bottom: 2px;
	}
</style>
