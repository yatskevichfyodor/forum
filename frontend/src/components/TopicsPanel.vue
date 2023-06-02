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
    },
    addTopic(title) {
      topicService.create(title)
    }
  },
  mounted() {
    this.loadTopics()
  },
})
</script>

<template>
  <div class="container mb-4 mt-4" id="topics-panel">
    <div class="mt-1 mb-3">
      <button type="button" class="btn btn-dark">
        <router-link to="/topic-edit">Add topic</router-link>
      </button>
    </div>
    <ul class="list-group">
      <router-link v-for="topic in topics" v-bind:to="{name: 'topic', params: { topicId: topic.id}}">
        <li class="list-group-item list-group-item-dark mb-1" aria-disabled="true">{{ topic.title }}</li>
      </router-link>
    </ul>
  </div>
</template>

<style scoped>
#topics-panel {
  width: 600px;
}
</style>