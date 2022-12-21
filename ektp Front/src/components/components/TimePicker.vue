<template>
  <mdb-container fluid>
    <h2 class="mt-lg-5 mb-5 pb-4 font-weight-bold">
      <strong>Time picker</strong>
    </h2>
    <mdb-time-picker
      color="blue"
      label="Time"
      icon="clock"
      far
      v-model="picker"
    ></mdb-time-picker>
    <!--Section: Docs link-->
    <section class="pb-4 mt-5">
      <!--Panel-->
      <mdb-card>
        <mdb-card-header class="primary-color text-center white-text"
          >Full documentation</mdb-card-header
        >
        <mdb-card-body class="text-center">
          <p>Read the full documentation for these components.</p>
          <a
            href="https://mdbootstrap.com/docs/vue/forms/time-picker/"
            target="_blank"
            class="btn btn-primary"
            >Learn more</a
          >
        </mdb-card-body>
      </mdb-card>
      <!--/.Panel-->
    </section>
    <!--Section: Docs link-->
  </mdb-container>
</template>

<script>
import {
  mdbContainer,
  mdbTimePicker,
  mdbCard,
  mdbCardHeader,
  mdbCardBody
} from "mdbvue";

export default {
  name: "TimePicker",
  components: {
    mdbContainer,
    mdbTimePicker,
    mdbCard,
    mdbCardHeader,
    mdbCardBody
  },
  data() {
    return {
      picker: null
    };
  }
};
</script>
