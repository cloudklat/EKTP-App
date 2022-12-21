<template>
  <div class="fullscreen white-skin">
    <!--Intro Section-->
    <section class="view fullscreen-view intro-2">
      <div class="mask rgba-gradient">
        <div
          class="container h-100 d-flex justify-content-center align-items-center"
        >
          <!--Grid row-->
          <div class="row  pt-5 mt-3">
            <!--Grid column-->
            <div class="col-md-12">
              <div class="card">
                <div class="card-body">
                  <h2
                    class="font-weight-bold my-4 text-center mb-5 mt-4 font-weight-bold"
                  >
                    <strong>Daftar Akun E-KTP</strong>
                  </h2>
                  <hr />

                  <!--Grid row-->
                  <div class="row mt-5">
                    <!--Grid column-->
                    <div class="col-md-6 ml-lg-5 ml-md-3">
                      <!--Grid row-->
                      <!-- <div class="row pb-4">
                        <div class="col-2 col-lg-1">
                          <i class="fas fa-university indigo-text fa-lg"></i>
                        </div>
                        <div class="col-10">
                          <h4 class="font-weight-bold mb-4">
                            <strong>Safety</strong>
                          </h4>
                          <p class="">
                            Lorem ipsum dolor sit amet, consectetur adipisicing
                            elit. Reprehenderit maiores nam, aperiam minima
                            assumenda deleniti hic.
                          </p>
                        </div>
                      </div> -->
                      <!--Grid row-->

                      <!--Grid row-->
                      <!-- <div class="row pb-4">
                        <div class="col-2 col-lg-1">
                          <i class="fas fa-desktop deep-purple-text fa-lg"></i>
                        </div>
                        <div class="col-10">
                          <h4 class="font-weight-bold mb-4">
                            <strong>Technology</strong>
                          </h4>
                          <p class="">
                            Lorem ipsum dolor sit amet, consectetur adipisicing
                            elit. Reprehenderit maiores nam, aperiam minima
                            assumenda deleniti hic.
                          </p>
                        </div>
                      </div> -->
                      <!--Grid row-->

                      <!--Grid row-->
                      <div class="row pb-4">
                        <div class="col-2 col-lg-1">
                          <i class="fas fa-money-bill purple-text fa-lg"></i>
                        </div>
                        <div class="col-10">
                          <h4 class="font-weight-bold mb-4">
                            <strong>Daftarkan E KTP</strong>
                          </h4>
                          <p class="">
                            Silahkan Mendaftar terlebih Dahulu Sebelum Login
                          </p>
                        </div>
                      </div>
                      <!--Grid row-->
                    </div>
                    <!--Grid column-->

                    <!--Grid column-->
                    <div class="col-md-5">
                      <!--Grid row-->
                      <div class="row pb-4 d-flex justify-content-center mb-4">
                        <h4 class="mt-3 mr-4">
                          <strong>Silahkan Daftar</strong>
                        </h4>

                        <!-- <div
                          class="inline-ul text-center d-flex justify-content-center"
                        >
                          <a class="p-2 m-2 fa-lg tw-ic">
                            <i class="fab fa-twitter fa-lg indigo-text"></i>
                          </a>
                          <a class="p-2 m-2 fa-lg li-ic">
                            <i class="fab fa-linkedin-in fa-lg indigo-text">
                            </i>
                          </a>
                          <a class="p-2 m-2 fa-lg ins-ic">
                            <i class="fab fa-instagram fa-lg indigo-text"> </i>
                          </a>
                        </div> -->

                        <!-- <h4 class="mt-3 ml-4">
                          <strong>or:</strong>
                        </h4> -->
                      </div>
                      <!--/Grid row-->

                      <!--Body-->
                      <mdb-input label="Nama Lengkap" icon="user" />
                      <mdb-input label="Email" icon="envelope" />
                      <mdb-input label="Password" icon="lock" type="password" />
                      <mdb-input
                        label="Ulangi Password"
                        icon="sync-alt"
                        type="password"
                      />

                      <div class="text-center">
                        <mdb-btn color="indigo" rounded class="mt-5"
                          >Sign up</mdb-btn
                        >
                      </div>
                    </div>
                    <!--Grid column-->
                  </div>
                  <!--Grid row-->
                </div>
              </div>
            </div>
            <!--Grid column-->
          </div>
          <!--Grid row-->
        </div>
      </div>
    </section>
    <!--Intro Section-->
  </div>
</template>

<script>
import { mdbBtn, mdbInput } from "mdbvue";

export default {
  name: "Register",
  components: {
    mdbBtn,
    mdbInput,
  },
  data() {
    return {};
  },
};
</script>

<style scoped>
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

.rgba-gradient {
  background: -webkit-linear-gradient(
    180deg,
    rgba(22, 91, 231, 0.5),
    rgba(255, 32, 32, 0.5) 100%
  );
  background: -webkit-gradient(
    linear,
    180deg,
    rgba(22, 91, 231, 0.5),
    rgba(255, 32, 32, 0.5) 100%
  );
  background: linear-gradient(
    0deg,
    rgba(22, 91, 231, 0.5),
    rgba(255, 32, 32, 0.5) 100%
  );
}

.card {
  background-color: rgba(255, 255, 255, 0.85);
}

h6 {
  line-height: 1.7;
}
</style>
