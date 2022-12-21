<template>
  <mdb-container fluid>
    <!--Section: Intro-->
    <section>
      <!--Grid row-->
      <mdb-row>
        <!--Grid column-->
        <mdb-col xl="3" md="6" class="mb-4">
          <!--Card-->
          <mdb-card cascade class="cascading-admin-card">
            <!--Card Data-->
            <div class="admin-up">
              <mdb-icon
                icon="money-bill-alt"
                far
                class="primary-color"
              ></mdb-icon>
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
                <p>ORGANIC T.</p>
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
    <!--Section: Intro-->

    <!--Section: Main panel-->
    <section class="my-5">
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
                      color="info"
                      label="Choose a time period"
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
                      :date="startTimeFrom"
                      :option="optionFrom"
                    ></mdb-date-picker
                    ><br />
                    <mdb-date-picker
                      :date="startTimeTo"
                      :option="optionTo"
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

        <!--Section: Table-->
        <section>
          <!--Top Table UI-->
          <div class="table-ui p-2 mb-3 mx-4 mb-5">
            <!--Grid row-->
            <mdb-row>
              <!--Grid column-->
              <mdb-col xl="3" lg="6" md="12">
                <!--Name-->
                <mdb-select
                  color="info"
                  class="mx-2 my-0"
                  label="Bulk actions"
                  :options="[
                    { value: 1, text: 'Delate' },
                    { value: 2, text: 'Export' },
                    { value: 3, text: 'Change segment' }
                  ]"
                />
              </mdb-col>
              <!--Grid column-->

              <!--Grid column-->
              <mdb-col class="col-xl-3 col-lg-6 col-md-6">
                <!--Blue select-->
                <mdb-select
                  color="info"
                  class="mx-2 my-0"
                  label="Show only"
                  :options="[
                    { value: 1, text: 'All (2000)' },
                    { value: 2, text: 'Never opened (200)' },
                    { value: 3, text: 'Opened but unanswered (1800)' },
                    { value: 4, text: 'Answered (200)' },
                    { value: 5, text: 'Unsunscribed (50)' }
                  ]"
                />
                <!--/Blue select-->
              </mdb-col>
              <!--Grid column-->

              <!--Grid column-->
              <mdb-col xl="3" lg="6" md="12">
                <!--Blue select-->
                <mdb-select
                  color="info"
                  class="mx-2 my-0"
                  label="Filter segments"
                  :options="[
                    { value: 1, text: 'Contacts in no segments (100)' },
                    { value: 2, text: 'Segment 1 (2000)' },
                    { value: 3, text: 'Segment 2 (1000)' },
                    { value: 4, text: 'Segment 3 (4000)' }
                  ]"
                />
                <!--/Blue select-->
              </mdb-col>
              <!--Grid column-->

              <!--Grid column-->
              <mdb-col xl="3" lg="6" md="12">
                <mdb-form-inline class="active-cyan-2 ">
                  <mdb-input
                    type="text"
                    label="Search"
                    aria-label="Search"
                  />
                  <mdb-icon icon="search"/>
                </mdb-form-inline>
              </mdb-col>
              <!--Grid column-->
            </mdb-row>
            <!--Grid row-->
          </div>
          <!--Top Table UI-->

          <div class="card card-cascade narrower z-depth-0">
            <!--Card image-->
            <div
              class="view view-cascade gradient-card-header blue-gradient narrower py-2 mx-4 mb-3 d-flex justify-content-between align-items-center"
            >
              <div class="text-left">
                <mdb-btn outline="white" rounded size="sm" class="px-2"
                  ><mdb-icon icon="th-large" class="mt-0"
                /></mdb-btn>
                <mdb-btn outline="white" rounded size="sm" class="px-2"
                  ><mdb-icon icon="columns" class="mt-0"
                /></mdb-btn>
              </div>

              <a href="" class="white-text mx-3">Table name</a>

              <div class="text-right">
                <mdb-btn outline="white" rounded size="sm" class="px-2"
                  ><mdb-icon icon="pencil-alt" class="mt-0"
                /></mdb-btn>
                <mdb-btn outline="white" rounded size="sm" class="px-2"
                  ><mdb-icon icon="times" class="mt-0"
                /></mdb-btn>
                <mdb-btn outline="white" rounded size="sm" class="px-2"
                  ><mdb-icon icon="info-circle" class="mt-0"
                /></mdb-btn>
              </div>
            </div>
            <!--/Card image-->

            <div class="px-4">
              <div class="table-responsive">
                <!--Table-->
                <table class="table table-hover mb-0">
                  <!--Table head-->
                  <thead>
                    <tr>
                      <th>
                        <input
                          class="form-check-input"
                          type="checkbox"
                          id="checkbox"
                        />
                        <label
                          for="checkbox"
                          class="form-check-label mr-2 label-table"
                        ></label>
                      </th>
                      <th class="th-lg">
                        <a>First Name <mdb-icon icon="sort" class="ml-1"/></a>
                      </th>
                      <th class="th-lg">
                        <a href=""
                          >Last Name<mdb-icon icon="sort" class="ml-1"
                        /></a>
                      </th>
                      <th class="th-lg">
                        <a href=""
                          >Username<mdb-icon icon="sort" class="ml-1"
                        /></a>
                      </th>
                      <th class="th-lg">
                        <a href="">Email<mdb-icon icon="sort" class="ml-1"/></a>
                      </th>
                      <th class="th-lg">
                        <a href=""
                          >Country<mdb-icon icon="sort" class="ml-1"
                        /></a>
                      </th>
                      <th class="th-lg">
                        <a href="">City<mdb-icon icon="sort" class="ml-1"/></a>
                      </th>
                    </tr>
                  </thead>
                  <!--Table head-->

                  <!--Table body-->
                  <tbody>
                    <tr>
                      <th scope="row">
                        <input
                          class="form-check-input"
                          type="checkbox"
                          id="checkbox1"
                        />
                        <label for="checkbox1" class="label-table"></label>
                      </th>
                      <td>Mark</td>
                      <td>Otto</td>
                      <td>@mdo</td>
                      <td>markotto@gmail.com</td>
                      <td>USA</td>
                      <td>San Francisco</td>
                    </tr>
                    <tr>
                      <th scope="row">
                        <input
                          class="form-check-input"
                          type="checkbox"
                          id="checkbox2"
                        />
                        <label for="checkbox2" class="label-table"></label>
                      </th>
                      <td>Jacob</td>
                      <td>Thornton</td>
                      <td>@fat</td>
                      <td>jacobt@gmail.com</td>
                      <td>France</td>
                      <td>Paris</td>
                    </tr>
                    <tr>
                      <th scope="row">
                        <input
                          class="form-check-input"
                          type="checkbox"
                          id="checkbox3"
                        />
                        <label for="checkbox3" class="label-table"></label>
                      </th>
                      <td>Larry</td>
                      <td>the Bird</td>
                      <td>@twitter</td>
                      <td>larrybird@gmail.com</td>
                      <td>Germany</td>
                      <td>Berlin</td>
                    </tr>
                    <tr>
                      <th scope="row">
                        <input
                          class="form-check-input"
                          type="checkbox"
                          id="checkbox4"
                        />
                        <label for="checkbox4" class="label-table"></label>
                      </th>
                      <td>Paul</td>
                      <td>Topolski</td>
                      <td>@P_Topolski</td>
                      <td>ptopolski@gmail.com</td>
                      <td>Poland</td>
                      <td>Warsaw</td>
                    </tr>
                    <tr>
                      <th scope="row">
                        <input
                          class="form-check-input"
                          type="checkbox"
                          id="checkbox5"
                        />
                        <label for="checkbox5" class="label-table"></label>
                      </th>
                      <td>Anna</td>
                      <td>Doe</td>
                      <td>@andy</td>
                      <td>annadoe@gmail.com</td>
                      <td>Spain</td>
                      <td>Madrid</td>
                    </tr>
                  </tbody>
                  <!--Table body-->
                </table>
                <!--Table-->
              </div>

              <hr class="my-0" />

              <!--Bottom Table UI-->
              <div>
                <!--Name-->
                <mdb-select
                  color="primary"
                  class="w-10 float-left mt-2 hidden-md-down"
                  label="Rows number"
                  :options="[
                    { value: 1, text: '5 rows', selected: true },
                    { value: 2, text: '25 rows' },
                    { value: 3, text: '50 rows' },
                    { value: 4, text: '100 rows' }
                  ]"
                />

                <!--Pagination -->
                <nav class="my-4 float-right">
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
              <!--Bottom Table UI-->
            </div>
          </div>
        </section>
        <!--Section: Table-->
      </mdb-card>
      <!--/.Card-->
    </section>
    <!--Section: Main panel-->

    <!--Section: Cascading panels-->
    <section class="mb-3">
      <!--Grid row-->
      <mdb-row>
        <!--Grid column-->
        <mdb-col lg="4" md="12" class="mb-4">
          <!--Panel-->
          <mdb-card>
            <mdb-card-header color="primary-color" class="white-text">
              Things to improve
            </mdb-card-header>
            <!--/.Card-->
            <mdb-card-body class="pt-0 px-1">
              <!--Card content-->
              <mdb-card-body class="text-center">
                <mdb-list-group>
                  <mdb-list-group-item
                    tag="a"
                    :action="true"
                    class="d-flex justify-content-between dark-grey-text"
                    >Cras justo odio
                    <mdb-tooltip
                      trigger="hover"
                      :options="{ placement: 'top' }"
                    >
                      <div class="tooltip">Click to fix</div>
                      <mdb-icon
                        slot="reference"
                        icon="wrench"
                        class="ml-auto"
                      />
                    </mdb-tooltip>
                  </mdb-list-group-item>
                  <mdb-list-group-item
                    tag="a"
                    :action="true"
                    class="d-flex justify-content-between dark-grey-text"
                    >Dapibus ac facilisi
                    <mdb-tooltip
                      trigger="hover"
                      :options="{ placement: 'top' }"
                    >
                      <div class="tooltip">Click to fix</div>
                      <mdb-icon
                        slot="reference"
                        icon="wrench"
                        class="ml-auto"
                      />
                    </mdb-tooltip>
                  </mdb-list-group-item>
                  <mdb-list-group-item
                    tag="a"
                    :action="true"
                    class="d-flex justify-content-between dark-grey-text"
                    >Morbi leo risus
                    <mdb-tooltip
                      trigger="hover"
                      :options="{ placement: 'top' }"
                    >
                      <div class="tooltip">Click to fix</div>
                      <mdb-icon
                        slot="reference"
                        icon="wrench"
                        class="ml-auto"
                      />
                    </mdb-tooltip>
                  </mdb-list-group-item>
                  <mdb-list-group-item
                    tag="a"
                    :action="true"
                    class="d-flex justify-content-between dark-grey-text"
                    >Porta ac consectet
                    <mdb-tooltip
                      trigger="hover"
                      :options="{ placement: 'top' }"
                    >
                      <div class="tooltip">Click to fix</div>
                      <mdb-icon
                        slot="reference"
                        icon="wrench"
                        class="ml-auto"
                      />
                    </mdb-tooltip>
                  </mdb-list-group-item>
                  <mdb-list-group-item
                    tag="a"
                    :action="true"
                    class="d-flex justify-content-between dark-grey-text"
                    >Vestibulum at eros
                    <mdb-tooltip
                      trigger="hover"
                      :options="{ placement: 'top' }"
                    >
                      <div class="tooltip">Click to fix</div>
                      <mdb-icon
                        slot="reference"
                        icon="wrench"
                        class="ml-auto"
                      />
                    </mdb-tooltip>
                  </mdb-list-group-item>
                </mdb-list-group>
              </mdb-card-body>
              <!--/.Card content-->
            </mdb-card-body>
            <!--/.Card-->
          </mdb-card>
          <!--Panel-->
        </mdb-col>
        <!--Grid column-->

        <!--Grid column-->
        <mdb-col lg="4" md="12" class="mb-4">
          <!--Panel-->
          <mdb-card>
            <mdb-card-header color="primary-color" class="white-text">
              Tasks to do
            </mdb-card-header>
            <!--/.Card-->
            <mdb-card-body class="pt-0 px-1">
              <!--Card content-->
              <mdb-card-body class="text-center">
                <mdb-list-group>
                  <mdb-list-group-item
                    tag="a"
                    :action="true"
                    class="d-flex justify-content-between dark-grey-text"
                    >Cras justo odio
                    <mdb-tooltip
                      trigger="hover"
                      :options="{ placement: 'top' }"
                    >
                      <div class="tooltip">Click to fix</div>
                      <mdb-icon
                        slot="reference"
                        icon="wrench"
                        class="ml-auto"
                      />
                    </mdb-tooltip>
                  </mdb-list-group-item>
                  <mdb-list-group-item
                    tag="a"
                    :action="true"
                    class="d-flex justify-content-between dark-grey-text"
                    >Dapibus ac facilisi
                    <mdb-tooltip
                      trigger="hover"
                      :options="{ placement: 'top' }"
                    >
                      <div class="tooltip">Click to fix</div>
                      <mdb-icon
                        slot="reference"
                        icon="wrench"
                        class="ml-auto"
                      />
                    </mdb-tooltip>
                  </mdb-list-group-item>
                  <mdb-list-group-item
                    tag="a"
                    :action="true"
                    class="d-flex justify-content-between dark-grey-text"
                    >Morbi leo risus
                    <mdb-tooltip
                      trigger="hover"
                      :options="{ placement: 'top' }"
                    >
                      <div class="tooltip">Click to fix</div>
                      <mdb-icon
                        slot="reference"
                        icon="wrench"
                        class="ml-auto"
                      />
                    </mdb-tooltip>
                  </mdb-list-group-item>
                  <mdb-list-group-item
                    tag="a"
                    :action="true"
                    class="d-flex justify-content-between dark-grey-text"
                    >Porta ac consectet
                    <mdb-tooltip
                      trigger="hover"
                      :options="{ placement: 'top' }"
                    >
                      <div class="tooltip">Click to fix</div>
                      <mdb-icon
                        slot="reference"
                        icon="wrench"
                        class="ml-auto"
                      />
                    </mdb-tooltip>
                  </mdb-list-group-item>
                  <mdb-list-group-item
                    tag="a"
                    :action="true"
                    class="d-flex justify-content-between dark-grey-text"
                    >Vestibulum at eros
                    <mdb-tooltip
                      trigger="hover"
                      :options="{ placement: 'top' }"
                    >
                      <div class="tooltip">Click to fix</div>
                      <mdb-icon
                        slot="reference"
                        icon="wrench"
                        class="ml-auto"
                      />
                    </mdb-tooltip>
                  </mdb-list-group-item>
                </mdb-list-group>
              </mdb-card-body>
              <!--/.Card content-->
            </mdb-card-body>
            <!--/.Card-->
          </mdb-card>
          <!--Panel-->
        </mdb-col>
        <!--Grid column-->

        <!--Grid column-->
        <mdb-col lg="4" md="12" class="mb-4">
          <!--Panel-->
          <mdb-card class="card">
            <mdb-card-header color="primary-color" class="white-text">
              Statistics
            </mdb-card-header>
            <!--/.Card-->
            <mdb-card-body class="card-body pt-0 px-1">
              <!--Card content-->
              <mdb-card-body class="card-body text-center">
                <mdb-list-group>
                  <mdb-list-group-item
                    tag="a"
                    :action="true"
                    class="d-flex justify-content-between dark-grey-text"
                    >Cras justo odio
                    <mdb-tooltip
                      trigger="hover"
                      :options="{ placement: 'top' }"
                    >
                      <div class="tooltip">Click to fix</div>
                      <mdb-icon
                        slot="reference"
                        icon="wrench"
                        class="ml-auto"
                      />
                    </mdb-tooltip>
                  </mdb-list-group-item>
                  <mdb-list-group-item
                    tag="a"
                    :action="true"
                    class="d-flex justify-content-between dark-grey-text"
                    >Dapibus ac facilisi
                    <mdb-tooltip
                      trigger="hover"
                      :options="{ placement: 'top' }"
                    >
                      <div class="tooltip">Click to fix</div>
                      <mdb-icon
                        slot="reference"
                        icon="wrench"
                        class="ml-auto"
                      />
                    </mdb-tooltip>
                  </mdb-list-group-item>
                  <mdb-list-group-item
                    tag="a"
                    :action="true"
                    class="d-flex justify-content-between dark-grey-text"
                    >Morbi leo risus
                    <mdb-tooltip
                      trigger="hover"
                      :options="{ placement: 'top' }"
                    >
                      <div class="tooltip">Click to fix</div>
                      <mdb-icon
                        slot="reference"
                        icon="wrench"
                        class="ml-auto"
                      />
                    </mdb-tooltip>
                  </mdb-list-group-item>
                  <mdb-list-group-item
                    tag="a"
                    :action="true"
                    class="d-flex justify-content-between dark-grey-text"
                    >Porta ac consectet
                    <mdb-tooltip
                      trigger="hover"
                      :options="{ placement: 'top' }"
                    >
                      <div class="tooltip">Click to fix</div>
                      <mdb-icon
                        slot="reference"
                        icon="wrench"
                        class="ml-auto"
                      />
                    </mdb-tooltip>
                  </mdb-list-group-item>
                  <mdb-list-group-item
                    tag="a"
                    :action="true"
                    class="d-flex justify-content-between dark-grey-text"
                    >Vestibulum at eros
                    <mdb-tooltip
                      trigger="hover"
                      :options="{ placement: 'top' }"
                    >
                      <div class="tooltip">Click to fix</div>
                      <mdb-icon
                        slot="reference"
                        icon="wrench"
                        class="ml-auto"
                      />
                    </mdb-tooltip>
                  </mdb-list-group-item>
                </mdb-list-group>
              </mdb-card-body>
              <!--/.Card content-->
            </mdb-card-body>
            <!--/.Card-->
          </mdb-card>
          <!--Panel-->
        </mdb-col>
        <!--Grid column-->
      </mdb-row>
      <!--Grid row-->
    </section>
    <!--Section: Cascading panels-->

    <!--Section: Classic admin cards-->
    <section>
      <!--Grid row-->
      <mdb-row>
        <!--Grid column-->
        <mdb-col xl="3" md="6" class="mb-4">
          <!--Card Success-->
          <mdb-card color="primary-color" class="classic-admin-card">
            <mdb-card-body>
              <div class="pull-right">
                <mdb-icon class="fa-money-bill-alt" far />
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
                <mdb-icon icon="chart-line" fas />
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
                <mdb-icon fas icon="chart-pie" />
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
                <mdb-icon fas icon="chart-bar" />
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
  </mdb-container>
