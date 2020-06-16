package com.parkk.web.mappers;

import com.parkk.web.Gym.GymDTO;
import com.parkk.web.proxy.Pager;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GymMapper {
    public void insertGym(GymDTO gym);
    public void updateGym(GymDTO gym);
    public void deleteGym(GymDTO gym);
    public GymDTO selectGym(String gymNo);
    public List<GymDTO> selectGyms(Pager pager);
    public int count();
}
