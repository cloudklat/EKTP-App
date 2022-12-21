<template>
  <div class="fullscreen">
    <mdb-navbar
      navStyle="background-color: transparent;"
      position="top"
      dark
      transparent
    >
      <mdb-navbar-brand href="#"><strong>MDB</strong></mdb-navbar-brand>
      <mdb-navbar-toggler>
        <mdb-navbar-nav>
          <mdb-nav-item href="#" waves-fixed active>Home</mdb-nav-item>
          <mdb-nav-item href="#" waves-fixed>Features</mdb-nav-item>
          <mdb-nav-item href="#" waves-fixed>Pricing</mdb-nav-item>
        </mdb-navbar-nav>
        <!-- Search form -->
        <form>
          <mdb-input
            type="text"
            class="text-white"
            placeholder="Search"
            aria-label="Search"
            label
            navInput
            waves
            waves-fixed
          />
        </form>
      </mdb-navbar-toggler>
    </mdb-navbar>

    <!--Intro Section-->
    <section class="view fullscreen-view intro-2 rgba-gradient">
      <div class="mask rgba-stylish-strong">
        <div
          class="container h-100 d-flex justify-content-center align-items-center"
        >
          <!--Section: Pricing v.3-->
          <section class="section my-5">
            <!--Section heading-->
            <h1 class="text-center my-5 h1 white-text">Our pricing plans</h1>
            <!--Section description-->
            <p class="text-center mb-5 w-responsive mx-auto white-text">
              Lorem ipsum dolor sit amet, consectetur adipisicing elit. Fugit,
              error amet numquam iure provident voluptate esse quasi, veritatis
              totam voluptas nostrum quisquam eum porro a pariatur accusamus
              veniam.
            </p>

            <!--Grid row-->
            <div class="row">
              <!--Grid column-->
              <div class="col-lg-4 col-md-12 mb-4">
                <!--Card-->
                <div class="card hoverable">
                  <!--Content-->
                  <div class="text-center">
                    <div class="card-body">
                      <h5>Basic plan</h5>
                      <div class="d-flex justify-content-center">
                        <div
                          class="card-circle d-flex justify-content-center align-items-center"
                        >
                          <i class="fas fa-home light-blue-text"></i>
                        </div>
                      </div>

                      <!--Price-->
                      <h2 class="font-weight-bold my-3">59$</h2>
                      <p class="grey-text">
                        Lorem ipsum dolor sit amet, consectetur adipisicing
                        elit. Culpa pariatur id nobis accusamus deleniti cumque
                        hic laborum.
                      </p>
                      <mdb-btn color="light-blue" rounded>Buy now</mdb-btn>
                    </div>
                  </div>
                </div>
                <!--Card-->
              </div>
              <!--Grid column-->

              <!--Grid column-->
              <div class="col-lg-4 col-md-12 mb-4">
                <!--Card-->
                <div class="card purple-gradient hoverable">
                  <!--Content-->
                  <div class="text-center white-text">
                    <div class="card-body">
                      <h5>Premium plan</h5>
                      <div class="d-flex justify-content-center">
                        <div
                          class="card-circle d-flex justify-content-center align-items-center"
                        >
                          <i class="fas fa-users white-text"></i>
                        </div>
                      </div>

                      <!--Price-->
                      <h2 class="font-weight-bold my-3">79$</h2>
                      <p>
                        Esse corporis saepe laudantium velit adipisci cumque
                        iste ratione facere non distinctio cupiditate sequi
                        atque.
                      </p>
                      <mdb-btn outline="white" rounded>Buy now</mdb-btn>
                    </div>
                  </div>
                </div>
                <!--Card-->
              </div>
              <!--Grid column-->

              <!--Grid column-->
              <div class="col-lg-4 col-md-12 mb-4">
                <!--Card-->
                <div class="card hoverable">
                  <!--Content-->
                  <div class="text-center">
                    <div class="card-body">
                      <h5>Advanced plan</h5>
                      <div class="d-flex justify-content-center">
                        <div
                          class="card-circle d-flex justify-content-center align-items-center"
                        >
                          <i class="fas fa-chart-bar light-blue-text"></i>
                        </div>
                      </div>

                      <!--Price-->
                      <h2 class="font-weight-bold my-3">99$</h2>
                      <p class="grey-text">
                        At ab ea a molestiae corrupti numquam quo beatae minima
                        ratione magni accusantium repellat eveniet quia vitae.
                      </p>
                      <mdb-btn color="light-blue" rounded>Buy now</mdb-btn>
                    </div>
                  </div>
                </div>
                <!--Card-->
              </div>
              <!--Grid column-->
            </div>
            <!--Grid row-->
          </section>
          <!--Section: Pricing v.3-->
        </div>
      </div>
    </section>
  </div>
</template>

<script>
import {
  mdbNavbar,
  mdbNavItem,
  mdbNavbarNav,
  mdbNavbarToggler,
  mdbBtn,
  mdbInput,
  mdbNavbarBrand
} from "mdbvue";

export default {
  name: "Pricing",
  components: {
    mdbNavbar,
    mdbNavItem,
    mdbNavbarNav,
    mdbNavbarToggler,
    mdbBtn,
    mdbInput,
    mdbNavbarBrand
  },
  data() {
    return {};
  }
};
</script>

<style scoped>
.d-flex > *,
.d-inline-flex > * {
  -ms-flex: 0 0 auto !important;
  flex: 0 0 auto !important;
}

.container.d-flex > *,
.container.d-inline-flex > * {
  -webkit-box-flex: 1 !important;
  -ms-flex: 1 1 auto !important;
  flex: 1 1 auto !important;
}

.intro-2 {
  background: url("http://mdbootstrap.com/img/Photos/Others/forest1.jpg")
    no-repeat center center;
  background-size: cover;
}

.top-nav-collapse {
  background-color: #3f51b5 !important;
}

.navbar:not(.top-nav-collapse) {
  background: transparent !important;
}

@media (max-width: 768px) {
  .navbar:not(.top-nav-collapse) {
    background: #3f51b5 !important;
  }
}
@media (min-width: 800px) and (max-width: 850px) {
  .navbar:not(.top-nav-collapse) {
    background: #3f51b5 !important;
  }
}

.card {
  background-color: rgba(255, 255, 255, 0.85);
}

h6 {
  line-height: 1.7;
}
</style>