</template>

<script>
import {
  mdbContainer,
  mdbRow,
  mdbCol,
  mdbCard,
  mdbCardBody,
  mdbCardText,
  mdbSelect,
  mdbBtn,
  mdbDatePicker,
  mdbTooltip,
  mdbSimpleChart,
  mdbInput,
  mdbFormInline,
  mdbIcon,
  mdbBadge,
  mdbView,
  mdbLineChart,
  mdbCardHeader,
  mdbListGroup,
  mdbListGroupItem
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
    mdbCardBody,
    mdbCardText,
    mdbSelect,
    mdbBtn,
    mdbDatePicker,
    mdbTooltip,
    mdbSimpleChart,
    mdbInput,
    mdbFormInline,
    mdbIcon,
    mdbBadge,
    mdbView,
    mdbLineChart,
    mdbCardHeader,
    mdbListGroup,
    mdbListGroupItem
  },
  data() {
    return {
      startTimeFrom: {
        time: ""
      },
      startTimeTo: {
        time: ""
      },
      optionFrom: {
        type: "day",
        placeholder: "From",
        week: ["Mo", "Tu", "We", "Th", "Fr", "Sa", "Su"],
        month: [
          "January",
          "February",
          "March",
          "April",
          "May",
          "June",
          "July",
          "August",
          "September",
          "October",
          "November",
          "December"
        ],
        format: "YYYY-MM-DD",
        inputStyle: {
          display: "inline-block",
          padding: "6px",
          "line-height": "22px",
          "font-size": "16px",
          border: "none",
          "border-bottom": "1px solid #ced4da",
          color: "#5F5F5F",
          width: "100%"
        },
        color: {
          header: "primary",
          headerText: "white",
          checkedDay: "primary"
        },
        buttons: {
          ok: "Ok",
          cancel: "Cancel"
        }
      },
      optionTo: {
        type: "day",
        placeholder: "To",
        week: ["Mo", "Tu", "We", "Th", "Fr", "Sa", "Su"],
        month: [
          "January",
          "February",
          "March",
          "April",
          "May",
          "June",
          "July",
          "August",
          "September",
          "October",
          "November",
          "December"
        ],
        format: "YYYY-MM-DD",
        inputStyle: {
          display: "inline-block",
          padding: "6px",
          "line-height": "22px",
          "font-size": "16px",
          border: "none",
          "border-bottom": "1px solid #ced4da",
          color: "#5F5F5F",
          width: "100%"
        },
        color: {
          header: "primary",
          headerText: "white",
          checkedDay: "primary"
        },
        buttons: {
          ok: "Ok",
          cancel: "Cancel"
        }
      },
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
