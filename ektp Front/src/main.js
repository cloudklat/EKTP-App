// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import router from './router'
import store from './store'
import * as VueGoogleMaps from 'vue2-google-maps'
import 'bootstrap-css-only/css/bootstrap.min.css'
import 'mdbvue/lib/css/mdb.min.css'
import '@fortawesome/fontawesome-free/css/all.min.css'
import "mdb-calendar/lib/main.css"

Vue.use(VueGoogleMaps, {
  load: {
    libraries: 'places'
  }
})

Vue.config.productionTip = false

new Vue({
  render: h => h(App),
  router,
  store,
  components: { App }
  }).$mount('#app')
  
  
