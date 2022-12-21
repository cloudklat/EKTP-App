<template>
  <mdb-footer>
    <p class="footer-copyright mb-0 py-3 text-center">
      &copy;
      <!-- update secara realtime tahun -->
      <!-- {{ new Date().getFullYear() }}  -->
      2022-2023
      <a href="https://www.google.com"> Cloudklat. All Rights Reserved.</a>
    </p>
  </mdb-footer>
</template>

<script>
import { mdbFooter } from "mdbvue";

export default {
  name: "Footer",
  components: {
    mdbFooter,
  },
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped></style>
