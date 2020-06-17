import router from "@/router";

const state ={
    context : "http://localhost:5000",
    searchWord : 'null',
    gyms : [],

}
const actions ={
    async find({commit},searchWord){
        alert('>>> '+searchWord)
        commit("GYM",searchWord)
        switch (searchWord) {
            case '종로구': router.push("/Gym")
                break
            case '용산구': router.push("/Gym")
                break
            case '중구': router.push("/Gym")
                break
        }
    },
}
const mutations ={
    GYM(state, data){
        alert('뮤테이션 접속' + data.count);
        console.log('aaa')
        state.gyms = []
        state.count = data.count;
        alert('asdffrf')
        data.list.forEach(item =>{state.gyms.push({
            ser_Num: item.ser_Num,
            open_YN: item.open_YN,
            number : item.number,
            address: item.address,
            mailing_address: item.mailing_address,
            name : item.name,
        });
        });
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