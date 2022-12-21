<template>
  <mdb-container fluid>
    <!-- First row -->
    <mdb-row>
      <!-- First column -->
      <mdb-col xl="4" md="6" class="mb-4">
        <!--Card-->
        <mdb-card cascade class="cascading-admin-card">
          <!--Card Data-->
          <div class="admin-up">
            <i class="fas fa-users primary-color"></i>
            <div class="data">
              <p>JUMLAH KARTU KELUARGA</p>
              <h3 class="font-weight-bold dark-grey-text">4 571 $</h3>
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
            <!-- <p class="card-text">Better than last week (25%)</p> -->
          </mdb-card-body>
          <!--/.Card content-->
        </mdb-card>
        <!--/.Card-->
      </mdb-col>

      <!-- Second column -->
      <mdb-col xl="4" md="6" class="mb-4">
        <!--Card-->
        <mdb-card cascade class="cascading-admin-card">
          <!--Card Data-->
          <div class="admin-up">
            <i class="fas fa-chart-line warning-color"></i>
            <div class="data">
              <p>JUMLAH PENDUDUK</p>
              <h3 class="font-weight-bold dark-grey-text">375</h3>
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
            <!-- <p class="card-text">Worse than last week (25%)</p> -->
          </mdb-card-body>
          <!--/.Card content-->
        </mdb-card>
        <!--/.Card-->
      </mdb-col>

      <!-- Third column -->
      <mdb-col xl="4" md="6" class="mb-4">
        <!--Card-->
        <mdb-card cascade class="cascading-admin-card">
          <!--Card Data-->
          <div class="admin-up">
            <i class="fas fa-user-shield light-blue lighten-1"></i>
            <div class="data">
              <p>JUMLAH PENGGUNA</p>
              <h3 class="font-weight-bold dark-grey-text">21 479</h3>
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
            <!-- <p class="card-text">Worse than last week (75%)</p> -->
          </mdb-card-body>
          <!--/.Card content-->
        </mdb-card>
        <!--/.Card-->
      </mdb-col>

      <!-- Fourth column -->
      <mdb-col xl="3" md="6" class="mb-4">
        <!--Card-->
        <mdb-card cascade class="cascading-admin-card">
          <!--Card Data-->
          <!-- <div class="admin-up">
            <i class="fas fa-chart-bar red accent-2"></i>
            <div class="data">
              <p>ORGANIC T.</p>
              <h3 class="font-weight-bold dark-grey-text">4 567</h3>
            </div>
          </div> -->
          <!--/.Card Data-->

          <!--Card content-->
          <!-- <mdb-card-body cascade>
            <div class="progress mb-3">
              <div
                class="progress-bar bg-primary"
                role="progressbar"
                style="width: 25%"
                aria-valuenow="25"
                aria-valuemin="0"
                aria-valuemax="100"
              ></div>
            </div> -->
          <!--Text-->
          <!-- <p class="card-text">Better than last week (25%)</p>
          </mdb-card-body> -->
          <!--/.Card content-->
        </mdb-card>
        <!--/.Card-->
      </mdb-col>
    </mdb-row>
    <!-- /.First row -->

    <!-- /.Second row -->
    <section>
      <mdb-card>
        <mdb-card-body>
          <!--Table-->
          <table class="table table-striped">
            <!--Table head-->
            <thead>
              <tr>
                <th>No</th>
                <th>Nomor KK</th>
                <th>Alamat</th>
                <th>Kota</th>
                <th>Kode Pos</th>
                <th>Action</th>
              </tr>
            </thead>
            <!--Table head-->

            <!--Table body-->
            <tbody>
              <tr>
                <th scope="row">1</th>
                <td>Mark</td>
                <td>Otto</td>
                <td>@mdo</td>
                <td>@mdo</td>
                <td>@mdo</td>
              </tr>
              <tr>
                <th scope="row">2</th>
                <td>Jacob</td>
                <td>Thornton</td>
                <td>@fat</td>
                <td>@fat</td>
                <td>@fat</td>
              </tr>
              <tr>
                <th scope="row">3</th>
                <td>Larry</td>
                <td>the Bird</td>
                <td>@twitter</td>
                <td>@twitter</td>
                <td>@twitter</td>
              </tr>
              <tr>
                <th scope="row">1</th>
                <td>Mark</td>
                <td>Otto</td>
                <td>@mdo</td>
                <td>@mdo</td>
                <td>@mdo</td>
              </tr>
              <tr>
                <th scope="row">2</th>
                <td>Jacob</td>
                <td>Thornton</td>
                <td>@fat</td>
                <td>@fat</td>
                <td>@fat</td>
              </tr>
              <tr>
                <th scope="row">3</th>
                <td>Larry</td>
                <td>the Bird</td>
                <td>@twitter</td>
                <td>@twitter</td>
                <td>@twitter</td>
              </tr>
            </tbody>
            <!--Table body-->
          </table>
          <!--Table-->
        </mdb-card-body>
      </mdb-card>
    </section>
  </mdb-container>
</template>

<script>
import { mdbContainer, mdbRow, mdbCol, mdbCard, mdbCardBody } from "mdbvue";

export default {
  name: "Dashboardv3",
  components: {
    mdbContainer,
    mdbRow,
    mdbCol,
    mdbCard,
    mdbCardBody,
  },
  data() {
    return {};
  },
};
</script>

<!-- Add 'scoped" attribute to limit CSS to this component only -->
<style scoped></style>
