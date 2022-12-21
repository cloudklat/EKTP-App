<template>
  <mdb-container>
    <!--Section: Modals-->
    <section>
      <!-- Frame Modal Top Info-->
      <mdb-modal
        frame
        position="top"
        :show="showModal"
        @close="showModal = false"
      >
        <mdb-modal-body class="text-center">
          <span
            >Lorem ipsum dolor sit amet, consectetur adipisicing elit. Impedit
            nisi quo provident fugiat reprehenderit nostrum quos...</span
          >
          <mdb-btn color="secondary" @click.native="showModal = false"
            >Close</mdb-btn
          >
          <mdb-btn color="primary">Save changes</mdb-btn>
        </mdb-modal-body>
      </mdb-modal>
      <!-- Frame Modal Bottom Success-->

      <!-- Frame Modal Bottom Success-->
      <mdb-modal
        frame
        position="bottom"
        :show="showModal2"
        @close="showModal2 = false"
      >
        <mdb-modal-body class="text-center">
          <span
            >Lorem ipsum dolor sit amet, consectetur adipisicing elit. Impedit
            nisi quo provident fugiat reprehenderit nostrum quos...</span
          >
          <mdb-btn color="secondary" @click.native="showModal2 = false"
            >Close</mdb-btn
          >
          <mdb-btn color="primary">Save changes</mdb-btn>
        </mdb-modal-body>
      </mdb-modal>
      <!-- Frame Modal Bottom Success-->

      <!-- Side Modal Top Right Success-->
      <mdb-modal
        removeBackdrop
        side
        position="top-right"
        :show="showModal3"
        @close="showModal3 = false"
      >
        <mdb-modal-header>
          <mdb-modal-title>Modal title</mdb-modal-title>
        </mdb-modal-header>
        <mdb-modal-body>...</mdb-modal-body>
        <mdb-modal-footer>
          <mdb-btn color="secondary" @click.native="showModal3 = false"
            >Close</mdb-btn
          >
          <mdb-btn color="primary">Save changes</mdb-btn>
        </mdb-modal-footer>
      </mdb-modal>
      <!-- Side Modal Top Right Success-->

      <!-- Side Modal Top Left Info-->
      <mdb-modal
        removeBackdrop
        side
        position="top-left"
        :show="showModal4"
        @close="showModal4 = false"
      >
        <mdb-modal-header>
          <mdb-modal-title>Modal title</mdb-modal-title>
        </mdb-modal-header>
        <mdb-modal-body>...</mdb-modal-body>
        <mdb-modal-footer>
          <mdb-btn color="secondary" @click.native="showModal4 = false"
            >Close</mdb-btn
          >
          <mdb-btn color="primary">Save changes</mdb-btn>
        </mdb-modal-footer>
      </mdb-modal>
      <!-- Side Modal Top Left Info-->

      <!-- Side Modal Bottom Right Danger-->
      <mdb-modal
        removeBackdrop
        side
        position="bottom-right"
        :show="showModal5"
        @close="showModal5 = false"
      >
        <mdb-modal-header>
          <mdb-modal-title>Modal title</mdb-modal-title>
        </mdb-modal-header>
        <mdb-modal-body>...</mdb-modal-body>
        <mdb-modal-footer>
          <mdb-btn color="secondary" @click.native="showModal5 = false"
            >Close</mdb-btn
          >
          <mdb-btn color="primary">Save changes</mdb-btn>
        </mdb-modal-footer>
      </mdb-modal>
      <!-- Side Modal Bottom Right Danger-->

      <!-- Side Modal Bottom Left Warning-->
      <mdb-modal
        removeBackdrop
        side
        position="bottom-left"
        :show="showModal6"
        @close="showModal6 = false"
      >
        <mdb-modal-header>
          <mdb-modal-title>Modal title</mdb-modal-title>
        </mdb-modal-header>
        <mdb-modal-body>...</mdb-modal-body>
        <mdb-modal-footer>
          <mdb-btn color="secondary" @click.native="showModal6 = false"
            >Close</mdb-btn
          >
          <mdb-btn color="primary">Save changes</mdb-btn>
        </mdb-modal-footer>
      </mdb-modal>
      <!-- Side Modal Bottom Left Warning-->

      <mdb-modal size="sm" :show="showModal7" @close="showModal7 = false">
        <mdb-modal-header>
          <mdb-modal-title>Modal title</mdb-modal-title>
        </mdb-modal-header>
        <mdb-modal-body>...</mdb-modal-body>
        <mdb-modal-footer>
          <mdb-btn
            color="secondary"
            size="sm"
            @click.native="showModal7 = false"
            >Close</mdb-btn
          >
          <mdb-btn color="primary" size="sm">Save changes</mdb-btn>
        </mdb-modal-footer>
      </mdb-modal>

      <mdb-modal :show="showModal8" @close="showModal8 = false">
        <mdb-modal-header>
          <mdb-modal-title>Modal title</mdb-modal-title>
        </mdb-modal-header>
        <mdb-modal-body>...</mdb-modal-body>
        <mdb-modal-footer>
          <mdb-btn
            color="secondary"
            size="sm"
            @click.native="showModal8 = false"
            >Close</mdb-btn
          >
          <mdb-btn color="primary" size="sm">Save changes</mdb-btn>
        </mdb-modal-footer>
      </mdb-modal>

      <mdb-modal size="lg" :show="showModal9" @close="showModal9 = false">
        <mdb-modal-header>
          <mdb-modal-title>Modal title</mdb-modal-title>
        </mdb-modal-header>
        <mdb-modal-body>...</mdb-modal-body>
        <mdb-modal-footer>
          <mdb-btn
            color="secondary"
            size="sm"
            @click.native="showModal9 = false"
            >Close</mdb-btn
          >
          <mdb-btn color="primary" size="sm">Save changes</mdb-btn>
        </mdb-modal-footer>
      </mdb-modal>

      <mdb-modal size="fluid" :show="showModal10" @close="showModal10 = false">
        <mdb-modal-header>
          <mdb-modal-title>Modal title</mdb-modal-title>
        </mdb-modal-header>
        <mdb-modal-body>...</mdb-modal-body>
        <mdb-modal-footer>
          <mdb-btn
            color="secondary"
            size="sm"
            @click.native="showModal10 = false"
            >Close</mdb-btn
          >
          <mdb-btn color="primary" size="sm">Save changes</mdb-btn>
        </mdb-modal-footer>
      </mdb-modal>

      <mdb-modal
        fullHeight
        position="right"
        :show="showModal11"
        @close="showModal11 = false"
      >
        <mdb-modal-header>
          <mdb-modal-title>Modal title</mdb-modal-title>
        </mdb-modal-header>
        <mdb-modal-body>...</mdb-modal-body>
        <mdb-modal-footer>
          <mdb-btn color="secondary" @click.native="showModal11 = false"
            >Close</mdb-btn
          >
          <mdb-btn color="primary">Save changes</mdb-btn>
        </mdb-modal-footer>
      </mdb-modal>

      <mdb-modal
        fullHeight
        position="left"
        :show="showModal12"
        @close="showModal12 = false"
      >
        <mdb-modal-header>
          <mdb-modal-title>Modal title</mdb-modal-title>
        </mdb-modal-header>
        <mdb-modal-body>...</mdb-modal-body>
        <mdb-modal-footer>
          <mdb-btn color="secondary" @click.native="showModal12 = false"
            >Close</mdb-btn
          >
          <mdb-btn color="primary">Save changes</mdb-btn>
        </mdb-modal-footer>
      </mdb-modal>

      <mdb-modal
        fullHeight
        position="top"
        :show="showModal13"
        @close="showModal13 = false"
      >
        <mdb-modal-header>
          <mdb-modal-title>Modal title</mdb-modal-title>
        </mdb-modal-header>
        <mdb-modal-body>...</mdb-modal-body>
        <mdb-modal-footer>
          <mdb-btn color="secondary" @click.native="showModal13 = false"
            >Close</mdb-btn
          >
          <mdb-btn color="primary">Save changes</mdb-btn>
        </mdb-modal-footer>
      </mdb-modal>

      <mdb-modal
        fullHeight
        position="bottom"
        :show="showModal14"
        @close="showModal14 = false"
      >
        <mdb-modal-header>
          <mdb-modal-title>Modal title</mdb-modal-title>
        </mdb-modal-header>
        <mdb-modal-body>...</mdb-modal-body>
        <mdb-modal-footer>
          <mdb-btn color="secondary" @click.native="showModal14 = false"
            >Close</mdb-btn
          >
          <mdb-btn color="primary">Save changes</mdb-btn>
        </mdb-modal-footer>
      </mdb-modal>

      <!-- Central Modal Success Demo-->
      <mdb-modal
        size="success"
        position="notify"
        :show="showModal15"
        @close="showModal15 = false"
      >
        <!--Header-->
        <mdb-modal-header class="text-white">
          <p class="heading lead">Modal Success</p>
        </mdb-modal-header>
        <!--Body-->
        <mdb-modal-body class="text-center">
          <mdb-icon
            icon="check"
            size="4x"
            class="mb-3 animated rotateIn"
          ></mdb-icon>
          <p>
            Lorem ipsum dolor sit amet, consectetur adipisicing elit. Impedit
            iusto nulla aperiam blanditiis ad consequatur in dolores culpa,
            dignissimos, eius non possimus fugiat. Esse ratione fuga, enim, ab
            officiis totam.
          </p>
        </mdb-modal-body>
        <!--Footer-->
        <mdb-modal-footer class="justify-content-center">
          <mdb-btn color="success">
            Get it now
            <i class="fas fa-gem text-white ml-1"></i>
          </mdb-btn>
          <mdb-btn outline="success" @click.native="showModal15 = false"
            >No, thanks</mdb-btn
          >
        </mdb-modal-footer>
      </mdb-modal>
      <!-- Central Modal Success Demo-->

      <!-- Central Modal Info Demo-->
      <mdb-modal
        size="info"
        position="notify"
        :show="showModal16"
        @close="showModal16 = false"
      >
        <!--Header-->
        <mdb-modal-header class="text-white">
          <p class="heading lead">Modal Info</p>
        </mdb-modal-header>
        <!--Body-->
        <mdb-modal-body class="text-center">
          <img
            src="https://mdbootstrap.com/wp-content/uploads/2016/11/admin-dashboard-bootstrap.jpg"
            alt
            class="img-fluid"
          />
          <p>
            Lorem ipsum dolor sit amet, consectetur adipisicing elit. Impedit
            iusto nulla aperiam blanditiis ad consequatur in dolores culpa,
            dignissimos, eius non possimus fugiat. Esse ratione fuga, enim, ab
            officiis totam.
          </p>
        </mdb-modal-body>
        <!--Footer-->
        <mdb-modal-footer class="justify-content-center">
          <mdb-btn color="info">
            Get it now
            <i class="fas fa-gem text-white ml-1"></i>
          </mdb-btn>
          <mdb-btn outline="info" @click.native="showModal16 = false"
            >No, thanks</mdb-btn
          >
        </mdb-modal-footer>
      </mdb-modal>
      <!-- Central Modal Info Demo-->

      <!-- Central Modal Danger Demo-->
      <mdb-modal
        size="danger"
        position="notify"
        :show="showModal17"
        @close="showModal17 = false"
      >
        <!--Header-->
        <mdb-modal-header class="text-white">
          <p class="heading lead">Modal Danger</p>
        </mdb-modal-header>
        <!--Body-->
        <mdb-modal-body>
          <div class="row">
            <div class="col-3">
              <p></p>
              <p class="text-center">
                <mdb-icon icon="shopping-cart" size="4x"></mdb-icon>
              </p>
            </div>
            <div class="col-9">
              <p>
                Lorem ipsum dolor sit amet, consectetur adipisicing elit. Fuga,
                molestiae provident temporibus sunt earum.
              </p>
              <h2>
                <span class="badge">v52gs1</span>
              </h2>
            </div>
          </div>
        </mdb-modal-body>
        <!--Footer-->
        <mdb-modal-footer class="justify-content-center">
          <mdb-btn color="danger">
            Get it now
            <i class="fas fa-gem text-white ml-1"></i>
          </mdb-btn>
          <mdb-btn outline="danger" @click.native="showModal17 = false"
            >No, thanks</mdb-btn
          >
        </mdb-modal-footer>
      </mdb-modal>
      <!-- Central Modal Danger Demo-->

      <!-- Central Modal Warning Demo-->
      <mdb-modal
        size="warning"
        position="notify"
        :show="showModal18"
        @close="showModal18 = false"
      >
        <!--Header-->
        <mdb-modal-header class="text-white">
          <p class="heading lead">Modal Warning</p>
        </mdb-modal-header>
        <!--Body-->
        <mdb-modal-body>
          <div class="row">
            <div class="col-3 text-center">
              <img
                src="https://mdbootstrap.com/img/Photos/Avatars/img%20(1).jpg"
                alt="Michal Szymanski - founder of Material Design for Bootstrap"
                class="img-fluid z-depth-1-half rounded-circle"
              />
              <div style="height: 10px"></div>
              <p class="title mb-0">Jane</p>
              <p class="text-muted" style="font-size: 13px">Consultant</p>
            </div>

            <div class="col-9">
              <p>
                Lorem ipsum dolor sit amet, consectetur adipisicing elit. Fuga,
                molestiae provident temporibus sunt earum.
              </p>
              <p class="card-text">
                <strong
                  >Lorem ipsum dolor sit amet, consectetur adipisicing
                  elit.</strong
                >
              </p>
            </div>
          </div>
        </mdb-modal-body>
        <!--Footer-->
        <mdb-modal-footer class="justify-content-center">
          <mdb-btn color="warning">
            Get it now
            <i class="fas fa-gem text-white ml-1"></i>
          </mdb-btn>
          <mdb-btn outline="warning" @click.native="showModal18 = false"
            >No, thanks</mdb-btn
          >
        </mdb-modal-footer>
      </mdb-modal>
      <!-- Central Modal Warning Demo-->

      <!-- Central Modal Contact Form-->
      <mdb-modal cascade :show="showModal19" @close="showModal19 = false">
        <!--Header-->
        <mdb-modal-header class="light-blue darken-3 text-white">
          <h4 class><i class="fas fa-pencil"></i> Contact form</h4>
        </mdb-modal-header>
        <!--Body-->
        <mdb-modal-body>
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
        </mdb-modal-body>
        <!--Footer-->
        <mdb-modal-footer class="justify-content-center">
          <mdb-btn color="info" icon="paper-plane" iconRight>Send</mdb-btn>
        </mdb-modal-footer>
      </mdb-modal>
      <!-- Central Modal Contact Form-->

      <!-- Central Modal Contact Form-->
      <mdb-modal :show="showModal20" @close="showModal20 = false" cascade tabs>
        <mdb-tab tabs justify class="light-blue darken-3">
          <mdb-tab-item :active="tabs == 1" @click.native.prevent="tabs = 1">
            <mdb-icon icon="user" class="mr-1" />Login
          </mdb-tab-item>
          <mdb-tab-item :active="tabs == 2" @click.native.prevent="tabs = 2">
            <mdb-icon icon="user-plus" class="mr-1" />Register
          </mdb-tab-item>
        </mdb-tab>
        <mdb-modal-body class="mx-3" v-if="tabs == 1">
          <mdb-input
            label="Your email"
            icon="envelope"
            type="email"
            class="mb-5"
          />
          <mdb-input label="Your password" icon="lock" type="password" />
          <div class="mt-2 text-center">
            <mdb-btn color="info">
              Log in
              <mdb-icon icon="sign-in-alt" class="ml-1" />
            </mdb-btn>
          </div>
        </mdb-modal-body>
        <mdb-modal-footer center v-if="tabs == 1">
          <div class="options text-center text-md-right mt-1">
            <p>
              Not a member?
              <a href="#" @click="tabs = 2">Sign Up</a>
            </p>
            <p>
              Forgot
              <a href="#">Password?</a>
            </p>
          </div>
          <mdb-btn
            outline="info"
            class="ml-auto"
            @click.native="showModal20 = false"
            >Close</mdb-btn
          >
        </mdb-modal-footer>
        <mdb-modal-body class="mx-3" v-if="tabs == 2">
          <mdb-input
            label="Your email"
            icon="envelope"
            type="email"
            class="mb-5"
          />
          <mdb-input
            label="Your password"
            icon="lock"
            type="password"
            class="mb-5"
          />
          <mdb-input label="Repeat password" icon="lock" type="password" />
          <div class="mt-2 text-center">
            <mdb-btn color="info">
              Sign Up
              <mdb-icon icon="sign-in-alt" class="ml-1" />
            </mdb-btn>
          </div>
        </mdb-modal-body>
        <mdb-modal-footer center v-if="tabs == 2">
          <div class="options text-center text-md-right mt-1">
            <p>
              Already have an account?
              <a href="#" @click="tabs = 1">Log in</a>
            </p>
          </div>
          <mdb-btn
            outline="info"
            class="ml-auto"
            @click.native="showModal20 = false"
            >Close</mdb-btn
          >
        </mdb-modal-footer>
      </mdb-modal>
      <!-- Central Modal Contact Form-->

      <!-- Central Modal Subscription Form-->
      <mdb-modal cascade :show="showModal21" @close="showModal21 = false">
        <!--Header-->
        <mdb-modal-header class="light-blue darken-3 text-white">
          <h4 class><i class="fas fa-newspaper-o"></i> Subscription form</h4>
        </mdb-modal-header>
        <!--Body-->
        <mdb-modal-body>
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
        </mdb-modal-body>
        <!--Footer-->
        <mdb-modal-footer class="justify-content-center">
          <mdb-btn color="info" icon="check" iconRight>Submit</mdb-btn>
        </mdb-modal-footer>
      </mdb-modal>
      <!-- Central Modal Subscription Form-->

      <!-- Central Modal Avatar Form-->
      <mdb-modal
        cascade
        size="sm"
        position="avatar"
        :show="showModal22"
        @close="showModal22 = false"
      >
        <!--Header-->
        <mdb-modal-header :close="false">
          <img
            src="https://mdbootstrap.com/img/Photos/Avatars/img%20%281%29.jpg"
            class="rounded-circle img-fluid"
          />
        </mdb-modal-header>
        <!--Body-->
        <mdb-modal-body class="text-center">
          <h5 class="mt-1 mb-2">Maria Doe</h5>
          <mdb-input class="grey-text" type="password" label="Enter password" />
          <mdb-btn color="info" icon="sign" iconRight>Login</mdb-btn>
        </mdb-modal-body>
      </mdb-modal>
      <!-- Central Modal Avatar Form-->
    </section>
    <!--/Section: Modals-->

    <!-- SECTION: Demo-->
    <section>
      <!--Section: Position & Sizes-->
      <section>
        <h4 class="mb-5 mt-4 dark-grey-text text-center font-weight-bold">
          <strong>Position & Sizes</strong>
        </h4>

        <div class="text-center mb-5">
          <p class="lead">Click buttons below to launch modals demo</p>
        </div>

        <!-- First row-->
        <div class="row">
          <!--First column-->
          <div class="col-md-3">
            <h5 class="text-center mb-3">Frame Modal</h5>

            <img
              src="https://mdbootstrap.com/img/brandflow/modal4.jpg"
              alt
              class="img-fluid z-depth-1"
            />
            <div class="text-center">
              <h5 class="my-3">Position</h5>

              <mdb-btn color="primary" @click.native="showModal = true"
                >Top</mdb-btn
              >
              <br />
              <mdb-btn color="primary" @click.native="showModal2 = true"
                >Bottom</mdb-btn
              >
            </div>
          </div>
          <!--First column-->

          <!--Second column-->
          <div class="col-md-3">
            <h5 class="text-center mb-3">Side Modal</h5>

            <img
              src="https://mdbootstrap.com/img/brandflow/modal3.jpg"
              alt
              class="img-fluid z-depth-1"
            />
            <div class="text-center">
              <h5 class="my-3">Position</h5>

              <mdb-btn color="primary" @click="showModal3 = true"
                >Top right</mdb-btn
              >
              <br />
              <mdb-btn color="primary" @click="showModal4 = true"
                >Top left</mdb-btn
              >
              <br />
              <mdb-btn color="primary" @click="showModal5 = true"
                >Bottom right</mdb-btn
              >
              <br />
              <mdb-btn color="primary" @click="showModal6 = true"
                >Bottom left</mdb-btn
              >
              <br />
            </div>
          </div>
          <!--Second column-->

          <!--Third column-->
          <div class="col-md-3">
            <h5 class="text-center mb-3">Central Modal</h5>

            <img
              src="https://mdbootstrap.com/img/brandflow/modal2.jpg"
              alt
              class="img-fluid z-depth-1"
            />
            <div class="text-center">
              <h5 class="my-3">Size</h5>

              <mdb-btn color="primary" @click="showModal7 = true"
                >Small</mdb-btn
              >
              <br />
              <mdb-btn color="primary" @click="showModal8 = true"
                >Medium</mdb-btn
              >
              <br />
              <mdb-btn color="primary" @click="showModal9 = true"
                >Large</mdb-btn
              >
              <br />
              <mdb-btn color="primary" @click="showModal10 = true"
                >Fluid</mdb-btn
              >
              <br />
            </div>
          </div>
          <!--Third column-->

          <!--Fourth column-->
          <div class="col-md-3">
            <h5 class="text-center mb-3">Fluid Modal</h5>

            <img
              src="https://mdbootstrap.com/img/brandflow/modal1.jpg"
              alt
              class="img-fluid z-depth-1"
            />
            <div class="text-center">
              <h5 class="my-3">Position</h5>

              <mdb-btn color="primary" @click="showModal11 = true"
                >Right</mdb-btn
              >
              <br />
              <mdb-btn color="primary" @click="showModal12 = true"
                >Left</mdb-btn
              >
              <br />
              <mdb-btn color="primary" @click="showModal13 = true"
                >Top</mdb-btn
              >
              <br />
              <mdb-btn color="primary" @click="showModal14 = true"
                >Bottom</mdb-btn
              >
              <br />
            </div>
          </div>
          <!--Fourth column-->
        </div>
        <!-- /.First row-->
      </section>
      <!--/Section: Position & Sizes-->

      <hr class="my-5" />

      <!--Section: Styles-->
      <section>
        <h4 class="my-5 mt-4 dark-grey-text text-center">
          <strong>Styles examples</strong>
        </h4>

        <!--First row-->
        <div class="row">
          <!--First column-->
          <div class="col-md-6">
            <div class="text-center">
              <mdb-btn
                color="primary"
                rounded
                @click="showModal15 = true"
                icon="eye"
                iconRight
                >Launch Modal Success</mdb-btn
              >
            </div>

            <!--Modal: mdb-abandonedCart-hard-->
            <div
              class="modal-dialog modal-notify modal-success"
              role="document"
            >
              <!--Content-->
              <div class="modal-content">
                <!--Header-->
                <div class="modal-header">
                  <p class="heading lead">Modal Success</p>

                  <button
                    type="button"
                    class="close"
                    data-dismiss="modal"
                    aria-label="Close"
                  >
                    <span aria-hidden="true" class="white-text">&times;</span>
                  </button>
                </div>

                <!--Body-->
                <div class="modal-body">
                  <div class="text-center">
                    <i class="fas fa-check fa-4x mb-3 animated rotateIn"></i>
                    <p>
                      Lorem ipsum dolor sit amet, consectetur adipisicing elit.
                      Impedit iusto nulla aperiam blanditiis ad consequatur in
                      dolores culpa, dignissimos, eius non possimus fugiat. Esse
                      ratione fuga, enim, ab officiis totam.
                    </p>
                  </div>
                </div>

                <!--Footer-->
                <div class="modal-footer justify-content-center">
                  <a type="button" class="btn btn-success px-3 px-3">
                    Get it now
                    <i class="fas fa-gem text-white ml-1"></i>
                  </a>
                  <a
                    type="button"
                    class="btn btn-outline-success waves-effect px-3 px-3"
                    data-dismiss="modal"
                    >No, thanks</a
                  >
                </div>
              </div>
              <!--/.Content-->
            </div>
          </div>
          <!--/First column-->

          <!--Second column-->
          <div class="col-md-6">
            <div class="text-center">
              <mdb-btn
                color="primary"
                rounded
                @click.native="showModal16 = true"
                icon="eye"
                iconRight
                >Launch Modal Info</mdb-btn
              >
            </div>

            <!--Modal: mdb-abandonedCart-hard-->
            <div class="modal-dialog modal-notify modal-info" role="document">
              <!--Content-->
              <div class="modal-content">
                <!--Header-->
                <div class="modal-header">
                  <p class="heading lead">Modal Info</p>

                  <button
                    type="button"
                    class="close"
                    data-dismiss="modal"
                    aria-label="Close"
                  >
                    <span aria-hidden="true" class="white-text">&times;</span>
                  </button>
                </div>

                <!--Body-->
                <div class="modal-body">
                  <img
                    src="https://mdbootstrap.com/wp-content/uploads/2016/11/admin-dashboard-bootstrap.jpg"
                    alt
                    class="img-fluid"
                  />

                  <div class="text-center">
                    <p>
                      Lorem ipsum dolor sit amet, consectetur adipisicing elit.
                      Nesciunt vero illo error eveniet cum.
                    </p>
                  </div>
                </div>

                <!--Footer-->
                <div class="modal-footer justify-content-center">
                  <a type="button" class="btn btn-info px-3">
                    Get it now
                    <i class="fas fa-gem text-white ml-1"></i>
                  </a>
                  <a
                    type="button"
                    class="btn btn-outline-info waves-effect px-3"
                    data-dismiss="modal"
                    >No, thanks</a
                  >
                </div>
              </div>
              <!--/.Content-->
            </div>
            <!--/Modal: mdb-abandonedCart-hard-->
          </div>
          <!--/Second column-->
        </div>
        <!--/First row-->

        <!--Second row-->
        <div class="row">
          <!--First column-->
          <div class="col-md-6">
            <div class="text-center">
              <mdb-btn
                color="primary"
                rounded
                @click.native="showModal17 = true"
                icon="eye"
                iconRight
                >Launch Modal Danger</mdb-btn
              >
            </div>

            <!--Modal: mdb-abandonedCart-hard-->
            <div class="modal-dialog modal-notify modal-danger" role="document">
              <!--Content-->
              <div class="modal-content">
                <!--Header-->
                <div class="modal-header">
                  <p class="heading">Modal Danger</p>

                  <button
                    type="button"
                    class="close"
                    data-dismiss="modal"
                    aria-label="Close"
                  >
                    <span aria-hidden="true" class="white-text">&times;</span>
                  </button>
                </div>

                <!--Body-->
                <div class="modal-body">
                  <div class="row">
                    <div class="col-3">
                      <p></p>
                      <p class="text-center">
                        <i class="fas fa-shopping-cart fa-4x"></i>
                      </p>
                    </div>

                    <div class="col-9">
                      <p>
                        Lorem ipsum dolor sit amet, consectetur adipisicing
                        elit. Fuga, molestiae provident temporibus sunt earum.
                      </p>
                      <h2>
                        <span class="badge">v52gs1</span>
                      </h2>
                    </div>
                  </div>
                </div>

                <!--Footer-->
                <div class="modal-footer justify-content-center">
                  <a type="button" class="btn btn-danger px-3">
                    Get it now
                    <i class="fas fa-gem text-white ml-1"></i>
                  </a>
                  <a
                    type="button"
                    class="btn btn-outline-danger waves-effect px-3"
                    data-dismiss="modal"
                    >No, thanks</a
                  >
                </div>
              </div>
              <!--/.Content-->
            </div>
          </div>
          <!--/First column-->

          <!--Second column-->
          <div class="col-md-6">
            <div class="text-center">
              <mdb-btn
                color="primary"
                rounded
                @click="showModal18 = true"
                icon="eye"
                iconRight
                >Launch Modal Warning</mdb-btn
              >
            </div>

            <!--Modal: mdb-abandonedCart-hard-->
            <div
              class="modal-dialog modal-notify modal-warning"
              role="document"
            >
              <!--Content-->
              <div class="modal-content">
                <!--Header-->
                <div class="modal-header">
                  <p class="heading">Modal Warning</p>

                  <button
                    type="button"
                    class="close"
                    data-dismiss="modal"
                    aria-label="Close"
                  >
                    <span aria-hidden="true" class="white-text">&times;</span>
                  </button>
                </div>

                <!--Body-->
                <div class="modal-body">
                  <div class="row">
                    <div class="col-3 text-center">
                      <img
                        src="https://mdbootstrap.com/img/Photos/Avatars/img%20(1).jpg"
                        alt="Michal Szymanski - founder of Material Design for Bootstrap"
                        class="img-fluid z-depth-1-half rounded-circle"
                      />
                      <div style="height: 10px"></div>
                      <p class="title mb-0">Jane</p>
                      <p class="text-muted" style="font-size: 13px">
                        Consultant
                      </p>
                    </div>

                    <div class="col-9">
                      <p>
                        Lorem ipsum dolor sit amet, consectetur adipisicing
                        elit. Fuga, molestiae provident temporibus sunt earum.
                      </p>
                      <p class="card-text">
                        <strong
                          >Lorem ipsum dolor sit amet, consectetur adipisicing
                          elit.</strong
                        >
                      </p>
                    </div>
                  </div>
                </div>

                <!--Footer-->
                <div class="modal-footer justify-content-center">
                  <a type="button" class="btn btn-warning px-3">
                    Get it now
                    <i class="fas fa-gem text-white ml-1"></i>
                  </a>
                  <a
                    type="button"
                    class="btn btn-outline-warning waves-effect px-3"
                    data-dismiss="modal"
                    >No, thanks</a
                  >
                </div>
              </div>
              <!--/.Content-->
            </div>
          </div>
          <!--/Second column-->
        </div>
        <!--/Second row-->
      </section>
      <!--Section: Styles-->

      <hr class="my-5" />

      <!--Section: Forms-->
      <section>
        <h4 class="my-5 mt-4 dark-grey-text text-center">
          <strong>Forms Examples</strong>
        </h4>

        <!--First row-->
        <div class="row">
          <!--First column-->
          <div class="col-md-6">
            <div class="text-center">
              <mdb-btn
                color="primary"
                rounded
                @click="showModal19 = true"
                icon="eye"
                iconRight
                >Launch Modal Contact Form</mdb-btn
              >
            </div>

            <!--Modal: Contact form-->
            <div class="modal-dialog cascading-modal" role="document">
              <!--Content-->
              <div class="modal-content">
                <!--Header-->
                <div class="modal-header light-blue darken-3 white-text">
                  <h4 class><i class="fas fa-pencil-alt"></i> Contact form</h4>
                  <button
                    type="button"
                    class="close waves-effect waves-light"
                    data-dismiss="modal"
                    aria-label="Close"
                  >
                    <span aria-hidden="true">&times;</span>
                  </button>
                </div>
                <!--Body-->
                <div class="modal-body mb-0">
                    <mdb-input size="sm" icon="envelope" label="Your name" type="text" />

                  <mdb-input size="sm" icon="lock" label="Your email" type="email" />

                  <mdb-input size="sm" icon="tag" label="Subject" type="text" />


                  <mdb-input size="sm" icon="pencil-alt" label="Your message" type="textarea" :rows="3"/>


                  <div class="text-center mt-1-half">
                    <mdb-btn icon="paper-plane" iconRight color="info">Send</mdb-btn>
                  </div>
                </div>
              </div>
              <!--/.Content-->
            </div>
            <!--/Modal: Contact form-->
          </div>
          <!--/First column-->

          <!--Second column-->
          <div class="col-md-6">
            <div class="text-center">
              <mdb-btn
                color="primary"
                rounded
                @click="showModal20 = true"
                icon="eye"
                iconRight
                >Launch Modal Login/Register</mdb-btn
              >
            </div>

            <!--Modal: Login & Register tabs-->
            <div class="modal-dialog cascading-modal" role="document">
              <!--Content-->
              <div class="modal-content">
                <!--Modal cascading tabs-->
                <div class="modal-c-tabs">
                  <!-- Nav tabs -->
                  <ul
                    class="nav md-tabs tabs-2 light-blue darken-3"
                    role="tablist"
                  >
                    <li class="nav-item">
                      <a
                        class="nav-link active"
                        data-toggle="tab"
                        href="#panel1"
                        role="tab"
                      >
                        <i class="fas fa-user mr-1"></i> Login
                      </a>
                    </li>
                    <li class="nav-item">
                      <a
                        class="nav-link"
                        data-toggle="tab"
                        href="#panel2"
                        role="tab"
                      >
                        <i class="fas fa-user-plus mr-1"></i> Register
                      </a>
                    </li>
                  </ul>

                  <!-- Tab panels -->
                  <div class="tab-content">
                    <!--Panel 1-->
                    <div
                      class="tab-pane fade in show active"
                      id="panel1"
                      role="tabpanel"
                    >
                      <!--Body-->
                      <div class="modal-body mb-1">
                
                          <mdb-input size="sm" icon="envelope" label="Your email" type="email" />

                        <mdb-input size="sm" icon="lock" label="Password" type="password" />

                        <div class="text-center mt-2">
                          <mdb-btn icon="paper-plane" iconRight color="info">Log in</mdb-btn>
                        </div>
                      </div>
                      <!--Footer-->
                      <div class="modal-footer display-footer">
                        <div class="options text-center text-md-right mt-1">
                          <p>
                            Not a member?
                            <a href="#" class="blue-text">Sign Up</a>
                          </p>
                          <p>
                            Forgot
                            <a href="#" class="blue-text">Password?</a>
                          </p>
                        </div>
                        <button
                          type="button"
                          class="btn btn-outline-info waves-effects ml-auto"
                          data-dismiss="modal"
                        >
                          Close
                        </button>
                      </div>
                    </div>
                    <!--/.Panel 1-->

                    <!--Panel 2-->
                    <div class="tab-pane fade" id="panel2" role="tabpanel">
                      <!--Body-->
                      <div class="modal-body">
                        <div class="md-form form-sm">
                          <i class="fas fa-envelope prefix"></i>
                          <input
                            type="text"
                            id="form13"
                            class="form-control form-control-sm"
                          />
                          <label for="form13">Your email</label>
                        </div>

                        <div class="md-form form-sm">
                          <i class="fas fa-lock prefix"></i>
                          <input
                            type="password"
                            id="form24"
                            class="form-control form-control-sm"
                          />
                          <label for="form24">Your password</label>
                        </div>

                        <div class="md-form form-sm">
                          <i class="fas fa-lock prefix"></i>
                          <input
                            type="password"
                            id="form15"
                            class="form-control form-control-sm"
                          />
                          <label for="form15">Repeat password</label>
                        </div>

                        <div class="text-center form-sm mt-2">
                          <button class="btn btn-info">
                            Sign up
                            <i class="fas fa-sign-in ml-1"></i>
                          </button>
                        </div>
                      </div>
                      <!--Footer-->
                      <div class="modal-footer">
                        <div class="options text-right">
                          <p class="pt-1">
                            Already have an account?
                            <a href="#" class="blue-text">Log In</a>
                          </p>
                        </div>
                        <button
                          type="button"
                          class="btn btn-outline-info waves-effect ml-auto"
                          data-dismiss="modal"
                        >
                          Close
                        </button>
                      </div>
                    </div>
                    <!--/.Panel 2-->
                  </div>
                </div>
              </div>
              <!--/.Content-->
            </div>
            <!--/Modal: Login & Register tabs-->
          </div>
          <!--/Second column-->
        </div>
        <!--/First row-->

        <!--Second row-->
        <div class="row">
          <!--First column-->
          <div class="col-md-6">
            <div class="text-center">
              <mdb-btn
                color="primary"
                rounded
                @click="showModal21 = true"
                icon="eye"
                iconRight
                >Launch Modal Contact Form</mdb-btn
              >
            </div>

            <!--Modal: Subscription-->
            <div class="modal-dialog cascading-modal" role="document">
              <!--Content-->
              <div class="modal-content">
                <!--Header-->
                <div class="modal-header light-blue darken-3 white-text">
                  <h4 class>
                    <i class="far fa-newspaper"></i> Subscription form
                  </h4>
                  <button
                    type="button"
                    class="close waves-effect waves-light"
                    data-dismiss="modal"
                    aria-label="Close"
                  >
                    <span aria-hidden="true">&times;</span>
                  </button>
                </div>
                <!--Body-->
                <div class="modal-body mb-0">
                  <mdb-input size="sm" icon="user" label="Your name" type="text" />

                  <mdb-input size="sm" icon="envelope" label="Your email" type="email" />

                  <div class="text-center mt-1-half">
                    <mdb-btn icon="check" color="info" iconRight>Submit</mdb-btn>
                  </div>
                </div>
              </div>
              <!--/.Content-->
            </div>
            <!--/Modal: Subscription-->
          </div>
          <!--/First column-->

          <!--Second column-->
          <div class="col-md-6">
            <div class="text-center">
              <mdb-btn
                color="primary"
                rounded
                @click.native="showModal22 = true"
                icon="eye"
                iconRight
                >Launch Modal Login with Avatar</mdb-btn
              >
            </div>

            <!--Modal: Avatar-->
            <div
              class="modal-dialog modal-sm cascading-modal modal-avatar"
              role="document"
            >
              <!--Content-->
              <div class="modal-content">
                <!--Header-->
                <div class="modal-header">
                  <img
                    src="https://mdbootstrap.com/img/Photos/Avatars/img%20%281%29.jpg"
                    class="rounded-circle img-fluid"
                  />
                </div>
                <!--Body-->
                <div class="modal-body text-center mb-1">
                  <h5 class="mt-1 mb-2">Maria Doe</h5>

                  <mdb-input size="sm" label="Enter password" type="password" />

                  <div class="text-center pt-4">
                    <button class="btn btn-cyan mt-1">
                      Login
                      <i class="fas fa-sign-in ml-1"></i>
                    </button>
                  </div>
                </div>
              </div>
              <!--/.Content-->
            </div>
            <!--/Modal: Avatar-->
          </div>
          <!--/Second column-->
        </div>
        <!--/Second row-->
      </section>
      <!--Section: Forms-->
    </section>
    <!-- /SECTION: Demo-->

    <!--Section: Docs link-->
    <section class="pb-4 pt-5">
      <!--Panel-->
      <div class="card text-center">
        <h3 class="card-header primary-color white-text">Full documentation</h3>
        <div class="card-body">
          <p class="card-text">
            Read the full documentation for these components.
          </p>
          <a
            href="https://mdbootstrap.com/docs/vue/modals/basic/"
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
  mdbBtn,
  mdbModal,
  mdbModalHeader,
  mdbModalTitle,
  mdbModalBody,
  mdbModalFooter,
  mdbIcon,
  mdbInput,
  mdbTextarea,
  mdbTab,
  mdbTabItem
} from "mdbvue";

export default {
  name: "ModalPage",
  components: {
    mdbContainer,
    mdbBtn,
    mdbModal,
    mdbModalHeader,
    mdbModalTitle,
    mdbModalBody,
    mdbModalFooter,
    mdbIcon,
    mdbInput,
    mdbTextarea,
    mdbTab,
    mdbTabItem
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
      showModal8: false,
      showModal9: false,
      showModal10: false,
      showModal11: false,
      showModal12: false,
      showModal13: false,
      showModal14: false,
      showModal15: false,
      showModal16: false,
      showModal17: false,
      showModal18: false,
      showModal19: false,
      showModal20: false,
      showModal21: false,
      showModal22: false,
      tabs: 1
    };
  }
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped></style>
