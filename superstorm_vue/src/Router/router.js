// import Home from '../components/Home.vue'
import TablePage from '../components/DataPanel/TablePage.vue'
import ChartPage from '../components/DataPanel/ChartPage.vue'
import PrometheusPage from '../components/MonitorPanel/PrometheusPage.vue'
import ActuatorPage from '../components/MonitorPanel/ActuatorPage.vue'
import DruidPage from '../components/MonitorPanel/DruidPage.vue'

const routes = [
    { path: '/table', component: TablePage },
    { path: '/chart', component: ChartPage },
    { path: '/prometheus', component: PrometheusPage },
    { path: '/actuator', component: ActuatorPage },
    { path: '/druid', component: DruidPage }
]

export default routes;