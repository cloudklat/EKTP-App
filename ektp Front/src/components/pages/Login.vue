<template>
  <div class="classic-form-page">
    <mdb-view>
      <mdb-mask
        overlay="stylish-strong"
        class="d-flex justify-content-center align-items-center"
      >
        <mdb-container>
          <mdb-row>
            <div class="col-xl-5 col-lg-6 col-md-10 col-sm-12 mx-auto mt-5">
              <mdb-card id="classic-card">
                <mdb-card-body class="z-depth-2 white-text">
                  <div class="form-header purple-gradient">
                    <h3><i class="fas fa-user mt-2 mb-2"></i> Log in:</h3>
                  </div>
                  <mdb-input
                    label="Input Email"
                    labelColor="white"
                    icon="user"
                  />

                  <mdb-input
                    label="Input password"
                    labelColor="white"
                    icon="lock"
                    type="password"
                  />
                  <div class="text-center mt-4 black-text">
                    <mdb-btn gradient="purple">Sign In</mdb-btn>
                    <mdb-btn gradient="purple">Daftar</mdb-btn>
                    <hr />
                  </div>
                </mdb-card-body>
              </mdb-card>
            </div>
          </mdb-row>
        </mdb-container>
      </mdb-mask>
    </mdb-view>
  </div>
</template>

<script>
import {
  mdbView,
  mdbMask,
  mdbBtn,
  mdbCard,
  mdbCardBody,
  mdbInput,
  mdbContainer,
  mdbRow,
} from "mdbvue";

export default {
  name: "Login",
  components: {
    mdbView,
    mdbMask,
    mdbBtn,
    mdbCard,
    mdbCardBody,
    mdbInput,

    mdbContainer,
    mdbRow,
  },
  data() {
    return {};
  },
};
</script>

<style scoped>
.classic-form-page {
  position: fixed;
  left: 0;
  top: 0;
  z-index: 10000;
  height: 100vh;
  width: 100%;
}

.classic-form-page .view {
  background-image: url("http://mdbootstrap.com/img/Photos/Horizontal/Nature/full page/img%20(11).jpg");
  background-repeat: no-repeat;
  background-size: cover;
  background-position: center center;
  height: 100vh;
}

.card {
  background-color: rgba(229, 228, 255, 0.2);
}

.classic-form-page h6 {
  line-height: 1.7;
}

.classic-form-page .navbar {
  transition: background 0.5s ease-in-out, padding 0.5s ease-in-out;
}

.classic-form-page .navbar .md-form {
  margin: 0;
}

.top-nav-collapse {
  background: #424f95 !important;
}

@media (max-width: 768px) {
  .classic-form-page .navbar:not(.top-nav-collapse) {
    background: #424f95 !important;
  }
}

.classic-form-page label {
  color: #fff !important;
}
</style>
