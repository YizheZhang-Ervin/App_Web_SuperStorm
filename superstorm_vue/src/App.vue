<template>
	<div id="app">
		<Home></Home>
	</div>
</template>

<script>
	import Home from './components/Home.vue';
	export default {
		name: 'App',
		components: { Home }
	}

</script>

<style>
	#app {
		font-family: Avenir, Helvetica, Arial, sans-serif;
		-webkit-font-smoothing: antialiased;
		-moz-osx-font-smoothing: grayscale;
	}
	/* 改menu头字体 */
	.ivu-menu-vertical .ivu-menu-item-group-title {
		font-size: 1.2em !important;
		color: white !important;
		text-align: center;
		padding-left: 0 !important;
	}
</style>
