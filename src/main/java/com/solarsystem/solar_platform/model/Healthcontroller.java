package com.solarsystem.solar_platform.model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Healthcontroller {

	
	@GetMapping("/health")
	public String health() {
		return "Solar platform is Running";
	}
}
