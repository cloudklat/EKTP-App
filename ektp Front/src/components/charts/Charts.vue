<template>
  <mdb-container fluid>
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
              <div class="view view-cascade gradient-card-header blue-gradient">
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
                    label="To"
                      v-model="startTimeTo"
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
                      color="green"
                      >{{ 76 }}%</mdb-simple-chart
                    >
                    <h5 class="d-inline">
                      <mdb-badge color="green" class="p-2"
                        >Change <mdb-icon icon="arrow-circle-up" class="ml-1"
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
              <mdb-view cascade class="indigo gradient-card-header">
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
    </section>

    <section>
      <mdb-row>
        <mdb-col md="6" lg="4" class="mb-4">
          <mdb-card cascade narrow>
            <mdb-view cascade class="gradient-card-header blue"
              ><h5 class="mb-0">Line Chart</h5></mdb-view
            >
            <mdb-card-body>
              <mdb-line-chart
                :data="lineChartData2"
                :options="lineChartOptions2"
                :height="300"
              ></mdb-line-chart>
            </mdb-card-body>
          </mdb-card>
        </mdb-col>
        <mdb-col md="6" lg="4" class="mb-4">
          <mdb-card cascade narrow>
            <mdb-view cascade class="gradient-card-header blue"
              ><h5 class="mb-0">Radar Chart</h5></mdb-view
            >
            <mdb-card-body>
              <mdb-radar-chart
                :data="radarChartData"
                :options="radarChartOptions"
                :height="300"
              ></mdb-radar-chart>
            </mdb-card-body>
          </mdb-card>
        </mdb-col>
        <mdb-col md="6" lg="4" class="mb-4">
          <mdb-card cascade narrow>
            <mdb-view cascade class="gradient-card-header blue"
              ><h5 class="mb-0">Bar Chart</h5></mdb-view
            >
            <mdb-card-body>
              <mdb-bar-chart
                :data="barChartData"
                :options="barChartOptions"
                :height="300"
              ></mdb-bar-chart>
            </mdb-card-body>
          </mdb-card>
        </mdb-col>

        <mdb-col md="6" lg="4" class="mb-4">
          <mdb-card cascade narrow>
            <mdb-view cascade class="gradient-card-header blue"
              ><h5 class="mb-0">Bubble Chart</h5></mdb-view
            >
            <mdb-card-body>
              <mdb-bubble-chart
                :data="bubbleChartData"
                :options="bubbleChartOptions"
                :height="300"
              ></mdb-bubble-chart>
            </mdb-card-body>
          </mdb-card>
        </mdb-col>
        <mdb-col md="6" lg="4" class="mb-4">
          <mdb-card cascade narrow>
            <mdb-view cascade class="gradient-card-header blue"
              ><h5 class="mb-0">Scatter Chart</h5></mdb-view
            >
            <mdb-card-body>
              <mdb-scatter-chart
                :data="scatterChartData"
                :options="scatterChartOptions"
                :height="300"
              ></mdb-scatter-chart>
            </mdb-card-body>
          </mdb-card>
        </mdb-col>
        <mdb-col md="6" lg="4" class="mb-4">
          <mdb-card cascade narrow>
            <mdb-view cascade class="gradient-card-header blue"
              ><h5 class="mb-0">Horizontal Bar Chart</h5></mdb-view
            >
            <mdb-card-body>
              <mdb-horizontal-bar-chart
                :data="horizontalBarChartData"
                :options="horizontalBarChartOptions"
                :height="300"
              ></mdb-horizontal-bar-chart>
            </mdb-card-body>
          </mdb-card>
        </mdb-col>

        <mdb-col md="6" lg="4" class="mb-4">
          <mdb-card cascade narrow>
            <mdb-view cascade class="gradient-card-header blue"
              ><h5 class="mb-0">Polar Chart</h5></mdb-view
            >
            <mdb-card-body>
              <mdb-polar-chart
                :data="polarChartData"
                :options="polarChartOptions"
                :height="300"
              ></mdb-polar-chart>
            </mdb-card-body>
          </mdb-card>
        </mdb-col>
        <mdb-col md="6" lg="4" class="mb-4">
          <mdb-card cascade narrow>
            <mdb-view cascade class="gradient-card-header blue"
              ><h5 class="mb-0">Pie Chart</h5></mdb-view
            >
            <mdb-card-body>
              <mdb-pie-chart
                :data="pieChartData"
                :options="pieChartOptions"
                :height="300"
              ></mdb-pie-chart>
            </mdb-card-body>
          </mdb-card>
        </mdb-col>
        <mdb-col md="6" lg="4" class="mb-4">
          <mdb-card cascade narrow>
            <mdb-view cascade class="gradient-card-header blue"
              ><h5 class="mb-0">Doughnut Chart</h5></mdb-view
            >
            <mdb-card-body>
              <mdb-doughnut-chart
                :data="pieChartData"
                :options="pieChartOptions"
                :height="300"
              ></mdb-doughnut-chart>
            </mdb-card-body>
          </mdb-card>
        </mdb-col>
        <mdb-col md="6" lg="4" class="mb-4">
          <mdb-card cascade narrow>
            <mdb-view cascade class="gradient-card-header blue"
              ><h5 class="mb-0">Minimalist Chart</h5></mdb-view
            >
            <mdb-card-body class="text-center">
              <mdb-simple-chart
                style="width: auto; height: auto"
                :value="56"
                color="#4CAF50"
              >
                56%
              </mdb-simple-chart>
            </mdb-card-body>
          </mdb-card>
        </mdb-col>
        <mdb-col md="6" lg="4" class="mb-4">
          <mdb-card cascade narrow>
            <mdb-view cascade class="gradient-card-header blue"
              ><h5 class="mb-0">Minimalist Chart</h5></mdb-view
            >
            <mdb-card-body class="text-center">
              <mdb-simple-chart
                style="width: auto; height: auto"
                :value="76"
                color="red"
              >
                76%
              </mdb-simple-chart>
            </mdb-card-body>
          </mdb-card>
        </mdb-col>
        <mdb-col md="6" lg="4" class="mb-4">
          <mdb-card cascade narrow>
            <mdb-view cascade class="gradient-card-header blue"
              ><h5 class="mb-0">Minimalist Chart</h5></mdb-view
            >
            <mdb-card-body class="text-center">
              <mdb-simple-chart
                style="width: auto; height: auto"
                :value="100"
                color="grey"
              >
                100%
              </mdb-simple-chart>
            </mdb-card-body>
          </mdb-card>
        </mdb-col>
      </mdb-row>
    </section>

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
            href="https://mdbootstrap.com/docs/vue/advanced/charts/"
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
  mdbCard,
  mdbCardBody,
  mdbSelect,
  mdbBtn,
  mdbDatePicker,
  mdbTooltip,
  mdbSimpleChart,
  mdbIcon,
  mdbBadge,
  mdbView,
  mdbLineChart,
  mdbRadarChart,
  mdbBarChart,
  mdbPolarChart,
  mdbPieChart,
  mdbScatterChart,
  mdbDoughnutChart,
  mdbBubbleChart,
  mdbHorizontalBarChart
} from "mdbvue";

