<template>
  <div class="book-container">
    <book-card v-for="book in $store.state.books" v-bind:book="book" v-bind:key="book.title" v-bin:class="{'read' : book.read === true}"/>
  </div>
</template>

<script>
import BookCard from './BookCard.vue'

export default {
    name: 'reading-list',
    components: {BookCard}
}
</script>

<style>
.book-container {
    display:flex;
    justify-content: space-evenly;
    flex-wrap: wrap;
}
</style>