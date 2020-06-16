package com.parkk.web.proxy;

import com.parkk.web.Gym.Gym;
import com.parkk.web.Gym.GymDTO;
import com.parkk.web.Gym.GymRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

@Service("loder") @Lazy
public class FileUploader extends Proxy {
    @Autowired GymDTO ser_Num;
    @Autowired Inventory<String> inventory;
    @Autowired GymDTO gymDTO;
    @Autowired GymRepository gymRepository;

    public void upload (){
        inventory.clear();
        try{
            BufferedReader reader = new BufferedReader(
                    new FileReader(
                            new File("/Users/apple/Desktop/gym4.txt")));
//                         \Users\apple\IdeaProjects\health2\src\main\resources\healthclub\gym2.txt
            String gym = "";
            while(( gym = reader.readLine())!=null){
                inventory.add(gym);
            }
        }catch(Exception e){
            print("파일 리딩 에러");
            e.printStackTrace();

        }
        print("-------------------------------");
        print(inventory.get().get(0).toString());
        String[] arr = inventory.get().get(0).split(",");
        //"2000003","유동우","K10","YOU,  DONGWOO","","","DF","40","","07-MAR-1978","1","177","70"


        Gym p = new Gym();
        p.setSer_Num(arr[1]);
        p.setOpen_YN(arr[2]);
        p.setNumber(arr[3]);
        p.setAddress(arr[4]);
        p.setMailing_address(arr[5]);
        p.setName(arr[6]);


        print("************************************");
        print(ser_Num.toString());
        gymRepository.save(p);
    }

}
