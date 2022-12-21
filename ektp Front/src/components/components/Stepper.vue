<template>
  <mdb-container fluid>
    <h2 class="mt-lg-5 mb-5 pb-4 font-weight-bold"><strong>Stepper</strong></h2>
    <!--Section: Horizontal stepper-->
    <section class="mb-5">
      <!--Card-->
      <mdb-card narrow style="min-height: 450px;">
        <!--Card image-->
        <mdb-view cascade gradient="blue">
          <h5 class="mb-0">Horizontal stepper</h5>
        </mdb-view>
        <!--/Card image-->

        <!--Card content-->
        <mdb-card-body class="text-center">
          <!-- Horizontal Steppers -->
          <mdb-row>
            <mdb-col md="12">
              <mdb-stepper simpleH :steps="steps" />
            </mdb-col>
          </mdb-row>
          <!-- /.Horizontal Steppers -->
        </mdb-card-body>
        <!--/.Card content-->
      </mdb-card>
      <!--/.Card-->
    </section>
    <!--Section: Horizontal stepper-->

    <!--Section: Horizontal stepper-->
    <section>
      <!--Card-->
      <mdb-card narrow>
        <!--Card image-->
        <mdb-view cascade gradient="peach">
          <h5 class="mb-0">Vertical stepper</h5>
        </mdb-view>
        <!--/Card image-->
        <!--Card content-->
        <mdb-card-body>
          <!-- Vertical Steppers -->
          <mdb-row>
            <mdb-col>
              <mdb-stepper simpleV :steps="4">
                <template #1>
                  <form>
                    <mdb-input label="name" />
                  </form>
                </template>
                <template #2>
                  <form>
                    <mdb-input label="email" type="email" />
                  </form>
                </template>
                <template #3>
                  <form>
                    <mdb-input label="message" type="textarea" :rows="4" />
                  </form>
                </template>
                <template #4>
                  <p>Finish!</p>
                </template>
              </mdb-stepper>
            </mdb-col>
          </mdb-row>
        </mdb-card-body>
        <!--/.Card content-->
      </mdb-card>
      <!--/.Card-->
    </section>
    <!--Section: Horizontal stepper-->

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
            href="https://mdbootstrap.com/docs/vue/components/stepper/"
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
  mdbStepper,
  mdbView,
  mdbCard,
  mdbCardBody,
  mdbCardHeader,
  mdbInput
} from "mdbvue";

export default {
  name: "Stepper",
  components: {
    mdbContainer,
    mdbRow,
    mdbCol,
    mdbStepper,
    mdbView,
    mdbCard,
    mdbCardBody,
    mdbCardHeader,
    mdbInput
  },
  data() {
    return {
      steps: [
        {
          content:
            "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Esse cupiditate voluptate facere iusto quaerat vitae excepturi, accusantium ut aliquam repellat atque nesciunt nostrum similique. Inventore nostrum ut, nobis porro sapiente."
        },
        {
          content:
            "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Esse cupiditate voluptate facere iusto quaerat vitae excepturi, accusantium ut aliquam repellat atque nesciunt nostrum similique. Inventore nostrum ut, nobis porro sapiente."
        },
        {
          content:
            "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Esse cupiditate voluptate facere iusto quaerat vitae excepturi, accusantium ut aliquam repellat atque nesciunt nostrum similique. Inventore nostrum ut, nobis porro sapiente."
        }
      ]
    };
  }
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped></style>
