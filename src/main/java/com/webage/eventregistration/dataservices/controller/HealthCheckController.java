package com.webage.eventregistration.dataservices.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HealthCheckController {

	@RequestMapping
	public String getStatus() {
		return "Event registration data services is running";
	}
}
