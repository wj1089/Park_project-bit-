<template>
<div>

  <v-app id="inspire">

    <v-navigation-drawer
            v-model="drawer"
            app
    >
      <v-divider></v-divider>

      <v-list dense>
        <v-list-item link>
          <v-list-item-action>
            <v-icon>mdi-home</v-icon>
          </v-list-item-action>

          <v-list-item-content>
            <router-link to="/"><v-list-item-title>Home</v-list-item-title></router-link>
          </v-list-item-content>

         </v-list-item>
        </v-list>

        <v-list dense>
          <v-list-item link>
            <v-list-item-action>
              <v-icon>mdi-home</v-icon>
            </v-list-item-action>

            <v-list-item-content>
              <router-link to="/MyPage"><v-list-item-title>MyPage</v-list-item-title></router-link>
            </v-list-item-content>
          </v-list-item>

      <v-list-item link>
          <v-list-item-action>
            <v-icon>Logout</v-icon>
          </v-list-item-action>

          <v-list-item-content>
            <v-list-item-title @click="log">Logout</v-list-item-title>
          </v-list-item-content>
      </v-list-item>


      <v-list-item Place>
        <v-list-item-action>
          <v-icon>fas fa-list</v-icon>
        </v-list-item-action>
        <v-list-item-content >
          <v-list-item-title @click="place">Place</v-list-item-title>
        </v-list-item-content>
      </v-list-item>

    </v-list>
  </v-navigation-drawer>

  <v-app-bar
          app
          color="black"
          dark
  >

      <v-app-bar-nav-icon @click.stop="drawer = !drawer"></v-app-bar-nav-icon>
      <v-toolbar-title @click="log2" style="cursor: pointer">Park.GYM</v-toolbar-title>
          <v-btn icon>
            <v-icon>mdi-magnify</v-icon>
          </v-btn>

          <v-btn icon>
            <v-icon>mdi-heart</v-icon>
          </v-btn>

      <v-btn icon>
        <v-icon>mdi-dots-vertical</v-icon>
      </v-btn>

  </v-app-bar>
    <v-container fluid>

  <v-content1>
    <template>
      <v-carousel>
        <v-carousel-item
                v-for="(item,i) in slides"
                :key="i"
                :src="item.src"
                reverse-transition="fade-transition"
                transition="fade-transition"
        ></v-carousel-item>
      </v-carousel>
    </template>
    <v-container
            class="fill-height"
            fluid
    >
    </v-container>
  </v-content1>

    </v-container>


  <template>
    <v-footer
            dark
            padless
    >
      <v-card
              class="flex"
              flat
              tile
      >
        <v-card-title class="teal">
          <strong class="subheading">Get connected with us on social networks!</strong>

          <v-spacer></v-spacer>

          <v-btn
                  v-for="icon in icons"
                  :key="icon"
                  class="mx-4"
                  black
                  icon
          >
            <v-icon size="24px">{{ icon }}</v-icon>
          </v-btn>
        </v-card-title>

        <v-card-text class="py-2 white--text text-center">
          {{ new Date().getFullYear() }} — <strong>로그인이 필요합니다.</strong>
        </v-card-text>
      </v-card>

    </v-footer>
  </template>
</v-app>
</div>
</template>

<script>
  import axios from 'axios'
  export default {
    name: 'GymHome',
    props: {
      source: String,
    },
    methods:{
      log(){
        this.$router.push('/Login')
      },
      place(){
        this.$router.push('/Place')
      },
      log2(){
        this.$router.push('/Login')
      },
      my(){
        this.$router.push('/Mypage')
      },
    cl(){
      alert("확인이요~")
      axios.get('https://localhost:5001/').then().catch(err=>{
        alert("통신 실패입니다." + err)
      })
    }
    },
    data: () => ({

      drawer: null,
      slides: [
        {
          src: 'https://images.unsplash.com/photo-1576678927484-cc907957088c?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=634&q=80',
        },
        {
          src : 'https://images.unsplash.com/photo-1507398941214-572c25f4b1dc?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=966&q=80',
        },
        {
          src: 'https://images.unsplash.com/photo-1580051745101-2dca6e53f15c?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1050&q=80',
        },
        {
          src: 'https://images.unsplash.com/photo-1518622358385-8ea7d0794bf6?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1050&q=80',
        },
      ],
      icons: [
        'mdi-facebook',
        'mdi-twitter',
        'mdi-linkedin',
        'mdi-instagram',
      ],
    })
  }


</script>
<style scoped>
  #search {
    color: white;
  }

</style>