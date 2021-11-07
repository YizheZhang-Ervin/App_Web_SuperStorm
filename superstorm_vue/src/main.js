import Vue from 'vue'
import App from './App.vue'
import VueRouter from 'vue-router';
import routes from './Router/router.js';
import ViewUI from 'view-design';
import 'view-design/dist/styles/iview.css';
import DataStore from './DataStore'

var echarts = require('echarts');
Vue.prototype.$echarts = echarts

Vue.config.productionTip = false

Vue.use(VueRouter);
Vue.use(ViewUI);

// The routing configuration
const RouterConfig = {
  routes: routes
};
const router = new VueRouter(RouterConfig);

new Vue({
  router: router,
  store: DataStore,
  render: h => h(App)
}).$mount('#app')