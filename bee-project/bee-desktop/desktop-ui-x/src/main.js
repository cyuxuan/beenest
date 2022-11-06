import Vue from 'vue'
import App from './App.vue'
import './registerServiceWorker'
import router from './router'
import { vueBaberrage } from 'vue-baberrage';
// import VueSocketIO from 'vue-socket.io';
import VueAxios from 'vue-axios'
import { VueJsonp } from 'vue-jsonp'
import Lazyload from 'vue-lazyload'
import Antd from 'ant-design-vue';
import axios from 'axios'
import Vuex from 'vuex'
import Store from "./store/store";
import ElementUI from 'element-ui';
import { Loading, Message } from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css';
import 'ant-design-vue/dist/antd.css';
import 'animate.css';

Vue.config.productionTip = false
Vue.use(Vuex)
Vue.use(ElementUI);
Vue.use(Antd);
Vue.use(vueBaberrage)
// 设置统一前缀
axios.defaults.baseURL = '/api'
Vue.use(VueAxios, axios)
Vue.use(VueJsonp)

// Vue.use(new VueSocketIO({
//   debug: false,
//   // 服务器端地址
//   connection: 'https://desktop.beenest.com:8090',
//   vuex: {
//   }
// }))

Vue.use(Lazyload, {
  preLoad: 1,
  loading: require('../public/img/images/loading-spin.svg'),
  attempt: 2,
})

// 自定义指令
Vue.directive('cfocus', {
  inserted: (el, binding) => {
      if (binding.value == true || binding.value == undefined) {
          el.focus()
      }
  }
});


// 超时时间
axios.defaults.timeout = 5000
// http请求拦截器
var loadinginstace
axios.interceptors.request.use(config => {
    // element ui Loading方法
    loadinginstace = Loading.service({ fullscreen: true })
    return config
}, error => {
    loadinginstace.close()
    Message.error({
        message: '加载超时'
    })
    return Promise.reject(error)
})
// http响应拦截器
axios.interceptors.response.use(data => {// 响应成功关闭loading
    loadinginstace.close()
    return data
}, error => {
    loadinginstace.close()
    Message.error({
        message: '加载失败'
    })
    // 判断当前失败原因是否为未登录
    if(error.data.code == '403') {
      // 开启登录
      this.$store.state.sign_show = true
    }
    return Promise.reject(error)
})


// 实例化应用
new Vue({
  router,
  render: h => h(App),
  components: { App },
  template: '<App/>',
  store: Store,
}).$mount('#app')
