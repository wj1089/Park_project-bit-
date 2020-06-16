package com.parkk.web.Gym;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class GymServiceImpl implements GymService {
    GymRepository gymRepository;


    public List<Gym> selectAll(){

        return gymRepository.findAll();
    }
}
