<template>
  <mdb-container fluid>
    <h2 class="mt-lg-5 mb-5 pb-4 font-weight-bold">
      <strong>Tags, Labels & Badges</strong>
    </h2>
    <!--Basic example-->
    <section class="section">
      <h5 class="mt-5 mb-5 dark-grey-text font-weight-bold">Basic examples</h5>
      <mdb-row>
        <mdb-col lg="4" md="12" class="mt-2 mb-4">
          <mdb-chip
            src="https://mdbootstrap.com/img/Photos/Avatars/avatar-6.jpg"
            color="pink lighten-4"
            alt="Contact Person"
            waves
          >
            John Doe</mdb-chip
          >
          <mdb-chip
            src="https://mdbootstrap.com/img/Photos/Avatars/avatar-10.jpg"
            color="pink lighten-4"
            alt="Contact Person"
            waves
          >
            Anna Smith</mdb-chip
          >
          <mdb-chip color="pink lighten-4" close> Tag 220 </mdb-chip>
          <mdb-chip color="pink lighten-4" close> Tag 219 </mdb-chip>
          <mdb-chip color="pink lighten-4" close> Tag 218 </mdb-chip>
        </mdb-col>
        <mdb-col lg="6" md="8" class="mb-4">
          <h1>Example heading <mdb-badge color="red">New</mdb-badge></h1>
          <h2>Example heading <mdb-badge color="blue">New</mdb-badge></h2>
          <h3>Example heading <mdb-badge color="black">New</mdb-badge></h3>
          <h4>Example heading <mdb-badge color="green">New</mdb-badge></h4>
          <h5>Example heading <mdb-badge color="grey">New</mdb-badge></h5>
          <h6>Example heading <mdb-badge color="indigo">New</mdb-badge></h6>
        </mdb-col>
        <mdb-col lg="2" md="4" class="mb-4">
          <mdb-badge>Default</mdb-badge>
          <mdb-badge color="primary-color">Primary</mdb-badge>
          <mdb-badge color="success-color">Success</mdb-badge>
          <mdb-badge color="info-color">Info</mdb-badge>
          <mdb-badge color="warning-color">Warning</mdb-badge>
          <mdb-badge color="danger-color">Danger</mdb-badge>
        </mdb-col>
      </mdb-row>
    </section>
    <!--Basic example-->
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
            href="https://mdbootstrap.com/docs/vue/components/badges/"
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
  mdbRow,
  mdbCol,
  mdbBadge,
  mdbChip,
  mdbCard,
  mdbCardHeader,
  mdbCardBody
} from "mdbvue";

export default {
  name: "Tags",
  components: {
    mdbContainer,
    mdbRow,
    mdbCol,
    mdbBadge,
    mdbChip,
    mdbCard,
    mdbCardHeader,
    mdbCardBody
  },
  data() {
    return {};
  }
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped></style>
