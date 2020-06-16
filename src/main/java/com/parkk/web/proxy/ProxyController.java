package com.parkk.web.proxy;


import com.parkk.web.Gym.GymRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;


@CrossOrigin(origins = "http://localhost:8080", allowedHeaders = "*")
@RestController
public class ProxyController {
    @Autowired Box<Object> box;
    @Autowired Proxy pxy;
    @Autowired GymRepository gymRepository;
    @Autowired FileUploader uploader;
    @PostMapping("/Place")
    public HashMap<String,Object> place(@RequestBody String searchWord){
        pxy.print("넘어온 키워드: "+searchWord);
        box.clear();
        return box.get();
}
    @GetMapping("/gym/{searchWord}")
    public String gym(@PathVariable String searchWord){
        pxy.print("넘어온 키워드 : " + searchWord);
        uploader.upload();
        return null;
    }
}