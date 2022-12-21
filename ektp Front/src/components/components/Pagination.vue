<template>
  <mdb-container fluid>
    <h2 class="mt-lg-5 mb-5 font-weight-bold"><strong>Pagination</strong></h2>
    <!--Section: Pagination-->
    <section class="mb-5 pb-5">
      <mdb-row>
        <!--Grid column-->
        <mdb-col>
            <h5 class="my-5 dark-grey-text font-weight-bold">Basic</h5>
            <mdb-row>
              <mdb-pagination circle>
                <mdb-page-item disabled>First</mdb-page-item>
                <mdb-page-nav prev disabled></mdb-page-nav>
                <mdb-page-item active>1</mdb-page-item>
                <mdb-page-item>2</mdb-page-item>
                <mdb-page-item>3</mdb-page-item>
                <mdb-page-item>4</mdb-page-item>
                <mdb-page-item>5</mdb-page-item>
                <mdb-page-nav next></mdb-page-nav>
                <mdb-page-item>Last</mdb-page-item>
              </mdb-pagination>
            </mdb-row>
            <!--Grid row-->

            <!--Grid row-->
            <mdb-row>
              <mdb-pagination>
                <mdb-page-nav prev></mdb-page-nav>
                <mdb-page-item>1</mdb-page-item>
                <mdb-page-item>2</mdb-page-item>
                <mdb-page-item>3</mdb-page-item>
                <mdb-page-nav next></mdb-page-nav>
              </mdb-pagination>
            </mdb-row>
            <!--Grid row-->

            <!--Grid row-->
            <mdb-row>
              <mdb-pagination color="blue">
                <mdb-page-nav prev></mdb-page-nav>
                <mdb-page-item active>1</mdb-page-item>
                <mdb-page-item>2</mdb-page-item>
                <mdb-page-item>3</mdb-page-item>
                <mdb-page-item>4</mdb-page-item>
                <mdb-page-item>5</mdb-page-item>
                <mdb-page-nav next></mdb-page-nav>
              </mdb-pagination>
            </mdb-row>
            <!--Grid row-->

        </mdb-col>
        <!--Grid column-->

        <!--Grid column-->
        <mdb-col>
          <h5 class="my-5 dark-grey-text font-weight-bold">Colors</h5>
          <!--Pagination blue-->
          <mdb-pagination color="blue">
            <mdb-page-nav prev></mdb-page-nav>
            <mdb-page-item active>1</mdb-page-item>
            <mdb-page-item>2</mdb-page-item>
            <mdb-page-item>3</mdb-page-item>
            <mdb-page-item>4</mdb-page-item>
            <mdb-page-item>5</mdb-page-item>
            <mdb-page-nav next></mdb-page-nav>
          </mdb-pagination>
          <!--/Pagination blue-->

          <!--Pagination red-->
          <mdb-pagination color="red">
            <mdb-page-nav prev></mdb-page-nav>
            <mdb-page-item active>1</mdb-page-item>
            <mdb-page-item>2</mdb-page-item>
            <mdb-page-item>3</mdb-page-item>
            <mdb-page-item>4</mdb-page-item>
            <mdb-page-item>5</mdb-page-item>
            <mdb-page-nav next></mdb-page-nav>
          </mdb-pagination>
          <!--/Pagination red-->

          <!--Pagination teal-->
          <mdb-pagination color="teal">
            <mdb-page-nav prev></mdb-page-nav>
            <mdb-page-item active>1</mdb-page-item>
            <mdb-page-item>2</mdb-page-item>
            <mdb-page-item>3</mdb-page-item>
            <mdb-page-item>4</mdb-page-item>
            <mdb-page-item>5</mdb-page-item>
            <mdb-page-nav next></mdb-page-nav>
          </mdb-pagination>
          <!--/Pagination teal-->

          <!--Pagination dark-->
          <mdb-pagination color="dark">
            <mdb-page-nav prev></mdb-page-nav>
            <mdb-page-item active>1</mdb-page-item>
            <mdb-page-item>2</mdb-page-item>
            <mdb-page-item>3</mdb-page-item>
            <mdb-page-item>4</mdb-page-item>
            <mdb-page-item>5</mdb-page-item>
            <mdb-page-nav next></mdb-page-nav>
          </mdb-pagination>
          <!--/Pagination dark-->

          <!--Pagination blue grey-->
          <mdb-pagination color="bluegrey">
            <mdb-page-nav prev></mdb-page-nav>
            <mdb-page-item active>1</mdb-page-item>
            <mdb-page-item>2</mdb-page-item>
            <mdb-page-item>3</mdb-page-item>
            <mdb-page-item>4</mdb-page-item>
            <mdb-page-item>5</mdb-page-item>
            <mdb-page-nav next></mdb-page-nav>
          </mdb-pagination>
          <!--/Pagination grey-->

          <!--Pagination amber-->
          <mdb-pagination color="amber">
            <mdb-page-nav prev></mdb-page-nav>
            <mdb-page-item active>1</mdb-page-item>
            <mdb-page-item>2</mdb-page-item>
            <mdb-page-item>3</mdb-page-item>
            <mdb-page-item>4</mdb-page-item>
            <mdb-page-item>5</mdb-page-item>
            <mdb-page-nav next></mdb-page-nav>
          </mdb-pagination>
          <!--/Pagination amber-->

          <!--Pagination purple-->
          <mdb-pagination color="purple">
            <mdb-page-nav prev></mdb-page-nav>
            <mdb-page-item active>1</mdb-page-item>
            <mdb-page-item>2</mdb-page-item>
            <mdb-page-item>3</mdb-page-item>
            <mdb-page-item>4</mdb-page-item>
            <mdb-page-item>5</mdb-page-item>
            <mdb-page-nav next></mdb-page-nav>
          </mdb-pagination>
          <!--/Pagination purple-->

          <!--Pagination dark grey-->
          <mdb-pagination color="dark-grey">
            <mdb-page-nav prev></mdb-page-nav>
            <mdb-page-item active>1</mdb-page-item>
            <mdb-page-item>2</mdb-page-item>
            <mdb-page-item>3</mdb-page-item>
            <mdb-page-item>4</mdb-page-item>
            <mdb-page-item>5</mdb-page-item>
            <mdb-page-nav next></mdb-page-nav>
          </mdb-pagination>
          <!--/Pagination dark grey-->
        </mdb-col>
        <!--Grid column-->

        <!--Grid column-->
        <mdb-col>
          <h5 class="my-5 dark-grey-text font-weight-bold">Size</h5>
          <h6 class="title mt-5 dark-grey-text font-weight-bold">Large</h6>

          <!--Grid row-->
          <mdb-row>
            <mdb-pagination lg>
              <mdb-page-nav prev></mdb-page-nav>
              <mdb-page-item>1</mdb-page-item>
              <mdb-page-item>2</mdb-page-item>
              <mdb-page-item>3</mdb-page-item>
              <mdb-page-nav next></mdb-page-nav>
            </mdb-pagination>
          </mdb-row>
          <!--Grid row-->

          <h6 class="title mt-4 mb-3 dark-grey-text font-weight-bold">Small</h6>
          <!--Grid row-->
          <mdb-row>
            <mdb-pagination sm>
              <mdb-page-nav prev></mdb-page-nav>
              <mdb-page-item>1</mdb-page-item>
              <mdb-page-item>2</mdb-page-item>
              <mdb-page-item>3</mdb-page-item>
              <mdb-page-nav next></mdb-page-nav>
            </mdb-pagination>
          </mdb-row>
          <!--Grid row-->
        </mdb-col>
        <!--Grid column-->
      </mdb-row>
      <!--Grid row-->
    </section>
    <!--Section: Background variants-->

    <!--Section: Docs link-->
    <section class="pb-4">
      <!--Panel-->
      <mdb-card>
        <mdb-card-header class="primary-color text-center white-text">Full documentation</mdb-card-header>
        <mdb-card-body class="text-center">
          <p>Read the full documentation for these components.</p>
          <a href="https://mdbootstrap.com/docs/vue/tables/pagination/" target="_blank" class="btn btn-primary">Learn more</a>
        </mdb-card-body>
      </mdb-card>
      <!--/.Panel-->
    </section>
    <!--Section: Docs link-->
  </mdb-container>
</template>

<script>
import { mdbContainer, mdbRow, mdbCol, mdbCard, mdbCardHeader, mdbCardBody, mdbPagination, mdbPageNav, mdbPageItem } from 'mdbvue'

export default {
  name: 'Pagination',
  components: {
    mdbContainer,
    mdbRow,
    mdbCol,
    mdbCard,
    mdbCardHeader,
    mdbCardBody,
    mdbPagination,
    mdbPageNav,
    mdbPageItem
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
