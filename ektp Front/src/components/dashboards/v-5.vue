<template>
  <mdb-container fluid>
    <!--Heading & Date-->
    <mdb-row class="mb-5">
      <!--First column-->
      <mdb-col md="4" class="panel-title mb-5 mt-3">
        <h5>
          <span
            class="px-4 py-3 white-text z-depth-1-half blue lighten-1"
            style="
                border-radius: 5px;"
            >Search analitycs</span
          >
        </h5>
      </mdb-col>
      <!--/First column-->

      <!--Second column-->
      <mdb-col md="8">
        <mdb-card>
          <mdb-card-body class="pb-1">
            <mdb-row>
              <mdb-col lg="4" sm="12">
                <!--Date select-->
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
                <!--/Date select-->
              </mdb-col>
              <mdb-col lg="4" sm="6">
                <mdb-date-picker
                  label="From"
                  v-model="startTimeFrom"
                ></mdb-date-picker>
              </mdb-col>
              <mdb-col lg="4" sm="6">
                <mdb-date-picker
                  label="To"
                  v-model="startTimeTo"
                ></mdb-date-picker>
              </mdb-col>
            </mdb-row>
          </mdb-card-body>
        </mdb-card>
      </mdb-col>
      <!--/Second column-->
    </mdb-row>
    <!--Heading & Date-->

    <!--Section: Main chart-->
    <section>
      <!--Card-->
      <mdb-card cascade narrow>
        <!--Card image-->
        <div class="view view-cascade gradient-card-header blue-gradient">
          <mdb-line-chart
            :data="lineChartData"
            :options="lineChartOptions"
            :height="400"
          ></mdb-line-chart>
        </div>
        <!--/Card image-->

        <!--Card content-->
        <mdb-card-body cascade class="blue-panel text-center">
          <!--Second row-->
          <mdb-row class="mx-3 mb-0 text-center">
            <mdb-col class="mt-1 mb-2">
              <div class="btn-group mt-1">
                <label class="btn btn-info btn-md active">
                  <input
                    type="checkbox"
                    name="options"
                    id="option1"
                    autocomplete="off"
                    checked
                  />Clicks <strong>1000</strong>
                  <i class="fas fa-arrow-up ml-2 white-text"></i>
                  <strong> 25%</strong>
                </label>
              </div>
              <div class="btn-group mt-1">
                <label class="btn btn-info btn-md">
                  <input
                    type="checkbox"
                    name="options"
                    id="option2"
                    autocomplete="off"
                  />Impressions <strong>1000</strong>
                  <i class="fas fa-arrow-up ml-2 white-text"></i>
                  <strong> 25%</strong>
                </label>
              </div>
              <div class="btn-group mt-1">
                <label class="btn red accent-2 btn-md">
                  <input
                    type="checkbox"
                    name="options"
                    id="option2"
                    autocomplete="off"
                  />CTR <strong>5%</strong>
                  <i class="fas fa-arrow-down ml-2 white-text"></i>
                  <strong> 25%</strong>
                </label>
              </div>
              <div class="btn-group mt-1">
                <label class="btn red accent-2 btn-md">
                  <input
                    type="checkbox"
                    name="options"
                    id="option2"
                    autocomplete="off"
                  />Position <strong>4.14</strong>
                  <i class="fas fa-arrow-down ml-2 white-text"></i>
                  <strong> 25%</strong>
                </label>
              </div>
            </mdb-col>
          </mdb-row>
          <!--/Second row-->

          <!--Third row-->
          <mdb-row class="mx-3 mb-5 text-center">
            <!--First column-->
            <mdb-col>
              <mdb-btn-group class="mt-1">
                <label class="btn btn-primary btn-md">
                  <input
                    type="radio"
                    name="options"
                    id="option1"
                    autocomplete="off"
                    checked
                  />Queries
                </label>
              </mdb-btn-group>
              <mdb-btn-group class="mt-1">
                <label class="btn btn-primary btn-md">
                  <input
                    type="radio"
                    name="options"
                    id="option2"
                    autocomplete="off"
                  />Pages
                </label>
              </mdb-btn-group>
              <mdb-btn-group class="mt-1">
                <label class="btn btn-primary btn-md">
                  <input
                    type="radio"
                    name="options"
                    id="option3"
                    autocomplete="off"
                  />Countries
                </label>
              </mdb-btn-group>
              <mdb-btn-group class="mt-1">
                <label class="btn btn-primary btn-md">
                  <input
                    type="radio"
                    name="options"
                    id="option4"
                    autocomplete="off"
                  />Devices
                </label>
              </mdb-btn-group>
              <mdb-btn-group class="mt-1">
                <label class="btn btn-primary btn-md">
                  <input
                    type="radio"
                    name="options"
                    id="option4"
                    autocomplete="off"
                  />Search type
                </label>
              </mdb-btn-group>
            </mdb-col>
            <!--/Second column-->
          </mdb-row>
          <!--/Third row-->

          <!--Third row-->
          <mdb-row class="mb-0">
            <!--First column-->
            <mdb-col md="12">
              <!--Panel content-->
              <div class="card-body pt-0">
                <!--Table-->
                <div class="table-responsive">
                  <table class="table table-hover">
                    <!--Table head-->
                    <thead class="rgba-stylish-strong white-text">
                      <tr>
                        <th>Queries</th>
                        <th>Clicks</th>
                        <th>Impressions</th>
                        <th>CTR</th>
                        <th>Position</th>
                        <th>Day</th>
                        <th>Week</th>
                        <th>Month</th>
                        <th>Local</th>
                        <th>Global</th>
                      </tr>
                    </thead>
                    <!--/Table head-->

                    <!--Table body-->
                    <tbody>
                      <tr class="none-top-border">
                        <td>bootstrap material design</td>
                        <td>1000</td>
                        <td>10000</td>
                        <td>5%</td>
                        <td>3.21</td>
                        <td>
                          2
                          <span class="badge primary-color"
                            >1 <i class="fas fa-arrow-circle-up"></i
                          ></span>
                        </td>
                        <td>
                          2
                          <span class="badge red accent-2"
                            >1 <i class="fas fa-arrow-circle-down"></i
                          ></span>
                        </td>
                        <td>2 <span class="badge grey">0 </span></td>
                        <td>200 (US)</td>
                        <td>2000</td>
                      </tr>
                      <tr>
                        <td>bootstrap material design</td>
                        <td>1000</td>
                        <td>10000</td>
                        <td>5%</td>
                        <td>3.21</td>
                        <td>
                          2
                          <span class="badge primary-color"
                            >1 <i class="fas fa-arrow-circle-up"></i
                          ></span>
                        </td>
                        <td>
                          2
                          <span class="badge red accent-2"
                            >1 <i class="fas fa-arrow-circle-down"></i
                          ></span>
                        </td>
                        <td>2 <span class="badge grey">0 </span></td>
                        <td>200 (US)</td>
                        <td>2000</td>
                      </tr>
                      <tr>
                        <td>bootstrap material design</td>
                        <td>1000</td>
                        <td>10000</td>
                        <td>5%</td>
                        <td>3.21</td>
                        <td>
                          2
                          <span class="badge primary-color"
                            >1 <i class="fas fa-arrow-circle-up"></i
                          ></span>
                        </td>
                        <td>
                          2
                          <span class="badge red accent-2"
                            >1 <i class="fas fa-arrow-circle-down"></i
                          ></span>
                        </td>
                        <td>2 <span class="badge grey">0 </span></td>
                        <td>200 (US)</td>
                        <td>2000</td>
                      </tr>
                    </tbody>
                    <!--/Table body-->
                  </table>
                </div>
                <!--/Table-->

                <!--Bottom Table UI-->
                <div class="d-flex justify-content-between">
                  <!--Name-->
                  <select
                    class="mdb-select colorful-select dropdown-primary mt-2"
                  >
                    <option value="" disabled>Rows number</option>
                    <option value="1" selected>5 rows</option>
                    <option value="2">25 rows</option>
                    <option value="3">50 rows</option>
                    <option value="4">100 rows</option>
                  </select>

                  <!--Pagination -->
                  <nav class="my-4">
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
                      <li class="page-item active">
                        <a class="page-link">1</a>
                      </li>
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
              <!--/.Panel content-->
            </mdb-col>
            <!--/First column-->
          </mdb-row>
          <!--/Third row-->
        </mdb-card-body>
        <!--/.Card content-->
      </mdb-card>
      <!--/.Card-->
    </section>
    <!--/Section: Main chart-->
  </mdb-container>
</template>

<script>
import {
  mdbContainer,
  mdbSelect,
  mdbDatePicker,
  mdbLineChart,
  mdbBtnGroup,
  mdbRow,
  mdbCol,
  mdbCard,
  mdbCardBody
} from "mdbvue";

export default {
  name: "Dashboardv5",
  components: {
    mdbContainer,
    mdbSelect,
    mdbDatePicker,
    mdbLineChart,
    mdbBtnGroup,
    mdbRow,
    mdbCol,
    mdbCard,
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

<!-- Add 'scoped" attribute to limit CSS to this component only -->
<style scoped>
td {
  padding: 0;
}
</style>
