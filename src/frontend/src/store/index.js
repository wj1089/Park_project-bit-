import Vue from 'vue'
import Vuex from 'vuex'
import gym from "./gym";


Vue.use(Vuex)

export const store = new Vuex.Store({
    modules:{
        gym
    }
})