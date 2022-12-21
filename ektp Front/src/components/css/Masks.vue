<template>
  <mdb-container fluid>
    <!--Section: Overlay-->
    <section>
      <h4 class="my-5 font-weight-bold dark-grey-text">
        <strong>Overlays</strong>
      </h4>

      <!--Grid row-->
      <mdb-row>
        <!--Grid column-->
        <mdb-col md="12" lg="4" class="mb-4">
          <mdb-view
            src="https://mdbootstrap.com/img/Photos/Others/forest-sm.jpg"
            class="img-fluid"
            alt=""
          >
            <mdb-mask
              flex-center
              overlay="teal-slight"
              text="super light overlay"
            >
            </mdb-mask>
          </mdb-view>
        </mdb-col>
        <!--Grid column-->

        <!--Grid column-->
        <mdb-col lg="4" md="6" class="mb-4">
          <mdb-view
            src="https://mdbootstrap.com/img/Photos/Others/forest-sm.jpg"
            class="img-fluid"
            alt=""
          >
            <mdb-mask flex-center overlay="teal-light" text="light overlay">
            </mdb-mask>
          </mdb-view>
        </mdb-col>
        <!--Grid column-->

        <!--Grid column-->
        <mdb-col lg="4" md="6" class="mb-4">
          <mdb-view
            src="https://mdbootstrap.com/img/Photos/Others/forest-sm.jpg"
            class="img-fluid"
            alt=""
          >
            <mdb-mask flex-center overlay="teal-strong" text="strong overlay">
            </mdb-mask>
          </mdb-view>
        </mdb-col>
        <!--Grid column-->
      </mdb-row>
      <!--Grid row-->
    </section>
    <!--Section: Overlay-->

    <hr class="mb-5" />

    <!--Section: Patterns-->
    <section>
      <h4 class="my-5 font-weight-bold dark-grey-text">
        <strong>Patterns</strong>
      </h4>

      <!--Grid row-->
      <mdb-row>
        <!--Grid column-->
        <mdb-col md="12" lg="4" class="mb-4">
          <mdb-view
            src="https://mdbootstrap.com/img/Photos/Others/nature-sm.jpg"
            class="img-fluid"
            alt="Image of ballons flying over canyons with mask pattern one."
          >
            <mdb-mask pattern="1" flex-center text=".pattern-1"> </mdb-mask>
          </mdb-view>
        </mdb-col>
        <!--Grid column-->

        <!--Grid column-->
        <mdb-col lg="4" md="6" class="mb-4">
          <mdb-view
            src="https://mdbootstrap.com/img/Photos/Others/nature-sm.jpg"
            class="img-fluid"
            alt=""
          >
            <mdb-mask pattern="2" flex-center text=".pattern-2"> </mdb-mask>
          </mdb-view>
        </mdb-col>
        <!--Grid column-->

        <!--Grid column-->
        <mdb-col lg="4" md="6" class="mb-4">
          <mdb-view
            src="https://mdbootstrap.com/img/Photos/Others/nature-sm.jpg"
            class="img-fluid"
            alt="Image of ballons flying over canyons with mask pattern one."
          >
            <mdb-mask pattern="3" flex-center text=".pattern-3"> </mdb-mask>
          </mdb-view>
        </mdb-col>
        <!--Grid column-->
      </mdb-row>
      <!--Grid row-->

      <!--Grid row-->
      <mdb-row>
        <!--Grid column-->
        <mdb-col md="12" lg="4" class="mb-4">
          <mdb-view
            src="https://mdbootstrap.com/img/Photos/Others/nature-sm.jpg"
            class="img-fluid"
            alt="Image of ballons flying over canyons with mask pattern one."
          >
            <mdb-mask pattern="4" flex-center text=".pattern-4"> </mdb-mask>
          </mdb-view>
        </mdb-col>
        <!--Grid column-->

        <!--Grid column-->
        <mdb-col lg="4" md="6" class="mb-4">
          <mdb-view
            src="https://mdbootstrap.com/img/Photos/Others/nature-sm.jpg"
            class="img-fluid"
            alt=""
          >
            <mdb-mask pattern="5" flex-center text=".pattern-5"> </mdb-mask>
          </mdb-view>
        </mdb-col>
        <!--Grid column-->

        <!--Grid column-->
        <mdb-col lg="4" md="6" class="mb-4">
          <mdb-view
            src="https://mdbootstrap.com/img/Photos/Others/nature-sm.jpg"
            class="img-fluid"
            alt="Image of ballons flying over canyons with mask pattern one."
          >
            <mdb-mask pattern="6" flex-center text=".pattern-6"> </mdb-mask>
          </mdb-view>
        </mdb-col>
        <!--Grid column-->
      </mdb-row>
      <!--Grid row-->

      <!--Grid row-->
      <mdb-row class="mb-4">
        <!--Grid column-->
        <mdb-col lg="4" md="12">
          <mdb-view
            src="https://mdbootstrap.com/img/Photos/Others/nature-sm.jpg"
            class="img-fluid"
            alt="Image of ballons flying over canyons with mask pattern one."
          >
            <mdb-mask pattern="7" flex-center text=".pattern-7"> </mdb-mask>
          </mdb-view>
        </mdb-col>
        <!--Grid column-->

        <!--Grid column-->
        <mdb-col lg="4" md="6">
          <mdb-view
            src="https://mdbootstrap.com/img/Photos/Others/nature-sm.jpg"
            class="img-fluid"
            alt=""
          >
            <mdb-mask pattern="8" flex-center text=".pattern-8"> </mdb-mask>
          </mdb-view>
        </mdb-col>
        <!--Grid column-->

        <!--Grid column-->
        <mdb-col lg="4" md="6">
          <mdb-view
            src="https://mdbootstrap.com/img/Photos/Others/nature-sm.jpg"
            class="img-fluid"
            alt="Image of ballons flying over canyons with mask pattern one."
          >
            <mdb-mask pattern="9" flex-center text=".pattern-9"> </mdb-mask>
          </mdb-view>
        </mdb-col>
        <!--Grid column-->
      </mdb-row>
      <!--Grid row-->
    </section>
    <!--Section: Patterns-->

    <!--Section: Docs link-->
    <section>
      <!--Panel-->
      <div class="card text-center mt-5">
        <h3 class="card-header primary-color white-text">Full documentation</h3>
        <div class="card-body">
          <p class="card-text">
            Read the full documentation for these components.
          </p>
          <a
            href="https://mdbootstrap.com/masks/"
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
import { mdbContainer, mdbMask, mdbView, mdbRow, mdbCol } from "mdbvue";

export default {
  name: "Masks",
  components: {
    mdbContainer,
    mdbMask,
    mdbView,
    mdbRow,
    mdbCol
  }
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped></style>
