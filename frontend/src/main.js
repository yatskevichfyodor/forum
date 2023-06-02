import './assets/main.css'

import { createApp } from 'vue'
import Home from "@/components/Home.vue";
import TopicsPanel from "@/components/TopicsPanel.vue";
import Tst from "@/components/Tst.vue";
import {createRouter, createWebHashHistory, createWebHistory} from "vue-router";
import App from "@/App.vue";
import NotFound from "@/components/NotFound.vue";

const routes = [
    { path: '/tst', component: Tst },
    { path: '/tp', component: TopicsPanel },
    { path: '/', component: Home },
    { path: '/404', component: NotFound },
    { path: '/:notFound(.*)', component: NotFound}
]

const router = createRouter({
    history: createWebHistory(),
    routes,
})

const app = createApp(App)
app.use(router)
app.mount('#app')
