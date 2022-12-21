<template>
  <mdb-container fluid>
    <!--Section: Profile-->
    <section>
      <!--Grid row-->
      <div class="row mt-5">
        <!--Grid column-->
        <div class="col-lg-4 col-md-12">
          <!--Section: Basic Info-->
          <section class="card profile-card mb-4 text-center">
            <div class="avatar z-depth-1-half">
              <img
                src="https://mdbootstrap.com/img/Photos/Avatars/img%20(8).jpg"
                alt=""
                class="img-fluid"
              />
            </div>
            <!--Card content-->
            <div class="card-body">
              <!--Title-->
              <h4 class="card-title"><strong>John Doe</strong></h4>
              <h5>Web designer at <a href="">MDBootstrap</a></h5>
              <p class="dark-grey-text">Warsaw, Poland</p>

              <!-- Social -->
              <mdb-btn
                class="dark-grey-text"
                tag="a"
                dark-waves
                floating
                transparent
                ><mdb-icon class="dark-grey-text" fab icon="facebook"
              /></mdb-btn>
              <mdb-btn
                class="dark-grey-text"
                tag="a"
                dark-waves
                floating
                transparent
                ><mdb-icon class="dark-grey-text" fab icon="twitter"
              /></mdb-btn>
              <mdb-btn
                class="dark-grey-text"
                tag="a"
                dark-waves
                floating
                transparent
                ><mdb-icon class="dark-grey-text" fab icon="linkedin"
              /></mdb-btn>

              <!--Text-->
              <p class="card-text mt-3">
                Some quick example text to build on the card title and make up
                the bulk of the card's content.
              </p>

              <mdb-btn
                color="info"
                rounded
                size="sm"
                icon="paper-plane"
                iconRight
                @click="showModal = true"
                >Contact</mdb-btn
              >

              <mdb-modal cascade :show="showModal" @close="showModal = false">
                <mdb-modal-header class="light-blue darken-3 white-text">
                  <mdb-modal-title>
                    <h4 class="">
                      <i class="far fa-envelope"></i> New Message
                    </h4>
                  </mdb-modal-title>
                </mdb-modal-header>
                <mdb-modal-body>
                  <mdb-textarea label="Your message" :rows="20" />
                </mdb-modal-body>
                <mdb-modal-footer>
                  <mdb-btn outline="primary" @click="showModal = false"
                    >Cancel</mdb-btn
                  >
                  <mdb-btn color="primary" icon="paper-plane" iconRight
                    >Send</mdb-btn
                  >
                </mdb-modal-footer>
              </mdb-modal>
            </div>
          </section>
          <!--Section: Basic Info-->

          <!--Section: Achievements-->
          <section class="card mb-4">
            <div class="card-body text-center">
              <h5><strong>John's Achievements</strong></h5>

              <hr class="my-3" />

              <mdb-btn
                color="light-blue"
                rounded
                size="sm"
                class="px-3"
                @click="showModal2 = true"
                >Bootstrap Master</mdb-btn
              >
              <mdb-modal cascade :show="showModal2" @close="showModal2 = false">
                <mdb-modal-header class="light-blue darken-3 white-text">
                  <mdb-modal-title>
                    <h4 class="">
                      <i class="far fa-newspaper"></i> Bootstrap Master
                    </h4>
                  </mdb-modal-title>
                </mdb-modal-header>
                <mdb-modal-body class="text-left">
                  <p>
                    Lorem ipsum dolor sit amet, consectetur adipisicing elit.
                    Quam quibusdam modi veritatis non accusamus distinctio
                    consequuntur aliquam, assumenda tempore in illum aspernatur
                    quia, minus ex! Eius tenetur praesentium, consectetur quod!
                  </p>
                </mdb-modal-body>
                <mdb-modal-footer class="justify-content-center">
                  <mdb-btn outline="primary" @click="showModal2 = false"
                    >Close</mdb-btn
                  >
                  <mdb-btn color="primary" icon="arrow-right" iconRight
                    >Go to</mdb-btn
                  >
                </mdb-modal-footer>
              </mdb-modal>

              <mdb-btn
                color="blue-grey"
                rounded
                size="sm"
                class="px-3"
                @click="showModal2 = true"
                >WordPress Master</mdb-btn
              >
              <mdb-btn
                color="default"
                rounded
                size="sm"
                class="px-3"
                @click="showModal2 = true"
                >Angular Master</mdb-btn
              >
              <mdb-btn
                color="secondary"
                rounded
                size="sm"
                class="px-3"
                @click="showModal2 = true"
                >MDB Expert</mdb-btn
              >
              <mdb-btn
                color="deep-purple"
                rounded
                size="sm"
                class="px-3"
                @click="showModal2 = true"
                >Community contributor</mdb-btn
              >
              <mdb-btn
                color="indigo"
                rounded
                size="sm"
                class="px-3"
                @click="showModal2 = true"
                >MDB Pro User</mdb-btn
              >
            </div>
          </section>
          <!--Section: Achievements-->

          <!--Section: Experience-->
          <section class="card mb-4">
            <div class="card-body">
              <h5 class="text-center mb-4">
                <strong>John's Contributions </strong>
              </h5>

              <ul class="list-unstyled pt-4">
                <li>
                  <p>
                    Questions
                    <span class="badge badge-primary pull-right">14</span>
                  </p>
                </li>
                <hr />
                <li>
                  <p>
                    Answers
                    <span class="badge badge-primary pull-right">14</span>
                  </p>
                </li>
                <hr />
                <li>
                  <p>
                    Submited projects
                    <span class="badge badge-primary pull-right">14</span>
                  </p>
                </li>
                <hr />
                <li>
                  <p>
                    Pull requests
                    <span class="badge badge-primary pull-right">14</span>
                  </p>
                </li>
              </ul>
            </div>
          </section>
          <!--Section: Experience-->
        </div>
        <!--Grid column-->

        <!--Grid column-->
        <div class="col-lg-8 col-md-12 text-center">
          <!-- Heading -->
          <div class="text-center mt-3 mb-5">
            <h4><strong>John's projects</strong></h4>

            <mdb-btn
              color="info"
              rounded
              icon="photo"
              class="mt-4"
              iconRight
              @click="showModal3 = true"
              >Submit new project</mdb-btn
            >

            <mdb-modal cascade :show="showModal3" @close="showModal3 = false">
              <mdb-modal-header class="light-blue darken-3 white-text">
                <mdb-modal-title>
                  <h4 class="">
                    <i class="far fa-envelope"></i> Submit new project
                  </h4>
                </mdb-modal-title>
              </mdb-modal-header>
              <mdb-modal-body>
                <mdb-input label="Project name" />
                <mdb-input label="Project URL address" />
                <mdb-input label="Image URL" />
                <mdb-textarea label="Description" :rows="5" />
              </mdb-modal-body>
              <mdb-modal-footer class="justify-content-center">
                <mdb-btn outline="primary" @click="showModal3 = false"
                  >Close</mdb-btn
                >
                <mdb-btn color="primary" icon="check" iconRight>Submit</mdb-btn>
              </mdb-modal-footer>
            </mdb-modal>
          </div>
          <!-- Heading -->

          <!-- Card row -->
          <div class="card-deck">
            <!--Card-->
            <div class="card card-cascade narrower card-ecommerce mb-5">
              <!--Card image-->
              <div class="view view-cascade overlay">
                <img
                  src="https://mdbootstrap.com/img/Mockups/Horizontal/6-col/pro-profile-page.jpg"
                  class="img-fluid"
                  alt=""
                />
                <a href="#">
                  <div class="mask"></div>
                </a>
              </div>

              <!--Card content-->
              <div class="card-body card-body-cascade">
                <!--Title-->
                <h4 class="card-title">Project name</h4>
                <!--Text-->
                <p class="card-text">
                  Some quick example text to build on the card title and make up
                  the bulk of the card's content.
                </p>
              </div>

              <!--Card footer-->
              <div class="card-footer links-light">
                <span class="float-left pt-2">
                  <a><i class="fas fa-share-alt mr-2"></i></a>
                  <a><i class="far fa-heart mr-2"></i>10</a>
                </span>
                <span class="float-right">
                  <a href="" class="waves-effect p-2"
                    >Live Preview <i class="fas fa-photo ml-1"></i
                  ></a>
                </span>
              </div>
            </div>
            <!--/.Card-->

            <!--Card-->
            <div class="card card-cascade narrower card-ecommerce d-flex mb-5">
              <!--Card image-->
              <div class="view view-cascade overlay">
                <img
                  src="https://mdbootstrap.com/img/Mockups/Horizontal/6-col/pro-signup.jpg"
                  class="img-fluid"
                  alt=""
                />
                <a href="#">
                  <div class="mask"></div>
                </a>
              </div>

              <!--Card content-->
              <div class="card-body card-body-cascade">
                <!--Title-->
                <h4 class="card-title">Project name</h4>
                <!--Text-->
                <p class="card-text">
                  Some quick example text to build on the card title and make up
                  the bulk of the card's content.
                </p>
              </div>

              <!--Card footer-->
              <div class="card-footer links-light">
                <span class="float-left pt-2">
                  <a><i class="fas fa-share-alt mr-2"></i></a>
                  <a><i class="far fa-heart mr-2"></i>10</a>
                </span>
                <span class="float-right">
                  <a href="" class="waves-effect p-2"
                    >Live Preview <i class="fas fa-photo ml-1"></i
                  ></a>
                </span>
              </div>
            </div>
            <!--/.Card-->
          </div>
          <!-- Card row -->

          <!-- Card row -->
          <div class="card-deck">
            <!--Card-->
            <div class="card card-cascade narrower card-ecommerce d-flex mb-5">
              <!--Card image-->
              <div class="view view-cascade overlay">
                <img
                  src="https://mdbootstrap.com/img/Mockups/Horizontal/6-col/pro-pricing.jpg"
                  class="img-fluid"
                  alt=""
                />
                <a href="#">
                  <div class="mask"></div>
                </a>
              </div>

              <!--Card content-->
              <div class="card-body card-body-cascade">
                <!--Title-->
                <h4 class="card-title">Project name</h4>
                <!--Text-->
                <p class="card-text">
                  Some quick example text to build on the card title and make up
                  the bulk of the card's content.
                </p>
              </div>

              <!--Card footer-->
              <div class="card-footer links-light">
                <span class="float-left pt-2">
                  <a><i class="fas fa-share-alt mr-2"></i></a>
                  <a><i class="far fa-heart mr-2"></i>10</a>
                </span>
                <span class="float-right">
                  <a href="" class="waves-effect p-2"
                    >Live Preview <i class="fas fa-photo ml-1"></i
                  ></a>
                </span>
              </div>
            </div>
            <!--/.Card-->

            <!--Card-->
            <div class="card card-cascade narrower card-ecommerce d-flex mb-5">
              <!--Card image-->
              <div class="view view-cascade overlay">
                <img
                  src="https://mdbootstrap.com/img/Mockups/Horizontal/6-col/pro-landing.jpg"
                  class="img-fluid"
                  alt=""
                />
                <a href="#">
                  <div class="mask"></div>
                </a>
              </div>

              <!--Card content-->
              <div class="card-body card-body-cascade">
                <!--Title-->
                <h4 class="card-title">Project name</h4>
                <!--Text-->
                <p class="card-text">
                  Some quick example text to build on the card title and make up
                  the bulk of the card's content.
                </p>
              </div>

              <!--Card footer-->
              <div class="card-footer links-light">
                <span class="float-left pt-2">
                  <a><i class="fas fa-share-alt mr-2"></i></a>
                  <a><i class="far fa-heart mr-2"></i>10</a>
                </span>
                <span class="float-right">
                  <a href="" class="waves-effect p-2"
                    >Live Preview <i class="fas fa-photo ml-1"></i
                  ></a>
                </span>
              </div>
            </div>
            <!--/.Card-->
          </div>
          <!-- Card row -->

          <!--Pagination -->
          <nav class="my-4 d-flex justify-content-center">
            <ul class="pagination pagination-circle pg-blue mb-0">
              <!--First-->
              <li class="page-item disabled clearfix d-none d-md-block">
                <a class="page-link">First</a>
              </li>

              <!--Arrow left-->
              <li class="page-item disabled">
                <a class="page-link" aria-label="Previous">
                  <span aria-hidden="true">&laquo;</span>
                  <span class="sr-only">Previous</span>
                </a>
              </li>

              <!--Numbers-->
              <li class="page-item active"><a class="page-link">1</a></li>
              <li class="page-item"><a class="page-link">2</a></li>
              <li class="page-item"><a class="page-link">3</a></li>
              <li class="page-item"><a class="page-link">4</a></li>
              <li class="page-item"><a class="page-link">5</a></li>

              <!--Arrow right-->
              <li class="page-item">
                <a class="page-link" aria-label="Next">
                  <span aria-hidden="true">&raquo;</span>
                  <span class="sr-only">Next</span>
                </a>
              </li>

              <!--First-->
              <li class="page-item clearfix d-none d-md-block">
                <a class="page-link">Last</a>
              </li>
            </ul>
          </nav>
          <!--/Pagination -->
        </div>
        <!--Grid column-->
      </div>
      <!--Grid row-->
    </section>
    <!--Section: Profile-->
  </mdb-container>
</template>

<script>
import {
  mdbContainer,
  mdbBtn,
  mdbIcon,
  mdbInput,
  mdbTextarea,
  mdbModal,
  mdbModalHeader,
  mdbModalTitle,
  mdbModalBody,
  mdbModalFooter
} from "mdbvue";

export default {
  name: "Extended",
  components: {
    mdbContainer,
    mdbBtn,
    mdbIcon,
    mdbInput,
    mdbTextarea,
    mdbModal,
    mdbModalHeader,
    mdbModalTitle,
    mdbModalBody,
    mdbModalFooter
  },
  data() {
    return {
      showModal: false,
      showModal2: false,
      showModal3: false,
      showModal4: false,
      showModal5: false,
      showModal6: false,
      showModal7: false,
      showModal8: false
    };
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

.btn-floating i {
  color: #4f4f4f !important;
}
</style>
