<template>
    <div>
        <h2>Join Form</h2>
<!--        <div class="imgcontainer">-->
<!--            <img src="https://www.w3schools.com/howto/img_avatar2.png" alt="Avatar" class="avatar">-->
<!--        </div>-->

<!--        <div class="container">-->
<!--            <label ></label>-->
<!--            <input type="text"  @keyup.enter="moveToPasswd"  v-model="userid" placeholder="Enter Username" required>-->
<!--            <h3>입력한 아이디 : {{userid}}</h3>-->
<!--            <label ><b>Password</b></label>-->
<!--            <input type="password" @keyup.enter="login"   v-model="passwd" placeholder="Enter Password" id="passwd" required>-->
<!--            <h3>입력한 비번 : {{passwd}}</h3>-->
<!--            <button @click="login"  type="submit">Login</button>-->
<!--            <label>-->
<!--                <input type="checkbox" checked="checked" name="remember"> Remember me-->
<!--            </label>-->
<!--        </div>-->


<!--        <div>-->
<!--            <div id="app">-->
<!--                <v-app id="inspire">-->
<!--                    <ValidationObserver ref="observer" v-slot="{ aa, aa1 }">-->
<!--                        <form>-->
<!--                            <ValidationProvider v-slot="{ a1 }" name="Name" rules="required|max:10">-->
<!--                                <v-text-field-->
<!--                                        v-model="name"-->
<!--                                        :counter="10"-->
<!--                                        :error-messages="a1"-->
<!--                                        label="Name"-->
<!--                                        required-->
<!--                                ></v-text-field>-->
<!--                            </ValidationProvider>-->
<!--                            <ValidationProvider v-slot="{ a2 }" name="email" rules="required|email">-->
<!--                                <v-text-field-->
<!--                                        v-model="email"-->
<!--                                        :error-messages="a2"-->
<!--                                        label="E-mail"-->
<!--                                        required-->
<!--                                ></v-text-field>-->
<!--                            </ValidationProvider>-->
<!--                            <ValidationProvider v-slot="{ a3 }" name="select" rules="required">-->
<!--                                <v-select-->
<!--                                        v-model="select"-->
<!--                                        :items="items"-->
<!--                                        :error-messages="a3"-->
<!--                                        label="Select"-->
<!--                                        data-vv-name="select"-->
<!--                                        required-->
<!--                                ></v-select>-->
<!--                            </ValidationProvider>-->
<!--                            <ValidationProvider v-slot="{ errors, bb1 }" rules="required" name="checkbox">-->
<!--                                <v-checkbox-->
<!--                                        v-model="checkbox"-->
<!--                                        :error-messages="errors"-->
<!--                                        value="1"-->
<!--                                        label="Option"-->
<!--                                        type="checkbox"-->
<!--                                        required-->
<!--                                ></v-checkbox>-->
<!--                            </ValidationProvider>-->

<!--                            <v-btn class="mr-4" @click="submit">submit</v-btn>-->
<!--                            <v-btn @click="clear">clear</v-btn>-->
<!--                        </form>-->
<!--                    </ValidationObserver>-->
<!--                </v-app>-->
<!--            </div>-->
<!--        </div>-->

        <div class="container" style="background-color:#f1f1f1">
            <button type="button" class="cancelbtn">Cancel</button>
            <span class="psw">Forgot <a href="#">password?</a></span>
        </div>

    </div>
</template>

<script>
    // new Vue({
    //     el: '#app',
    //     vuetify: new Vuetify(),
    //     components: {
    //         ValidationProvider,
    //         ValidationObserver,
    //     },
    //     data: () => ({
    //         name: '',
    //         email: '',
    //         select: null,
    //         items: [
    //             'Item 1',
    //             'Item 2',
    //             'Item 3',
    //             'Item 4',
    //         ],
    //         checkbox: null,
    //     }),
    //
    //     methods: {
    //         submit () {
    //             this.$refs.observer.validate()
    //         },
    //         clear () {
    //             this.name = ''
    //             this.email = ''
    //             this.select = null
    //             this.checkbox = null
    //             this.$refs.observer.reset()
    //         },
    //     },
    // })
</script>
