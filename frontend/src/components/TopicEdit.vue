<script>
import {defineComponent} from "vue";
import {TopicService} from "@/services/TopicService";

const topicService = new TopicService();
export default defineComponent({
  data() {
    return {
      topic: {
        title: '',
        comments: [{content: ''}]
      },
    }
  },
  methods: {
    createTopic() {
      topicService.create(this.topic).then((response) => {
        console.log(response);
        this.redirectToHomePage()
      })
    },
    redirectToHomePage() {
      this.$router.push('/')
    }
  }
})
</script>

<template>
  <div class="container form-group mb-4 mt-4" id="topics-panel">
    <input v-model="topic.title" placeholder="Title" class="form-control mb-1"/>
    <textarea v-model="topic.comments[0].content" placeholder="Content" class="form-control mb-1"/>
    <button @click="createTopic()" class="btn btn-light">Create</button>
  </div>
</template>

<style scoped>
#topics-panel {
  width: 500px;
}
</style>