package com.robot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.robot.entity.Survivor;
import com.robot.repository.SurvivorRepository;

@Service
public class SurvivorService {

	@Autowired
	private SurvivorRepository repository;

	public void saveSurvivore(Survivor survivor) {
		repository.save(survivor);
	}

	public List<Survivor> findSurvivors(String flag) {
		return repository.findByflag(flag.toLowerCase());
	}

	public String survivorsPercentage(String flag) {
		int totalCount = repository.findAll().size();
		int infectedSurvivorsCount = repository.findByflag(flag.toLowerCase()).size();
		float percentage = infectedSurvivorsCount * 100 / totalCount;
		return percentage + "%";

	}
	
}
