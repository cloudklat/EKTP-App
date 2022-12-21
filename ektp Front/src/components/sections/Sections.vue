<template>
  <mdb-container fluid>
    <!--Section: Main panel-->
    <section class="my-5">
      <!--Section heading-->
      <h2 class="text-center my-5 h1 pt-4">Analytical panel</h2>
      <!--Section description-->
      <p class="text-center mb-5 w-responsive mx-auto">
        Duis aute irure dolor in reprehenderit in voluptate velit esse cillum
        dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non
        proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
      </p>

      <!--Card-->
      <mdb-card cascade narrow>
        <!--Section: Chart-->
        <section>
          <!--Grid row-->
          <mdb-row>
            <!--Grid column-->
            <mdb-col xl="5" lg="12" class="mr-0">
              <!--Card image-->
              <div
                class="view view-cascade gradient-card-header light-blue lighten-1"
              >
                <h2 class="h2-responsive mb-0">Sales</h2>
              </div>
              <!--/Card image-->

              <!--Card content-->
              <mdb-card-body cascade class="pb-0">
                <!--Panel data-->
                <mdb-card-body class="row pt-3">
                  <!--First column-->
                  <mdb-col md="6">
                    <!--Date select-->
                    <p class="lead">
                      <span class="badge info-color p-2">Data range</span>
                    </p>

                    <mdb-select
                      label="Choose time period"
                      :options="[
                        { value: 1, text: 'Today' },
                        { value: 2, text: 'Yesterday' },
                        { value: 3, text: 'Last 7 days' },
                        { value: 4, text: 'Last 30 days' },
                        { value: 5, text: 'Last week' },
                        { value: 6, text: 'Last month' }
                      ]"
                    />

                    <!--Date pickers-->
                    <p class="lead mt-5">
                      <span class="badge info-color p-2">Custom date</span>
                    </p>
                    <br />

                    <mdb-date-picker
                      v-model="startTimeFrom"
                      label="From"
                    ></mdb-date-picker>
                    <mdb-date-picker
                      v-model="startTimeTo"
                      label="To"
                    ></mdb-date-picker>
                  </mdb-col>
                  <!--/First column-->

                  <!--Second column-->
                  <mdb-col md="6" class="text-center mb-2">
                    <!--Summary-->
                    <p>
                      Total sales: <strong>2000$</strong>
                      <mdb-tooltip
                        trigger="hover"
                        :options="{ placement: 'top' }"
                      >
                        <div class="tooltip">
                          Total sales in the given period
                        </div>
                        <mdb-btn
                          slot="reference"
                          color="info"
                          size="sm"
                          class="p-2"
                          ><mdb-icon icon="question"
                        /></mdb-btn>
                      </mdb-tooltip>
                    </p>

                    <p>
                      Average sales: <strong>100$</strong>
                      <mdb-tooltip
                        trigger="hover"
                        :options="{ placement: 'top' }"
                      >
                        <div class="tooltip">
                          Average daily sales in the given period
                        </div>
                        <mdb-btn
                          slot="reference"
                          color="info"
                          size="sm"
                          class="p-2"
                          ><mdb-icon icon="question"
                        /></mdb-btn>
                      </mdb-tooltip>
                    </p>

                    <!--Change chart-->
                    <mdb-simple-chart
                      class="my-4"
                      style="width: auto; height: auto"
                      :value="76"
                      color="red"
                      >{{ 76 }}%</mdb-simple-chart
                    >
                    <h5 class="d-inline">
                      <mdb-badge color="red" class="accent-2 p-2"
                        >Change <mdb-icon icon="arrow-circle-down" class="ml-1"
                      /></mdb-badge>
                    </h5>
                    <span>
                      <mdb-tooltip
                        trigger="hover"
                        :options="{ placement: 'top' }"
                      >
                        <div class="tooltip">
                          Percentage change compared to the same period in the
                          past
                        </div>
                        <mdb-btn
                          slot="reference"
                          color="info"
                          size="sm"
                          class="p-2"
                          ><mdb-icon icon="question"
                        /></mdb-btn>
                      </mdb-tooltip>
                    </span>
                  </mdb-col>
                  <!--/Second column-->
                </mdb-card-body>
                <!--/Panel data-->
              </mdb-card-body>
              <!--/.Card content-->
            </mdb-col>
            <!--Grid column-->

            <!--Grid column-->
            <div class="col-xl-7 col-lg-12 mb-4">
              <!--Card image-->
              <mdb-view cascade gradient="blue" class="gradient-card-header">
                <!-- Chart -->
                <mdb-line-chart
                  :data="lineChartData"
                  :options="lineChartOptions"
                  :height="300"
                ></mdb-line-chart>
              </mdb-view>
              <!--/Card image-->
            </div>
            <!--Grid column-->
          </mdb-row>
          <!--Grid row-->
        </section>
        <!--Section: Chart-->
      </mdb-card>
      <!--/.Card-->
    </section>
    <!--Section: Main panel-->

    <!--Section: Admin Cards-->
    <section>
      <!--Section heading-->
      <h2 class="text-center my-5 h1 pt-4">Cascading admin cards</h2>
      <!--Section description-->
      <p class="text-center mb-5 w-responsive mx-auto">
        Duis aute irure dolor in reprehenderit in voluptate velit esse cillum
        dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non
        proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
      </p>

      <!--Grid row-->
      <mdb-row>
        <!--Grid column-->
        <mdb-col xl="3" md="6" class="mb-4">
          <!--Card-->
          <mdb-card cascade class="cascading-admin-card">
            <!--Card Data-->
            <div class="admin-up">
              <mdb-icon icon="money-bill" class="primary-color"></mdb-icon>
              <div class="data">
                <p>SALES</p>
                <h4 class="font-weight-bold dark-grey-text">2000$</h4>
              </div>
            </div>
            <!--/.Card Data-->

            <!--Card content-->
            <mdb-card-body cascade>
              <div class="progress mb-3">
                <div
                  class="progress-bar bg-primary"
                  role="progressbar"
                  style="width: 25%"
                  aria-valuenow="25"
                  aria-valuemin="0"
                  aria-valuemax="100"
                ></div>
              </div>
              <!--Text-->
              <mdb-card-text>Better than last week (25%)</mdb-card-text>
            </mdb-card-body>
            <!--/.Card content-->
          </mdb-card>
          <!--/.Card-->
        </mdb-col>
        <!--Grid column-->

        <!--Grid column-->
        <mdb-col xl="3" md="6" class="mb-4">
          <!--Card-->
          <mdb-card cascade class="cascading-admin-card">
            <!--Card Data-->
            <div class="admin-up">
              <mdb-icon icon="chart-line" class="warning-color"></mdb-icon>
              <div class="data">
                <p>SUBSCRIPTIONS</p>
                <h4 class="font-weight-bold dark-grey-text">200</h4>
              </div>
            </div>
            <!--/.Card Data-->

            <!--Card content-->
            <mdb-card-body cascade>
              <div class="progress mb-3">
                <div
                  class="progress-bar red accent-2"
                  role="progressbar"
                  style="width: 25%"
                  aria-valuenow="25"
                  aria-valuemin="0"
                  aria-valuemax="100"
                ></div>
              </div>
              <!--Text-->
              <p class="card-text">Worse than last week (25%)</p>
            </mdb-card-body>
            <!--/.Card content-->
          </mdb-card>
          <!--/.Card-->
        </mdb-col>
        <!--Grid column-->

        <!--Grid column-->
        <mdb-col xl="3" md="6" class="mb-4">
          <!--Card-->
          <mdb-card cascade class="cascading-admin-card">
            <!--Card Data-->
            <div class="admin-up">
              <mdb-icon
                icon="chart-pie"
                class="light-blue lighten-1"
              ></mdb-icon>
              <div class="data">
                <p>TRAFFIC</p>
                <h4 class="font-weight-bold dark-grey-text">20000</h4>
              </div>
            </div>
            <!--/.Card Data-->

            <!--Card content-->
            <mdb-card-body cascade>
              <div class="progress mb-3">
                <div
                  class="progress-bar red accent-2"
                  role="progressbar"
                  style="width: 75%"
                  aria-valuenow="75"
                  aria-valuemin="0"
                  aria-valuemax="100"
                ></div>
              </div>
              <!--Text-->
              <p class="card-text">Worse than last week (75%)</p>
            </mdb-card-body>
            <!--/.Card content-->
          </mdb-card>
          <!--/.Card-->
        </mdb-col>
        <!--Grid column-->

        <!--Grid column-->
        <mdb-col xl="3" md="6" class="mb-4">
          <!--Card-->
          <mdb-card cascade class="cascading-admin-card">
            <!--Card Data-->
            <div class="admin-up">
              <mdb-icon icon="chart-bar" class="red accent-2"></mdb-icon>
              <div class="data">
                <p>ORGANIC TRAFFIC</p>
                <h4 class="font-weight-bold dark-grey-text">2000</h4>
              </div>
            </div>
            <!--/.Card Data-->

            <!--Card content-->
            <mdb-card-body cascade>
              <div class="progress mb-3">
                <div
                  class="progress-bar bg-primary"
                  role="progressbar"
                  style="width: 25%"
                  aria-valuenow="25"
                  aria-valuemin="0"
                  aria-valuemax="100"
                ></div>
              </div>
              <!--Text-->
              <p class="card-text">Better than last week (25%)</p>
            </mdb-card-body>
            <!--/.Card content-->
          </mdb-card>
          <!--/.Card-->
        </mdb-col>
        <!--Grid column-->
      </mdb-row>
      <!--Grid row-->
    </section>
    <!--Section: Admin Cards-->

    <!--Section: Classic admin cards-->
    <section>
      <!--Section heading-->
      <h2 class="text-center my-5 h1 pt-4">Classic admin cards</h2>
      <!--Section description-->
      <p class="text-center mb-5 w-responsive mx-auto">
        Duis aute irure dolor in reprehenderit in voluptate velit esse cillum
        dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non
        proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
      </p>

      <!--Grid row-->
      <mdb-row>
        <!--Grid column-->
        <mdb-col xl="3" md="6" class="mb-4">
          <!--Card Success-->
          <mdb-card color="primary-color" class="classic-admin-card">
            <mdb-card-body>
              <div class="pull-right">
                <i class="fas fa-money-bill"></i>
              </div>
              <p class="white-text">SALES</p>
              <h4>2000$</h4>
            </mdb-card-body>
            <div class="progress">
              <div
                class="progress-bar bg grey darken-3"
                role="progressbar"
                style="width: 25%"
                aria-valuenow="25"
                aria-valuemin="0"
                aria-valuemax="100"
              ></div>
            </div>
            <mdb-card-body>
              <p>Better than last week (25%)</p>
            </mdb-card-body>
          </mdb-card>
          <!--/.Card Success-->
        </mdb-col>
        <!--Grid column-->

        <!--Grid column-->
        <mdb-col xl="3" md="6" class="mb-4">
          <!--Card Success-->
          <mdb-card color="warning-color" class="classic-admin-card">
            <mdb-card-body>
              <div class="pull-right">
                <i class="fas fa-chart-line"></i>
              </div>
              <p class="white-text">SUBSCRIPTIONS</p>
              <h4>200</h4>
            </mdb-card-body>
            <div class="progress">
              <div
                class="progress-bar bg grey darken-3"
                role="progressbar"
                style="width: 25%"
                aria-valuenow="25"
                aria-valuemin="0"
                aria-valuemax="100"
              ></div>
            </div>
            <mdb-card-body>
              <p>Worse than last week (25%)</p>
            </mdb-card-body>
          </mdb-card>
          <!--/.Card Success-->
        </mdb-col>
        <!--Grid column-->

        <!--Grid column-->
        <mdb-col xl="3" md="6" class="mb-4">
          <!--Card Success-->
          <mdb-card color="light-blue" class="classic-admin-card lighten-1">
            <mdb-card-body>
              <div class="pull-right">
                <i class="fas fa-chart-pie"></i>
              </div>
              <p class="white-text">TRAFFIC</p>
              <h4>20000</h4>
            </mdb-card-body>
            <div class="progress">
              <div
                class="progress-bar bg grey darken-3"
                role="progressbar"
                style="width: 75%"
                aria-valuenow="75"
                aria-valuemin="0"
                aria-valuemax="100"
              ></div>
            </div>
            <mdb-card-body>
              <p>Better than last week (75%)</p>
            </mdb-card-body>
          </mdb-card>
          <!--/.Card Success-->
        </mdb-col>
        <!--Grid column-->

        <!--Grid column-->
        <mdb-col xl="3" md="6" class="mb-4">
          <!--Card Success-->
          <mdb-card color="red" class="classic-admin-card accent-2">
            <mdb-card-body>
              <div class="pull-right">
                <i class="fas fa-chart-bar"></i>
              </div>
              <p class="white-text">ORGANIC TRAFFIC</p>
              <h4>2000</h4>
            </mdb-card-body>
            <div class="progress">
              <div
                class="progress-bar bg grey darken-3"
                role="progressbar"
                style="width: 25%"
                aria-valuenow="25"
                aria-valuemin="0"
                aria-valuemax="100"
              ></div>
            </div>
            <mdb-card-body>
              <p>Better than last week (25%)</p>
            </mdb-card-body>
          </mdb-card>
          <!--/.Card Success-->
        </mdb-col>
        <!--Grid column-->
      </mdb-row>
      <!--Grid row-->
    </section>
    <!--Section: Classic admin cards-->

    <!--Section: Notification panels-->
    <section class="section">
      <!--Section heading-->
      <h2 class="text-center my-5 h1 pt-4">Notification panels</h2>
      <!--Section description-->
      <p class="text-center mb-5 w-responsive mx-auto">
        Duis aute irure dolor in reprehenderit in voluptate velit esse cillum
        dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non
        proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
      </p>

      <!--Section: Cascading panels-->
      <section class="mb-5">
        <!--Grid row-->
        <div class="row">
          <!--Grid column-->
          <div class="col-lg-4 col-md-12 mb-4">
            <!--Card-->
            <div class="card card-cascade narrower">
              <!--Card image-->
              <div class="view view-cascade gradient-card-header info-color">
                <h4 class="mb-0">Things to improve</h4>
              </div>
              <!--/Card image-->

              <!--Card content-->
              <div class="card-body card-body-cascade text-center">
                <div class="list-group list-panel">
                  <a
                    href="#"
                    class="list-group-item d-flex justify-content-between dark-grey-text"
                    >Cras justo odio
                    <i
                      class="fas fa-wrench ml-auto"
                      data-toggle="tooltip"
                      data-placement="top"
                      title="Click to fix"
                    ></i
                  ></a>
                  <a
                    href="#"
                    class="list-group-item d-flex justify-content-between dark-grey-text"
                    >Dapibus ac facilisi<i
                      class="fas fa-wrench ml-auto"
                      data-toggle="tooltip"
                      data-placement="top"
                      title="Click to fix"
                    ></i
                  ></a>
                  <a
                    href="#"
                    class="list-group-item d-flex justify-content-between dark-grey-text"
                    >Morbi leo risus
                    <i
                      class="fas fa-wrench ml-auto"
                      data-toggle="tooltip"
                      data-placement="top"
                      title="Click to fix"
                    ></i
                  ></a>
                  <a
                    href="#"
                    class="list-group-item d-flex justify-content-between dark-grey-text"
                    >Porta ac consectet<i
                      class="fas fa-wrench ml-auto"
                      data-toggle="tooltip"
                      data-placement="top"
                      title="Click to fix"
                    ></i
                  ></a>
                  <a
                    href="#"
                    class="list-group-item d-flex justify-content-between dark-grey-text"
                    >Vestibulum at eros
                    <i
                      class="fas fa-wrench ml-auto"
                      data-toggle="tooltip"
                      data-placement="top"
                      title="Click to fix"
                    ></i
                  ></a>
                </div>
              </div>
              <!--/.Card content-->
            </div>
            <!--/.Card-->
          </div>
          <!--Grid column-->

          <!--Grid column-->
          <div class="col-lg-4 col-md-6 mb-4">
            <!--Card-->
            <div class="card card-cascade narrower">
              <!--Card image-->
              <div class="view view-cascade gradient-card-header warning-color">
                <h4 class="mb-0">Tasks to do</h4>
              </div>
              <!--/Card image-->

              <!--Card content-->
              <div class="card-body card-body-cascade text-center">
                <div class="list-group list-panel">
                  <a
                    href="#"
                    class="list-group-item d-flex justify-content-between dark-grey-text"
                    >Cras justo odio
                    <i
                      class="fas fa-wrench ml-auto"
                      data-toggle="tooltip"
                      data-placement="top"
                      title="Click to fix"
                    ></i
                  ></a>
                  <a
                    href="#"
                    class="list-group-item d-flex justify-content-between dark-grey-text"
                    >Dapibus ac facilisi<i
                      class="fas fa-wrench ml-auto"
                      data-toggle="tooltip"
                      data-placement="top"
                      title="Click to fix"
                    ></i
                  ></a>
                  <a
                    href="#"
                    class="list-group-item d-flex justify-content-between dark-grey-text"
                    >Morbi leo risus
                    <i
                      class="fas fa-wrench ml-auto"
                      data-toggle="tooltip"
                      data-placement="top"
                      title="Click to fix"
                    ></i
                  ></a>
                  <a
                    href="#"
                    class="list-group-item d-flex justify-content-between dark-grey-text"
                    >Porta ac consectet<i
                      class="fas fa-wrench ml-auto"
                      data-toggle="tooltip"
                      data-placement="top"
                      title="Click to fix"
                    ></i
                  ></a>
                  <a
                    href="#"
                    class="list-group-item d-flex justify-content-between dark-grey-text"
                    >Vestibulum at eros
                    <i
                      class="fas fa-wrench ml-auto"
                      data-toggle="tooltip"
                      data-placement="top"
                      title="Click to fix"
                    ></i
                  ></a>
                </div>
              </div>
              <!--/.Card content-->
            </div>
            <!--/.Card-->
          </div>
          <!--Grid column-->

          <!--Grid column-->
          <div class="col-lg-4 col-md-6 mb-4">
            <!--Card-->
            <div class="card card-cascade narrower">
              <!--Card image-->
              <div class="view view-cascade gradient-card-header red accent-2">
                <h4 class="mb-0">Warnings</h4>
              </div>
              <!--/Card image-->

              <!--Card content-->
              <div class="card-body card-body-cascade text-center">
                <div class="list-group list-panel">
                  <a
                    href="#"
                    class="list-group-item d-flex justify-content-between dark-grey-text"
                    >Cras justo odio
                    <i
                      class="fas fa-wrench ml-auto"
                      data-toggle="tooltip"
                      data-placement="top"
                      title="Click to fix"
                    ></i
                  ></a>
                  <a
                    href="#"
                    class="list-group-item d-flex justify-content-between dark-grey-text"
                    >Dapibus ac facilisi<i
                      class="fas fa-wrench ml-auto"
                      data-toggle="tooltip"
                      data-placement="top"
                      title="Click to fix"
                    ></i
                  ></a>
                  <a
                    href="#"
                    class="list-group-item d-flex justify-content-between dark-grey-text"
                    >Morbi leo risus
                    <i
                      class="fas fa-wrench ml-auto"
                      data-toggle="tooltip"
                      data-placement="top"
                      title="Click to fix"
                    ></i
                  ></a>
                  <a
                    href="#"
                    class="list-group-item d-flex justify-content-between dark-grey-text"
                    >Porta ac consectet<i
                      class="fas fa-wrench ml-auto"
                      data-toggle="tooltip"
                      data-placement="top"
                      title="Click to fix"
                    ></i
                  ></a>
                  <a
                    href="#"
                    class="list-group-item d-flex justify-content-between dark-grey-text"
                    >Vestibulum at eros
                    <i
                      class="fas fa-wrench ml-auto"
                      data-toggle="tooltip"
                      data-placement="top"
                      title="Click to fix"
                    ></i
                  ></a>
                </div>
              </div>
              <!--/.Card content-->
            </div>
            <!--/.Card-->
          </div>
          <!--Grid column-->
        </div>
        <!--Grid row-->
      </section>
      <!--Section: Cascading panels-->
    </section>
    <!--Section: Notification panels-->

    <!--Section: Blog v.2-->
    <section class="section extra-margins text-center pb-3">
      <!--Section heading-->
      <h2 class="text-center my-5 h1 pt-4">Recent posts</h2>
      <!--Section description-->
      <p class="text-center mb-5 w-responsive mx-auto">
        Duis aute irure dolor in reprehenderit in voluptate velit esse cillum
        dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non
        proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
      </p>

      <!--Grid row-->
      <div class="row">
        <!--Grid column-->
        <div class="col-lg-4 col-md-12 mb-4">
          <!--Featured image-->
          <mdb-view class="z-depth-1-half mb-2">
            <mdb-card-image
              src="https://mdbootstrap.com/img/Photos/Horizontal/Work/6-col/img%20(41).jpg"
              class="img-fluid"
              alt="First sample image"
            />
            <mdb-mask overlay="white-slight" waves></mdb-mask>
          </mdb-view>

          <!--Excerpt-->
          <a href="" class="pink-text">
            <h6 class="mb-3 mt-3">
              <i class="fas fa-laptop "></i><strong> Work</strong>
            </h6>
          </a>
          <h4 class="mb-3"><strong>This is title of the news</strong></h4>
          <p>
            by <a><strong>Billy Forester</strong></a
            >, 15/07/2016
          </p>
          <p>
            Nam libero tempore, cum soluta nobis est eligendi optio cumque nihil
            impedit quo minus id quod maxime placeat facere possimus.
          </p>
          <mdb-btn color="primary" rounded>Read more</mdb-btn>
        </div>
        <!--Grid column-->

        <!--Grid column-->
        <div class="col-lg-4 col-md-6 mb-4">
          <!--Featured image-->
          <mdb-view class="z-depth-1-half mb-2">
            <mdb-card-image
              src="https://mdbootstrap.com/img/Photos/Horizontal/Work/6-col/img%20(42).jpg"
              class="img-fluid"
              alt="First sample image"
            />
            <mdb-mask overlay="white-slight" waves></mdb-mask>
          </mdb-view>

          <!--Excerpt-->
          <a href="" class="teal-text">
            <h6 class="mb-3 mt-3">
              <i class="fas fa-graduation-cap"></i><strong> Education</strong>
            </h6>
          </a>
          <h4 class="mb-3"><strong>This is title of the news</strong></h4>
          <p>
            by <a><strong>Billy Forester</strong></a
            >, 12/07/2016
          </p>
          <p>
            At vero eos et accusamus et iusto odio dignissimos ducimus qui
            blanditiis praesentium voluptatum deleniti atque corrupti quos.
          </p>
          <mdb-btn color="primary" rounded>Read more</mdb-btn>
        </div>
        <!--Grid column-->

        <!--Grid column-->
        <div class="col-lg-4 col-md-6 mb-4">
          <!--Featured image-->
          <mdb-view class="z-depth-1-half mb-2">
            <mdb-card-image
              src="https://mdbootstrap.com/img/Photos/Horizontal/Work/6-col/img%20(43).jpg"
              class="img-fluid"
              alt="First sample image"
            />
            <mdb-mask overlay="white-slight" waves></mdb-mask>
          </mdb-view>

          <!--Excerpt-->
          <a href="" class="cyan-text">
            <h6 class="mb-3 mt-3">
              <i class="fas fa-fire "></i><strong> Culture</strong>
            </h6>
          </a>
          <h4 class="mb-3"><strong>This is title of the news</strong></h4>
          <p>
            by <a><strong>Billy Forester</strong></a
            >, 10/07/2016
          </p>
          <p>
            Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut
            fugit, quia consequuntur magni dolores eos qui ratione.
          </p>
          <mdb-btn color="primary" rounded>Read more</mdb-btn>
        </div>
        <!--Grid column-->
      </div>
      <!--Grid row-->
    </section>
    <!--Section: Blog v.2-->

    <section class="section extra-margins pb-3">
      <h2 class="h1-responsive font-weight-bold text-center my-5">
        Contact us
      </h2>
      <p class="text-center w-responsive mx-auto pb-5">
        Lorem ipsum dolor sit amet, consectetur adipisicing elit. Fugit, error
        amet numquam iure provident voluptate esse quasi, veritatis totam
        voluptas nostrum quisquam eum porro a pariatur veniam.
      </p>
      <mdb-row>
        <mdb-col lg="5" class="lg-0 mb-4">
          <mdb-card>
            <mdb-card-body>
              <div class="form-header blue accent-1 text-left">
                <h3 class="mt-2"><mdb-icon icon="envelope" /> Write to us:</h3>
              </div>
              <p class="dark-grey-text">
                We'll write rarely, but only the best content.
              </p>
              <div class="md-form">
                <mdb-input
                  icon="user"
                  label="Your name"
                  iconClass="grey-text"
                  type="text"
                  id="form-name"
                />
              </div>
              <div class="md-form">
                <mdb-input
                  icon="envelope"
                  label="Your email"
                  iconClass="grey-text"
                  type="text"
                  id="form-email"
                />
              </div>
              <div class="md-form">
                <mdb-input
                  icon="tag"
                  label="Subject"
                  iconClass="grey-text"
                  type="text"
                  id="form-subject"
                />
              </div>
              <div class="md-form">
                <mdb-textarea
                  icon="pencil-alt"
                  label="Icon Prefix"
                  iconClass="grey-text"
                  id="form-text"
                />
              </div>
              <div class="text-center">
                <mdb-btn color="light-blue">Submit</mdb-btn>
              </div>
            </mdb-card-body>
          </mdb-card>
        </mdb-col>
        <mdb-col lg="7">
          <div
            id="map-container"
            class="rounded z-depth-1-half map-container"
            style="height: 400px"
          >
            <iframe
              src="https://www.google.com/maps/embed?pb=!1m14!1m12!1m3!1d76765.98321148289!2d-73.96694563267306!3d40.751663750099084!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!5e0!3m2!1spl!2spl!4v1525939514494"
              width="100%"
              height="100%"
              frameBorder="0"
              style="border: 0"
            ></iframe>
          </div>
          <br />
          <mdb-row class="text-center">
            <mdb-col md="4">
              <mdb-btn tag="a" floating color="blue" class="accent-1">
                <mdb-icon icon="map-marker" />
              </mdb-btn>
              <p>New York, 94126</p>
              <p class="mb-md-0">United States</p>
            </mdb-col>
            <mdb-col md="4">
              <mdb-btn tag="a" floating color="blue" class="accent-1">
                <mdb-icon icon="phone" />
              </mdb-btn>
              <p>+ 01 234 567 89</p>
              <p class="mb-md-0">Mon - Fri, 8:00-22:00</p>
            </mdb-col>
            <mdb-col md="4">
              <mdb-btn tag="a" floating color="blue" class="accent-1">
                <mdb-icon icon="envelope" />
              </mdb-btn>
              <p>info@gmail.com</p>
              <p class="mb-md-0">sale@gmail.com</p>
            </mdb-col>
          </mdb-row>
        </mdb-col>
      </mdb-row>
    </section>
  </mdb-container>
