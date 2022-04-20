package com.robot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.robot.entity.Survivor;
import com.robot.service.RestClientService;
import com.robot.service.SurvivorService;

@RestController
@RequestMapping(value = "/v1")
public class RobotController {

	@Autowired
	private RestClientService restClientService;

	@Autowired
	private SurvivorService survivorService;

	@PostMapping(value = "/saveSurvivor")
	public void save(@RequestBody Survivor survivor) {
		survivorService.saveSurvivore(survivor);
	}

	@GetMapping("/listOfSurvivors/{flag}")
	public ResponseEntity<List<Survivor>> getListOfInfectedSurvivors(@PathVariable("flag") String flag) {
		return new ResponseEntity<List<Survivor>>(survivorService.findSurvivors(flag), HttpStatus.OK);
	}

	/*
	 * @GetMapping("/listOfNonInfectedSurvivors/{flag}") public
	 * ResponseEntity<List<Survivor>>
	 * getListOfNonInfectedSurvivors(@PathVariable("flag") String flag) { return new
	 * ResponseEntity<List<Survivor>>(survivorService.findNonInfectedSurvivors(flag)
	 * , HttpStatus.OK); }
	 */

	@GetMapping("/survivorsPercentage/{flag}")
	public ResponseEntity<String> nonInfectedSurvivorsPercentage(@PathVariable("flag") String flag) {
		return new ResponseEntity<String>(survivorService.survivorsPercentage(flag), HttpStatus.OK);
	}

	/*
	 * @GetMapping("/infectedSurvivorsPercentage/{flag}") public
	 * ResponseEntity<String> infectedSurvivorsPercentage(@PathVariable("flag")
	 * String flag) { return new
	 * ResponseEntity<String>(survivorService.infectedPercentage(flag),
	 * HttpStatus.OK); }
	 */

	@GetMapping("/getAllRobots")
	public ResponseEntity<List<Object>> getAllRobots() {
		return new ResponseEntity<List<Object>>(restClientService.getListOfRobots(), HttpStatus.OK);
	}

}
