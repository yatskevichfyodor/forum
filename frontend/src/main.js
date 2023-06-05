import { createApp } from 'vue'
import TopicsPanel from "@/components/TopicsPanel.vue";
import {createRouter, createWebHistory} from "vue-router";
import App from "@/App.vue";
import NotFound from "@/components/NotFound.vue";
import TopicEdit from "@/components/TopicEdit.vue";
import Topic from "@/components/Topic.vue";
import Test from "@/components/Test.vue";

import 'bootstrap/dist/css/bootstrap.css';
import 'bootstrap/dist/js/bootstrap.js';

const routes = [
    { path: '/', component: TopicsPanel},
    { path: '/topics-panel', component: TopicsPanel },
    { path: '/topic-edit', component: TopicEdit },
    { path: '/topic/:topicId', component: Topic, name: 'topic' },
    { path: '/:notFound(.*)', component: NotFound},
    { path: '/test', component: Test },
]

const router = createRouter({
    history: createWebHistory(),
    routes,
})

const app = createApp(App)
app.use(router)
app.mount('#app')