<template>
  <mdb-container fluid>
    <!--Section: Analytical panel-->
    <section class="mb-5">
      <!--Card-->
      <mdb-card cascade narrow>
        <!--Section: Chart-->
        <section>
          <!--Grid row-->
          <mdb-row>
            <!--Grid column-->
            <mdb-col xl="5" md="12" class="mr-0">
              <!--Card image-->
              <mdb-view cascade class="gradient-card-header primary-color">
                <h4 class="h4-responsive mb-0 font-weight-bold">Traffic</h4>
              </mdb-view>
              <!--/Card image-->

              <!--Card content-->
              <mdb-card-body cascade class="pb-0">
                <!--Panel data-->
                <mdb-row class="card-body pt-3">
                  <!--First column-->
                  <mdb-col md="12" class="mb-3">
                    <!--Date select-->
                    <h4>
                      <mdb-badge color="primary-color" class="big-badge"
                        >Data range</mdb-badge
                      >
                    </h4>
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
                    <br />

                    <!--Date pickers-->
                    <h4>
                      <mdb-badge color="primary-color" class="big-badge"
                        >Custom date</mdb-badge
                      >
                    </h4>
                    <br />
                    <div class="d-flex justify-content-between">
                      <mdb-date-picker
                        :date="startTimeFrom"
                        :option="optionFrom"
                      ></mdb-date-picker>
                      <mdb-date-picker
                        :date="startTimeTo"
                        :option="optionTo"
                      ></mdb-date-picker>
                    </div>
                  </mdb-col>
                  <!--/First column-->
                </mdb-row>
                <!--/Panel data-->
              </mdb-card-body>
              <!--/.Card content-->
            </mdb-col>
            <!--Grid column-->

            <!--Grid column-->
            <div class="col-xl-7 col-md-12 mb-4">
              <!--Card image-->
              <div class="view view-cascade gradient-card-header primary-color">
                <!-- Chart -->
                <mdb-bar-chart
                  :data="barChartData"
                  :options="barChartOptions"
                  :width="600"
                  :height="300"
                ></mdb-bar-chart>
              </div>
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
    <!--Section: Analytical panel-->

    <!-- Section: data tables -->
    <section class="section">
      <mdb-row>
        <mdb-col md="4">
          <mdb-card class="mb-4">
            <mdb-card-body>
              <h4 class="h4-responsive text-center mb-3">
                Visits by Browser
              </h4>

              <mdb-doughnut-chart
                :data="doughnutChartData"
                :options="doughnutChartOptions"
                :height="200"
              ></mdb-doughnut-chart>
            </mdb-card-body>
          </mdb-card>
          <mdb-card class="mb-4">
            <mdb-card-body>
              <div class="table-responsive">
                <table class="table large-header">
                  <thead>
                    <tr>
                      <th class="font-weight-bold dark-grey-text">
                        <strong>Keywords</strong>
                      </th>
                      <th class="font-weight-bold dark-grey-text">
                        <strong>Visits</strong>
                      </th>
                      <th class="font-weight-bold dark-grey-text">
                        <strong>Pages</strong>
                      </th>
                    </tr>
                  </thead>
                  <tbody>
                    <tr>
                      <td>Material Design</td>
                      <td>15</td>
                      <td>307</td>
                    </tr>
                    <tr>
                      <td>Bootstrap</td>
                      <td>32</td>
                      <td>504</td>
                    </tr>
                    <tr>
                      <td>MDBootstrap</td>
                      <td>41</td>
                      <td>613</td>
                    </tr>
                    <tr>
                      <td>Frontend</td>
                      <td>14</td>
                      <td>208</td>
                    </tr>
                  </tbody>
                </table>
              </div>

              <mdb-btn
                dark-waves
                flat
                rounded
                class="grey lighten-3 float-right font-weight-bold dark-grey-text"
                >View full report</mdb-btn
              >
            </mdb-card-body>
          </mdb-card>
        </mdb-col>

        <div class="col-md-8">
          <div class="card mb-4">
            <div class="card-body">
              <table class="table large-header">
                <thead>
                  <tr>
                    <th class="font-weight-bold dark-grey-text">
                      <strong>Country</strong>
                    </th>
                    <th class="font-weight-bold dark-grey-text">
                      <strong>Visits</strong>
                    </th>
                    <th class="font-weight-bold dark-grey-text">
                      <strong>Pages</strong>
                    </th>
                  </tr>
                </thead>
                <tbody>
                  <tr>
                    <td>
                      <img src="../../assets/flags/us.png" class="flag" />
                      United States
                    </td>
                    <td>15</td>
                    <td>307</td>
                  </tr>
                  <tr>
                    <td>
                      <img src="../../assets/flags/in.png" class="flag" /> India
                    </td>
                    <td>32</td>
                    <td>504</td>
                  </tr>
                  <tr>
                    <td>
                      <img src="../../assets/flags/cn.png" class="flag" /> China
                    </td>
                    <td>41</td>
                    <td>613</td>
                  </tr>
                  <tr>
                    <td>
                      <img src="../../assets/flags/pl.png" class="flag" />
                      Poland
                    </td>
                    <td>14</td>
                    <td>208</td>
                  </tr>
                  <tr>
                    <td>
                      <img src="../../assets/flags/it.png" class="flag" /> Italy
                    </td>
                    <td>24</td>
                    <td>314</td>
                  </tr>
                </tbody>
              </table>

              <mdb-btn
                dark-waves
                flat
                rounded
                class="grey lighten-3 float-right font-weight-bold dark-grey-text"
                >View full report</mdb-btn
              >
            </div>
          </div>

          <div class="card mb-4">
            <div class="card-body">
              <table class="table large-header mb-1">
                <thead>
                  <tr>
                    <th class="font-weight-bold dark-grey-text">
                      <strong>Browser</strong>
                    </th>
                    <th class="font-weight-bold dark-grey-text">
                      <strong>Visits</strong>
                    </th>
                    <th class="font-weight-bold dark-grey-text">
                      <strong>Pages</strong>
                    </th>
                  </tr>
                </thead>
                <tbody>
                  <tr>
                    <td>Google Chrome</td>
                    <td>15</td>
                    <td>307</td>
                  </tr>
                  <tr>
                    <td>Mozilla Firefox</td>
                    <td>32</td>
                    <td>504</td>
                  </tr>
                  <tr>
                    <td>Safari</td>
                    <td>41</td>
                    <td>613</td>
                  </tr>
                  <tr>
                    <td>Opera</td>
                    <td>14</td>
                    <td>208</td>
                  </tr>
                  <tr>
                    <td>Microsoft Edge</td>
                    <td>24</td>
                    <td>314</td>
                  </tr>
                </tbody>
              </table>

              <mdb-btn
                dark-waves
                flat
                rounded
                class="grey lighten-3 float-right font-weight-bold dark-grey-text"
                >View full report</mdb-btn
              >
            </div>
          </div>
        </div>
      </mdb-row>
    </section>
    <!-- /.Section: data tables -->
  </mdb-container>
