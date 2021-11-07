import { exampleTable } from './examples/exampleTable.js';

// initial state
// 使用: store.state
const state = () => ({
    tableCol: exampleTable.tableCol,
    tableData: exampleTable.tableData
})

// getters
// 使用: store.getters.xx
const getters = {}

// mutations
// 使用: store.commit("xx","yy")
const mutations = {
    setTableCol(state, status) {
        state.tableCol = status
    },
    setTableData(state, status) {
        state.tableData = status
    }
}

// actions
// 使用: store.dispatch('xx')
const actions = {
    initTable({ commit }) {
        commit('setTableCol', exampleTable.tableCol)
        commit('setTableData', exampleTable.tableData)
    }
}

export default {
    namespaced: true,
    state,
    getters,
    actions,
    mutations
}