import axios from 'axios';

export const processData = (condition) => {
    return axios.request({
        method: "GET",
        url: "/api/car",
        params: { filter: condition.filter, sort: condition.sort },
        data: ""
    })
}

export const getData = (carId) => {
    return axios.request({
        method: "GET",
        url: `/api/car/${carId}`,
        params: "",
        data: ""
    })
}

export const postData = (obj) => {
    return axios.request({
        method: "POST",
        url: "/api/car",
        params: {},
        data: obj
    })
}

export const putData = (key, obj) => {
    return axios.request({
        method: "PUT",
        url: "/api/car",
        params: { key },
        data: obj
    })
}

export const deleteData = (key, obj) => {
    return axios.request({
        method: "DELETE",
        url: "/api/car",
        params: { key },
        data: obj
    })
}