<template>
  <mdb-container fluid>
    <!--Section: Team v.1-->
    <section class="section team-section">
      <!--Grid row-->
      <div class="row text-center">
        <!-- Grid column -->
        <div class="col-md-8 mb-4">
          <!--Card-->
          <div class="card card-cascade cascading-admin-card user-card">
            <!--Card Data-->
            <div class="admin-up d-flex justify-content-start">
              <i class="fas fa-users info-color py-4 mr-3"></i>
              <div class="data">
                <h5 class="font-weight-bold dark-grey-text">
                  Edit Profile -
                  <span class="text-muted">Complete your profile</span>
                </h5>
              </div>
            </div>
            <!--/.Card Data-->

            <!--Card content-->
            <div class="card-body card-body-cascade">
              <!-- Grid row -->
              <div class="row">
                <!-- Grid column -->
                <div class="col-lg-4">
                  <mdb-input label="Username" />
                </div>
                <!-- Grid column -->

                <!-- Grid column -->
                <div class="col-lg-4">
                  <mdb-input label="Email address" />
                </div>
                <!-- Grid column -->

                <!-- Grid column -->
                <div class="col-lg-4">
                  <mdb-input label="Company" />
                </div>
                <!-- Grid column -->
              </div>
              <!-- Grid row -->

              <!-- Grid row -->
              <div class="row">
                <!-- Grid column -->
                <div class="col-md-6">
                  <mdb-input label="First name" />
                </div>
                <!-- Grid column -->

                <!-- Grid column -->
                <div class="col-md-6">
                  <mdb-input label="Last name" />
                </div>
                <!-- Grid column -->
              </div>
              <!-- Grid row -->

              <!-- Grid row -->
              <div class="row">
                <!-- Grid column -->
                <div class="col-md-12">
                  <mdb-input label="Address" />
                </div>
                <!-- Grid column -->
              </div>
              <!-- Grid row -->

              <!-- Grid row -->
              <div class="row">
                <!-- Grid column -->
                <div class="col-lg-4 col-md-12">
                  <mdb-input label="City" />
                </div>
                <!-- Grid column -->

                <!-- Grid column -->
                <div class="col-lg-4 col-md-6">
                  <mdb-input label="Country" />
                </div>
                <!-- Grid column -->

                <!-- Grid column -->
                <div class="col-lg-4 col-md-6">
                  <mdb-input label="Postal Code" />
                </div>
                <!-- Grid column -->
              </div>
              <!-- Grid row -->

              <!-- Grid row -->
              <div class="row">
                <!-- Grid column -->
                <div class="col-md-12 about-text">
                  <h4 class="text-muted text-left my-4">
                    <strong>About me</strong>
                  </h4>

                  <!--Basic textarea-->
                  <mdb-textarea label="Basic textarea" :rows="4" />
                </div>
                <!-- Grid column -->
              </div>
              <!-- Grid row -->
            </div>
            <!--/.Card content-->
          </div>
          <!--/.Card-->
        </div>
        <!-- Grid column -->

        <!-- Grid column -->
        <div class="col-md-4 mb-4">
          <!--Card-->
          <div class="card profile-card">
            <!--Avatar-->
            <div class="avatar z-depth-1-half mb-4">
              <img
                src="https://mdbootstrap.com/img/Photos/Avatars/img%20(10).jpg"
                class="rounded-circle"
                alt="First sample avatar image"
              />
            </div>

            <div class="card-body pt-0 mt-0">
              <!--Name-->
              <h3 class="mb-3 font-weight-bold">
                <strong>Anna Deynah</strong>
              </h3>
              <h6 class="font-weight-bold cyan-text mb-4">Web Designer</h6>

              <p class="mt-4 text-muted">
                Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do
                eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut
                enim ad minim veniam, quis nostrud exercitation ullamco laboris
                nisi ut aliquip consequat.
              </p>

              <mdb-btn color="info" rounded>Follow</mdb-btn>
            </div>
          </div>
          <!--Card-->
        </div>
        <!-- Grid column -->
      </div>
      <!--Grid row-->
    </section>
    <!--Section: Team v.1-->
  </mdb-container>
</template>

<script>
import { mdbContainer, mdbBtn, mdbInput, mdbTextarea } from "mdbvue";

export default {
  name: "Basicv1",
  components: {
    mdbContainer,
    mdbBtn,
    mdbInput,
    mdbTextarea
  }
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
.profile-card {
  margin-top: 100px;
}

.profile-card .avatar {
  max-width: 150px;
  max-height: 150px;
  margin: -70px auto 0;
  -webkit-border-radius: 50%;
  border-radius: 50%;
  overflow: hidden;
}
.cascading-admin-card .admin-up {
  margin-left: 4%;
  margin-right: 4%;
  margin-top: -20px;
}
.cascading-admin-card .admin-up .fa {
  padding: 1.7rem;
  font-size: 2rem;
  color: #fff;
  text-align: left;
  margin-right: 1rem;
  -webkit-border-radius: 3px;
  border-radius: 3px;
}
.cascading-admin-card .admin-up .fa,
.z-depth-2 {
  -webkit-box-shadow: 0 8px 17px 0 rgba(0, 0, 0, 0.2),
    0 6px 20px 0 rgba(0, 0, 0, 0.19);
  box-shadow: 0 8px 17px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);
}
</style>