export default {
  name: "Charts",
  components: {
    mdbContainer,
    mdbRow,
    mdbCol,
    mdbCard,
    mdbCardBody,
    mdbSelect,
    mdbBtn,
    mdbDatePicker,
    mdbTooltip,
    mdbSimpleChart,
    mdbIcon,
    mdbBadge,
    mdbView,
    mdbLineChart,
    mdbRadarChart,
    mdbBarChart,
    mdbPolarChart,
    mdbPieChart,
    mdbDoughnutChart,
    mdbBubbleChart,
    mdbScatterChart,
    mdbHorizontalBarChart
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
            backgroundColor: "rgba(255, 99, 132, 0.1)",
            borderColor: "rgba(255, 99, 132, 1)",
            borderWidth: 0.7,
            data: [65, 59, 80, 81, 56, 55, 40]
          },
          {
            label: "My Second dataset",
            backgroundColor: "rgba(151,187,205,0.2)",
            borderColor: "rgba(151,187,205,1)",
            borderWidth: 0.8,
            data: [28, 48, 40, 19, 86, 27, 90]
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
      },
      lineChartData2: {
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
            backgroundColor: "rgba(255, 99, 132, 0.1)",
            borderColor: "rgba(255, 99, 132, 1)",
            borderWidth: 0.7,
            data: [65, 59, 80, 81, 56, 55, 40]
          },
          {
            label: "My Second dataset",
            backgroundColor: "rgba(151,187,205,0.2)",
            borderColor: "rgba(151,187,205,1)",
            borderWidth: 0.8,
            data: [28, 48, 40, 19, 86, 27, 90]
          }
        ]
      },
      lineChartOptions2: {
        responsive: true,
        maintainAspectRatio: false,
        scales: {
          xAxes: [
            {
              gridLines: {
                display: true,
                color: "rgba(0, 0, 0, 0.1)"
              },
              ticks: {
                fontColor: "black"
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
                fontColor: "black"
              }
            }
          ]
        },
        legend: {
          labels: {
            fontColor: "black"
          }
        }
      },
      radarChartData: {
        labels: [
          "Eating",
          "Drinking",
          "Sleeping",
          "Designing",
          "Coding",
          "Cycling",
          "Running"
        ],
        datasets: [
          {
            label: "My First dataset",
            backgroundColor: "rgba(255, 99, 132, 0.1)",
            borderColor: "rgba(255, 99, 132, 1)",
            borderWidth: 0.7,
            data: [65, 59, 90, 81, 56, 55, 40]
          },
          {
            label: "My Second dataset",
            backgroundColor: "rgba(75, 192, 192, 0.2)",
            borderColor: "rgba(75, 192, 192, 1)",
            borderWidth: 0.7,
            data: [28, 48, 40, 19, 96, 27, 100]
          }
        ]
      },
      radarChartOptions: {
        responsive: true,
        maintainAspectRatio: false,
        legend: {
          labels: {
            fontColor: "black"
          }
        }
      },
      barChartData: {
        labels: ["Red", "Blue", "Yellow", "Green", "Purple", "Orange"],
        datasets: [
          {
            label: "# of Votes",
            data: [12, 19, 3, 5, 2, 3],
            backgroundColor: [
              "rgba(255, 99, 132, 0.2)",
              "rgba(54, 162, 235, 0.2)",
              "rgba(255, 206, 86, 0.2)",
              "rgba(75, 192, 192, 0.2)",
              "rgba(153, 102, 255, 0.2)",
              "rgba(255, 159, 64, 0.2)"
            ],
            borderColor: [
              "rgba(255,99,132,1)",
              "rgba(54, 162, 235, 1)",
              "rgba(255, 206, 86, 1)",
              "rgba(75, 192, 192, 1)",
              "rgba(153, 102, 255, 1)",
              "rgba(255, 159, 64, 1)"
            ],
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
              },
              ticks: {
                fontColor: "black"
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
                fontColor: "black"
              }
            }
          ]
        },
        legend: {
          labels: {
            fontColor: "black"
          }
        }
      },
      scatterChartData: {
        datasets: [
          {
            label: "V(node2)",
            backgroundColor: "rgba(255, 99, 132, 0.1)",
            borderColor: "rgba(255, 99, 132, 1)",
            borderWidth: 0.7,
            data: [
              {
                x: 1,
                y: -1.711e-2
              },
              {
                x: 1.26,
                y: -2.708e-2
              },
              {
                x: 1.58,
                y: -4.285e-2
              },
              {
                x: 2.0,
                y: -6.772e-2
              },
              {
                x: 2.51,
                y: -1.068e-1
              },
              {
                x: 3.16,
                y: -1.681e-1
              },
              {
                x: 3.98,
                y: -2.635e-1
              },
              {
                x: 5.01,
                y: -4.106e-1
              },
              {
                x: 6.31,
                y: -6.339e-1
              },
              {
                x: 7.94,
                y: -9.659e-1
              },
              {
                x: 10.0,
                y: -1.445
              },
              {
                x: 12.6,
                y: -2.11
              },
              {
                x: 15.8,
                y: -2.992
              },
              {
                x: 20.0,
                y: -4.102
              },
              {
                x: 25.1,
                y: -5.429
              },
              {
                x: 31.6,
                y: -6.944
              },
              {
                x: 39.8,
                y: -8.607
              },
              {
                x: 50.1,
                y: -1.038e1
              },
              {
                x: 63.1,
                y: -1.223e1
              },
              {
                x: 79.4,
                y: -1.413e1
              },
              {
                x: 100.0,
                y: -1.607e1
              },
              {
                x: 126,
                y: -1.803e1
              },
              {
                x: 158,
                y: -2e1
              },
              {
                x: 200,
                y: -2.199e1
              },
              {
                x: 251,
                y: -2.398e1
              },
              {
                x: 316,
                y: -2.597e1
              },
              {
                x: 398,
                y: -2.797e1
              },
              {
                x: 501,
                y: -2.996e1
              },
              {
                x: 631,
                y: -3.196e1
              },
              {
                x: 794,
                y: -3.396e1
              },
              {
                x: 1000,
                y: -3.596e1
              }
            ]
          }
        ]
      },
      scatterChartOptions: {
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
              }
            }
          ]
        }
      },
      bubbleChartData: {
        datasets: [
          {
            label: "My First dataset",
            backgroundColor: "rgba(255, 99, 132, 0.1)",
            borderColor: "rgba(255, 99, 132, 1)",
            borderWidth: 0.7,
            data: [
              {
                x: 5,
                y: 7,
                r: 7
              }
            ]
          },
          {
            label: "My Second dataset",
            backgroundColor: "rgba(151,187,205,0.2)",
            borderColor: "rgba(151,187,205,1)",
            borderWidth: 0.8,
            data: [
              {
                x: 15,
                y: 2,
                r: 6
              }
            ]
          },
          {
            label: "My Thrid dataset",
            backgroundColor: "rgba(255, 206, 86, 0.2)",
            borderColor: "rgba(255, 206, 86, 1)",
            borderWidth: 0.8,
            data: [
              {
                x: 10,
                y: 4,
                r: 14
              }
            ]
          }
        ]
      },
      bubbleChartOptions: {
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
              }
            }
          ]
        }
      },
      horizontalBarChartData: {
        labels: ["Red", "Blue", "Yellow", "Green", "Purple", "Orange"],
        datasets: [
          {
            label: "# of Votes",
            data: [12, 19, 3, 5, 2, 3],
            backgroundColor: [
              "rgba(255, 99, 132, 0.2)",
              "rgba(54, 162, 235, 0.2)",
              "rgba(255, 206, 86, 0.2)",
              "rgba(75, 192, 192, 0.2)",
              "rgba(153, 102, 255, 0.2)",
              "rgba(255, 159, 64, 0.2)"
            ],
            borderColor: [
              "rgba(255,99,132,1)",
              "rgba(54, 162, 235, 1)",
              "rgba(255, 206, 86, 1)",
              "rgba(75, 192, 192, 1)",
              "rgba(153, 102, 255, 1)",
              "rgba(255, 159, 64, 1)"
            ],
            borderWidth: 1
          }
        ]
      },
      horizontalBarChartOptions: {
        responsive: true,
        maintainAspectRatio: false,
        scales: {
          xAxes: [
            {
              barPercentage: 1,
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
              }
            }
          ]
        }
      },
      polarChartData: {
        labels: ["Red", "Green", "Yellow", "Grey", "Dark Grey"],
        datasets: [
          {
            data: [300, 50, 100, 40, 120],
            backgroundColor: [
              "rgba(247, 70, 74, 0.3)",
              "rgba(70, 191, 189, 0.3)",
              "rgba(253, 180, 92, 0.3)",
              "rgba(148, 159, 177, 0.3)",
              "rgba(77, 83, 96, 0.3)"
            ],
            hoverBackgroundColor: [
              "rgba(247, 70, 74, 0.4)",
              "rgba(70, 191, 189, 0.4)",
              "rgba(253, 180, 92, 0.4)",
              "rgba(148, 159, 177, 0.4)",
              "rgba(77, 83, 96, 0.4)"
            ]
          }
        ]
      },
      polarChartOptions: {
        responsive: true,
        maintainAspectRatio: false,
        legend: {
          labels: {
            fontColor: "black"
          }
        }
      },
      pieChartData: {
        labels: ["Red", "Green", "Yellow", "Grey", "Dark Grey"],
        datasets: [
          {
            data: [300, 50, 100, 40, 120],
            backgroundColor: [
              "#F7464A",
              "#46BFBD",
              "#FDB45C",
              "#949FB1",
              "#4D5360"
            ],
            hoverBackgroundColor: [
              "#FF5A5E",
              "#5AD3D1",
              "#FFC870",
              "#A8B3C5",
              "#616774"
            ]
          }
        ]
      },
      pieChartOptions: {
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

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped></style>
