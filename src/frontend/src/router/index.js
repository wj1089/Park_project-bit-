import Vue from 'vue'
import Router from 'vue-router'
import GymHome from '@/components/common/GymHome'
import Mypage from '@/components/user/MyPage'
import Login from '@/components/user/Login'
import Join from '@/components/user/Join'
import Place from '@/components/user/Place'
import test from "../components/test";
import Layout from "../components/common/Layout";
import Logout from "../components/common/Logout";



Vue.use(Router)
export default new Router( {
    mode: 'history',
    routes : [
        {path: '/',component: GymHome},
        {path: '/Login', component: Login},
        {path: '/Mypage', component: Mypage},
        {path: '/Join', component: Join},
        {path: '/Place', component: Place},
        {path: '/test', component: test},
        {path: '/test', component: test},
        {path: '/Layout', component: Layout},
        {path: '/Logout', component: Logout}

    ]
})


