import { createApp } from "vue";
import { createPinia } from "pinia";

import App from "./App.vue";
import router from "./router";

// 全局引入
// import ElementPlus from "element-plus";
// import "element-plus/lib/theme-chalk/index.css";

// 如果您正在使用CDN引入，请删除下面一行。
// import * as ElementPlusIconsVue from "@element-plus/icons-vue";

const app = createApp(App);

// app.use(ElementPlus);

// for (const [key, component] of Object.entries(ElementPlusIconsVue)) {
//   app.component(key, component);
// }

app.use(createPinia());
app.use(router);

app.mount("#app");
