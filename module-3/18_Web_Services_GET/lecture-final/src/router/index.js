import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '../views/Home.vue'
import Board from '../views/Board.vue'
import Card from '../views/Card.vue'
import Dictionary from '@/views/Dictionary.vue'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'Home',
    component: Home
  },
  {
    path: '/board/:id',
    name: 'Board',
    component: Board
  },
  {
    path: '/board/:boardID/card/:cardID',
    name: 'Card',
    component: Card
  },
  {
    path: '/definition',
    name: 'Definition',
    component: Dictionary
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router