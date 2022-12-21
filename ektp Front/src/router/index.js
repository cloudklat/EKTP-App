import Vue from "vue";
import Router from "vue-router";
import Dashboardv3 from "@/components/dashboards/Home";
import Login from "@/components/pages/Login";
import Register from "@/components/pages/Register";
import AddKk from "@/components/profiles/Basic-2";
import Logout from "@/components/sections/Sections";

Vue.use(Router);

export default new Router({
  routes: [
    {
      path: "/home",
      name: "E-KTP Dashboard",
      component: Dashboardv3,
    },
    {
      path: "/addKK",
      name: "Form Tambah Kartu Keluarga",
      component: AddKk,
    },
    {
      path: "/pages/login",
      name: "Login Page",
      component: Login,
    },
    {
      path: "/pages/register",
      name: "Register Page",
      component: Register,
    },
    {
      path: "/",
      name: "Logout",
      component: Logout,
    },
  ],
});
