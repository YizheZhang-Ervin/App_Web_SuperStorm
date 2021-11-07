import { examplePage } from './examples/examplePage.js';

// initial state
// 使用: store.state
const state = () => ({
    current: examplePage.current,
    total: examplePage.total,
    pageSize: examplePage.pageSize,
    pageSizeOpts: examplePage.pageSizeOpts
})

// getters
// 使用: store.getters.xx
const getters = {}

// mutations
// 使用: store.commit("xx","yy")
const mutations = {
    setPageCurrent(state, status) {
        state.current = status
    },
    setPageTotal(state, status) {
        state.total = status
    },
    setPageSize(state, status) {
        state.pageSize = status
    },
    setPageSizeopts(state, status) {
        state.pageSizeOpts = status
    }
}

// actions
// 使用: store.dispatch('xx')
const actions = {
    initPage({ commit }) {
        commit('setPageCurrent', examplePage.current)
        commit('setPageTotal', examplePage.total)
        commit('setPageSize', examplePage.pageSize)
        commit('setPageSizeopts', examplePage.pageSizeOpts)
    }
}

export default {
    namespaced: true,
    state,
    getters,
    actions,
    mutations
}