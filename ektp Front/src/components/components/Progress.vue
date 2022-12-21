<template>
  <mdb-container fluid>
    <section class="px-3">
      <mdb-row>
        <h2 class="mt-lg-5 mb-5 pb-4 font-weight-bold">
          <strong>Progress bars</strong>
        </h2>
      </mdb-row>
      <mdb-row>
        <h5 class="mb-3 dark-grey-text font-weight-bold">Basic examples</h5>

        <mdb-progress :height="20" :value="0" />
        <mdb-progress :height="20" :value="25" color="blue" />
        <mdb-progress :height="20" :value="50" color="blue" />
        <mdb-progress :height="20" :value="75" color="blue" />
        <mdb-progress :height="20" :value="100" color="blue" />
      </mdb-row>
      <mdb-row>
        <h5 class="mt-5 mb-3 pt-4 dark-grey-text font-weight-bold">
          Contextual alternatives
        </h5>

        <mdb-progress color="success" :value="25"></mdb-progress>
        <mdb-progress color="info" :value="50"></mdb-progress>
        <mdb-progress
          color="warning"
          :value="75"
          striped
          animated
        ></mdb-progress>
        <mdb-progress color="danger" :value="100" striped></mdb-progress>
      </mdb-row>
      <mdb-row>
        <h5 class="mt-5 mb-3 pt-4 dark-grey-text font-weight-bold">
          Infinite loading
        </h5>

        <mdb-progress bgColor="primary-color-dark" indeterminate />
      </mdb-row>
      <mdb-row class="mb-5">
        <h5 class="mt-5 mb-3 pt-4 dark-grey-text font-weight-bold">Circles</h5>
      </mdb-row>
      <mdb-row class="mb-5">
        <mdb-col>
          <!--Big blue-->
          <mdb-spinner big />
        </mdb-col>
        <mdb-col>
          <!--Medium red-->
          <mdb-spinner color="red" />
        </mdb-col>
        <mdb-col>
          <!--Small yellow-->
          <mdb-spinner small color="yellow" />
        </mdb-col>
      </mdb-row>
      <mdb-row class="mb-5">
        <mdb-col>
          <!--Big blue-->
          <mdb-spinner big crazy />
          <!--Medium red-->
          <mdb-spinner color="red" crazy />
          <!--Small yellow-->
          <mdb-spinner small color="yellow" crazy />
        </mdb-col>
        <mdb-col>
          <mdb-spinner multicolor big />
        </mdb-col>
        <mdb-col>
          <mdb-spinner multicolor small />
        </mdb-col>
      </mdb-row>
    </section>

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
            href="https://mdbootstrap.com/docs/vue/components/demo/progresss/"
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
  mdbProgress,
  mdbSpinner,
  mdbCard,
  mdbCardHeader,
  mdbCardBody
} from "mdbvue";

export default {
  name: "Progress",
  components: {
    mdbContainer,
    mdbRow,
    mdbCol,
    mdbProgress,
    mdbSpinner,
    mdbCard,
    mdbCardBody,
    mdbCardHeader
  }
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped></style>
