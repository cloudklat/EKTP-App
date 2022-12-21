<template>
  <div class="fullscreen">
    <mdb-navbar
      position="top"
      color="mdb"
      dark
      scrolling
      transparent
    >
      <mdb-navbar-brand href="#"><strong>MDB</strong></mdb-navbar-brand>
      <mdb-navbar-toggler>
        <mdb-navbar-nav>
          <mdb-nav-item href="#home" waves-fixed active>Home</mdb-nav-item>
          <mdb-nav-item href="#team" waves-fixed>Team</mdb-nav-item>
          <mdb-nav-item href="#products" waves-fixed>Products</mdb-nav-item>
          <mdb-nav-item href="#gallery" waves-fixed>Gallery</mdb-nav-item>
          <mdb-nav-item href="#contact" waves-fixed>Contact</mdb-nav-item>
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

    <!-- Intro Section -->
    <div
      id="home"
      class="view"
      style="background-image: url(https://mdbootstrap.com/img/Photos/Others/img%20%2853%29.jpg); background-repeat: no-repeat; background-size: cover; background-position: center center;"
    >
      <div class="mask rgba-stylish-light">
        <div
          class="container h-100 d-flex justify-content-center align-items-center"
        >
          <div class="row pt-5 mt-3">
            <div class="col-md-12 mb-3">
              <div class="intro-info-content text-center">
                <h1
                  class="display-3 white-text mb-5 wow fadeInDown"
                  data-wow-delay="0.3s"
                >
                  ABOUT <a class="white-text font-weight-bold">US</a>
                </h1>
                <h5
                  class="text-uppercase white-text mb-5 font-weight-bold wow fadeInDown"
                  data-wow-delay="0.3s"
                >
                  Lorem ipsum dolor sit amet consectetur.
                </h5>
                <a
                  class="btn btn-light-blue btn-lg wow fadeInDown"
                  data-wow-delay="0.3s"
                  >portfolio</a
                >
                <a
                  class="btn btn-indigo btn-lg wow fadeInDown"
                  data-wow-delay="0.3s"
                  >About</a
                >
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>

    <div class="container">
      <!-- Section: Team v.3 -->
      <section
        id="team"
        class="section team-section pb-4 wow fadeIn"
        data-wow-delay="0.3s"
      >
        <!-- Section heading -->
        <h2 class="text-center my-5 h1">Our amazing team</h2>
        <!-- Section description -->
        <p class="text-center mb-5 w-responsive mx-auto">
          Lorem ipsum dolor sit amet, consectetur adipisicing elit. Fugit, error
          amet numquam iure provident voluptate esse quasi, veritatis totam
          voluptas nostrum quisquam eum porro a pariatur accusamus veniam.
        </p>

        <!-- Grid row -->
        <div class="row mb-lg-4 text-center text-md-left">
          <!-- Grid column -->
          <div class="col-lg-6 col-md-12 mb-4">
            <div class="col-md-6 float-left">
              <div class="avatar mx-auto">
                <img
                  src="https://mdbootstrap.com/img/Photos/Avatars/img%20(27).jpg"
                  class="z-depth-1"
                  alt="First sample avatar image"
                />
              </div>
            </div>

            <div class="col-md-6 float-right">
              <h4><strong>John Doe</strong></h4>
              <h6 class="font-weight-bold grey-text mb-4">Web Designer</h6>
              <p class="grey-text">
                Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quod
                eos id officiis hic tenetur.
              </p>

              <!-- Facebook -->
              <a class="p-2 m-2 fa-lg fb-ic"
                ><i class="fab fa-facebook-f"> </i
              ></a>
              <!-- Twitter -->
              <a class="p-2 m-2 fa-lg tw-ic"><i class="fab fa-twitter"> </i></a>
              <!-- Dribbble -->
              <a class="p-2 m-2 fa-lg dribbble-ic"
                ><i class="fab fa-dribbble"> </i
              ></a>
            </div>
          </div>
          <!-- Grid column -->

          <!-- Grid column -->
          <div class="col-lg-6 col-md-12 mb-4">
            <div class="col-md-6 float-left">
              <div class="avatar mx-auto">
                <img
                  src="https://mdbootstrap.com/img/Photos/Avatars/img%20(31).jpg"
                  class="z-depth-1"
                  alt="Second sample avatar image"
                />
              </div>
            </div>

            <div class="col-md-6 float-right">
              <h4><strong>Maria Kate</strong></h4>
              <h6 class="font-weight-bold grey-text mb-4">Photographer</h6>
              <p class="grey-text">
                Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quod
                eos id officiis hic tenetur.
              </p>

              <!-- Facebook -->
              <a class="p-2 m-2 fa-lg fb-ic"
                ><i class="fab fa-facebook-f"> </i
              ></a>
              <!-- YouTube -->
              <a class="p-2 m-2 fa-lg yt-ic"><i class="fab fa-youtube"> </i></a>
              <!-- Instagram -->
              <a class="p-2 m-2 fa-lg ins-ic"
                ><i class="fab fa-instagram"> </i
              ></a>
            </div>
          </div>
          <!-- Grid column -->
        </div>
        <!-- Grid row -->

        <!-- Grid row -->
        <div class="row text-center text-md-left">
          <!-- Grid column -->
          <div class="col-lg-6 col-md-12 mb-4">
            <div class="col-md-6 float-left">
              <div class="avatar mx-auto">
                <img
                  src="https://mdbootstrap.com/img/Photos/Avatars/img%20(26).jpg"
                  class="z-depth-1"
                  alt="Fourth sample avatar image"
                />
              </div>
            </div>

            <div class="col-md-6 float-right">
              <h4><strong>Anna Deynah</strong></h4>
              <h6 class="font-weight-bold grey-text mb-4">Web Developer</h6>
              <p class="grey-text">
                Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quod
                eos id officiis hic tenetur.
              </p>

              <!-- Facebook -->
              <a class="p-2 m-2 fa-lg fb-ic"
                ><i class="fab fa-facebook-f"> </i
              ></a>
              <!-- Twitter -->
              <a class="p-2 m-2 fa-lg tw-ic"><i class="fab fa-twitter"> </i></a>
              <!-- GitHub -->
              <a class="p-2 m-2 fa-lg git-ic"><i class="fab fa-github"> </i></a>
            </div>
          </div>
          <!-- Grid column -->

          <!-- Grid column -->
          <div class="col-lg-6 col-md-12 mb-4">
            <div class="col-md-6 float-left">
              <div class="avatar mx-auto">
                <img
                  src="https://mdbootstrap.com/img/Photos/Avatars/img%20(29).jpg"
                  class="z-depth-1"
                  alt="Fifth sample avatar image"
                />
              </div>
            </div>

            <div class="col-md-6 float-right">
              <h4><strong>Sarah Melyah</strong></h4>
              <h6 class="font-weight-bold grey-text mb-4">
                Front-end Developer
              </h6>
              <p class="grey-text">
                Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quod
                eos id officiis hic tenetur.
              </p>

              <!-- Google + -->
              <a class="p-2 m-2 fa-lg gplus-ic"
                ><i class="fab fa-google-plus-g"> </i
              ></a>
              <!-- LinkedIn -->
              <a class="p-2 m-2 fa-lg li-ic"
                ><i class="fab fa-linkedin-in"> </i
              ></a>
              <!-- Email -->
              <a class="p-2 m-2 fa-lg email-ic"
                ><i class="fas fa-envelope"> </i
              ></a>
            </div>
          </div>
          <!-- Grid column -->
        </div>
        <!-- Grid row -->
      </section>
      <!-- Section: Team v.3 -->

      <hr class="my-5" />

      <!-- Section: Features v.1 -->
      <section
        id="products"
        class="text-center wow fadeIn"
        data-wow-delay="0.3s"
      >
        <!-- Section heading -->
        <h1 class="text-center my-5 h1">We create awesome products</h1>
        <!-- Section description -->
        <p class="text-center mb-5 w-responsive mx-auto lead grey-text">
          Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
          eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad
          minim veniam.
        </p>

        <!-- Grid row -->
        <div class="row">
          <!-- Grid column -->
          <div class="col-md-4 mb-4">
            <i class="fas fa-4x fa-chart-area pink-text"></i>
            <h4 class="font-weight-bold my-4">Analytics</h4>
            <p class="grey-text">
              Lorem ipsum dolor sit amet, consectetur adipisicing elit.
              Reprehenderit maiores nam, aperiam minima assumenda deleniti hic.
            </p>
          </div>
          <!-- Grid column -->

          <!-- Grid column -->
          <div class="col-md-4 mb-4">
            <i class="fas fa-4x fa-pencil-alt cyan-text"></i>
            <h4 class="font-weight-bold my-4">Design</h4>
            <p class="grey-text">
              Lorem ipsum dolor sit amet, consectetur adipisicing elit.
              Reprehenderit maiores nam, aperiam minima assumenda deleniti hic.
            </p>
          </div>
          <!-- Grid column -->

          <!-- Grid column -->
          <div class="col-md-4 mb-4">
            <i class="fas fa-4x fa-laptop indigo-text"></i>
            <h4 class="font-weight-bold my-4">Development</h4>
            <p class="grey-text">
              Lorem ipsum dolor sit amet, consectetur adipisicing elit.
              Reprehenderit maiores nam, aperiam minima assumenda deleniti hic.
            </p>
          </div>
          <!-- Grid column -->
        </div>
        <!-- Grid row -->
      </section>
      <!-- Section: Features v.1 -->

      <hr class="my-5" />

      <!-- Section: Gallery -->
      <section id="gallery" class="section wow fadeIn" data-wow-delay="0.3s">
        <!-- Section heading -->
        <h1 class="text-center my-5 h1">Our work</h1>
        <!-- Section description -->
        <p class="text-center mb-5 w-responsive mx-auto">
          Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
          eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad
          minim veniam.
        </p>

        <div class="row pb-4">
          <div class="col-md-12">
            <mdb-container class="mt-5">
              <mdb-row class="mdb-lightbox">
                <mdb-col md="4" @click.native="show(0)">
                  <figure>
                    <img
                      src="https://mdbootstrap.com/img/Photos/Horizontal/People/4-col/img%20(132).jpg"
                      class="img-fluid"
                      alt=""
                    />
                  </figure>
                </mdb-col>
                <mdb-col md="4" @click.native="show(1)">
                  <figure>
                    <img
                      src="https://mdbootstrap.com/img/Photos/Horizontal/Work/12-col/img%20(40).jpg"
                      class="img-fluid"
                      alt=""
                    />
                  </figure>
                </mdb-col>
                <mdb-col md="4" @click.native="show(2)">
                  <figure>
                    <img
                      src="https://mdbootstrap.com/img/Photos/Horizontal/Work/4-col/img%20(14).jpg"
                      class="img-fluid"
                      alt=""
                    />
                  </figure>
                </mdb-col>
              </mdb-row>
            </mdb-container>

            <mdb-lightbox
              :visible="visible"
              :imgs="imgs"
              :index="index"
              @hide="handleHide"
            ></mdb-lightbox>
          </div>
        </div>
      </section>
      <!-- /Section: Gallery -->

      <hr class="my-5" />

      <!-- Section: Contact v.2 -->
      <section
        id="contact"
        class="section pb-5 wow fadeIn"
        data-wow-delay="0.3s"
      >
        <!-- Section heading -->
        <h2 class="text-center my-5 h1">Contact us</h2>
        <!-- Section description -->
        <p class="text-center mb-5 w-responsive mx-auto">
          Lorem ipsum dolor sit amet, consectetur adipisicing elit. Fugit, error
          amet numquam iure provident voluptate esse quasi, veritatis totam
          voluptas nostrum quisquam eum porro a pariatur accusamus veniam.
        </p>

        <div class="row">
          <!-- Grid column -->
          <div class="col-md-8 col-xl-9">
            <form>
              <!-- Grid row -->
              <div class="row">
                <!-- Grid column -->
                <div class="col-md-6">
                  <div class="md-form mb-0">
                    <input type="text" id="contact-name" class="form-control" />
                    <label for="contact-name" class="">Your name</label>
                  </div>
                </div>
                <!-- Grid column -->

                <!-- Grid column -->
                <div class="col-md-6">
                  <div class="md-form mb-0">
                    <input
                      type="text"
                      id="contact-email"
                      class="form-control"
                    />
                    <label for="contact-email" class="">Your email</label>
                  </div>
                </div>
                <!-- Grid column -->
              </div>
              <!-- Grid row -->

              <!-- Grid row -->
              <div class="row">
                <div class="col-md-12">
                  <div class="md-form mb-0">
                    <input
                      type="text"
                      id="contact-Subject"
                      class="form-control"
                    />
                    <label for="contact-Subject" class="">Subject</label>
                  </div>
                </div>
              </div>
              <!-- Grid row -->

              <!-- Grid row -->
              <div class="row mb-4">
                <!-- Grid column -->
                <div class="col-md-12">
                  <div class="md-form mb-0">
                    <textarea
                      type="text"
                      id="contact-message"
                      class="md-textarea form-control"
                      rows="3"
                    ></textarea>
                    <label for="contact-message">Your message</label>
                  </div>
                </div>
              </div>
              <!-- Grid row -->
            </form>

            <div class="text-center text-md-left mb-4">
              <a class="btn btn-light-blue">Send</a>
            </div>
          </div>
          <!-- Grid column -->

          <!-- Grid column -->
          <div class="col-md-4 col-xl-3">
            <ul class="contact-icons list-unstyled text-center">
              <li>
                <i class="fas fa-map-marker fa-2x"></i>
                <p>San Francisco, CA 94126, USA</p>
              </li>

              <li>
                <i class="fas fa-phone fa-2x"></i>
                <p>+ 01 234 567 89</p>
              </li>

              <li>
                <i class="fas fa-envelope fa-2x"></i>
                <p>contact@mdbootstrap.com</p>
              </li>
            </ul>
          </div>
          <!-- Grid column -->
        </div>
      </section>
      <!-- Section: Contact v.2 -->
    </div>

    <!-- Footer -->
    <footer class="page-footer pt-4 mt-4 text-center text-md-left grey">
      <!-- Footer Links -->
      <div class="container">
        <div class="row">
          <!-- First column -->
          <div class="col-md-6">
            <h6 class="text-uppercase font-weight-bold">Footer Content</h6>
            <p>
              Here you can use rows and columns here to organize your footer
              content.
            </p>
          </div>
          <!-- First column -->

          <!-- Second column -->
          <div class="col-md-3">
            <h6 class="text-uppercase font-weight-bold">Links</h6>
            <ul class="list-unstyled">
              <li><a href="#!">Link 1</a></li>
              <li><a href="#!">Link 2</a></li>
              <li><a href="#!">Link 3</a></li>
            </ul>
          </div>
          <!-- Second column -->

          <!-- Third column -->
          <div class="col-md-3">
            <h6 class="text-uppercase font-weight-bold">Links</h6>
            <ul class="list-unstyled">
              <li><a href="#!">Link 1</a></li>
              <li><a href="#!">Link 2</a></li>
              <li><a href="#!">Link 3</a></li>
            </ul>
          </div>
          <!-- Third column -->
        </div>
      </div>
      <!-- Footer Links -->

      <!-- Copyright -->
      <div class="footer-copyright py-3 text-center">
        <div class="container-fluid">
          &copy; 2018 Copyright:
          <a href="https://mdbootstrap.com/bootstrap-tutorial/">
            MDBootstrap.com
          </a>
        </div>
      </div>
      <!-- Copyright -->
    </footer>
    <!-- Footer -->
  </div>
