<template>
  <div>
      <h1>{{ book.title }}</h1>
      <h2>{{ book.author }}</h2>
      <img v-if="book.isbn" v-bind:src="'http://covers.openlibrary.org/b/isbn/' + book.isbn + '-M.jpg'" />
      <p>{{ book.read == true ? "Book has been read" : "Book has not been read"}}</p>
  </div>
</template>

<script>
export default {
    name: 'book-details',
    props: ['book']

}
</script>

<style>

</style>