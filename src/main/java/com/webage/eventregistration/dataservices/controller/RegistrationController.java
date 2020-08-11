package com.webage.eventregistration.dataservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webage.eventregistration.dataservices.domain.Registration;
import com.webage.eventregistration.dataservices.service.RegistrationService;

@RestController
@RequestMapping("/registrations")
public class RegistrationController {

	@Autowired
	private RegistrationService registrationService;
	
	@GetMapping
	public Iterable<Registration> findAllRegistrations() {
		return registrationService.findAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Registration> findRegistrationById(@PathVariable("id") Long id) {
		return ResponseEntity.of(registrationService.findById(id));
	}
	
}
