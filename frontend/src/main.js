import './assets/main.css'

import { createApp } from 'vue'
import Home from "@/components/Home.vue";
import TopicsPanel from "@/components/TopicsPanel.vue";
import Tst from "@/components/Tst.vue";
import {createRouter, createWebHistory} from "vue-router";
import App from "@/App.vue";
import NotFound from "@/components/NotFound.vue";
import TopicEdit from "@/components/TopicEdit.vue";

const routes = [
    { path: '/', component: Home },
    { path: '/tst', component: Tst },
    { path: '/tp', component: TopicsPanel },
    { path: '/:notFound(.*)', component: NotFound},
    { path: '/topic-edit', component: TopicEdit },
]

const router = createRouter({
    history: createWebHistory(),
    routes,
})

const app = createApp(App)
app.use(router)
app.mount('#app')
