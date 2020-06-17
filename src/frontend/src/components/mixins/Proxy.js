import axios from "axios";

export const proxy = {
    methods: {
        paging(d) {
        const list = []
        const pages = []
        let temp = {}
        let nowPage = {}

        axios.get(d).then(res => {
            res.data.list.forEach(elem => {
                list.push(elem)
            })
            let pager = res.data.pager
            let i = pager.startPage
            for (; i <= pager.endPage; i++) {
                pages.push(i + 1)
            }
            nowPage = pager.nowPage
            temp.existNext = pager.existNext
            temp.existPrev = pager.existPrev
            temp.nextBlock = pager.nextBlock
            temp.nowBlock = pager.nowBlock
            temp.pageSize = pager.pageSize
            temp.startPage = pager.startPage

        }).catch(() => {
            alert('서버전송실패')
        })

        return {list, pages, temp, nowPage}
    }
}
}








