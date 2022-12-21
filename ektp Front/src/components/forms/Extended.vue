<template>
  <mdb-container fluid>
    <!--Grid row-->
    <div class="row">
      <!--Grid column-->
      <div class="col-lg-4 col-md-12 mb-4">
        <!--Card-->
        <div class="card">
          <!--Card content-->
          <div class="card-body">
            <!-- Login form -->
            <form>
              <p class="h5 text-center mb-4">Sign in</p>

              <mdb-input
                class="grey-text"
                type="text"
                label="Your email"
                icon="envelope"
              />
              <mdb-input
                class="grey-text"
                type="password"
                label="Your password"
                icon="lock"
              />

              <div class="text-center mt-4">
                <mdb-btn color="default">Login</mdb-btn>
              </div>
            </form>
            <!-- Login form -->
          </div>
        </div>
        <!--/.Card-->
      </div>
      <!--Grid column-->

      <!--Grid column-->
      <div class="col-lg-4 col-md-6 mb-4">
        <!--Card-->
        <div class="card">
          <!--Card content-->
          <div class="card-body">
            <!-- Register form -->
            <form>
              <p class="h5 text-center mb-4">Sign up</p>

              <mdb-input
                class="grey-text"
                type="text"
                label="Your name"
                icon="user"
              />
              <mdb-input
                class="grey-text"
                type="text"
                label="Your email"
                icon="envelope"
              />
              <mdb-input
                class="grey-text"
                type="password"
                label="Your password"
                icon="lock"
              />

              <div class="text-center mt-4">
                <mdb-btn color="deep-orange">Sign up</mdb-btn>
              </div>
            </form>
            <!-- Register form -->
          </div>
        </div>
        <!--/.Card-->
      </div>
      <!--Grid column-->

      <!--Grid column-->
      <div class="col-lg-4 col-md-6 mb-4">
        <!--Card-->
        <div class="card">
          <!--Card content-->
          <div class="card-body">
            <!-- Subscription form -->
            <form>
              <p class="h5 text-center mb-4">Subscribe</p>

              <mdb-input
                class="grey-text"
                type="text"
                label="Your name"
                icon="user"
              />
              <mdb-input
                class="grey-text"
                type="text"
                label="Your email"
                icon="envelope"
              />

              <div class="text-center mt-4">
                <mdb-btn color="indigo" icon="paper-plane-o" iconRight
                  >Send</mdb-btn
                >
              </div>
            </form>
            <!-- Subscription form -->
          </div>
        </div>
        <!--/.Card-->
      </div>
      <!--Grid column-->
    </div>
    <!--Grid row-->

    <hr class="my-5" />

    <!--Section: Contact v.1-->
    <section class="section pb-5">
      <!--Section heading-->
      <h2 class="text-center my-5 h1 pt-4">Contact us</h2>
      <!--Section description-->
      <p class="text-center mb-5 w-responsive mx-auto pb-4">
        Lorem ipsum dolor sit amet, consectetur adipisicing elit. Fugit, error
        amet numquam iure provident voluptate esse quasi, veritatis totam
        voluptas nostrum quisquam eum porro a pariatur accusamus veniam.
      </p>

      <div class="row">
        <!--Grid column-->
        <div class="col-lg-5 mb-4">
          <!--Form with header-->
          <div class="card">
            <div class="card-body">
              <!--Header-->
              <div class="form-header blue accent-1">
                <h3><i class="fas fa-envelope"></i> Write to us:</h3>
              </div>

              <p>We'll write rarely, but only the best content.</p>
              <br />

              <!--Body-->
              <mdb-input
                class="grey-text"
                type="text"
                label="Your name"
                icon="user"
              />
              <mdb-input
                class="grey-text"
                type="text"
                label="Your email"
                icon="envelope"
              />
              <mdb-input
                class="grey-text"
                type="text"
                label="Your password"
                icon="tag"
              />
              <mdb-textarea
                class="grey-text"
                :rows="4"
                label="Message"
                icon="pencil-alt"
              />

              <div class="text-center mt-4">
                <mdb-btn color="light-blue">Submit</mdb-btn>
              </div>
            </div>
          </div>
          <!--Form with header-->
        </div>
        <!--Grid column-->

        <!--Grid column-->
        <div class="col-lg-7">
          <!--Google map-->
          <GmapMap
            :center="{ lat: 10, lng: 10 }"
            :zoom="7"
            style="width: 100%; height: 300px"
          >
          </GmapMap>

          <br />
          <!--Buttons-->
          <div class="row text-center">
            <div class="col-md-4">
              <mdb-btn
                floating
                tag="a"
                color="blue accent-1"
                icon="map-marker"
                iconLeft
              ></mdb-btn>
              <p>San Francisco, CA 94126</p>
              <p>United States</p>
            </div>

            <div class="col-md-4">
              <mdb-btn
                floating
                tag="a"
                color="blue accent-1"
                icon="phone"
                iconLeft
              ></mdb-btn>
              <p>+ 01 234 567 89</p>
              <p>Mon - Fri, 8:00-22:00</p>
            </div>

            <div class="col-md-4">
              <mdb-btn
                floating
                tag="a"
                color="blue accent-1"
                icon="envelope"
                iconLeft
              ></mdb-btn>
              <p>info@gmail.com</p>
              <p>sale@gmail.com</p>
            </div>
          </div>
        </div>
        <!--Grid column-->
      </div>
    </section>
    <!--Section: Contact v.1-->

    <!--Section: Docs link-->
    <section class="pb-4">
      <!--Panel-->
      <div class="card text-center">
        <h3 class="card-header primary-color white-text">Full documentation</h3>
        <div class="card-body">
          <p class="card-text">
            Read the full documentation for these components.
          </p>
          <a
            href="https://mdbootstrap.com/docs/vue/forms/basic/"
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
import {
  mdbContainer,
  mdbInput,
  mdbTextarea,
  mdbBtn
} from "mdbvue";

export default {
  name: "Extended",
  components: {
    mdbContainer,
    mdbInput,
    mdbTextarea,
    mdbBtn
  },
  data() {
    return {};
  }
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped></style>
