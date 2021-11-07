import axios from 'axios';

export const monitorList = [
    "/actuator",
    "/actuator/beans",
    "/actuator/caches",
    "/actuator/health",
    "/actuator/info",
    "/actuator/conditions",
    "/actuator/shutdown",
    "/actuator/configprops",
    "/actuator/env",
    "/actuator/loggers",
    "/actuator/heapdump",
    "/actuator/threaddump",
    "/actuator/metrics",
    "/actuator/scheduledtasks",
    "/actuator/mappings",
    "/actuator/prometheus",
    "/druid/stat"
]

export const getMonitor = (url) => {
    return axios.request({
        method: "GET",
        url: `/api${url}`,
        params: "",
        data: ""
    })
}
