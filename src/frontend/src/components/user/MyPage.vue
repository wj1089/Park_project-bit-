<template>
    <div>
        <v-app-bar
                app
                color="black"
                dark
        >
            <v-app-bar-nav-icon @click.stop="drawer = !drawer"></v-app-bar-nav-icon>
            <v-toolbar-title>Park. GYM</v-toolbar-title>
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

                <v-list-item link>
                    <v-list-item-action>
                        <v-icon>mdi-email</v-icon>
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

            <v-app id="inspire">
                <v-card
                        class="mx-auto"
                        max-width="434"
                        tile
                >
                    <v-img
                            height="100%"
                            src="https://cdn.vuetifyjs.com/images/cards/server-room.jpg"
                    >
                        <v-row
                                align="end"
                                class="fill-height"
                        >
                            <v-col
                                    align-self="start"
                                    class="pa-0"
                                    cols="12"
                            >
                                <v-avatar
                                        class="profile"
                                        color="grey"
                                        size="164"
                                        tile
                                >
                                    <v-img src="https://cdn.vuetifyjs.com/images/profiles/marcus.jpg"></v-img>
                                </v-avatar>
                            </v-col>
                            <v-col class="py-0">
                                <v-list-item
                                        color="rgba(0, 0, 0, .4)"
                                        dark
                                >
                                    <v-list-item-content>
                                        <v-list-item-title class="title">Marcus Obrien</v-list-item-title>
                                        <v-list-item-subtitle>Fitness Trainer</v-list-item-subtitle>
                                    </v-list-item-content>
                                </v-list-item>
                            </v-col>
                        </v-row>
                    </v-img>
                </v-card>
            </v-app>
        </div>
</template>
<script>

    export default {
        el: '#app',
        name: "MyPage",
        data(){

        },
        methods: {
        }
    }
</script>


<style scoped>

</style>