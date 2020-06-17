import router from "@/router";
import axios from 'axios'

const state ={
    context : "http://localhost:5000",
    searchWord : 'null',
    gyms : [],

}
const actions ={
    async find({commit},searchWord){
        alert('>>> '+searchWord)
        commit("GYM",searchWord)
        axios.get(state.context+"/GYM/"+searchWord)
            .then(({data})=>{
                alert('검색된 결과 수 :'+data.count)
                commit('GYM',data)
                router.push('/gym')
        }).catch( error =>{
            alert(`통신실패입니다 :: ${error}`)
        })
    }
}
const mutations ={
    GYM(state, data){
        console.log('데이터'+JSON.stringify(data))
        alert('뮤테이션 접속' + data.count);
        alert('리스트'+ data.list);
        console.log('aaa')
        state.gyms = []
        state.count = data.count;
        alert('data')
        // data.list.forEach(item =>{state.gyms.push({
        //     ser_Num: item.ser_Num,
        //     open_YN: item.open_YN,
        //     number : item.number,
        //     address: item.address,
        //     mailing_address: item.mailing_address,
        //     name : item.name,
        // });
        // alert("qwe")
        // });
    },
}
const getters ={
    gym: state => state.gym,
    count :state => state.count
}



export default {
    name:"gym",
    namespaced: true,
    state,
    actions,
    mutations,
    getters

}