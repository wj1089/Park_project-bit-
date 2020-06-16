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

                    <v-list-item link>
                        <v-list-item-action>
                            <v-icon>mdi-email</v-icon>
                        </v-list-item-action>

                        <v-list-item-content>
                            <v-list-item-title @click="log">Login</v-list-item-title>
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
        </v-app>
    </div>
</template>

<script>
    export default {
        name: ""
    }
</script>

<style scoped>
</style>