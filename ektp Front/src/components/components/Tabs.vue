<template>
  <mdb-container fluid>
    <h2 class="mt-lg-5 mb-5 pb-4 font-weight-bold">
      <strong>Tabs & pills</strong>
    </h2>

    <mdb-tab tabs class="md-tabs" justify>
      <mdb-tab-item :active="basic1 == 1" @click.native.prevent="basic1 = 1"
        >Profile</mdb-tab-item
      >
      <mdb-tab-item :active="basic1 == 2" @click.native.prevent="basic1 = 2"
        >Follow</mdb-tab-item
      >
      <mdb-tab-item :active="basic1 == 3" @click.native.prevent="basic1 = 3"
        >Contact</mdb-tab-item
      >
    </mdb-tab>
    <mdb-tab-content class="mb-5 card">
      <transition-group name="slide-toggle">
        <mdb-tab-pane key="show1" v-show="basic1 == 1"
          ><br />Lorem ipsum dolor sit amet, consectetur adipisicing elit. Nihil
          odit magnam minima, soluta doloribus reiciendis molestiae placeat unde
          eos molestias. Quisquam aperiam, pariatur. Tempora, placeat ratione
          porro voluptate odit minima.</mdb-tab-pane
        >
        <mdb-tab-pane key="show2" v-show="basic1 == 2"
          ><br />Sed ut perspiciatis unde omnis iste natus error sit voluptatem
          accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae
          ab illo inventore veritatis et quasi architecto beatae vitae dicta
          sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit
          aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos
          qui ratione voluptatem sequi nesciunt. <br /><br />Neque porro
          quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur,
          adipisci velit, sed quia non numquam eius modi tempora incidunt ut
          labore et dolore magnam aliquam quaerat voluptatem.
        </mdb-tab-pane>
        <mdb-tab-pane key="show3" v-show="basic1 == 3"
          ><br />At vero eos et accusamus et iusto odio dignissimos ducimus qui
          blanditiis praesentium voluptatum deleniti atque corrupti quos dolores
          et quas molestias excepturi sint occaecati cupiditate non provident,
          similique sunt in culpa qui officia deserunt mollitia animi, id est
          laborum et dolorum fuga. <br /><br />Et harum quidem rerum facilis est
          et expedita distinctio. Nam libero tempore, cum soluta nobis est
          eligendi optio cumque nihil impedit quo minus id quod maxime placeat
          facere possimus, omnis voluptas assumenda est, omnis dolor
          repellendus. Temporibus autem quibusdam et aut officiis debitis aut
          rerum necessitatibus saepe eveniet ut et voluptates repudiandae sint
          et molestiae non recusandae. Itaque earum rerum hic tenetur a sapiente
          delectus, ut aut reiciendis voluptatibus maiores alias consequatur aut
          perferendis doloribus asperiores repellat.</mdb-tab-pane
        >
      </transition-group>
    </mdb-tab-content>

    <mdb-tab tabs class="md-tabs" color="indigo" justify>
      <mdb-tab-item
        icon="user"
        :active="basic2 == 1"
        @click.native.prevent="basic2 = 1"
        >Profile</mdb-tab-item
      >
      <mdb-tab-item
        icon="heart"
        :active="basic2 == 2"
        @click.native.prevent="basic2 = 2"
        >Follow</mdb-tab-item
      >
      <mdb-tab-item
        icon="envelope"
        :active="basic2 == 3"
        @click.native.prevent="basic2 = 3"
        >Mail</mdb-tab-item
      >
    </mdb-tab>
    <mdb-tab-content class="card">
      <transition-group name="slide-toggle">
        <mdb-tab-pane key="show4" v-show="basic2 == 1"
          ><br />Lorem ipsum dolor sit amet, consectetur adipisicing elit. Nihil
          odit magnam minima, soluta doloribus reiciendis molestiae placeat unde
          eos molestias. Quisquam aperiam, pariatur. Tempora, placeat ratione
          porro voluptate odit minima.</mdb-tab-pane
        >
        <mdb-tab-pane key="show5" v-show="basic2 == 2"
          ><br />Sed ut perspiciatis unde omnis iste natus error sit voluptatem
          accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae
          ab illo inventore veritatis et quasi architecto beatae vitae dicta
          sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit
          aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos
          qui ratione voluptatem sequi nesciunt. <br /><br />Neque porro
          quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur,
          adipisci velit, sed quia non numquam eius modi tempora incidunt ut
          labore et dolore magnam aliquam quaerat voluptatem.
        </mdb-tab-pane>
        <mdb-tab-pane key="show6" v-show="basic2 == 3"
          ><br />At vero eos et accusamus et iusto odio dignissimos ducimus qui
          blanditiis praesentium voluptatum deleniti atque corrupti quos dolores
          et quas molestias excepturi sint occaecati cupiditate non provident,
          similique sunt in culpa qui officia deserunt mollitia animi, id est
          laborum et dolorum fuga. <br /><br />Et harum quidem rerum facilis est
          et expedita distinctio. Nam libero tempore, cum soluta nobis est
          eligendi optio cumque nihil impedit quo minus id quod maxime placeat
          facere possimus, omnis voluptas assumenda est, omnis dolor
          repellendus. Temporibus autem quibusdam et aut officiis debitis aut
          rerum necessitatibus saepe eveniet ut et voluptates repudiandae sint
          et molestiae non recusandae. Itaque earum rerum hic tenetur a sapiente
          delectus, ut aut reiciendis voluptatibus maiores alias consequatur aut
          perferendis doloribus asperiores repellat.</mdb-tab-pane
        >
      </transition-group>
    </mdb-tab-content>

    <hr class="my-5" />

    <h2 class="mb-4">Pills</h2>
    <mdb-tab pills color="secondary" justify>
      <mdb-tab-item :active="pills == 1" @click.native.prevent="pills = 1"
        >Active</mdb-tab-item
      >
      <mdb-tab-item :active="pills == 2" @click.native.prevent="pills = 2"
        >Link</mdb-tab-item
      >
      <mdb-tab-item :active="pills == 3" @click.native.prevent="pills = 3"
        >Link</mdb-tab-item
      >
      <mdb-tab-item :active="pills == 4" @click.native.prevent="pills = 4"
        >Help</mdb-tab-item
      >
    </mdb-tab>
    <mdb-tab-content class="mb-5">
      <transition-group name="slide-toggle">
        <mdb-tab-pane key="pills1" v-show="pills == 1"
          >Lorem ipsum dolor sit amet, consectetur adipisicing elit. Nihil odit
          magnam minima, soluta doloribus reiciendis molestiae placeat unde eos
          molestias. Quisquam aperiam, pariatur. Tempora, placeat ratione porro
          voluptate odit minima.</mdb-tab-pane
        >
        <mdb-tab-pane key="pills2" v-show="pills == 2"
          >Sed ut perspiciatis unde omnis iste natus error sit voluptatem
          accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae
          ab illo inventore veritatis et quasi architecto beatae vitae dicta
          sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit
          aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos
          qui ratione voluptatem sequi nesciunt. <br /><br />Neque porro
          quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur,
          adipisci velit, sed quia non numquam eius modi tempora incidunt ut
          labore et dolore magnam aliquam quaerat voluptatem.
        </mdb-tab-pane>
        <mdb-tab-pane key="pills3" v-show="pills == 3"
          >At vero eos et accusamus et iusto odio dignissimos ducimus qui
          blanditiis praesentium voluptatum deleniti atque corrupti quos dolores
          et quas molestias excepturi sint occaecati cupiditate non provident,
          similique sunt in culpa qui officia deserunt mollitia animi, id est
          laborum et dolorum fuga. <br /><br />Et harum quidem rerum facilis est
          et expedita distinctio. Nam libero tempore, cum soluta nobis est
          eligendi optio cumque nihil impedit quo minus id quod maxime placeat
          facere possimus, omnis voluptas assumenda est, omnis dolor
          repellendus. Temporibus autem quibusdam et aut officiis debitis aut
          rerum necessitatibus saepe eveniet ut et voluptates repudiandae sint
          et molestiae non recusandae. Itaque earum rerum hic tenetur a sapiente
          delectus, ut aut reiciendis voluptatibus maiores alias consequatur aut
          perferendis doloribus asperiores repellat.</mdb-tab-pane
        >
        <mdb-tab-pane key="pills4" v-show="pills == 4"
          >Et harum quidem rerum facilis est et expedita distinctio. Nam libero
          tempore, cum soluta nobis est eligendi optio cumque nihil impedit quo
          minus id quod maxime placeat facere possimus, omnis voluptas assumenda
          est, omnis dolor repellendus. Temporibus autem quibusdam et aut
          officiis debitis aut rerum necessitatibus saepe eveniet ut et
          voluptates repudiandae sint et molestiae non recusandae. Itaque earum
          rerum hic tenetur a sapiente delectus, ut aut reiciendis voluptatibus
          maiores alias consequatur aut perferendis doloribus asperiores
          repellat.</mdb-tab-pane
        >
      </transition-group>
    </mdb-tab-content>

    <h2 class="mb-4">Vertical pills</h2>
    <mdb-row class="mb-5">
      <mdb-col md="3">
        <mdb-tab pills color="primary" vertical>
          <mdb-tab-item
            :active="vertical == 1"
            @click.native.prevent="vertical = 1"
            >Downloads <mdb-icon icon="download" class="ml-2"
          /></mdb-tab-item>
          <mdb-tab-item
            :active="vertical == 2"
            @click.native.prevent="vertical = 2"
            >Orders & Invoices <mdb-icon icon="file" class="ml-2"
          /></mdb-tab-item>
          <mdb-tab-item
            :active="vertical == 3"
            @click.native.prevent="vertical = 3"
            >Billing Details <mdb-icon icon="address-card" class="ml-2"
          /></mdb-tab-item>
        </mdb-tab>
      </mdb-col>
      <mdb-col md="9">
        <mdb-tab-content vertical>
          <transition-group name="slide-toggle">
            <mdb-tab-pane key="pills1" v-show="vertical == 1"
              ><h5 class="my-2 h5">Panel 1</h5></mdb-tab-pane
            >
            <mdb-tab-pane key="pills2" v-show="vertical == 2"
              ><h5 class="my-2 h5">Panel 2</h5></mdb-tab-pane
            >
            <mdb-tab-pane key="pills3" v-show="vertical == 3"
              ><h5 class="my-2 h5">Panel 3</h5></mdb-tab-pane
            >
          </transition-group>
        </mdb-tab-content>
      </mdb-col>
    </mdb-row>

    <h2 class="mb-4">Pills within the tabs</h2>

    <mdb-tab tabs class="md-tabs" color="indigo" justify>
      <mdb-tab-item
        icon="user"
        :active="basicOutside == 1"
        @click.native.prevent="basicOutside = 1"
        >Profile</mdb-tab-item
      >
      <mdb-tab-item
        icon="heart"
        :active="basicOutside == 2"
        @click.native.prevent="basicOutside = 2"
        >Follow</mdb-tab-item
      >
    </mdb-tab>
    <mdb-tab-content>
      <transition-group name="slide-toggle">
        <mdb-tab-pane key="show5" v-show="basicOutside == 1">
          <mdb-row>
            <mdb-col md="3">
              <mdb-tab pills color="primary" vertical>
                <mdb-tab-item
                  :active="verticalWithin == 1"
                  @click.native.prevent="verticalWithin = 1"
                  >Downloads <mdb-icon icon="download" class="ml-2"
                /></mdb-tab-item>
                <mdb-tab-item
                  :active="verticalWithin == 2"
                  @click.native.prevent="verticalWithin = 2"
                  >Orders & Invoices <mdb-icon icon="file" class="ml-2"
                /></mdb-tab-item>
                <mdb-tab-item
                  :active="verticalWithin == 3"
                  @click.native.prevent="verticalWithin = 3"
                  >Billing Details <mdb-icon icon="address-card" class="ml-2"
                /></mdb-tab-item>
              </mdb-tab>
            </mdb-col>
            <mdb-col md="9">
              <mdb-tab-content vertical>
                <transition-group name="slide-toggle">
                  <mdb-tab-pane key="pills1" v-show="verticalWithin == 1"
                    ><h5 class="my-2 h5">Panel 1</h5></mdb-tab-pane
                  >
                  <mdb-tab-pane key="pills2" v-show="verticalWithin == 2"
                    ><h5 class="my-2 h5">Panel 2</h5></mdb-tab-pane
                  >
                  <mdb-tab-pane key="pills3" v-show="verticalWithin == 3"
                    ><h5 class="my-2 h5">Panel 3</h5></mdb-tab-pane
                  >
                </transition-group>
              </mdb-tab-content>
            </mdb-col>
          </mdb-row>
        </mdb-tab-pane>
        <mdb-tab-pane key="show6" v-show="basicOutside == 2"
          ><br />At vero eos et accusamus et iusto odio dignissimos ducimus qui
          blanditiis praesentium voluptatum deleniti atque corrupti quos dolores
          et quas molestias excepturi sint occaecati cupiditate non provident,
          similique sunt in culpa qui officia deserunt mollitia animi, id est
          laborum et dolorum fuga. <br /><br />Et harum quidem rerum facilis est
          et expedita distinctio. Nam libero tempore, cum soluta nobis est
          eligendi optio cumque nihil impedit quo minus id quod maxime placeat
          facere possimus, omnis voluptas assumenda est, omnis dolor
          repellendus. Temporibus autem quibusdam et aut officiis debitis aut
          rerum necessitatibus saepe eveniet ut et voluptates repudiandae sint
          et molestiae non recusandae. Itaque earum rerum hic tenetur a sapiente
          delectus, ut aut reiciendis voluptatibus maiores alias consequatur aut
          perferendis doloribus asperiores repellat.</mdb-tab-pane
        >
      </transition-group>
    </mdb-tab-content>

    <hr class="my-5" />

    <h2 class="mb-4">Classic tabs</h2>
    <div class="classic-tabs">
      <mdb-tab color="cyan">
        <mdb-tab-item
          :active="classic1 == 1"
          @click.native.prevent="classic1 = 1"
          >Profile</mdb-tab-item
        >
        <mdb-tab-item
          :active="classic1 == 2"
          @click.native.prevent="classic1 = 2"
          >Follow</mdb-tab-item
        >
        <mdb-tab-item
          :active="classic1 == 3"
          @click.native.prevent="classic1 = 3"
          >Contact</mdb-tab-item
        >
        <mdb-tab-item
          :active="classic1 == 4"
          @click.native.prevent="classic1 = 4"
          >Be awesome</mdb-tab-item
        >
      </mdb-tab>
      <mdb-tab-content class="mb-5 card">
        <transition-group name="slide-toggle">
          <mdb-tab-pane key="show1" v-show="classic1 == 1"
            >Lorem ipsum dolor sit amet, consectetur adipisicing elit. Nihil
            odit magnam minima, soluta doloribus reiciendis molestiae placeat
            unde eos molestias. Quisquam aperiam, pariatur. Tempora, placeat
            ratione porro voluptate odit minima.</mdb-tab-pane
          >
          <mdb-tab-pane key="show2" v-show="classic1 == 2"
            >Sed ut perspiciatis unde omnis iste natus error sit voluptatem
            accusantium doloremque laudantium, totam rem aperiam, eaque ipsa
            quae ab illo inventore veritatis et quasi architecto beatae vitae
            dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit
            aspernatur aut odit aut fugit, sed quia consequuntur magni dolores
            eos qui ratione voluptatem sequi nesciunt. <br /><br />Neque porro
            quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur,
            adipisci velit, sed quia non numquam eius modi tempora incidunt ut
            labore et dolore magnam aliquam quaerat voluptatem.
          </mdb-tab-pane>
          <mdb-tab-pane key="show3" v-show="classic1 == 3"
            >At vero eos et accusamus et iusto odio dignissimos ducimus qui
            blanditiis praesentium voluptatum deleniti atque corrupti quos
            dolores et quas molestias excepturi sint occaecati cupiditate non
            provident, similique sunt in culpa qui officia deserunt mollitia
            animi, id est laborum et dolorum fuga. <br /><br />Et harum quidem
            rerum facilis est et expedita distinctio. Nam libero tempore, cum
            soluta nobis est eligendi optio cumque nihil impedit quo minus id
            quod maxime placeat facere possimus, omnis voluptas assumenda est,
            omnis dolor repellendus. Temporibus autem quibusdam et aut officiis
            debitis aut rerum necessitatibus saepe eveniet ut et voluptates
            repudiandae sint et molestiae non recusandae. Itaque earum rerum hic
            tenetur a sapiente delectus, ut aut reiciendis voluptatibus maiores
            alias consequatur aut perferendis doloribus asperiores
            repellat.</mdb-tab-pane
          >
          <mdb-tab-pane key="show4" v-show="classic1 == 4"
            >Et harum quidem rerum facilis est et expedita distinctio. Nam
            libero tempore, cum soluta nobis est eligendi optio cumque nihil
            impedit quo minus id quod maxime placeat facere possimus, omnis
            voluptas assumenda est, omnis dolor repellendus. Temporibus autem
            quibusdam et aut officiis debitis aut rerum necessitatibus saepe
            eveniet ut et voluptates repudiandae sint et molestiae non
            recusandae. Itaque earum rerum hic tenetur a sapiente delectus, ut
            aut reiciendis voluptatibus maiores alias consequatur aut
            perferendis doloribus asperiores repellat.</mdb-tab-pane
          >
        </transition-group>
      </mdb-tab-content>
    </div>

    <div class="classic-tabs">
      <mdb-tab color="orange">
        <mdb-tab-item
          :active="classic2 == 1"
          @click.native.prevent="classic2 = 1"
          ><mdb-icon icon="user" size="2x" /><br />Profile</mdb-tab-item
        >
        <mdb-tab-item
          :active="classic2 == 2"
          @click.native.prevent="classic2 = 2"
          ><mdb-icon icon="heart" size="2x" /><br />Follow</mdb-tab-item
        >
        <mdb-tab-item
          :active="classic2 == 3"
          @click.native.prevent="classic2 = 3"
          ><mdb-icon icon="envelope" size="2x" /><br />Contact</mdb-tab-item
        >
        <mdb-tab-item
          :active="classic2 == 4"
          @click.native.prevent="classic2 = 4"
          ><mdb-icon icon="star" size="2x" /><br />Be awesome</mdb-tab-item
        >
      </mdb-tab>
      <mdb-tab-content class="mb-5 card">
        <transition-group name="slide-toggle">
          <mdb-tab-pane key="show1" v-show="classic2 == 1"
            >Lorem ipsum dolor sit amet, consectetur adipisicing elit. Nihil
            odit magnam minima, soluta doloribus reiciendis molestiae placeat
            unde eos molestias. Quisquam aperiam, pariatur. Tempora, placeat
            ratione porro voluptate odit minima.</mdb-tab-pane
          >
          <mdb-tab-pane key="show2" v-show="classic2 == 2"
            >Sed ut perspiciatis unde omnis iste natus error sit voluptatem
            accusantium doloremque laudantium, totam rem aperiam, eaque ipsa
            quae ab illo inventore veritatis et quasi architecto beatae vitae
            dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit
            aspernatur aut odit aut fugit, sed quia consequuntur magni dolores
            eos qui ratione voluptatem sequi nesciunt. <br /><br />Neque porro
            quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur,
            adipisci velit, sed quia non numquam eius modi tempora incidunt ut
            labore et dolore magnam aliquam quaerat voluptatem.
          </mdb-tab-pane>
          <mdb-tab-pane key="show3" v-show="classic2 == 3"
            >At vero eos et accusamus et iusto odio dignissimos ducimus qui
            blanditiis praesentium voluptatum deleniti atque corrupti quos
            dolores et quas molestias excepturi sint occaecati cupiditate non
            provident, similique sunt in culpa qui officia deserunt mollitia
            animi, id est laborum et dolorum fuga. <br /><br />Et harum quidem
            rerum facilis est et expedita distinctio. Nam libero tempore, cum
            soluta nobis est eligendi optio cumque nihil impedit quo minus id
            quod maxime placeat facere possimus, omnis voluptas assumenda est,
            omnis dolor repellendus. Temporibus autem quibusdam et aut officiis
            debitis aut rerum necessitatibus saepe eveniet ut et voluptates
            repudiandae sint et molestiae non recusandae. Itaque earum rerum hic
            tenetur a sapiente delectus, ut aut reiciendis voluptatibus maiores
            alias consequatur aut perferendis doloribus asperiores
            repellat.</mdb-tab-pane
          >
          <mdb-tab-pane key="show4" v-show="classic2 == 4"
            >Et harum quidem rerum facilis est et expedita distinctio. Nam
            libero tempore, cum soluta nobis est eligendi optio cumque nihil
            impedit quo minus id quod maxime placeat facere possimus, omnis
            voluptas assumenda est, omnis dolor repellendus. Temporibus autem
            quibusdam et aut officiis debitis aut rerum necessitatibus saepe
            eveniet ut et voluptates repudiandae sint et molestiae non
            recusandae. Itaque earum rerum hic tenetur a sapiente delectus, ut
            aut reiciendis voluptatibus maiores alias consequatur aut
            perferendis doloribus asperiores repellat.</mdb-tab-pane
          >
        </transition-group>
      </mdb-tab-content>
    </div>
    <!--Section: Docs link-->
    <section class="pb-4 mt-5">
      <!--Panel-->
      <mdb-card>
        <mdb-card-header class="primary-color text-center white-text"
          >Full documentation</mdb-card-header
        >
        <mdb-card-body class="text-center">
          <p>Read the full documentation for these components.</p>
          <a
            href="https://mdbootstrap.com/docs/vue/components/tabs/"
            target="_blank"
            class="btn btn-primary"
            >Learn more</a
          >
        </mdb-card-body>
      </mdb-card>
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
  mdbTab,
  mdbTabItem,
  mdbTabContent,
  mdbTabPane,
  mdbIcon,
  mdbCard,
  mdbCardHeader,
  mdbCardBody
} from "mdbvue";

export default {
  name: "tabs",
  components: {
    mdbContainer,
    mdbRow,
    mdbCol,
    mdbTab,
    mdbTabItem,
    mdbTabContent,
    mdbTabPane,
    mdbIcon,
    mdbCard,
    mdbCardBody,
    mdbCardHeader
  },
  data() {
    return {
      basic1: "1",
      basic2: "1",
      pills: "1",
      vertical: "1",
      basicOutside: "1",
      verticalWithin: "1",
      classic1: "1",
      classic2: "1"
    };
  }
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
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
