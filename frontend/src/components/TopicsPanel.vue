<script>
import {defineComponent} from "vue";
import {TopicService} from "@/services/TopicService";

const topicService = new TopicService()
export default defineComponent({
  data() {
    return {
      topics: []
    }
  },
  methods: {
    async loadTopics() {
      let response = await topicService.getAll()
      this.topics = response.data
    }
  },
  mounted() {
    this.loadTopics()
  },
})
</script>

<template>
  <div class="container mb-4 mt-4" id="topics-panel">
    <h1>Topics list</h1>
    <ul class="list-group">
      <router-link v-for="topic in topics" v-bind:to="{name: 'topic', params: { topicId: topic.id}}">
        <li class="list-group-item list-group-item-dark mb-1" aria-disabled="true">{{ topic.title }}</li>
      </router-link>
    </ul>
    <div class="mt-1 mb-3">
      <button type="button" class="btn btn-light">
        <router-link to="/topic-edit">Add topic</router-link>
      </button>
    </div>
  </div>
</template>

<style scoped>
#topics-panel {
  width: 600px;
}
</style>