package com.parkk.web.mappers;

import com.parkk.web.Gym.GymDTO;
import com.parkk.web.proxy.Pager;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GymMapper {
    public GymDTO selectGym(String name);
    public List<GymDTO> selectReviews(Pager pager);
    public int count();
}
