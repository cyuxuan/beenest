const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
  transpileDependencies: true
})

module.exports = {
  devServer: {
    host: 'localhost',
    port: 80,
    // 此处开启 https
    https: false,
    proxy: {
      '/beenest/sso' : {
        // 代理到网关地址
        target: 'http://desktop.beenest.club:10666',
        // 如果要代理 websockets，配置这个参数
        ws: true,
        // 如果是https接口，需要配置这个参数
        secure: false,
        // 是否跨域
        changeOrigin: true,
        // 重定向
        // pathRewrite: {
        //   "^/beenest/sso": "/beenest/sso",//和上面一样，将请求地址中前面的替换为后面的内容
        // }
      }
    }
  }
}
