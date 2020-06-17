package com.parkk.web.Gym;

import com.parkk.web.proxy.Box;
import com.parkk.web.Pager.Pager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.parkk.web.proxy.Proxy;

import java.util.Map;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("GYM")
public class GymController {
    @Autowired GymRepository gymRepository;
    @Autowired Proxy pxy;
    @Autowired Box box;
    @Autowired Pager pager;


    @GetMapping("/{searchWord}/{pageNumber}")
    public Map<?,?> list(@PathVariable String searchWord,
                         @PathVariable String pageNumber) {
        System.out.println(searchWord);
        if (searchWord.equals(null)) {
            pxy.print("검색어가 없음");
        } else {
            pxy.print("검색어가 " + searchWord);
        }
//        pager.setNowPage(pxy.integer(pageNumber));
//        pager.setBlockSize(5);
//        pager.setPageSize(5);
//        pager.paging();
//        IFunction<Pager, List<GymDTO>> f = p ->  gymRepository.findAll(p);
//        List<GymDTO> list = f.apply(pager);
//        pxy.print("***********");
//        for(GymDTO g : list){
//        pxy.print(g.toString());

//    }
//        box.clear();
//        box.put("pager", pager);
//        box.put("list", list);
        return box.get();
    }
}


//    @GetMapping("/{searchWord}")
//    public HashMap<String, Object> gym(@PathVariable String searchWord){
//        pxy.print("넘어온 키워드: "+searchWord);
//        if(gymRepository.count() == 0) gymRepository.findAll();
//        List<Gym> list = gymRepository.findAll();
//        box.put("count", list.size());
//        box.put("list", list);
//        pxy.print("조회한 수: "+list.size());
//        return gymRepository.get();
