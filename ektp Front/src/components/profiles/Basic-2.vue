<template>
  <mdb-container fluid>
    <!-- Section: Edit Account -->
    <section class="section">
      <!-- First row -->
      <div class="row">
        <!-- First column -->
        <div class="col-lg-12 mb-8">
          <!--Card-->

          <!--/.Card-->
        </div>
        <!-- /.First column -->
        <!-- Second column -->
        <div class="col-lg-12 mb-8">
          <!--Card-->
          <div class="card card-cascade narrower">
            <!--Card image-->
            <div
              class="view view-cascade gradient-card-header mdb-color lighten-3"
            >
              <h5 class="mb-0 font-weight-bold">Tambah kartu Keluarga</h5>
            </div>
            <!--/Card image-->

            <!-- Card content -->
            <div class="card-body card-body-cascade text-center">
              <!-- Edit Form -->
              <form>
                <!--First row-->
                <div class="row">
                  <!--First column-->
                  <div class="col-md-6">
                    <mdb-input
                      label="Nomor Kartu Keluarga"
                      placeholder="Input No. KK"
                    />
                  </div>
                  <!--Second column-->
                  <div class="col-md-6">
                    <mdb-input label="Desa / Kelurahan" />
                  </div>
                </div>
                <!--/.First row-->

                <!--Third row-->
                <div class="row">
                  <!--First column-->
                  <div class="col-md-6">
                    <mdb-textarea label="Alamat" :rows="3" />
                  </div>
                  <!--Second column-->
                  <div class="col-md-6">
                    <mdb-input label="Kecamatan" />
                    <mdb-input label="Kabupaten / Kota" />
                  </div>
                </div>

                <!--/.Third row-->

                <!--First row-->
                <div class="row">
                  <!--First column-->
                  <div class="col-md-6">
                    <mdb-input label="RT" />
                  </div>
                  <!--Second column-->
                  <div class="col-md-6">
                    <mdb-input label="Provinsi" />
                  </div>
                </div>
                <!--/.First row-->
                <!--Second row-->
                <div class="row">
                  <!--First column-->
                  <div class="col-md-6">
                    <mdb-input label="RW" />
                  </div>
                  <!--Second column-->
                  <div class="col-md-6">
                    <mdb-input label="Kode Pos" />
                  </div>
                </div>
                <!--/.Second row-->

                <!-- Fourth row -->
                <div class="row">
                  <div class="col-md-12 text-center my-4">
                    <input
                      type="submit"
                      value="Tambah"
                      class="btn btn-info btn-rounded"
                    />
                  </div>
                </div>
                <!-- /.Fourth row -->
              </form>
              <!-- Edit Form -->
            </div>
            <!-- /.Card content -->
          </div>
          <!--/.Card-->
        </div>
        <!-- /.Second column -->
      </div>
      <!-- /.First row -->
    </section>
    <!-- /.Section: Edit Account -->
  </mdb-container>
</template>

<script>
import { mdbContainer, mdbInput, mdbTextarea } from "mdbvue";

export default {
  name: "Basicv2",
  components: {
    mdbContainer,

    mdbInput,
    mdbTextarea,
  },
  data() {
    return {};
  },
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
.card.card-cascade .view.gradient-card-header {
  padding: 1.1rem 1rem;
}

.card.card-cascade .view {
  box-shadow: 0 5px 12px 0 rgba(0, 0, 0, 0.2), 0 2px 8px 0 rgba(0, 0, 0, 0.19);
}
</style>
