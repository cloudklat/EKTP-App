<template>
  <mdb-container fluid>
    <h2 class="font-weight-bold mt-lg-5 mb-5 pb-4"><strong>Panels</strong></h2>
    <!--Section: Background variants-->
    <section class="mb-5 pb-5">
      <h5 class="my-5 dark-grey-text font-weight-bold">Background variants</h5>
      <mdb-row>
        <mdb-col>
          <!--Card indigo-->
          <mdb-card class="indigo text-center z-depth-2">
            <mdb-card-body>
              <p class="white-text mb-0">
                Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer
                posuere erat a ante.
              </p>
            </mdb-card-body>
          </mdb-card>
          <!--/.Card indigo-->
          <br />
          <!--Card pink-->
          <mdb-card class="pink lighten-2 text-center z-depth-2">
            <mdb-card-body>
              <p class="white-text mb-0">
                Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer
                posuere erat a ante.
              </p>
            </mdb-card-body>
          </mdb-card>
          <!--/.Card pink-->
          <br />
          <!--Card info-->
          <mdb-card class="info-color text-center z-depth-2 mb-4">
            <mdb-card-body>
              <p class="white-text mb-0">
                Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer
                posuere erat a ante.
              </p>
            </mdb-card-body>
          </mdb-card>
          <!--/.Card info-->

          <!--Card white-->
          <mdb-card class="white text-center z-depth-2 mb-4">
            <mdb-card-body>
              <p class="dark-grey mb-0">
                Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer
                posuere erat a ante.
              </p>
            </mdb-card-body>
          </mdb-card>
          <!--/.Card white-->
        </mdb-col>
        <mdb-col>
          <!--Card red-->
          <mdb-card class="red lighten-1 text-center z-depth-2">
            <mdb-card-body>
              <p class="white-text mb-0">
                Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer
                posuere erat a ante.
              </p>
            </mdb-card-body>
          </mdb-card>
          <!--/.Card red-->
          <br />
          <!--Card success-->
          <mdb-card class="success-color text-center z-depth-2">
            <mdb-card-body>
              <p class="white-text mb-0">
                Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer
                posuere erat a ante.
              </p>
            </mdb-card-body>
          </mdb-card>
          <!--/.Card success-->
          <br />
          <!--Card mdb-->
          <mdb-card class="mdb-color lighten-2 text-center z-depth-2 mb-4">
            <mdb-card-body>
              <p class="white-text mb-0">
                Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer
                posuere erat a ante.
              </p>
            </mdb-card-body>
          </mdb-card>
          <!--/.Card mdb-->

          <!--Card transparent-->
          <mdb-card class="transparent text-center z-depth-2">
            <mdb-card-body>
              <p class="dark-grey-text mb-0">
                Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer
                posuere erat a ante.
              </p>
            </mdb-card-body>
          </mdb-card>
          <!--/.Card transparent-->
        </mdb-col>
      </mdb-row>
    </section>
    <!--Section: Background variants-->

    <!--Section: Basic examples-->
    <section class="mb-5">
      <h5 class="my-5 dark-grey-text font-weight-bold">Basic examples</h5>
      <!--Grid row-->
      <mdb-row>
        <!--Grid column-->
        <mdb-col>
          <!--Panel-->
          <mdb-card>
            <mdb-card-header>Panel title</mdb-card-header>
            <mdb-card-body>
              <mdb-card-text
                >Some quick example text to build on the card title and make up
                the bulk of the card's content.</mdb-card-text
              >
              <div class="flex-row">
                <a class="card-link">Card link</a>
                <a class="card-link">Another link</a>
              </div>
            </mdb-card-body>
          </mdb-card>
          <!--/.Panel-->
        </mdb-col>
        <!--Grid column-->

        <!--Grid column-->
        <mdb-col>
          <!--Panel-->
          <mdb-card>
            <mdb-card-header class="deep-orange lighten-1 white-text">
              Featured
            </mdb-card-header>
            <mdb-card-body>
              <mdb-card-title>Special title treatment</mdb-card-title>
              <mdb-card-text
                >With supporting text below as a natural lead-in to additional
                content.</mdb-card-text
              >
              <mdb-btn color="deep-orange">Go somewhere</mdb-btn>
            </mdb-card-body>
          </mdb-card>
          <!--/.Panel-->
        </mdb-col>
        <!--Grid column-->

        <!--Grid column-->
        <mdb-col>
          <!--Panel-->
          <mdb-card class="text-center">
            <mdb-card-header class="success-color white-text">
              Featured
            </mdb-card-header>
            <mdb-card-body>
              <mdb-card-title>Special title treatment</mdb-card-title>
              <mdb-card-text
                >With supporting text below as a natural lead-in to additional
                content.</mdb-card-text
              >
              <mdb-btn color="success" size="sm">Go somewhere</mdb-btn>
            </mdb-card-body>
            <mdb-card-footer class=" text-muted success-color white-text">
              <p class="mb-0">2 days ago</p>
            </mdb-card-footer>
          </mdb-card>
          <!--/.Panel-->
        </mdb-col>
        <!--Grid column-->
      </mdb-row>
      <!--Grid row-->
    </section>
    <!--Section: Basic examples-->
    <!--Section: Docs link-->
    <section class="pb-4">
      <!--Panel-->
      <mdb-card>
        <mdb-card-header class="primary-color text-center white-text"
          >Full documentation</mdb-card-header
        >
        <mdb-card-body class="text-center">
          <p>Read the full documentation for these components.</p>
          <a
            href="https://mdbootstrap.com/docs/vue/components/panels/"
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
  mdbBtn,
  mdbCard,
  mdbCardHeader,
  mdbCardBody,
  mdbCardTitle,
  mdbCardText,
  mdbCardFooter
} from "mdbvue";

export default {
  name: "Panels",
  components: {
    mdbContainer,
    mdbRow,
    mdbCol,
    mdbBtn,
    mdbCard,
    mdbCardHeader,
    mdbCardBody,
    mdbCardTitle,
    mdbCardText,
    mdbCardFooter
  },
  data() {
    return {};
  }
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped></style>
