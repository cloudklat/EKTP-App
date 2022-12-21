<template>
  <mdb-container fluid>
    <h2 class="mt-lg-5 mb-5 font-weight-bold"><strong>List group</strong></h2>
    <!--Section: Basic examples-->
    <section class="mb-5 pb-5">
      <h5 class="my-5 dark-grey-text font-weight-bold">Basic examples</h5>
      <!--Grid row-->
      <mdb-row>
        <!--Grid column-->
        <mdb-col>
          <mdb-list-group>
            <mdb-list-group-item>Cras justo odio</mdb-list-group-item>
            <mdb-list-group-item>Dapibus ac facilisis in</mdb-list-group-item>
            <mdb-list-group-item>Morbi leo risus</mdb-list-group-item>
            <mdb-list-group-item>Porta ac consectetur ac</mdb-list-group-item>
            <mdb-list-group-item>Vestibulum at eros</mdb-list-group-item>
          </mdb-list-group>
        </mdb-col>
        <!--Grid column-->
        <!--Grid column-->
        <mdb-col>
          <mdb-list-group>
            <mdb-list-group-item>Cras justo odio
              <mdb-badge color="primary-color" pill>14</mdb-badge>
            </mdb-list-group-item>
            <mdb-list-group-item>Dapibus ac facilisis in
              <mdb-badge color="primary-color" pill>2</mdb-badge>
            </mdb-list-group-item>
            <mdb-list-group-item>Morbi leo risus
              <mdb-badge color="primary-color" pill>1</mdb-badge>
            </mdb-list-group-item>
          </mdb-list-group>
        </mdb-col>
        <!--Grid column-->
      </mdb-row>
      <!--Grid row-->
    </section>
    <!--Section: Basic examples-->

    <!--Section: Linked items-->
    <section class="mb-5 pb-5">
      <h5 class="my-5 dark-grey-text font-weight-bold">Linked items</h5>
      <!--Grid row-->
      <mdb-row>
        <!--Grid column-->
        <mdb-col>
          <mdb-list-group>
            <mdb-list-group-item :active="true">Cras justo odio</mdb-list-group-item>
            <mdb-list-group-item>Dapibus ac facilisis in</mdb-list-group-item>
            <mdb-list-group-item>Morbi leo risus</mdb-list-group-item>
            <mdb-list-group-item>Porta ac consectetur ac</mdb-list-group-item>
            <mdb-list-group-item>Vestibulum at eros</mdb-list-group-item>
          </mdb-list-group>
        </mdb-col>
        <!--Grid column-->

        <!--Grid column-->
        <mdb-col>
          <mdb-list-group>
            <mdb-list-group-item :action="true" :active="true">Cras justo odio</mdb-list-group-item>
            <mdb-list-group-item :action="true">Dapibus ac facilisis in</mdb-list-group-item>
            <mdb-list-group-item :action="true">Morbi leo risus</mdb-list-group-item>
            <mdb-list-group-item :action="true">Porta ac consectetur ac</mdb-list-group-item>
            <mdb-list-group-item :action="true">Vestibulum at eros</mdb-list-group-item>
          </mdb-list-group>
        </mdb-col>
        <!--Grid column-->

        <!--Grid column-->
        <mdb-col>
          <mdb-list-group>
            <mdb-list-group-item disabled>Cras justo odio</mdb-list-group-item>
            <mdb-list-group-item>Dapibus ac facilisis in</mdb-list-group-item>
            <mdb-list-group-item>Morbi leo risus</mdb-list-group-item>
            <mdb-list-group-item>Porta ac consectetur ac</mdb-list-group-item>
            <mdb-list-group-item>Vestibulum at eros</mdb-list-group-item>
          </mdb-list-group>
        </mdb-col>
        <!--Grid column-->
      </mdb-row>
      <!--Grid row-->
    </section>
    <!--Section: Linked items-->

    <!--Section: Reviews-->
    <section class="mb-5 pb-5">
      <h5 class="my-5 dark-grey-text font-weight-bold">Reviews</h5>
      <!--First review-->
      <mdb-media>
        <mdb-media-image src="https://mdbootstrap.com/img/Photos/Avatars/avatar-13.jpg" alt="Generic placeholder image"/>
        <mdb-media-body>
          <h4 class="font-weight-bold">John Doe</h4>
          <ul class="rating">
            <li><i class="fas fa-star amber-text"></i></li>
            <li><i class="fas fa-star amber-text"></i></li>
            <li><i class="fas fa-star amber-text"></i></li>
            <li><i class="fas fa-star grey-text"></i></li>
            <li><i class="fas fa-star grey-text"></i></li>
          </ul>
          <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Nisi cupiditate temporibus iure soluta. Quasi mollitia maxime nemo quam accusamus possimus, voluptatum expedita assumenda. Earum sit id ullam eum vel delectus!</p>
        </mdb-media-body>
      </mdb-media>

      <!--Second review-->
      <mdb-media>
        <mdb-media-image src="https://mdbootstrap.com/img/Photos/Avatars/avatar-10.jpg" alt="Generic placeholder image"/>
        <mdb-media-body>
          <h4 class="font-weight-bold">Anna Casie</h4>
          <ul class="rating">
            <li><i class="fas fa-star amber-text"></i></li>
            <li><i class="fas fa-star amber-text"></i></li>
            <li><i class="fas fa-star amber-text"></i></li>
            <li><i class="fas fa-star amber-text"></i></li>
            <li><i class="fas fa-star amber-text"></i></li>
          </ul>
          <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Nisi cupiditate temporibus iure soluta. Quasi mollitia maxime nemo quam accusamus possimus, voluptatum expedita assumenda. Earum sit id ullam eum vel delectus!</p>
        </mdb-media-body>
      </mdb-media>
      <!--Second review-->
      <mdb-media>
        <mdb-media-image class="rounded-circle" src="https://mdbootstrap.com/img/Photos/Avatars/avatar-16.jpg" alt="Generic placeholder image"/>
        <mdb-media-body>
          <h4 class="font-weight-bold">Maria Kate</h4>
          <ul class="rating">
            <li><i class="fas fa-star amber-text"></i></li>
            <li><i class="fas fa-star amber-text"></i></li>
            <li><i class="fas fa-star amber-text"></i></li>
            <li><i class="fas fa-star amber-text"></i></li>
            <li><i class="fas fa-star grey-text"></i></li>
          </ul>
          <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Nisi cupiditate temporibus iure soluta. Quasi mollitia maxime nemo quam accusamus possimus, voluptatum expedita assumenda. Earum sit id ullam eum vel delectus!</p>
        </mdb-media-body>
      </mdb-media>
    </section>
    <!--Section: Reviews-->

    <!--Section: Linked items-->
    <section class="mb-5 pb-5">
      <h5 class="my-5 dark-grey-text font-weight-bold">Custom content</h5>
      <mdb-list-group>
        <mdb-list-group-item active action class="flex-column">
          <div class="d-flex w-100 justify-content-between">
            <h5 class="font-weight-bold mb-3 mt-2">List group item heading</h5>
            <small>3 days ago</small>
          </div>
          <p class="mb-1">Donec id elit non mi porta gravida at eget metus. Maecenas sed diam eget risus varius blandit.</p>
          <small>Donec id elit non mi porta.</small>
        </mdb-list-group-item>
        <mdb-list-group-item action class="flex-column">
          <div class="d-flex w-100 justify-content-between">
            <h5 class="font-weight-bold mb-3 mt-2">List group item heading</h5>
            <small class="text-muted">3 days ago</small>
          </div>
          <p class="mb-1">Donec id elit non mi porta gravida at eget metus. Maecenas sed diam eget risus varius blandit.</p>
          <small class="text-muted">Donec id elit non mi porta.</small>
        </mdb-list-group-item>
        <mdb-list-group-item action class="flex-column">
          <div class="d-flex w-100 justify-content-between">
            <h5 class="font-weight-bold mb-3 mt-2">List group item heading</h5>
            <small class="text-muted">3 days ago</small>
          </div>
          <p class="mb-1">Donec id elit non mi porta gravida at eget metus. Maecenas sed diam eget risus varius blandit.</p>
          <small class="text-muted">Donec id elit non mi porta.</small>
        </mdb-list-group-item>
      </mdb-list-group>
    </section>
    <!--Section: Linked items-->

    <!--Section: Docs link-->
    <section class="pb-4">
      <!--Panel-->
      <mdb-card>
        <mdb-card-header class="primary-color text-center white-text">Full documentation</mdb-card-header>
        <mdb-card-body class="text-center">
          <p>Read the full documentation for these components.</p>
          <a href="https://mdbootstrap.com/docs/vue/components/list-group/" target="_blank" class="btn btn-primary">Learn more</a>
        </mdb-card-body>
      </mdb-card>
      <!--/.Panel-->
    </section>
    <!--Section: Docs link-->
  </mdb-container>
</template>

<script>
import { mdbContainer, mdbRow, mdbCol, mdbListGroup, mdbListGroupItem, mdbBadge, mdbMedia, mdbMediaBody, mdbMediaImage, mdbCard, mdbCardHeader, mdbCardBody } from 'mdbvue'

export default {
  name: 'List',
  components: {
    mdbContainer,
    mdbRow,
    mdbCol,
    mdbListGroup,
    mdbListGroupItem,
    mdbBadge,
    mdbMedia,
    mdbMediaImage,
    mdbMediaBody,
    mdbCard,
    mdbCardHeader,
    mdbCardBody
  },
  data () {
    return {}
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
.d-flex>*,
.d-inline-flex>* {
    -ms-flex: 0 0 auto !important;
    flex: 0 0 auto !important;
}
</style>
