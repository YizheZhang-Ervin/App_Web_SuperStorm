<template>
	<section>
		<Dropdown class="dropdownStyle" @on-click="changeDropdown">
			<Button type="primary">
				Actuator监控路径
				<Icon type="ios-arrow-down"></Icon>
			</Button>
			<DropdownMenu slot="list">
				<DropdownItem :name="url" v-for="url in monitorURL" :key="url">{{url}}</DropdownItem>
			</DropdownMenu>
		</Dropdown>
		<pre class="preStyle">
			{{monitorData}}
		</pre>
	</section>
</template>

<script>
	import { getMonitor, monitorList } from '@/API/monitorAPI.js';
	export default {
		name: 'Actuator',
		data() {
			return {
				monitorData: "",
				monitorURL: monitorList.slice(0, 15)
			}
		},
		methods: {
			changeDropdown(name) {
				getMonitor(name).then(data => {
					this.monitorData = data;
				})
			}
		}
	}
</script>

<style scoped>
	.dropdownStyle {
		min-height: 5vh;
		max-height: 5vh;
	}
	.preStyle {
		overflow: auto;
		min-height: 95vh;
		max-height: 95vh;
		margin: 0;
	}
</style>