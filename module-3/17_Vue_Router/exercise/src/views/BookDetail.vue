<template>
  <book-details v-bind:book="book" />
</template>

<script>
import BookDetails from "../components/BookDetails.vue";
export default {
  name: "book-detail",
  components: { BookDetails },
  computed: {
      book() {
          return this.$store.state.books.find(
              book => book.isbn == this.$route.params.isbn
          );
      }
  }
};
</script>

<style>
</style>