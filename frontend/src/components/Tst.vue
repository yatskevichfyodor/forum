<script>
import {defineComponent} from 'vue'
import {TopicService} from "@/services/TopicService";

const topicService = new TopicService()
export default defineComponent({
  data() {
    return {
      count: 0,
      message: '',
      topics: []
    }
  },
  methods: {
    async getTopics() {
      let response = await topicService.getAll()
      this.topics = response.data
    },
    addTopic(title) {
      topicService.create(title)
    }
  },
  mounted() {
    this.getTopics()
  },
})
</script>

<template>
  <p>TOPICS: {{ topics }}</p>
  <p>Message is: {{ message }}</p>
  <input v-model="message" placeholder="edit me" />
  <button @click="addTopic(message)">add topic </button>
  <button @click="count++">You clicked me {{ count }} times.</button>
  <p>CONPONENT END</p>
</template>