<script>
import {defineComponent} from 'vue'
import {CommentService} from "@/services/CommentService";
import {TopicService} from "@/services/TopicService";

const topicService = new TopicService()
const commentService = new CommentService()
export default defineComponent({
  data() {
    return {
      topic: {
        id: undefined,
        title: undefined,
        comments: [{content: ''}]
      },
      newComment: {
        topic: {id: this.$route.params.topicId},
        content: undefined
      }
    }
  },
  methods: {
    async getTopic() {
      let response = await topicService.get(this.$route.params.topicId)
      this.topic = response.data
      this.newComment.topic.id = this.topic.id
      this.newComment.content = undefined
    },
    async addComment() {
      console.log(this.newComment)
      await commentService.create(this.newComment)
      await this.getTopic();
    }
  },
  mounted() {
    this.getTopic()
  },
})
</script>

<template>
  <div class="container mb-4 mt-4" id="topic">
    <ul class="list-group">
      <li v-for="comment in topic.comments" class="list-group-item list-group-item-dark mb-1" aria-disabled="true">
        {{ comment.content }}
      </li>
      <input v-model="newComment.content" class="mt-3 list-group-item list-group-ite  m-dark mb-1" placeholder="Add comment"/>
      <button @click="addComment()" class="btn btn-dark" style="width:150px">Add comment</button>
    </ul>
  </div>
</template>

<style scoped>

</style>