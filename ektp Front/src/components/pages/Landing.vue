<template>
  <div class="fullscreen">
    <mdb-navbar
      position="top"
      transparent
      color="mdb"
      dark
      scrolling
    >
      <mdb-navbar-brand href="#"><strong>MDB</strong></mdb-navbar-brand>
      <mdb-navbar-toggler>
        <mdb-navbar-nav>
          <mdb-nav-item href="#" waves-fixed active>Home</mdb-nav-item>
          <mdb-nav-item href="#" waves-fixed>Link</mdb-nav-item>
          <mdb-nav-item href="#" waves-fixed>Profile</mdb-nav-item>
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
    <section class="view intro-2">
      <div class="mask rgba-gradient">
        <div
          class="container h-100 d-flex justify-content-center align-items-center"
        >
          <div class="d-flex align-items-center content-height">
            <div class="row flex-center pt-5 mt-3">
              <div class="col-md-6 text-center text-md-left mb-5">
                <div class="white-text">
                  <h1
                    class="h1-responsive font-weight-bold wow fadeInLeft"
                    data-wow-delay="0.3s"
                  >
                    Sign up right now!
                  </h1>
                  <hr class="hr-light wow fadeInLeft" data-wow-delay="0.3s" />
                  <h6 class="wow fadeInLeft" data-wow-delay="0.3s">
                    Lorem ipsum dolor sit amet, consectetur adipisicing elit.
                    Rem repellendus quasi fuga nesciunt dolorum nulla magnam
                    veniam sapiente, fugiat! Commodi sequi non animi ea dolor
                    molestiae, quisquam iste, maiores. Nulla.
                  </h6>
                  <br />
                  <mdb-btn outline="white" rounded>Learn more</mdb-btn>
                </div>
              </div>

              <div class="col-md-6 col-xl-5 offset-xl-1">
                <!-- Form -->
                <div class="card wow fadeInRight" data-wow-delay="0.3s">
                  <div class="card-body">
                    <!-- Header -->
                    <div class="text-center">
                      <h3 class="white-text">
                        <i class="fas fa-user white-text"></i> Register:
                      </h3>
                      <hr class="hr-light" />
                    </div>

                    <!-- Body -->
                    <mdb-input
                      label="Your name"
                      labelColor="white"
                      icon="user"
                      iconClass="text-white"
                    />
                    <mdb-input
                      label="Your email"
                      labelColor="white"
                      icon="envelope"
                      iconClass="text-white"
                    />
                    <mdb-input
                      label="Your password"
                      labelColor="white"
                      icon="lock"
                      type="password"
                      iconClass="text-white"
                    />

                    <div class="text-center mt-4">
                      <mdb-btn color="light-blue" rounded>Sign up</mdb-btn>
                      <hr class="hr-light mb-3 mt-4" />

                      <div
                        class="inline-ul text-center d-flex justify-content-center"
                      >
                        <a class="p-2 m-2 fa-lg tw-ic"
                          ><i class="fab fa-twitter white-text"></i
                        ></a>
                        <a class="p-2 m-2 fa-lg li-ic"
                          ><i class="fab fa-linkedin-in white-text"> </i
                        ></a>
                        <a class="p-2 m-2 fa-lg ins-ic"
                          ><i class="fab fa-instagram white-text"> </i
                        ></a>
                      </div>
                    </div>
                  </div>
                </div>
                <!-- /.Form -->
              </div>
            </div>
          </div>
        </div>
      </div>
    </section>

    <div class="container">
      <!--Section: Features v.4-->
      <section class="section my-5wow fadeIn" data-wow-delay="0.3s">
        <!--Section heading-->
        <h1 class="text-center my-5 h1">Why is it so great?</h1>
        <!--Section description-->
        <p class="text-center mb-5 w-responsive mx-auto">
          Lorem ipsum dolor sit amet, consectetur adipisicing elit. Fugit, error
          amet numquam iure provident voluptate esse quasi, veritatis totam
          voluptas nostrum quisquam eum porro a pariatur accusamus veniam.
        </p>

        <!--Grid row-->
        <div class="row">
          <!--Grid column-->
          <div class="col-md-4">
            <!--Grid row-->
            <div class="row mb-2">
              <div class="col-2">
                <i class="fas fa-2x fa-flag-checkered indigo-text"></i>
              </div>
              <div class="col-10">
                <h5 class="font-weight-bold my-4">International</h5>
                <p class="grey-text">
                  Lorem ipsum dolor sit amet, consectetur adipisicing elit.
                  Reprehenderit maiores nam, aperiam minima assumenda.
                </p>
              </div>
            </div>
            <!--Grid row-->

            <!--Grid row-->
            <div class="row mb-2">
              <div class="col-2">
                <i class="fas fa-2x fa-flask blue-text"></i>
              </div>
              <div class="col-10">
                <h5 class="font-weight-bold my-4">Experimental</h5>
                <p class="grey-text">
                  Lorem ipsum dolor sit amet, consectetur adipisicing elit.
                  Reprehenderit maiores nam, aperiam minima assumenda.
                </p>
              </div>
            </div>
            <!--Grid row-->

            <!--Grid row-->
            <div class="row mb-2">
              <div class="col-2">
                <i class="fas fa-2x fa-glass cyan-text"></i>
              </div>
              <div class="col-10">
                <h5 class="font-weight-bold my-4">Relaxing</h5>
                <p class="grey-text">
                  Lorem ipsum dolor sit amet, consectetur adipisicing elit.
                  Reprehenderit maiores nam, aperiam minima assumenda.
                </p>
              </div>
            </div>
            <!--Grid row-->
          </div>
          <!--Grid column-->

          <!--Grid column-->
          <div class="col-md-4 mb-2 text-center text-md-left flex-center">
            <img
              src="https://mdbootstrap.com/img/Mockups/Transparent/Small/iphone-portfolio1.png"
              alt=""
              class="z-depth-0"
            />
          </div>
          <!--Grid column-->

          <!--Grid column-->
          <div class="col-md-4">
            <!--Grid row-->
            <div class="row mb-2">
              <div class="col-2">
                <i class="fas fa-2x fa-heart deep-purple-text"></i>
              </div>
              <div class="col-10">
                <h5 class="font-weight-bold my-4">Beloved</h5>
                <p class="grey-text">
                  Lorem ipsum dolor sit amet, consectetur adipisicing elit.
                  Reprehenderit maiores nam, aperiam minima assumenda.
                </p>
              </div>
            </div>
            <!--Grid row-->

            <!--Grid row-->
            <div class="row mb-2">
              <div class="col-2">
                <i class="fas fa-2x fa-bolt purple-text"></i>
              </div>
              <div class="col-10">
                <h5 class="font-weight-bold my-4">Rapid</h5>
                <p class="grey-text">
                  Lorem ipsum dolor sit amet, consectetur adipisicing elit.
                  Reprehenderit maiores nam, aperiam minima assumenda.
                </p>
              </div>
            </div>
            <!--Grid row-->

            <!--Grid row-->
            <div class="row mb-2">
              <div class="col-2">
                <i class="fas fa-2x fa-magic pink-text"></i>
              </div>
              <div class="col-10">
                <h5 class="font-weight-bold my-4">Magical</h5>
                <p class="grey-text">
                  Lorem ipsum dolor sit amet, consectetur adipisicing elit.
                  Reprehenderit maiores nam, aperiam minima assumenda.
                </p>
              </div>
            </div>
            <!--Grid row-->
          </div>
          <!--Grid column-->
        </div>
        <!--Grid row-->
      </section>
      <!--/Section: Features v.4-->

      <hr class="mb-5" />

      <!--Section: Testimonials v.3-->
      <section
        class="section team-section text-center my-5 wow fadeIn"
        data-wow-delay="0.3s"
      >
        <!--Section heading-->
        <h1 class="text-center my-5 h1">Testimonials</h1>
        <!--Section description-->
        <p class="text-center mb-5 w-responsive mx-auto">
          Lorem ipsum dolor sit amet, consectetur adipisicing elit. Fugit, error
          amet numquam iure provident voluptate esse quasi, veritatis totam
          voluptas nostrum quisquam eum porro a pariatur accusamus veniam.
        </p>

        <!--Grid row-->
        <div class="row text-center">
          <!--Grid column-->
          <div class="col-md-4 mb-4">
            <div class="testimonial">
              <!--Avatar-->
              <div class="avatar mx-auto">
                <img
                  src="https://mdbootstrap.com/img/Photos/Avatars/img%20(1).jpg"
                  class="rounded-circle z-depth-1 img-fluid"
                />
              </div>

              <!--Content-->
              <h4 class="font-weight-bold mt-4 mb-3">Anna Deynah</h4>
              <h6 class="mb-3 font-weight-bold grey-text">Web Designer</h6>
              <p>
                <i class="fas fa-quote-left"></i> Lorem ipsum dolor sit amet,
                consectetur adipisicing elit. Quod eos id officiis hic tenetur
                quae quaerat ad velit ab hic tenetur.
              </p>

              <!--Review-->
              <div class="orange-text">
                <i class="fas fa-star"> </i>
                <i class="fas fa-star"> </i>
                <i class="fas fa-star"> </i>
                <i class="fas fa-star"> </i>
                <i class="fas fa-star-half-alt"> </i>
              </div>
            </div>
          </div>
          <!--Grid column-->

          <!--Grid column-->
          <div class="col-md-4 mb-4">
            <div class="testimonial">
              <!--Avatar-->
              <div class="avatar mx-auto">
                <img
                  src="https://mdbootstrap.com/img/Photos/Avatars/img%20(32).jpg"
                  class="rounded-circle z-depth-1 img-fluid"
                />
              </div>

              <!--Content-->
              <h4 class="font-weight-bold mt-4 mb-3">John Doe</h4>
              <h6 class="mb-3 font-weight-bold grey-text">Web Developer</h6>
              <p>
                <i class="fas fa-quote-left"></i> Ut enim ad minima veniam, quis
                nostrum exercitationem ullam corporis suscipit laboriosam, nisi
                ut aliquid ex ea commodi.
              </p>

              <!--Review-->
              <div class="orange-text">
                <i class="fas fa-star"> </i>
                <i class="fas fa-star"> </i>
                <i class="fas fa-star"> </i>
                <i class="fas fa-star"> </i>
                <i class="fas fa-star"> </i>
              </div>
            </div>
          </div>
          <!--Grid column-->

          <!--Grid column-->
          <div class="col-md-4 mb-4">
            <div class="testimonial">
              <!--Avatar-->
              <div class="avatar mx-auto">
                <img
                  src="https://mdbootstrap.com/img/Photos/Avatars/img%20(10).jpg"
                  class="rounded-circle z-depth-1 img-fluid"
                />
              </div>
              <!--Content-->
              <h4 class="font-weight-bold mt-4 mb-3">Maria Kate</h4>
              <h6 class="mb-3 font-weight-bold grey-text">Photographer</h6>
              <p>
                <i class="fas fa-quote-left"></i> At vero eos et accusamus et
                iusto odio dignissimos ducimus qui blanditiis praesentium
                voluptatum deleniti atque corrupti.
              </p>

              <!--Review-->
              <div class="orange-text">
                <i class="fas fa-star"> </i>
                <i class="fas fa-star"> </i>
                <i class="fas fa-star"> </i>
                <i class="fas fa-star"> </i>
                <i class="far fa-star"> </i>
              </div>
            </div>
          </div>
          <!--Grid column-->
        </div>
        <!--Grid row-->
      </section>
      <!--Section: Testimonials v.3-->

      <hr class="mb-5" />

      <!--Section: Pricing v.3-->
      <section class="section my-5 wow fadeIn" data-wow-delay="0.3s">
        <!--Section heading-->
        <h1 class="text-center my-5 h1">Our pricing plans</h1>
        <!--Section description-->
        <p class="text-center mb-5 w-responsive mx-auto">
          Lorem ipsum dolor sit amet, consectetur adipisicing elit. Fugit, error
          amet numquam iure provident voluptate esse quasi, veritatis totam
          voluptas nostrum quisquam eum porro a pariatur accusamus veniam.
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
                    Lorem ipsum dolor sit amet, consectetur adipisicing elit.
                    Culpa pariatur id nobis accusamus deleniti cumque hic
                    laborum.
                  </p>
                  <a class="btn btn-light-blue btn-rounded">Buy now</a>
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
                    Esse corporis saepe laudantium velit adipisci cumque iste
                    ratione facere non distinctio cupiditate sequi atque.
                  </p>
                  <a class="btn btn-outline-white btn-rounded">Buy now</a>
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
                  <a class="btn btn-light-blue btn-rounded">Buy now</a>
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

      <hr class="mb-5" />

      <!--Section: Contact v.2-->
      <section class="section my-5 wow fadeIn" data-wow-delay="0.3s">
        <!--Section heading-->
        <h2 class="text-center my-5 h1">Contact us</h2>
        <!--Section description-->
        <p class="text-center mb-5 w-responsive mx-auto">
          Lorem ipsum dolor sit amet, consectetur adipisicing elit. Fugit, error
          amet numquam iure provident voluptate esse quasi, veritatis totam
          voluptas nostrum quisquam eum porro a pariatur accusamus veniam. Quia,
          minima?
        </p>

        <div class="row">
          <!--Grid column-->
          <div class="col-md-8 col-xl-9">
            <form>
              <!--Grid row-->
              <div class="row">
                <!--Grid column-->
                <div class="col-md-6">
                  <mdb-input label="Your name" />
                </div>
                <!--Grid column-->

                <!--Grid column-->
                <div class="col-md-6">
                  <mdb-input label="Your email" />
                </div>
                <!--Grid column-->
              </div>
              <!--Grid row-->

              <!--Grid row-->
              <div class="row">
                <div class="col-md-12">
                  <mdb-input label="Subject" />
                </div>
              </div>
              <!--Grid row-->

              <!--Grid row-->
              <div class="row">
                <!--Grid column-->
                <div class="col-md-12">
                  <mdb-textarea rows="5" label="Your message" />
                </div>
              </div>
              <!--Grid row-->
            </form>

            <div class="text-center text-md-left my-4">
              <mdb-btn color="light-blue" rounded>Send</mdb-btn>
            </div>
          </div>
          <!--Grid column-->

          <!--Grid column-->
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
          <!--Grid column-->
        </div>
      </section>
      <!--Section: Contact v.2-->
    </div>

    <!--Footer-->
    <footer class="page-footer pt-4 mt-4 text-center text-md-left">
      <!--Footer Links-->
      <div class="container">
        <div class="row">
          <!--First column-->
          <div class="col-md-3">
            <h5 class="text-uppercase font-weight-bold">Footer Content</h5>
            <p>
              Here you can use rows and columns here to organize your footer
              content.
            </p>
          </div>
          <!--/.First column-->

          <hr class="w-100 clearfix d-md-none" />

          <!--Second column-->
          <div class="col-md-2 ml-auto">
            <h5 class="text-uppercase font-weight-bold">Links</h5>
            <ul class="list-unstyled">
              <li><a href="#!">Link 1</a></li>
              <li><a href="#!">Link 2</a></li>
              <li><a href="#!">Link 3</a></li>
              <li><a href="#!">Link 4</a></li>
            </ul>
          </div>
          <!--/.Second column-->

          <hr class="w-100 clearfix d-md-none" />

          <!--Third column-->
          <div class="col-md-2 ml-auto">
            <h5 class="text-uppercase font-weight-bold">Links</h5>
            <ul class="list-unstyled">
              <li><a href="#!">Link 1</a></li>
              <li><a href="#!">Link 2</a></li>
              <li><a href="#!">Link 3</a></li>
              <li><a href="#!">Link 4</a></li>
            </ul>
          </div>
          <!--/.Third column-->

          <hr class="w-100 clearfix d-md-none" />

          <!--Fourth column-->
          <div class="col-md-2 ml-auto">
            <h5 class="text-uppercase font-weight-bold">Links</h5>
            <ul class="list-unstyled">
              <li><a href="#!">Link 1</a></li>
              <li><a href="#!">Link 2</a></li>
              <li><a href="#!">Link 3</a></li>
              <li><a href="#!">Link 4</a></li>
            </ul>
          </div>
          <!--/.Fourth column-->
        </div>
      </div>

      <hr />

      <div class="container">
        <!--Grid row-->
        <div class="row mb-3">
          <!--First column-->
          <div class="col-md-12">
            <ul
              class="list-unstyled d-flex justify-content-center mb-0 py-4 list-inline"
            >
              <li class="list-inline-item">
                <a class="p-2 m-2 fa-lg fb-ic"
                  ><i class="fab fa-facebook-f white-text fa-lg"> </i
                ></a>
              </li>
              <li class="list-inline-item">
                <a class="p-2 m-2 fa-lg tw-ic"
                  ><i class="fab fa-twitter white-text fa-lg"> </i
                ></a>
              </li>
              <li class="list-inline-item">
                <a class="p-2 m-2 fa-lg gplus-ic"
                  ><i class="fas fa-google-plus white-text fa-lg"> </i
                ></a>
              </li>
              <li class="list-inline-item">
                <a class="p-2 m-2 fa-lg li-ic"
                  ><i class="fab fa-linkedin-in white-text fa-lg"> </i
                ></a>
              </li>
              <li class="list-inline-item">
                <a class="p-2 m-2 fa-lg ins-ic"
                  ><i class="fas fa-instagram white-text fa-lg"> </i
                ></a>
              </li>
              <li class="list-inline-item">
                <a class="p-2 m-2 fa-lg pin-ic"
                  ><i class="fas fa-pinterest white-text fa-lg"> </i
                ></a>
              </li>
            </ul>
          </div>
          <!--/First column-->
        </div>
        <!--/Grid row-->
      </div>
      <!--/.Footer Links-->

      <!--Copyright-->
      <div class="footer-copyright py-3 text-center">
        <div class="container-fluid">
          &copy; 2018 Copyright:
          <a href="https://mdbootstrap.com/bootstrap-tutorial/">
            MDBootstrap.com
          </a>
        </div>
      </div>
      <!--/.Copyright-->
    </footer>
    <!--/.Footer-->
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
  mdbNavbarBrand,
  mdbTextarea
} from "mdbvue";

export default {
  name: "Landing",
  components: {
    mdbNavbar,
    mdbNavItem,
    mdbNavbarNav,
    mdbNavbarToggler,
    mdbBtn,
    mdbInput,
    mdbNavbarBrand,
    mdbTextarea
  },
  data() {
    return {};
  }
};
</script>

<style scoped>
.intro-2 {
  background: url("https://mdbootstrap.com/img/Photos/Others/img%20(42).jpg")
    no-repeat center center;
  background-size: cover;
  height: 100vh;
}

.navbar {
  background: transparent;
}

.rgba-gradient {
  background: -webkit-linear-gradient(
    45deg,
    rgba(83, 125, 210, 0.4),
    rgba(178, 30, 123, 0.4) 100%
  );
  background: -webkit-gradient(
    linear,
    45deg,
    from(rgba(29, 236, 197, 0.4)),
    to(rgba(96, 0, 136, 0.4))
  );
  background: linear-gradient(
    45deg,
    rgba(29, 236, 197, 0.4),
    rgba(96, 0, 136, 0.4) 100%
  );
}

.card {
  background-color: rgba(229, 228, 255, 0.2);
}
</style>
