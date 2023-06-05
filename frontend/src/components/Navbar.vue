<script>
import {defineComponent} from "vue";

export default defineComponent({
  data() {
    return {
      pages: {
        'Home': '/',
        'Topics panel' : '/topics-panel',
        'Test' : '/test'
      }
    }
  }
})
</script>

<template>
  <nav class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="container-fluid">
      <a class="navbar-brand" href="/">Forum</a>
      <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav me-auto mb-2 mb-lg-0">
            <li v-for="(path, name) in pages" :key="path">
              <a class="nav-link active" aria-current="page" :href="path">{{name}}</a>
            </li>
        </ul>
      </div>
    </div>
  </nav>
</template>

<style scoped>
#header {
  background-color: #000000;
}
</style>