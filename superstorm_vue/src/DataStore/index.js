import Vue from 'vue'
import Vuex from 'vuex'
import pageStore from './pageStore.js'
import tableStore from './tableStore.js'

Vue.use(Vuex)

const debug = process.env.NODE_ENV !== 'production'

export default new Vuex.Store({
    modules: {
        pageStore,
        tableStore
    },
    strict: debug,
    plugins: debug ? [] : []
})