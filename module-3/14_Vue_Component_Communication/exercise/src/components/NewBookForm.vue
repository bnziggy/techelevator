<template>
  <form class="new-book-form" v-on:submit.prevent="addBook">
      <input class="title-input" type="text" placeholder="Title" v-model="book.title"/>
      <input class="author-input" type="text" placeholder="Author" v-model="book.author"/>
      <input class="isbn-input" type="text" placeholder="ISBN" v-model="book.isbn"/>
      <button>Add</button>
  </form>
</template>

<script>
export default {
    name: "new-book-form",
    data() {
        return {
            book: {
                title: '',
                author: '',
                read: false,
                isbn: ''
            }
        }
    },
    methods: {
        addBook() {
            this.$store.commit('ADD_BOOK', this.book);
            this.book = {
                title: '',
                author: '',
                read: false,
                isbn: ''
            }
        }
    }
}
</script>

<style>

</style>