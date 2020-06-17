package com.parkk.web.Gym;

import com.parkk.web.proxy.Box;
import com.parkk.web.Pager.Pager;
import com.parkk.web.proxy.IFunction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.parkk.web.proxy.Proxy;

import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/GYM")
public class GymController {
    @Autowired GymRepository gymRepository;
    @Autowired Proxy pxy;
    @Autowired Box box;


    @GetMapping("/{searchWord}")
    public Map<?,?> list(@PathVariable String searchWord) {
        System.out.println(searchWord);
        pxy.print("넘어옴");
        List<Gym> list = gymRepository.findAll();
        List<Gym2> list2 = gymRepository.findAll2();
        List<Gym3> list3 = gymRepository.findAll3();
        box.clear();
        box.put("list", list);
        box.put("list", list2);
        box.put("list", list3);

        return box.get();
    }
//    @GetMapping("/{searchWord}")
//    public Map<?,?> list2(@PathVariable String searchWord) {
//        System.out.println(searchWord);
//        pxy.print("넘어옴");
//        List<Gym2> list2 = gymRepository.findAll2();
//        List<Gym3> list3 = gymRepository.findAll3();
//        box.clear();
//        box.put("list", list2);
//        return box.get();
//    }
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
