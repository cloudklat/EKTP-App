<template>
  <mdb-container fluid>
    <!--Section: Chat-->
    <section class="section">
      <!--Grid row-->
      <div class="row">
        <!--Grid column-->
        <div class="col-lg-4">
          <mdb-input type="text" label="Search Message" icon="search" />

          <!-- Messages -->
          <div class="list-group">
            <!-- Single message -->
            <a
              href="#"
              class="list-group-item list-group-item-action media active"
            >
              <!-- Avatar -->
              <img
                class="mr-3 avatar-sm float-left"
                src="https://mdbootstrap.com/img/Photos/Avatars/adach.jpg"
              />

              <!-- Author -->
              <div class="d-flex justify-content-between mb-1 ">
                <h6 class="mb-1"><strong>Dawid Adach</strong></h6>
                <small>13 July</small>
              </div>

              <!-- Message -->
              <p class="text-truncate">
                <strong>You: </strong> Donec id elit non mi porta gravida at
                eget metus. Maecenas sed diam eget risus varius blandit.
              </p>
            </a>

            <!-- Single message -->
            <a href="#" class="list-group-item list-group-item-action media">
              <!-- Avatar -->
              <img
                class="mr-3 avatar-sm float-left"
                src="https://secure.gravatar.com/avatar/8c051fd54e4c811e02bbc78d50549280?s=150&amp;d=mm&amp;r=g"
              />

              <!-- Author -->
              <div class="d-flex justify-content-between mb-1 ">
                <h6 class="mb-1"><strong>Michal Szymanski</strong></h6>
                <small>14 July</small>
              </div>

              <!-- Message -->
              <p class="text-truncate">
                <span class="badge red">MDB Team</span>
                <strong>Michal: </strong> Donec id elit non mi porta gravida at
                eget metus. Maecenas sed diam eget risus varius blandit.
              </p>
            </a>

            <!-- Single message -->
            <a href="#" class="list-group-item list-group-item-action media">
              <!-- Avatar -->
              <img
                class="mr-3 avatar-sm float-left"
                src="https://mdbootstrap.com/img/Photos/Avatars/piotr.jpg"
              />

              <!-- Author -->
              <div class="d-flex justify-content-between mb-1 ">
                <h6 class="mb-1"><strong>Piotr Bender</strong></h6>
                <small>15 July</small>
              </div>

              <!-- Message -->
              <p class="text-truncate">
                <strong>Piotr: </strong> Donec id elit non mi porta gravida at
                eget metus. Maecenas sed diam eget risus varius blandit.
              </p>
            </a>

            <!-- Single message -->
            <a href="#" class="list-group-item list-group-item-action media">
              <!-- Avatar -->
              <img
                class="mr-3 avatar-sm float-left"
                src="https://mdbootstrap.com/img/Photos/Avatars/michal.jpg"
              />

              <!-- Author -->
              <div class="d-flex justify-content-between mb-1 ">
                <h6 class="mb-1"><strong>Michal Krawczyk</strong></h6>
                <small>16 July</small>
              </div>

              <!-- Message -->
              <p class="text-truncate">
                <strong>You: </strong> Donec id elit non mi porta gravida at
                eget metus. Maecenas sed diam eget risus varius blandit.
              </p>
            </a>

            <!-- Single message -->
            <a href="#" class="list-group-item list-group-item-action media">
              <!-- Avatar -->
              <img
                class="mr-3 avatar-sm float-left"
                src="https://mdbootstrap.com/img/Photos/Avatars/laura.jpg"
              />

              <!-- Author -->
              <div class="d-flex justify-content-between mb-1 ">
                <h6 class="mb-1"><strong>Laura Choromanska</strong></h6>
                <small>16 July</small>
              </div>

              <!-- Message -->
              <p class="text-truncate">
                <strong>Laura: </strong> Donec id elit non mi porta gravida at
                eget metus. Maecenas sed diam eget risus varius blandit.
              </p>
            </a>

            <!-- Single message -->
            <a href="#" class="list-group-item list-group-item-action media">
              <!-- Avatar -->
              <img
                class="mr-3 avatar-sm float-left"
                src="https://mdbootstrap.com/img/Photos/Avatars/bartek.jpg"
              />

              <!-- Author -->
              <div class="d-flex justify-content-between mb-1 ">
                <h6 class="mb-1"><strong>Bartłomiej Malanowski</strong></h6>
                <small>16 July</small>
              </div>

              <!-- Message -->
              <p class="text-truncate">
                <strong>Miroslaw: </strong> Donec id elit non mi porta gravida
                at eget metus. Maecenas sed diam eget risus varius blandit.
              </p>
            </a>

            <!-- Single message -->
            <a href="#" class="list-group-item list-group-item-action media">
              <!-- Avatar -->
              <img
                class="mr-3 avatar-sm float-left"
                src="https://mdbootstrap.com/img/Photos/Avatars/filip.jpg"
              />

              <!-- Author -->
              <div class="d-flex justify-content-between mb-1 ">
                <h6 class="mb-1"><strong>Filip Kapusta</strong></h6>
                <small>16 July</small>
              </div>

              <!-- Message -->
              <p class="text-truncate">
                <strong>You: </strong> Donec id elit non mi porta gravida at
                eget metus. Maecenas sed diam eget risus varius blandit.
              </p>
            </a>
          </div>
          <!-- Messages -->
        </div>
        <!--Grid column-->

        <!--Grid column-->
        <div class="col-lg-8 mt-lg-0 mt-5">
          <!-- Conversation -->
          <div class="border border-dark p-4">
            <!-- My Message -->
            <div class="text-center"><small>16 July, 23:54</small></div>
            <div class="d-flex justify-content-end">
              <p class="primary-color rounded p-3 text-white w-75 ">
                Lorem ipsum dolor sit amet, consectetur adipisicing elit.
                Molestiae modi exercitationem dignissimos repellat, voluptas
                iure quod aliquid voluptatem perspiciatis quidem sit eos, cum
                fugit voluptatibus quos laboriosam sed tenetur voluptate!
              </p>
            </div>

            <!-- Your Message -->
            <div class="text-center"><small>16 July, 23:55</small></div>
            <div class="d-flex justify-content-start media">
              <!-- Avatar -->
              <img
                class="mr-3 avatar-sm float-left"
                src="https://mdbootstrap.com/img/Photos/Avatars/adach.jpg"
              />

              <p class="grey lighten-3 rounded p-3 w-75">
                Lorem ipsum dolor sit amet, consectetur adipisicing elit.
                Molestiae modi exercitationem dignissimos repellat, voluptas
                iure quod aliquid voluptatem perspiciatis quidem sit eos, cum
                fugit voluptatibus quos laboriosam sed tenetur voluptate!
              </p>
            </div>

            <!-- Your Message -->
            <div class="text-center"><small>16 July, 23:56</small></div>
            <div class="d-flex justify-content-start media">
              <!-- Avatar -->
              <img
                class="mr-3 avatar-sm float-left"
                src="https://mdbootstrap.com/img/Photos/Avatars/adach.jpg"
              />

              <p class="grey lighten-3 rounded p-3 w-75">
                Lorem ipsum dolor sit amet, consectetur adipisicing elit.
                Molestiae modi exercitationem dignissimos repellat, voluptas
                iure quod aliquid voluptatem perspiciatis quidem sit eos, cum
                fugit voluptatibus quos laboriosam sed tenetur voluptate!
              </p>
            </div>

            <!-- My Message -->
            <div class="text-center"><small>16 July, 23:54</small></div>
            <div class="d-flex justify-content-end">
              <p class="primary-color rounded p-3 text-white w-75 ">
                Lorem ipsum dolor sit amet, consectetur adipisicing elit.
                Molestiae modi exercitationem dignissimos repellat, voluptas
                iure quod aliquid voluptatem perspiciatis quidem sit eos, cum
                fugit voluptatibus quos laboriosam sed tenetur voluptate!
              </p>
            </div>

            <!-- New message -->
            <div class="row">
              <div class="col-md-12">
                <div class="d-flex flex-row">
                  <mdb-textarea
                    :rows="5"
                    class="chat-message-type"
                    label="Type your message"
                  />

                  <div class="mt-5">
                    <mdb-btn color="primary" size="lg">Send</mdb-btn>
                  </div>
                </div>
              </div>
            </div>
            <!-- /.New message -->
          </div>
          <!-- Conversation -->
        </div>
        <!--Grid column-->
      </div>
      <!--/.Grid row-->
    </section>
    <!--Section: Chat-->
  </mdb-container>
</template>

<script>
import {
  mdbContainer,
  mdbBtn,
  mdbInput,
  mdbTextarea
} from "mdbvue";

export default {
  name: "Chat",
  components: {
    mdbContainer,
    mdbBtn,
    mdbInput,
    mdbTextarea
  },
  data() {
    return {};
  }
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
.avatar-sm {
  width: 56px;
  border-radius: 50%;
}
.chat-message-type {
  -webkit-box-flex: 1 !important;
  -webkit-flex: 1 0 auto !important;
  -ms-flex: 1 0 auto !important;
  flex: 1 0 auto !important;
}
</style>
