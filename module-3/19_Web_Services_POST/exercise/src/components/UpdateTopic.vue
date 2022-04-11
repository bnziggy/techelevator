<template>
  <form v-on:submit.prevent>
    <div class="field">
      <div class="status-message error" v-show="errorMsg !== ''">{{ errorMsg }}</div>
      <label for="title">Title</label>
      <input type="text" v-model="title" />
    </div>
    <div class="actions">
      <button type="submit" v-on:click="updateTopic()">Save Document</button>
    </div>
  </form>
</template>

<script>
import topicService from "../services/TopicService";

export default {
  name: "update-topic",
  props: ["topicID"],
  data() {
    return {
      title: "",
      errorMsg: ''
    };
  },
  methods: {
    updateTopic() {
      const topic = { id: this.topicID, title: this.title };
      topicService.edit(topic.id, topic)
      .then(response => {
        if (response.status === 200) {
          this.$router.push('/');
        }
      })
      .catch(error => {
        if (error.response) {
          this.errorMsg = "Error adding. Response: " + error.response.statusText;
        }
        else if (error.request) {
          this.errorMsg = "Error adding. Unreachable server."
        }
        else {
          this.errorMsg = "Error addding. Could not create"
        }
      })
      // call topic service update method
    }
  },
  created() {
    topicService
      .get(this.topicID)
      .then(response => {
        this.$store.commit("SET_ACTIVE_TOPIC", response.data);
        this.title = response.data.title;
      })
      .catch(error => {
        if (error.response.status == 404) {
          this.$router.push({name: 'NotFound'});
        }
      });
  }
};
</script>

<style>
</style>