</template>

<script>
import {
  mdbContainer,
  mdbRow,
  mdbCol,
  mdbCard,
  mdbView,
  mdbCardBody,
  mdbBadge,
  mdbSelect,
  mdbDatePicker,
  mdbBarChart,
  mdbDoughnutChart,
  mdbBtn
} from "mdbvue";

export default {
  name: "Dashboardv2",
  components: {
    mdbContainer,
    mdbRow,
    mdbCol,
    mdbCard,
    mdbView,
    mdbCardBody,
    mdbBadge,
    mdbSelect,
    mdbDatePicker,
    mdbBarChart,
    mdbDoughnutChart,
    mdbBtn
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
        placeholder: "From"
      },
      optionTo: {
        placeholder: "To"
      },
      barChartData: {
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
            label: "# of Votes",
            data: [12, 19, 3, 5, 2, 12, 4],
            backgroundColor: "rgba(255, 255, 255, 0.3)",
            borderColor: "#fff",
            borderWidth: 1
          }
        ]
      },
      barChartOptions: {
        responsive: true,
        maintainAspectRatio: false,
        scales: {
          xAxes: [
            {
              gridLines: {
                display: true,
                color: "rgba(0, 0, 0, 0.1)"
              }
            }
          ],
          yAxes: [
            {
              gridLines: {
                display: true,
                color: "rgba(0, 0, 0, 0.1)"
              },
              ticks: {
                beginAtZero: true,
                min: 0
              }
            }
          ]
        }
      },
      doughnutChartData: {
        labels: ["March", "April", "May", "June"],
        datasets: [
          {
            data: [240, 50, 130, 40],
            backgroundColor: ["#F7464A", "#46BFBD", "#FDB45C", "#949FB1"],
            hoverBackgroundColor: ["#FF5A5E", "#5AD3D1", "#FFC870", "#A8B3C5"]
          }
        ]
      },
      doughnutChartOptions: {
        responsive: true,
        maintainAspectRatio: false,
        legend: {
          labels: {
            fontColor: "black"
          }
        }
      }
    };
  }
};
</script>

<!-- Add 'scoped" attribute to limit CSS to this component only -->
<style scoped></style>
