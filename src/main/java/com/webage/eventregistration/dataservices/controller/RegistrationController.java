package com.webage.eventregistration.dataservices.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.webage.eventregistration.dataservices.domain.Registration;
import com.webage.eventregistration.dataservices.service.RegistrationService;
import com.webage.eventregistration.dataservices.util.Utils;

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
	
	@PostMapping
	public ResponseEntity<?> addRegistration(@RequestBody Registration registration) {
		if (!registration.getId().equals(0L) ||
				registration.getEventId().equals(0L) ||
				registration.getCustomerId().equals(0L) ||
				registration.getRegistrationDate() == null ||
				Utils.isEmpty(registration.getNotes())) {
			return ResponseEntity.badRequest().build();
		}
		
		Registration newRegistration = registrationService.saveRegistration(registration);
		
		URI location = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(newRegistration.getId())
				.toUri();
		
		return ResponseEntity.created(location).build();
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> updateRegistration(@PathVariable("id") Long id, @RequestBody Registration registration) {
		if (!registration.getId().equals(id) ||
				registration.getEventId().equals(0L) ||
				registration.getCustomerId().equals(0L) ||
				registration.getRegistrationDate() == null ||
				Utils.isEmpty(registration.getNotes())) {
			return ResponseEntity.badRequest().build();
		}
		
		registrationService.saveRegistration(registration);
		
		return ResponseEntity.noContent().build();
	}
	
	@DeleteMapping("/{id}") 
	public ResponseEntity<?> deleteRegistration(@PathVariable("id") Long id) {
		if (id.equals(0L)) {
			return ResponseEntity.badRequest().build();
		}
		
		ResponseEntity<?> response;
		
		try {
			registrationService.deleteRegistration(id);
			response = ResponseEntity.noContent().build();
		} catch (Exception e) {
			e.printStackTrace();
			response = new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return response;
	}
	
}
