import axios from 'axios';

export const getDataByPage = (pageObj) => {
    return axios.request({
        method: "GET",
        url: "/api/car",
        params: { current: pageObj.current, total: pageObj.total, pageSize: pageObj.pageSize },
        data: ""
    })
}

export const getAllData = () => {
    return axios.request({
        method: "GET",
        url: "/api/allcar",
        data: ""
    })
}