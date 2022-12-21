<template>
  <mdb-container fluid>
    <!--Section: Inputs-->
    <section class="section card mb-5">
      <div class="card-body">
        <!--Section heading-->
        <h1 class="text-center my-5 h1">Inputs</h1>

        <h5 class="pb-5">Input fields</h5>

        <!--Grid row-->
        <div class="row">
          <!--Grid column-->
          <div class="col-md-4 mb-4">
            <mdb-input type="text" label="Basic example" />
          </div>
          <!--Grid column-->

          <!--Grid column-->
          <div class="col-md-4 mb-4">
            <mdb-input size="sm" type="text" label="Small input" />
          </div>
          <!--Grid column-->

          <!--Grid column-->
          <div class="col-md-4 mb-4">
            <mdb-input
              type="text"
              label="Example label"
              placeholder="Placeholder"
            />
          </div>
          <!--Grid column-->
        </div>
        <!--Grid row-->

        <!--Grid row-->
        <div class="row">
          <!--Grid column-->
          <div class="col-md-6 mb-4">
            <mdb-input type="text" label="Example label" value="John Doe" />
          </div>
          <!--Grid column-->

          <!--Grid column-->
          <div class="col-md-6 mb-4">
            <mdb-input type="text" label="Basic example" disabled />
          </div>
          <!--Grid column-->
        </div>
        <!--Grid row-->

        <!--Grid row-->
        <div class="row text-left">
          <!--Grid column-->
          <div class="col-md-6 mb-4">
            <!--Email validation-->
            <mdb-input type="text" label="Type your email" icon="envelope" />
          </div>
          <!--Grid column-->

          <!--Grid column-->
          <div class="col-md-6 mb-4">
            <!--Password validation-->
            <mdb-input type="password" label="Type your password" icon="lock" />
          </div>
          <!--Grid column-->
        </div>
        <!--Grid row-->

        <h5 class="pb-5">Textarea</h5>

        <!--Grid row-->
        <div class="row text-left">
          <!--Grid column-->
          <div class="col-md-6 mb-4">
            <!--Basic textarea-->
            <mdb-textarea :rows="5" label="Basic textarea" />
          </div>
          <!--Grid column-->

          <!--Grid column-->
          <div class="col-md-6 mb-4">
            <!--Textarea with icon prefix-->
            <mdb-textarea :rows="5" label="Icon prefix" icon="pencil-alt" />
          </div>
          <!--Grid column-->
        </div>
        <!--Grid row-->

        <h5 class="pb-5">Checkboxes and Radio</h5>

        <!--Grid row-->
        <div class="row">
          <!--Grid column-->
          <div class="col-lg-4 col-md-12 mb-4">
            <mdb-input
              type="checkbox"
              id="checkbox1"
              label="Classic checkbox"
            />
            <mdb-input
              type="checkbox"
              id="checkbox2"
              label="Filled-in checkbox"
              filled
            />
          </div>
          <!--Grid column-->

          <!--Grid column-->
          <div class="col-lg-4 col-md-6 mb-4">
            <mdb-input
              type="radio"
              id="option1-1"
              name="option1"
              value="option1"
              label="Option 1"
              checked
              @input="handleRadio"
            />
            <mdb-input
              type="radio"
              id="option1-2"
              name="option1"
              value="option2"
              label="Option 2"
              @input="handleRadio"
            />
            <mdb-input
              type="radio"
              id="option1-3"
              name="option1"
              value="option3"
              label="Option 3"
              @input="handleRadio"
            />
          </div>
          <!--Grid column-->

          <!--Grid column-->
          <div class="col-lg-4 col-md-6 mb-4">
            <!-- Switch -->
            <mdb-switch />

            <!-- Disabled Switch -->
            <mdb-switch disabled />
          </div>
          <!--Grid column-->
        </div>
        <!--Grid row-->

        <h5 class="pb-5">File input</h5>

        <!--Grid row-->
        <div class="row">
          <!--Grid column-->
          <div class="col-md-6 mb-4">
            <mdb-file-input btnColor="primary" />
          </div>
          <!--Grid column-->

          <!--Grid column-->
          <div class="col-md-6 mb-4">
            <mdb-file-input
              multiple
              textFieldTitle="Upload your files"
              btnColor="primary"
            ></mdb-file-input>
          </div>
          <!--Grid column-->
        </div>
        <!--Grid row-->

        <h5 class="pb-5">Range</h5>

        <!--Grid row-->
        <div class="row">
          <!--Grid column-->
          <div class="col-md-12 mb-4">
            <mdb-range-input :min="0" :max="100" :value="50"></mdb-range-input>
          </div>
          <!--Grid column-->
        </div>
        <!--Grid row-->

        <h5 class="pb-5">Select</h5>

        <!--Grid row-->
        <div class="row mb-5">
          <!--Grid column-->
          <div class="col-lg-4 col-md-12 mb-4">
            <!--Name-->
            <mdb-select
              @getValue="getSelectValue"
              label="Choose your option"
              :options="[
                { value: 'Option 1', text: 'Option nr 1' },
                { value: 'Option 2', text: 'Option nr 2' },
                { value: 'Option 3', text: 'Option nr 3' },
                { value: 'Option 4', text: 'Option nr 4' },
                { value: 'Option 5', text: 'Option nr 5' }
              ]"
            />
          </div>
          <!--Grid column-->

          <!--Grid column-->
          <div class="col-lg-4 col-md-6 mb-4">
            <!--Name-->
            <mdb-select
              color="primary"
              @getValue="getSelectValue"
              label="Choose your option"
              :options="[
                {
                  value: 'Option 1',
                  text: 'Option nr 1',
                  disabled: true,
                  selected: true
                },
                { value: 'Option 2', text: 'Option nr 2' },
                { value: 'Option 3', text: 'Option nr 3' },
                { value: 'Option 4', text: 'Option nr 4' },
                { value: 'Option 5', text: 'Option nr 5' }
              ]"
            />
          </div>
          <!--Grid column-->

          <!--Grid column-->
          <div class="col-lg-4 col-md-6 mb-4">
            <!--Name-->
            <mdb-select
              multiple
              search
              @getValue="getSelectValue"
              label="Choose your option"
              :options="[
                { value: 'Option 1', text: 'Option nr 1' },
                { value: 'Option 2', text: 'Option nr 2' },
                { value: 'Option 3', text: 'Option nr 3' },
                { value: 'Option 4', text: 'Option nr 4' },
                { value: 'Option 5', text: 'Option nr 5' }
              ]"
            />
          </div>
          <!--Grid column-->
        </div>
        <!--Grid row-->

        <!--Grid row-->
        <div class="row">
          <!--Grid column-->
          <div class="col-lg-4 col-md-12 mb-4">
            <!--Name-->
            <mdb-select
              @getValue="getSelectValue"
              :options="[
                {
                  value: 'team 1',
                  text: 'team 1',
                  disabled: true,
                  optgroup: true
                },
                { value: 'Option 1', text: 'Option nr 1', selected: true },
                { value: 'Option 2', text: 'Option nr 2' },
                { value: 'team 2', text: 'team 2', optgroup: true },
                { value: 'Option 3', text: 'Option nr 3' },
                { value: 'Option 4', text: 'Option nr 4' }
              ]"
            />
          </div>
          <!--Grid column-->

          <!--Grid column-->
          <div class="col-lg-4 col-md-6 mb-4">
            <!--Name-->
            <mdb-select
              @getValue="getSelectValue"
              label="Choose your option"
              :options="[
                {
                  icon:
                    'https://mdbootstrap.com/img/Photos/Avatars/avatar-1.jpg',
                  value: 'Option 1',
                  text: 'Option nr 1'
                },
                {
                  icon:
                    'https://mdbootstrap.com/img/Photos/Avatars/avatar-2.jpg',
                  value: 'Option 2',
                  text: 'Option nr 2'
                },
                {
                  icon:
                    'https://mdbootstrap.com/img/Photos/Avatars/avatar-3.jpg',
                  value: 'Option 3',
                  text: 'Option nr 3'
                }
              ]"
            />
          </div>
          <!--Grid column-->

          <!--Grid column-->
          <div class="col-lg-4 col-md-6 mb-4">
            <!--Name-->
            <mdb-select
              disabled
              label="Choose your option"
              :options="[
                { value: 'Option 1', text: 'Option nr 1' },
                { value: 'Option 2', text: 'Option nr 2' },
                { value: 'Option 3', text: 'Option nr 3' },
                { value: 'Option 4', text: 'Option nr 4' },
                { value: 'Option 5', text: 'Option nr 5' }
              ]"
            />
          </div>
          <!--Grid column-->
        </div>
        <!--Grid row-->
      </div>
    </section>
    <!--Section: Inputs-->

    <!--Section: Docs link-->
    <section class="pb-5">
      <!--Panel-->
      <div class="card text-center">
        <h3 class="card-header primary-color white-text">Full documentation</h3>
        <div class="card-body">
          <p class="card-text">
            Read the full documentation for these components.
          </p>
          <a
            href="https://mdbootstrap.com/docs/vue/forms/inputs/"
            target="_blank"
            class="btn btn-primary"
            >Learn more</a
          >
        </div>
      </div>
      <!--/.Panel-->
    </section>
    <!--Section: Docs link-->
  </mdb-container>
