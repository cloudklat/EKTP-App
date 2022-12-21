<template>
  <mdb-container fluid>
    <h2 class="mt-lg-5 mb-5 pb-4 font-weight-bold">
      <strong>Date picker</strong>
    </h2>

    <mdb-date-picker icon="clock" far :option="options" v-model="date" />

    <!--Section: Docs link-->
    <section class="pb-4 pt-5 mt-5">
      <!--Panel-->
      <div class="card text-center">
        <h3 class="card-header primary-color white-text">Full documentation</h3>
        <div class="card-body">
          <p class="card-text">
            Read the full documentation for these components.
          </p>
          <a
            href="https://mdbootstrap.com/docs/vue/forms/date-picker/"
            target="_blank"
            class="btn btn-primary"
            >Learn more</a
          >
        </div>
      </div>
      <!--/.Panel-->
    </section>
    <!--Section: Docs link-->
  </mdb-container>
</template>

<script>
import { mdbContainer, mdbDatePicker } from "mdbvue";

export default {
  name: "DatePicker",
  components: {
    mdbContainer,

    mdbDatePicker
  },
  data() {
    return {
      date: '',
        options: {
          placeholder: '2018-04-13',
          label: "default date"
        }
    };
  }
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped></style>
