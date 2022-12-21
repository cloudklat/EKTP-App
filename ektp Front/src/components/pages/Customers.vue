<template>
  <mdb-container fluid>
    <!--Section: Customers-->
    <section class="section team-section">
      <!-- First row -->
      <mdb-row>
        <!-- First column -->
        <mdb-col md="8">
          <mdb-row class="mb-1">
            <mdb-col md="9">
              <h4 class="h4-responsive mt-1">Your Clients</h4>
            </mdb-col>
            <mdb-col col="3">
              <div class="md-form">
                <input
                  placeholder="Search..."
                  type="text"
                  id="form5"
                  class="form-control"
                />
              </div>
            </mdb-col>
          </mdb-row>
          <mdb-row>
            <mdb-col md="12" class="mb-1">
              <div class="classic-tabs">
                <mdb-tab color="primary">
                  <mdb-tab-item
                    :active="basic1 == 1"
                    @click.native.prevent="basic1 = 1"
                    >Personal Clients</mdb-tab-item
                  >
                  <mdb-tab-item
                    :active="basic1 == 2"
                    @click.native.prevent="basic1 = 2"
                    >Corporate Clients</mdb-tab-item
                  >
                </mdb-tab>
                <mdb-tab-content class="mb-5 card">
                  <transition-group name="slide-toggle">
                    <mdb-tab-pane key="show1" v-show="basic1 == 1">
                      <mdb-tbl responsive>
                        <thead>
                          <tr>
                            <th>#</th>
                            <th>First Name</th>
                            <th>Last Name</th>
                            <th>Username</th>
                            <th>Actions</th>
                          </tr>
                        </thead>
                        <tbody>
                          <tr>
                            <th scope="row">1</th>
                            <td>Abby</td>
                            <td>Barrett</td>
                            <td>@abbeme</td>
                            <td>
                              <mdb-tooltip :options="{ placement: 'top' }"
                                ><div class="tooltip">See results</div>
                                <a slot="reference"
                                  ><mdb-icon icon="user" class="blue-text"/></a
                              ></mdb-tooltip>
                              <mdb-tooltip :options="{ placement: 'top' }"
                                ><div class="tooltip">Edit</div>
                                <a slot="reference"
                                  ><mdb-icon
                                    icon="pencil-alt"
                                    class="teal-text"/></a
                              ></mdb-tooltip>
                              <mdb-tooltip :options="{ placement: 'top' }"
                                ><div class="tooltip">Remove</div>
                                <a slot="reference"
                                  ><mdb-icon icon="times" class="red-text"/></a
                              ></mdb-tooltip>
                            </td>
                          </tr>
                          <tr>
                            <th scope="row">2</th>
                            <td>Danny</td>
                            <td>Collins</td>
                            <td>@dennis</td>
                            <td>
                              <mdb-tooltip :options="{ placement: 'top' }"
                                ><div class="tooltip">See results</div>
                                <a slot="reference"
                                  ><mdb-icon icon="user" class="blue-text"/></a
                              ></mdb-tooltip>
                              <mdb-tooltip :options="{ placement: 'top' }"
                                ><div class="tooltip">Edit</div>
                                <a slot="reference"
                                  ><mdb-icon
                                    icon="pencil-alt"
                                    class="teal-text"/></a
                              ></mdb-tooltip>
                              <mdb-tooltip :options="{ placement: 'top' }"
                                ><div class="tooltip">Remove</div>
                                <a slot="reference"
                                  ><mdb-icon icon="times" class="red-text"/></a
                              ></mdb-tooltip>
                            </td>
                          </tr>
                          <tr>
                            <th scope="row">3</th>
                            <td>Clara</td>
                            <td>Ericson</td>
                            <td>@claris</td>
                            <td>
                              <mdb-tooltip :options="{ placement: 'top' }"
                                ><div class="tooltip">See results</div>
                                <a slot="reference"
                                  ><mdb-icon icon="user" class="blue-text"/></a
                              ></mdb-tooltip>
                              <mdb-tooltip :options="{ placement: 'top' }"
                                ><div class="tooltip">Edit</div>
                                <a slot="reference"
                                  ><mdb-icon
                                    icon="pencil-alt"
                                    class="teal-text"/></a
                              ></mdb-tooltip>
                              <mdb-tooltip :options="{ placement: 'top' }"
                                ><div class="tooltip">Remove</div>
                                <a slot="reference"
                                  ><mdb-icon icon="times" class="red-text"/></a
                              ></mdb-tooltip>
                            </td>
                          </tr>
                          <tr>
                            <th scope="row">4</th>
                            <td>Jessie</td>
                            <td>Doe</td>
                            <td>@jessiedoeofficial</td>
                            <td>
                              <mdb-tooltip :options="{ placement: 'top' }"
                                ><div class="tooltip">See results</div>
                                <a slot="reference"
                                  ><mdb-icon icon="user" class="blue-text"/></a
                              ></mdb-tooltip>
                              <mdb-tooltip :options="{ placement: 'top' }"
                                ><div class="tooltip">Edit</div>
                                <a slot="reference"
                                  ><mdb-icon
                                    icon="pencil-alt"
                                    class="teal-text"/></a
                              ></mdb-tooltip>
                              <mdb-tooltip :options="{ placement: 'top' }"
                                ><div class="tooltip">Remove</div>
                                <a slot="reference"
                                  ><mdb-icon icon="times" class="red-text"/></a
                              ></mdb-tooltip>
                            </td>
                          </tr>
                          <tr>
                            <th scope="row">5</th>
                            <td>Saul</td>
                            <td>Hudson</td>
                            <td>@slash</td>
                            <td>
                              <mdb-tooltip :options="{ placement: 'top' }"
                                ><div class="tooltip">See results</div>
                                <a slot="reference"
                                  ><mdb-icon icon="user" class="blue-text"/></a
                              ></mdb-tooltip>
                              <mdb-tooltip :options="{ placement: 'top' }"
                                ><div class="tooltip">Edit</div>
                                <a slot="reference"
                                  ><mdb-icon
                                    icon="pencil-alt"
                                    class="teal-text"/></a
                              ></mdb-tooltip>
                              <mdb-tooltip :options="{ placement: 'top' }"
                                ><div class="tooltip">Remove</div>
                                <a slot="reference"
                                  ><mdb-icon icon="times" class="red-text"/></a
                              ></mdb-tooltip>
                            </td>
                          </tr>
                        </tbody>
                      </mdb-tbl>
                    </mdb-tab-pane>
                    <mdb-tab-pane key="show2" v-show="basic1 == 2">
                      <div class="table-responsive">
                        <table class="table">
                          <thead>
                            <tr>
                              <th>#</th>
                              <th>Company Name</th>
                              <th>Username</th>
                              <th>Actions</th>
                            </tr>
                          </thead>
                          <tbody>
                            <tr>
                              <th scope="row">1</th>
                              <td>PiedPiper</td>
                              <td>@piedpiper</td>
                              <td>
                                <mdb-tooltip :options="{ placement: 'top' }"
                                  ><div class="tooltip">See results</div>
                                  <a slot="reference"
                                    ><mdb-icon
                                      icon="user"
                                      class="blue-text"/></a
                                ></mdb-tooltip>
                                <mdb-tooltip :options="{ placement: 'top' }"
                                  ><div class="tooltip">Edit</div>
                                  <a slot="reference"
                                    ><mdb-icon
                                      icon="pencil-alt"
                                      class="teal-text"/></a
                                ></mdb-tooltip>
                                <mdb-tooltip :options="{ placement: 'top' }"
                                  ><div class="tooltip">Remove</div>
                                  <a slot="reference"
                                    ><mdb-icon
                                      icon="times"
                                      class="red-text"/></a
                                ></mdb-tooltip>
                              </td>
                            </tr>
                            <tr>
                              <th scope="row">2</th>
                              <td>Github, Inc</td>
                              <td>@github</td>
                              <td>
                                <mdb-tooltip :options="{ placement: 'top' }"
                                  ><div class="tooltip">See results</div>
                                  <a slot="reference"
                                    ><mdb-icon
                                      icon="user"
                                      class="blue-text"/></a
                                ></mdb-tooltip>
                                <mdb-tooltip :options="{ placement: 'top' }"
                                  ><div class="tooltip">Edit</div>
                                  <a slot="reference"
                                    ><mdb-icon
                                      icon="pencil-alt"
                                      class="teal-text"/></a
                                ></mdb-tooltip>
                                <mdb-tooltip :options="{ placement: 'top' }"
                                  ><div class="tooltip">Remove</div>
                                  <a slot="reference"
                                    ><mdb-icon
                                      icon="times"
                                      class="red-text"/></a
                                ></mdb-tooltip>
                              </td>
                            </tr>
                            <tr>
                              <th scope="row">3</th>
                              <td>Twitter, Inc</td>
                              <td>@twitter</td>
                              <td>
                                <mdb-tooltip :options="{ placement: 'top' }"
                                  ><div class="tooltip">See results</div>
                                  <a slot="reference"
                                    ><mdb-icon
                                      icon="user"
                                      class="blue-text"/></a
                                ></mdb-tooltip>
                                <mdb-tooltip :options="{ placement: 'top' }"
                                  ><div class="tooltip">Edit</div>
                                  <a slot="reference"
                                    ><mdb-icon
                                      icon="pencil-alt"
                                      class="teal-text"/></a
                                ></mdb-tooltip>
                                <mdb-tooltip :options="{ placement: 'top' }"
                                  ><div class="tooltip">Remove</div>
                                  <a slot="reference"
                                    ><mdb-icon
                                      icon="times"
                                      class="red-text"/></a
                                ></mdb-tooltip>
                              </td>
                            </tr>
                            <tr>
                              <th scope="row">4</th>
                              <td>Alphabet, Inc</td>
                              <td>@alphabet</td>
                              <td>
                                <mdb-tooltip :options="{ placement: 'top' }"
                                  ><div class="tooltip">See results</div>
                                  <a slot="reference"
                                    ><mdb-icon
                                      icon="user"
                                      class="blue-text"/></a
                                ></mdb-tooltip>
                                <mdb-tooltip :options="{ placement: 'top' }"
                                  ><div class="tooltip">Edit</div>
                                  <a slot="reference"
                                    ><mdb-icon
                                      icon="pencil-alt"
                                      class="teal-text"/></a
                                ></mdb-tooltip>
                                <mdb-tooltip :options="{ placement: 'top' }"
                                  ><div class="tooltip">Remove</div>
                                  <a slot="reference"
                                    ><mdb-icon
                                      icon="times"
                                      class="red-text"/></a
                                ></mdb-tooltip>
                              </td>
                            </tr>
                            <tr>
                              <th scope="row">5</th>
                              <td>Adobe Corporation</td>
                              <td>@adobe</td>
                              <td>
                                <mdb-tooltip :options="{ placement: 'top' }"
                                  ><div class="tooltip">See results</div>
                                  <a slot="reference"
                                    ><mdb-icon
                                      icon="user"
                                      class="blue-text"/></a
                                ></mdb-tooltip>
                                <mdb-tooltip :options="{ placement: 'top' }"
                                  ><div class="tooltip">Edit</div>
                                  <a slot="reference"
                                    ><mdb-icon
                                      icon="pencil-alt"
                                      class="teal-text"/></a
                                ></mdb-tooltip>
                                <mdb-tooltip :options="{ placement: 'top' }"
                                  ><div class="tooltip">Remove</div>
                                  <a slot="reference"
                                    ><mdb-icon
                                      icon="times"
                                      class="red-text"/></a
                                ></mdb-tooltip>
                              </td>
                            </tr>
                          </tbody>
                        </table>
                      </div>
                    </mdb-tab-pane>
                  </transition-group>
                </mdb-tab-content>
              </div>
            </mdb-col>
          </mdb-row>
        </mdb-col>
        <!-- /.First column -->
        <!-- Second column -->
        <div class="col-md-4 mb-1">
          <!--Card-->
          <div class="card profile-card">
            <!--Avatar-->
            <div class="avatar z-depth-1-half mb-4">
              <img
                src="https://mdbootstrap.com/img/Photos/Avatars/img%20(10).jpg"
                class="rounded-circle"
                alt="First sample avatar image"
              />
            </div>

            <div class="card-body pt-0 mt-0">
              <!--Name-->
              <div class="text-center">
                <h3 class="mb-3 font-weight-bold">
                  <strong>Anna Deynah</strong>
                </h3>
                <h6 class="font-weight-bold blue-text mb-4">Web Designer</h6>
              </div>

              <ul class="striped list-unstyled">
                <li><strong>E-mail address:</strong> a.doe@example.com</li>

                <li><strong>Phone number:</strong> +1 234 5678 90</li>

                <li><strong>Company:</strong> The Company, Inc</li>

                <li><strong>Twitter username:</strong> @anna.doe</li>

                <li><strong>Instagram username:</strong> @anna.doe</li>
              </ul>
            </div>
          </div>
          <!--Card-->
        </div>
      </mdb-row>
      <!-- /.Second column -->
    </section>
    <!--Section: Customers-->
  </mdb-container>
