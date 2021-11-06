let path = require('path')
function resolve(dir) {
    return path.join(__dirname, dir)
}

module.exports = {
    outputDir: 'dist',
    lintOnSave: true,
    runtimeCompiler: true, //关键点在这

    // 调整内部的 webpack 配置。
    // 查阅 https://github.com/vuejs/vue-doc-zh-cn/vue-cli/webpack.md
    chainWebpack: config => {
        config.resolve.alias.set('@', resolve('src'))
    },
    configureWebpack: () => { },
    // 配置 webpack-dev-server 行为。
    devServer: {
        proxy: {
            '/api': {
                target: 'http://localhost:8080',  // 后台接口域名
                ws: true,        //如果要代理 websockets，配置这个参数
                secure: false,  // 如果是https接口，需要配置这个参数
                changeOrigin: true,  //是否跨域
                pathRewrite: {
                    '^/api': ''
                }
            }
        }
    }
}