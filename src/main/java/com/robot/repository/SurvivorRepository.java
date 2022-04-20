package com.robot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.robot.entity.Survivor;

public interface SurvivorRepository extends JpaRepository<Survivor, Integer>{
	
    List<Survivor> findByflag(String flag);
}
