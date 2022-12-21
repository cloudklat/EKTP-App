<template>
  <mdb-container fluid>

    <h2 class="mt-lg-5 mb-5 pb-4 font-weight-bold"><strong>Popovers</strong></h2>

    <mdb-row>
      <mdb-col md="12" xl="10" >
        <mdb-card>
          <mdb-card-body>
            <mdb-popover trigger="click" :options="{placement: 'top'}">
              <span slot="header">popover on top</span>
              <span slot="body">Sed posuere consectetur est at lobortis. Aenean eu leo quam. Pellentesque ornare sem lacinia quam venenatis vestibulum.</span>
              <mdb-btn slot="reference">
                Popover on top
              </mdb-btn>
            </mdb-popover>
            <mdb-popover trigger="click" :options="{placement: 'right'}">
              <span slot="header">popover on right</span>
              <span slot="body">Sed posuere consectetur est at lobortis. Aenean eu leo quam. Pellentesque ornare sem lacinia quam venenatis vestibulum.</span>
              <mdb-btn slot="reference">
                Popover on right
              </mdb-btn>
            </mdb-popover>
            <mdb-popover trigger="click" :options="{placement: 'bottom'}">
              <span slot="header">popover on bottom</span>
              <span slot="body">Sed posuere consectetur est at lobortis. Aenean eu leo quam. Pellentesque ornare sem lacinia quam venenatis vestibulum.</span>
              <mdb-btn slot="reference">
                Popover on bottom
              </mdb-btn>
            </mdb-popover>
            <mdb-popover trigger="click" :options="{placement: 'left'}">
              <span slot="header">popover on left</span>
              <span slot="body">Sed posuere consectetur est at lobortis. Aenean eu leo quam. Pellentesque ornare sem lacinia quam venenatis vestibulum.</span>
              <mdb-btn slot="reference">
                Popover on left
              </mdb-btn>
            </mdb-popover>

          </mdb-card-body>
        </mdb-card>
      </mdb-col>
    </mdb-row>

    <!--Section: Docs link-->
    <section class="pb-4 mt-5">
      <!--Panel-->
      <mdb-card>
        <mdb-card-header class="primary-color text-center white-text">Full documentation</mdb-card-header>
        <mdb-card-body class="text-center">
          <p>Read the full documentation for these components.</p>
          <a href="https://mdbootstrap.com/docs/vue/advanced/popovers/" target="_blank" class="btn btn-primary">Learn more</a>
        </mdb-card-body>
      </mdb-card>
      <!--/.Panel-->
    </section>
    <!--Section: Docs link-->
  </mdb-container>
</template>

<script>
import { mdbContainer, mdbRow, mdbCol, mdbBtn, mdbPopover, mdbCard, mdbCardBody, mdbCardHeader } from 'mdbvue'

export default {
  name: 'Popovers',
  components: {
    mdbContainer,
    mdbRow,
    mdbCol,
    mdbBtn,
    mdbPopover,
    mdbCard,
    mdbCardBody,
    mdbCardHeader
  },
  data () {
    return {
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