</template>

<script>
import {
  mdbContainer,
  mdbRow,
  mdbCol,
  mdbNavbar,
  mdbNavItem,
  mdbNavbarNav,
  mdbNavbarToggler,
  mdbInput,
  mdbNavbarBrand,
  mdbLightbox
} from "mdbvue";

export default {
  name: "About",
  components: {
    mdbContainer,
    mdbRow,
    mdbCol,
    mdbNavbar,
    mdbNavItem,
    mdbNavbarNav,
    mdbNavbarToggler,
    mdbInput,
    mdbNavbarBrand,
    mdbLightbox
  },
  data() {
    return {
      imgs: [
        "https://mdbootstrap.com/img/Photos/Horizontal/People/12-col/img%20(132).jpg",
        "https://mdbootstrap.com/img/Photos/Horizontal/Work/12-col/img%20(40).jpg",
        "https://mdbootstrap.com/img/Photos/Horizontal/Work/12-col/img%20(14).jpg"
      ],
      visible: false,
      index: 0
    };
  },
  methods: {
    show(index) {
      this.index = index;
      this.visible = true;
    },
    handleHide() {
      this.visible = false;
    }
  }
};
</script>

<style scoped>
.navbar {
  background: transparent;
}

.intro-2 {
  background: url("http://mdbootstrap.com/img/Photos/Others/forest1.jpg")
    no-repeat center center;
  background-size: cover;
}

.view {
  height: 60vh;
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