</template>

<script>
import {
  mdbContainer,
  mdbRow,
  mdbCol,
  mdbTooltip,
  mdbIcon,
  mdbTab,
  mdbTabItem,
  mdbTabContent,
  mdbTabPane,
  mdbTbl
} from "mdbvue";

// eslint-disable-next-line
Chart.defaults.global.defaultFontColor = "#fff";

export default {
  name: "Customers",
  components: {
    mdbContainer,
    mdbRow,
    mdbCol,
    mdbTooltip,
    mdbIcon,
    mdbTab,
    mdbTabItem,
    mdbTabContent,
    mdbTabPane,
    mdbTbl
  },
  data() {
    return {
      basic1: "1"
    };
  }
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
.profile-card {
  margin-top: 100px;
}

.profile-card .avatar {
  max-width: 150px;
  max-height: 150px;
  margin: -70px auto 0;
  -webkit-border-radius: 50%;
  border-radius: 50%;
  overflow: hidden;
}

.slide-toggle-enter-active {
  transition: 0.3s ease-in;
  opacity: 1;
  max-height: 500px;
}
.slide-toggle-enter,
.slide-toggle-leave-active {
  opacity: 0;
  max-height: 0;
}
.slide-toggle-leave {
  opacity: 1;
  max-height: 500px;
}
</style>
