package com.parkk.web.Gym;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GymRepository extends JpaRepository<Gym,Long> {
//   public List<GymDTO> findAll(Pager p);
}
