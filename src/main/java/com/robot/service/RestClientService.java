package com.robot.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RestClientService {

	@Autowired
	private RestTemplate restTemplate;
	
	private static final String URL="https://robotstakeover20210903110417.azurewebsites.net/robotcpu";
 
	public List<Object> getListOfRobots(){
		Object[] list = restTemplate.getForObject(URL, Object[].class);
		return Arrays.asList(list);
	}
}
