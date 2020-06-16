package com.parkk.web.Gym;


import com.parkk.web.proxy.Pager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GymRepository extends JpaRepository<Gym,Long> {
   public List<GymDTO> findAll(Pager p);
}