</template>

<script>
import {
  mdbContainer,
  mdbInput,
  mdbTextarea,
  mdbSelect,
  mdbSwitch,
  mdbFileInput,
  mdbRangeInput
} from "mdbvue";

export default {
  name: "Basic",
  components: {
    mdbContainer,
    mdbInput,
    mdbTextarea,
    mdbSelect,
    mdbSwitch,
    mdbFileInput,
    mdbRangeInput
  },
  data() {
    return {
      radio1: 0,
      radio2: 0,
      radio3: 0,
      active1: true,
      active2: false,
      active3: false
    };
  },
  methods: {
    checkboxChange(val) {
      console.log(val);
    },
    handleRadio(val) {
      console.log(val);
    },
    toggleActiveState1() {
      this.active1 = !this.active1;
    },
    toggleActiveState2() {
      this.active2 = !this.active2;
    },
    toggleActiveState3() {
      this.active3 = !this.active3;
    },
    toggleRadio1() {
      this.radio1 = 1;
    },
    toggleRadio2() {
      this.radio1 = 2;
    },
    toggleRadio3() {
      this.radio1 = 3;
    },
    toggleRadio4() {
      this.radio2 = 1;
    },
    toggleRadio5() {
      this.radio2 = 2;
    },
    toggleRadio6() {
      this.radio2 = 3;
    },
    toggleRadio7() {
      this.radio3 = 1;
    },
    toggleRadio8() {
      this.radio3 = 2;
    },
    toggleRadio9() {
      this.radio3 = 3;
    },
    getSelectValue(value) {
      console.log(value);
    }
  }
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped></style>
