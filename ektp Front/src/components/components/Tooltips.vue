<template>
  <mdb-container fluid>
    <h2 class="mt-lg-5 mb-5 pb-4 font-weight-bold">
      <strong>Tooltips</strong>
    </h2>
    <mdb-row>
      <mdb-col md="12" xl="10" class="mx-auto">
        <mdb-card class="p-5 mt-5">
          <mdb-card-body class="justify-content-center">
            <mdb-tooltip trigger="hover" :options="{ placement: 'top' }">
              <span slot="tip">
                Tooltip on top
              </span>
              <mdb-btn slot="reference" color="primary">
                Tooltip on top
              </mdb-btn>
            </mdb-tooltip>
            <mdb-tooltip trigger="hover" :options="{ placement: 'right' }">
              <span slot="tip">
                Tooltip on right
              </span>
              <mdb-btn slot="reference" color="primary">
                Tooltip on right
              </mdb-btn>
            </mdb-tooltip>
            <mdb-tooltip trigger="hover" :options="{ placement: 'bottom' }">
              <span slot="tip">
                Tooltip on bottom
              </span>
              <mdb-btn slot="reference" color="primary">
                Tooltip on bottom
              </mdb-btn>
            </mdb-tooltip>
            <mdb-tooltip trigger="hover" :options="{ placement: 'left' }">
              <span slot="tip">
                Tooltip on left
              </span>
              <mdb-btn slot="reference" color="primary">
                Tooltip on left
              </mdb-btn>
            </mdb-tooltip>
          </mdb-card-body>
        </mdb-card>
      </mdb-col>
    </mdb-row>
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
            href="https://mdbootstrap.com/docs/vue/advanced/tooltips/"
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
  mdbTooltip,
  mdbBtn,
  mdbCard,
  mdbCardHeader,
  mdbCardBody
} from "mdbvue";

export default {
  name: "Tooltips",
  components: {
    mdbContainer,
    mdbRow,
    mdbCol,
    mdbTooltip,
    mdbBtn,
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
