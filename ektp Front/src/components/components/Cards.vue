<template>
  <mdb-container fluid>
    <!--Section: Cascading cards-->
    <section>
      <h2 class="font-weight-bold mt-lg-5 mb-5 pb-4">
        <strong>Cascading cards</strong>
      </h2>

      <mdb-row class="pb-4">
        <!--Subheading-->
        <mdb-col md="4" class="mb-4">
          <h4 class="mb-4 dark-grey-text font-weight-bold">
            <strong>Wider</strong>
          </h4>

          <!--Section: Live preview-->
          <section>
            <!--Card-->
            <mdb-card cascade wide>
              <!--Card image-->
              <mdb-view cascade>
                <mdb-card-image
                  top
                  src="https://mdbootstrap.com/img/Photos/Horizontal/People/6-col/img%20%283%29.jpg"
                />
                <mdb-mask overlay="white-slight" waves></mdb-mask>
              </mdb-view>
              <!--/Card image-->

              <!--Card content-->
              <mdb-card-body cascade class="text-center">
                <!--Title-->
                <h4 class="card-title"><strong>Alice Mayer</strong></h4>
                <h5 class="indigo-text"><strong>Photographer</strong></h5>

                <p class="card-text">
                  Sed ut perspiciatis unde omnis iste natus sit voluptatem
                  accusantium doloremque laudantium, totam rem aperiam.
                </p>

                <!--Linkedin-->
                <a class="p-2 m-2 fa-lg li-ic"
                  ><i class="fab fa-linkedin-in"> </i
                ></a>
                <!--Twitter-->
                <a class="p-2 m-2 fa-lg tw-ic"
                  ><i class="fab fa-twitter"> </i
                ></a>
                <!--Dribbble-->
                <a class="p-2 m-2 fa-lg fb-ic"
                  ><i class="fab fa-facebook-f"> </i
                ></a>
              </mdb-card-body>
              <!--/.Card content-->
            </mdb-card>
            <!--/.Card-->
          </section>
          <!--Section: Live preview-->
        </mdb-col>
        <mdb-col md="4" class="mb-4">
          <!--Subheading-->
          <h4 class="mb-4 dark-grey-text font-weight-bold">
            <strong>Narrower</strong>
          </h4>

          <!--Section: Live preview-->
          <section>
            <!--Card-->
            <mdb-card cascade narrow style="margin-top: 44px">
              <!--Card image-->
              <mdb-view cascade class="view view-cascade overlay">
                <mdb-card-image
                  src="https://mdbootstrap.com/img/Photos/Lightbox/Thumbnail/img%20(147).jpg"
                  class="card-img-top"
                  alt=""
                />
                <mdb-mask overlay="white-slight" waves></mdb-mask>
              </mdb-view>
              <!--/.Card image-->

              <!--Card content-->
              <mdb-card-body cascade>
                <h5 class="pink-text">
                  <i class="fas fa-utensils"></i> Culinary
                </h5>
                <!--Title-->
                <h4 class="card-title">Cheat day inspirations</h4>
                <!--Text-->
                <p class="card-text">
                  Ut enim ad minima veniam, quis nostrum exercitationem ullam
                  corporis suscipit laboriosam, nisi ut aliquid ex ea commodi.
                </p>
                <mdb-btn color="unique">Button</mdb-btn>
              </mdb-card-body>
              <!--/.Card content-->
            </mdb-card>
            <!--/.Card-->
          </section>
          <!--Section: Live preview-->
        </mdb-col>
        <mdb-col md="4" class="mb-4">
          <!--Subheading-->
          <h4 class="mb-4 dark-grey-text font-weight-bold">
            <strong>Regular</strong>
          </h4>

          <!--Section: Live preview-->
          <section>
            <!--Card-->
            <mdb-card cascade>
              <!--Card image-->
              <mdb-view cascade>
                <mdb-card-image
                  src="https://mdbootstrap.com/img/Photos/Others/men.jpg"
                  class="card-img-top"
                  alt=""
                />
                <mdb-mask overlay="white-slight" waves></mdb-mask>
              </mdb-view>
              <!--/.Card image-->

              <!--Card content-->
              <div class="card-body card-body-cascade text-center">
                <!--Title-->
                <h4 class="card-title"><strong>Billy Cullen</strong></h4>
                <h5>Web developer</h5>

                <p class="card-text">
                  Lorem ipsum dolor sit amet, consectetur adipisicing elit.
                  Voluptatibus, ex, recusandae. Facere modi sunt, quod
                  quibusdam.
                </p>

                <!--Facebook-->
                <mdb-btn
                  color="fb"
                  floating
                  tag="a"
                  size="sm"
                  fab
                  icon="facebook"
                  iconLeft
                ></mdb-btn>
                <!--Twitter-->
                <mdb-btn
                  color="tw"
                  floating
                  tag="a"
                  size="sm"
                  fab
                  icon="twitter"
                  iconLeft
                ></mdb-btn>
                <!--Google +-->
                <mdb-btn
                  color="dribbble"
                  floating
                  tag="a"
                  size="sm"
                  fab
                  icon="dribbble"
                  iconLeft
                ></mdb-btn>
              </div>
              <!--/.Card content-->
            </mdb-card>
            <!--/.Card-->
          </section>
          <!--Section: Live preview-->
        </mdb-col>
      </mdb-row>
    </section>
    <!--Section: Cascading cards-->

    <!--Section: Cascading panels-->
    <section>
      <h3 class="mb-4 dark-grey-text font-weight-bold">
        <strong>Cascading panels</strong>
      </h3>

      <mdb-row class="mb-5">
        <!--Grid column-->
        <mdb-col lg="4" md="12" class="mb-4">
          <!--Card-->
          <mdb-card cascade narrow>
            <!--Card image-->
            <mdb-view cascade gradient="purple">
              <h2 class="card-header-title">Mattonit</h2>
              <p>The Boar</p>
              <div class="text-center">
                <!--Facebook-->
                <mdb-btn
                  floating
                  fab
                  icon="facebook"
                  iconLeft
                  transparent
                ></mdb-btn>
                <!--Twitter-->
                <mdb-btn
                  floating
                  fab
                  icon="twitter"
                  iconLeft
                  transparent
                ></mdb-btn>
                <!--Google +-->
                <mdb-btn
                  floating
                  fab
                  icon="google-plus"
                  iconLeft
                  transparent
                ></mdb-btn>
              </div>
            </mdb-view>
            <!--/Card image-->

            <!--Card content-->
            <mdb-card-body cascade class="text-center">
              <p class="card-text">
                Lorem ipsum dolor sit amet, consectetur adipisicing elit.
                Voluptatibus, ex, recusandae. Facere modi sunt, quod quibusdam
                dignissimos neque rem nihil ratione est placeat vel, natus non
                quos laudantium veritatis sequi.Ut enim ad minima veniam, quis
                nostrum exercitationem ullam corporis suscipit laboriosam.
              </p>
            </mdb-card-body>
            <!--/.Card content-->
          </mdb-card>
          <!--/.Card-->
        </mdb-col>
        <!--Grid column-->

        <!--Grid column-->
        <mdb-col lg="4" md="6" class="mb-4">
          <!--Card-->
          <mdb-card cascade wide>
            <!--Card image-->
            <mdb-view cascade gradient="peach">
              <h2 class="card-header-title mb-2">Title of the news</h2>
              <p class=""><i class="fas fa-calendar"></i> 26.07.2017</p>
            </mdb-view>
            <!--/Card image-->

            <!--Card content-->
            <mdb-card-body cascade class="text-center">
              <p class="card-text mr-2 ml-2 pb-1">
                Lorem ipsum dolor sit amet, consectetur adipisicing elit.
                Voluptatibus, ex, recusandae. Facere modi sunt, quod quibusdam
                dignissimos neque rem nihil ratione est placeat vel, natus non
                quos laudantium veritatis sequi.Ut enim ad minima veniam, quis
                nostrum.
              </p>

              <a href="#" class="orange-text mt-1 d-flex flex-row-reverse">
                <h5 class="waves-effect p-2">
                  Read more <i class="fas fa-chevron-right"></i>
                </h5>
              </a>
            </mdb-card-body>
            <!--/.Card content-->
          </mdb-card>
          <!--/.Card-->
        </mdb-col>
        <!--Grid column-->

        <!--Grid column-->
        <mdb-col lg="4" md="6" class="mb-4">
          <!--Card-->
          <mdb-card cascade>
            <!--Card image-->
            <mdb-view cascade gradient="blue">
              <h2 class="card-header-title">Marta</h2>
              <p>Deserve for her own card</p>
            </mdb-view>
            <!--/Card image-->

            <!--Card content-->
            <mdb-card-body cascade class="text-center">
              <p class="card-text pb-2">
                Lorem ipsum dolor sit amet, consectetur adipisicing elit.
                Voluptatibus, ex, recusandae. Facere modi sunt, quod quibusdam
                dignissimos neque rem nihil ratione est placeat vel, natus non
                quos laudantium veritatis sequi.Ut enim ad minima veniam, quis
                nostrum exercitationem ullam corporis suscipit laboriosam.
              </p>
              <hr />
              <!--Twitter-->
              <a class="p-2 m-2 fa-lg tw-ic"><i class="fab fa-twitter"> </i></a>
              <!--Linkedin-->
              <a class="p-2 m-2 fa-lg li-ic"
                ><i class="fab fa-linkedin-in"> </i
              ></a>
              <!--Facebook-->
              <a class="p-2 m-2 fa-lg fb-ic"
                ><i class="fab fa-facebook-f"> </i
              ></a>
              <!--Email-->
              <a class="p-2 m-2 fa-lg email-ic"
                ><i class="fas fa-envelope"> </i
              ></a>
            </mdb-card-body>
            <!--/.Card content-->
          </mdb-card>
          <!--/.Card-->
        </mdb-col>
        <!--Grid column-->
      </mdb-row>
    </section>
    <!--Section: Cascading panels-->

    <!--Section: Reverse cascade-->
    <section>
      <h3 class="mb-4 dark-grey-text font-weight-bold">
        <strong>Reverse cascade</strong>
      </h3>

      <div class="row mb-5 pb-4">
        <!--Card-->
        <mdb-card cascade reverse class="my-4 mx-3">
          <!--Card image-->
          <mdb-view cascade>
            <mdb-card-image
              top
              src="https://mdbootstrap.com/img/Photos/Slides/img%20(135).jpg"
            />
            <mdb-mask waves></mdb-mask>
          </mdb-view>
          <!--/Card image-->

          <!--Card content-->
          <mdb-card-body cascade class="text-center">
            <!--Title-->
            <h4 class="card-title"><strong>My adventure</strong></h4>
            <h5 class="indigo-text"><strong>Photography</strong></h5>

            <p class="card-text">
              Sed ut perspiciatis unde omnis iste natus sit voluptatem
              accusantium doloremque laudantium, totam rem aperiam.
            </p>

            <!--Linkedin-->
            <a class="p-2 m-2 fa-lg li-ic"
              ><i class="fab fa-linkedin-in"> </i
            ></a>
            <!--Twitter-->
            <a class="p-2 m-2 fa-lg tw-ic"><i class="fab fa-twitter"> </i></a>
            <!--Dribbble-->
            <a class="p-2 m-2 fa-lg fb-ic"
              ><i class="fab fa-facebook-f"> </i
            ></a>
          </mdb-card-body>
          <!--/.Card content-->
        </mdb-card>
        <!--/.Card-->
      </div>
    </section>
    <!--Section: Reverse cascade-->

    <!--Section: Additional cards-->
    <section class="mb-5">
      <mdb-row>
        <!--Subheading-->
        <mdb-col md="4" class="mb-4">
          <h4 id="" class="mb-4 font-weight-bold dark-grey-text">
            <strong>Waves effect</strong>
          </h4>

          <!--Section: Live preview-->
          <section>
            <!--Card-->
            <mdb-card>
              <!--Card image-->
              <mdb-view>
                <mdb-card-image
                  top
                  src="https://mdbootstrap.com/img/Mockups/Lightbox/Thumbnail/img%20(67).jpg"
                />
                <mdb-mask waves></mdb-mask>
              </mdb-view>

              <!--Card content-->
              <mdb-card-body cascade>
                <!--Title-->
                <h4 class="card-title">Card title</h4>
                <!--Text-->
                <p class="card-text">
                  Some quick example text to build on the card title and make up
                  the bulk of the card's content.
                </p>
                <mdb-btn color="primary">Button</mdb-btn>
              </mdb-card-body>
            </mdb-card>
            <!--/.Card-->
          </section>
          <!--Section: Live preview-->
        </mdb-col>

        <mdb-col md="4" class="mb-4">
          <!--Subheading-->
          <h4 id="" class="mb-4 font-weight-bold dark-grey-text">
            <strong>Basic example</strong>
          </h4>

          <!--Section: Live preview-->
          <section>
            <!--Card-->
            <mdb-card class="card">
              <!--Card image-->
              <mdb-card-image
                top
                src="https://mdbootstrap.com/img/Photos/Lightbox/Thumbnail/img%20(97).jpg"
                alt="Card image cap"
              />

              <!--Card content-->
              <mdb-card-body>
                <!--Title-->
                <h4 class="card-title"><strong>Card title</strong></h4>
                <!--Text-->
                <p class="card-text">
                  Some quick example text to build on the card title and make up
                  the bulk of the card's content.
                </p>
                <mdb-btn color="pink" rounded>Button</mdb-btn>
              </mdb-card-body>
            </mdb-card>
            <!--/.Card-->
          </section>
          <!--Section: Live preview-->
        </mdb-col>

        <mdb-col md="4" class="mb-4">
          <!--Subheading-->
          <h4 id="" class="mb-4 font-weight-bold dark-grey-text">
            <strong>Testimonial card</strong>
          </h4>

          <!--Section: Live preview-->
          <section>
            <!--Card-->
            <mdb-card testimonial style="max-width: 22rem;">
              <!--Bacground color-->
              <div class="card-up aqua-gradient"></div>

              <!--Avatar-->
              <mdb-avatar class="mx-auto white"
                ><img
                  src="https://mdbootstrap.com/img/Photos/Avatars/img%20%2831%29.jpg"
                  class="rounded-circle img-fluid"
                />
              </mdb-avatar>

              <mdb-card-body>
                <!--Name-->
                <h4 class="card-title dark-grey-text">
                  <strong>Martha Smith</strong>
                </h4>
                <hr />
                <!--Quotation-->
                <p class="card-text pt-2">
                  Lorem ipsum dolor sit amet, consectetur adipisicing elit. Eos,
                  adipisci Sed ut perspiciatis unde omnis iste natus sit
                  voluptatem accusantium doloremque laudantium, totam rem
                  aperiam. Facere modi sunt, quod quibusdam dignissimos neque
                  rem nihil.
                </p>
              </mdb-card-body>
            </mdb-card>
            <!--/.Card-->
          </section>
          <!--Section: Live preview-->
        </mdb-col>
      </mdb-row>
    </section>
    <!--Section: Additional cards-->

    <!--Section: Overlay cards-->
    <section class="mb-5">
      <h3 id="" class="font-weight-bold dark-grey-text mb-4">
        <strong>Image overlay</strong>
      </h3>

      <mdb-row>
        <mdb-col md="6" class="mb-4">
          <!-- Card -->
          <mdb-card
            class="card-image"
            style="background-image: url(https://mdbootstrap.com/img/Photos/Horizontal/Work/4-col/img%20%2814%29.jpg);"
          >
            <!-- Content -->
            <div
              class="text-white text-center d-flex align-items-center rgba-black-strong py-5 px-4"
            >
              <div>
                <h6 class="pink-text">
                  <i class="fas fa-chart-pie"></i><strong> Marketing</strong>
                </h6>
                <h3 class="card-title pt-4 pb-3 font-weight-bold">
                  <strong>This is card title</strong>
                </h3>
                <p>
                  Lorem ipsum dolor sit amet, consectetur adipisicing elit.
                  Repellat fugiat, laboriosam, voluptatem, optio vero odio nam
                  sit officia accusamus minus error nisi architecto nulla ipsum
                  dignissimos. Odit sed qui, dolorum!.
                </p>
                <a class="btn btn-pink btn-rounded waves-effect waves-light"
                  ><i class="fas fa-clone left"></i> View project</a
                >
              </div>
            </div>
            <!-- Content -->
          </mdb-card>
          <!-- Card -->
        </mdb-col>

        <mdb-col md="6" class="mb-4">
          <div
            class="card card-image"
            style="background-image: url('https://mdbootstrap.com/img/Photos/Horizontal/City/6-col/img%20(47).jpg');"
          >
            <div
              class="text-white text-center d-flex align-items-center rgba-indigo-strong py-5 px-4"
            >
              <div>
                <h6 class="orange-text">
                  <i class="fas fa-desktop"></i><strong> Software</strong>
                </h6>
                <h3 class="card-title pt-4 pb-3 font-weight-bold">
                  <strong>This is card title</strong>
                </h3>
                <p>
                  Lorem ipsum dolor sit amet, consectetur adipisicing elit.
                  Repellat fugiat, laboriosam, voluptatem, optio vero odio nam
                  sit officia accusamus minus error nisi architecto nulla ipsum
                  dignissimos. Odit sed qui, dolorum!
                </p>
                <a
                  class="btn btn-deep-orange btn-rounded waves-effect waves-light"
                  ><i class="fas fa-clone left"></i> View project</a
                >
              </div>
            </div>
          </div>
        </mdb-col>
      </mdb-row>
    </section>
    <!--Section: Overlay cards-->

    <!--Section: Additional cards-->
    <section class="mb-5">
      <mdb-row>
        <!--Subheading-->
        <mdb-col md="4" class="mb-4">
          <h4 id="" class="font-weight-bold mb-4 dark-grey-text">
            <strong>Action button</strong>
          </h4>

          <!--Section: Live preview-->
          <section>
            <!--Card-->
            <mdb-card>
              <!--Card image-->
              <mdb-view>
                <mdb-card-image
                  top
                  src="https://mdbootstrap.com/img/Photos/Others/food.jpg"
                  class="card-img-top"
                  alt="sample"
                />
                <mdb-mask overlay="white-slight"></mdb-mask>
              </mdb-view>
              <!--/.Card image-->
              <!--Button-->
              <mdb-btn
                floating
                action
                class="ml-auto mr-4 mdb-color lighten-3"
                icon="chevron-right"
                iconLeft
              ></mdb-btn>
              <!--Card content-->
              <mdb-card-body>
                <!--Title-->
                <h4 class="card-title">Card title</h4>
                <hr />
                <!--Text-->
                <p class="card-text mb-0">
                  Some quick example text to build on the card title and make up
                  the bulk of the card's content.
                </p>
              </mdb-card-body>
              <!--/.Card content-->
              <!-- Card footer -->
              <div class="mdb-color lighten-3 text-center rounded-bottom">
                <ul class="list-unstyled list-inline font-small mt-3">
                  <li class="list-inline-item pr-2 white-text">
                    <i class="far fa-clock pr-1"></i>05/10/2015
                  </li>
                  <li class="list-inline-item pr-2">
                    <a href="#" class="white-text"
                      ><i class="far fa-comments pr-1"></i>12</a
                    >
                  </li>
                  <li class="list-inline-item pr-2">
                    <a href="#" class="white-text"
                      ><i class="fab fa-facebook-f pr-1"> </i>21</a
                    >
                  </li>
                  <li class="list-inline-item">
                    <a href="#" class="white-text"
                      ><i class="fab fa-twitter pr-1"> </i>5</a
                    >
                  </li>
                </ul>
              </div>
              <!-- Card footer -->
            </mdb-card>
            <!--/.Card-->
          </section>
          <!--Section: Live preview-->
        </mdb-col>
        <mdb-col md="4" class="mb-4">
          <!--Subheading-->
          <h4 id="" class="font-weight-bold mb-4 dark-grey-text">
            <strong>Light version</strong>
          </h4>

          <!--Section: Live preview-->
          <section>
            <!--Card Light-->
            <mdb-card>
              <!--Card image-->
              <mdb-view>
                <mdb-card-image
                  top
                  src="https://mdbootstrap.com/img/Photos/Horizontal/Nature/4-col/img%20%28131%29.jpg"
                  alt="fern"
                />
                <mdb-mask waves overlay="white-slight"></mdb-mask>
              </mdb-view>
              <!--/.Card image-->
              <!--Card content-->
              <mdb-card-body>
                <!--Social shares button-->
                <a class="activator mr-3"><i class="fas fa-share-alt"></i></a>
                <!--Title-->
                <h4 class="card-title">Card title</h4>
                <hr />
                <!--Text-->
                <p class="card-text">
                  Some quick example text to build on the card title and make up
                  the bulk of the card's content.
                </p>
                <a class="link-text"
                  ><h5>Read more <i class="fas fa-chevron-right"></i></h5
                ></a>
              </mdb-card-body>
              <!--/.Card content-->
            </mdb-card>
            <!--/.Card Light-->
          </section>
          <!--Section: Live preview-->
        </mdb-col>

        <mdb-col md="4" class="mb-4">
          <!--Subheading-->
          <h4 id="" class="font-weight-bold mb-4 dark-grey-text">
            <strong>Dark card</strong>
          </h4>

          <!--Section: Live preview-->
          <section>
            <!--Card Dark-->
            <mdb-card dark>
              <!--Card image-->
              <mdb-view>
                <mdb-card-image
                  top
                  src="https://mdbootstrap.com/img/Photos/Horizontal/Work/4-col/img%20%2821%29.jpg"
                  alt="work desk"
                />
                <mdb-mask waves overlay="white-slight"></mdb-mask>
              </mdb-view>
              <!--/.Card image-->
              <!--Card content-->
              <mdb-card-body color="elegant" class="white-text rounded-bottom">
                <!--Social shares button-->
                <a class="activator mr-3"
                  ><i class="fas fa-share-alt white-text"></i
                ></a>
                <!--Title-->
                <h4 class="card-title">Card title</h4>
                <hr class="hr-light" />
                <!--Text-->
                <p class="font-small mb-4">
                  Some quick example text to build on the card title and make up
                  the bulk of the card's content.
                </p>
                <a href="#!" class="white-text d-flex justify-content-end"
                  ><h5>Read more</h5>
                  <span><i class="fas fa-chevron-right pl-2"></i></span
                ></a>
              </mdb-card-body>
              <!--/.Card content-->
            </mdb-card>
            <!--/.Card Dark-->
          </section>
          <!--Section: Live preview-->
        </mdb-col>
      </mdb-row>
    </section>
    <!--Section: Additional cards-->

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
            href="https://mdbootstrap.com/docs/vue/components/cards/"
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
  mdbRow,
  mdbCol,
  mdbBtn,
  mdbCard,
  mdbCardBody,
  mdbView,
  mdbCardImage,
  mdbMask,
  mdbAvatar
} from "mdbvue";

export default {
  name: "Cards",
  components: {
    mdbContainer,
    mdbRow,
    mdbCol,
    mdbBtn,
    mdbCard,
    mdbCardBody,
    mdbView,
    mdbCardImage,
    mdbMask,
    mdbAvatar
  },
  data() {
    return {};
  }
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped></style>
