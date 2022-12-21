<template>
  <mdb-container>
    <mdb-calendar :events="events" />
  </mdb-container>
</template>

<script>
import { mdbContainer } from 'mdbvue'
import { mdbCalendar } from 'mdb-calendar'

export default {
  name: 'Calendar',
  components: {
    mdbCalendar,
    mdbContainer
  },
  data () {
    return {
      events: [
        {
          title: 'Meeting',
          start: new Date(new Date().getFullYear(), new Date().getMonth(), new Date().getDate() + 7),
          end: new Date(new Date().getFullYear(), new Date().getMonth(), new Date().getDate() + 8, 23, 59, 59),
          color: 'warning'
        },
        {
          title: 'Front-End Conference',
          start: new Date(new Date().getFullYear(), new Date().getMonth(), new Date().getDate() - 1),
          end: new Date(new Date().getFullYear(), new Date().getMonth(), new Date().getDate() + 3, 23, 59, 59),
          color: 'danger'
        },
        {
          title: 'Feedback',
          start: new Date(new Date().getFullYear(), new Date().getMonth(), new Date().getDate() + 13),
          end: new Date(new Date().getFullYear(), new Date().getMonth(), new Date().getDate() + 13, 23, 59, 59),
          color: 'success'
        }
      ]
    }
  }
}
</script>

<style>
#app {
  font-family: Calibri, Helvetica, Arial, sans-serif;
  margin-top: 50px;
}
</style>
