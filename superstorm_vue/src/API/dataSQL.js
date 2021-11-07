import axios from 'axios';

// 返回{code,msg,data:{list,pageNum,pageSize,total}}
export const getDataByPage = (pageObj) => {
    return axios.request({
        method: "GET",
        url: "/api/car",
        params: { current: pageObj.current, total: pageObj.total, pageSize: pageObj.pageSize },
        data: "",
        timeout: 30000
    })
}