</template>

<script>
import {
  mdbContainer,
  mdbRow,
  mdbCol,
  mdbCard,
  mdbCardImage,
  mdbCardText,
  mdbSelect,
  mdbBtn,
  mdbDatePicker,
  mdbTooltip,
  mdbSimpleChart,
  mdbIcon,
  mdbBadge,
  mdbView,
  mdbLineChart,
  mdbMask,
  mdbInput,
  mdbTextarea,
  mdbCardBody
} from "mdbvue";

// eslint-disable-next-line
Chart.defaults.global.defaultFontColor = "#fff";

export default {
  name: "Dashboardv1",
  components: {
    mdbContainer,
    mdbRow,
    mdbCol,
    mdbCard,
    mdbCardImage,
    mdbCardText,
    mdbSelect,
    mdbBtn,
    mdbDatePicker,
    mdbTooltip,
    mdbSimpleChart,
    mdbIcon,
    mdbBadge,
    mdbView,
    mdbLineChart,
    mdbMask,
    mdbInput,
    mdbTextarea,
    mdbCardBody
  },
  data() {
    return {
      startTimeFrom: null,
      startTimeTo: null,
      lineChartData: {
        labels: [
          "January",
          "February",
          "March",
          "April",
          "May",
          "June",
          "July"
        ],
        datasets: [
          {
            label: "My First dataset",
            backgroundColor: "rgba(255,255,255,0.4)",
            borderColor: "#fff",
            pointBackgroundColor: "transparent",
            borderWidth: 2,
            pointBorderColor: "#fff",
            pointBorderWidth: 1,
            data: [30, 41, 23, 34, 43, 56, 70]
          }
        ]
      },
      lineChartOptions: {
        responsive: true,
        maintainAspectRatio: false,
        scales: {
          xAxes: [
            {
              gridLines: {
                display: true,
                color: "rgba(255, 255, 255, 0.2)"
              }
            }
          ],
          yAxes: [
            {
              gridLines: {
                display: true,
                color: "rgba(255, 255, 255, 0.2)"
              }
            }
          ]
        }
      }
    };
  }
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped></style>
