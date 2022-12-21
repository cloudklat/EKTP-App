<template>
  <div class="white-skin mdb-admin-sidenav">
    <mdb-side-nav
      logo="https://i.ibb.co/tzY2kN6/ktp.png"
      sideNavClass="sn-bg-4"
      mask="strong"
      :OpenedFromOutside.sync="toggle"
    >
      <li>
        <form class="search-form" role="search">
          <div class="form-group md-form mt-0 pt-1 ripple-parent" @click="wave">
            <input
              type="text"
              class="form-control"
              placeholder="E-KTP App"
              disabled
            />
          </div>
        </form>
      </li>
      <li>
        <mdb-side-nav-nav>
          <mdb-side-nav-item
            header
            @click.native="width < 1440 && toggleSideNav(false)"
            icon="tachometer-alt"
            to="/home"
            >Dashboards</mdb-side-nav-item
          >

          <mdb-side-nav-item
            header
            @click.native="width < 1440 && toggleSideNav(false)"
            icon="user-plus"
            to="/addKK"
            >Tambah KK</mdb-side-nav-item
          >

          <mdb-side-nav-item
            header
            @click.native="width < 1440 && toggleSideNav(false)"
            icon="sign-out-alt"
            to="/login"
            >Logout</mdb-side-nav-item
          >
        </mdb-side-nav-nav>
      </li>
    </mdb-side-nav>
  </div>
</template>

<script>
import {
  mdbSideNav,
  mdbSideNavNav,
  // mdbSideNavCat,
  mdbSideNavItem,
  waves,
} from "mdbvue";
import { mapGetters, mapActions } from "vuex";

export default {
  name: "SideNav",
  props: {
    waves: {
      type: Boolean,
      default: true,
    },
    open: {
      type: Boolean,
    },
  },
  components: {
    mdbSideNav,
    mdbSideNavNav,
    // mdbSideNavCat,
    mdbSideNavItem,
  },
  data() {
    return {
      active: 0,
      elHeight: 0,
      windowHeight: 0,
      toggle: true,
      width: 0,
    };
  },
  computed: mapGetters(["sidenav"]),
  methods: {
    ...mapActions(["toggleSideNav"]),
    afterEnter(el) {
      el.style.maxHeight = "1000px";
    },
    beforeLeave(el) {
      el.style.maxHeight = 0;
    },
    setWidth() {
      this.width = window.innerWidth;
    },
  },
  mounted() {
    this.setWidth();
    window.addEventListener("resize", this.setWidth);
  },
  beforeDestroy() {
    window.removeEventListener("resize", this.setWidth);
  },
  watch: {
    toggle(value) {
      this.toggleSideNav(value);
    },
    sidenav(value) {
      this.toggle = value;
    },
    width(value) {
      if (value < 1440) {
        this.toggle = false;
      } else this.toggle = true;
    },
  },
  mixins: [waves],
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->

<style>
.side-nav {
  opacity: 1 !important;
  transition: transform 0.3s linear !important;
}
</style>
