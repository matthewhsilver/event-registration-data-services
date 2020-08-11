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

import com.webage.eventregistration.dataservices.domain.Event;
import com.webage.eventregistration.dataservices.domain.Event;
import com.webage.eventregistration.dataservices.service.EventService;
import com.webage.eventregistration.dataservices.util.Utils;

@RestController
@RequestMapping("/events")
public class EventController {

	@Autowired
	private EventService eventService;
	
	@GetMapping
	public Iterable<Event> findAllEvents() {
		return eventService.findAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Event> findEventById(@PathVariable("id") Long id) {
		return ResponseEntity.of(eventService.findById(id));
	}
	
	@PostMapping
	public ResponseEntity<?> addEvent(@RequestBody Event event) {
		if (!event.getId().equals(0L) ||
				Utils.isEmpty(event.getCode()) ||
				Utils.isEmpty(event.getTitle()) ||
				Utils.isEmpty(event.getDescription())) {
			return ResponseEntity.badRequest().build();
		}
		
		Event newEvent = eventService.saveEvent(event);
		
		URI location = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(newEvent.getId())
				.toUri();
		
		return ResponseEntity.created(location).build();
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> updateEvent(@PathVariable("id") Long id, @RequestBody Event event) {
		if (!event.getId().equals(id) ||
				Utils.isEmpty(event.getCode()) ||
				Utils.isEmpty(event.getTitle()) ||
				Utils.isEmpty(event.getDescription())) {
			return ResponseEntity.badRequest().build();
		}
		
		eventService.saveEvent(event);
		
		return ResponseEntity.noContent().build();
	}
	
	@DeleteMapping("/{id}") 
	public ResponseEntity<?> deleteEvent(@PathVariable("id") Long id) {
		if (id.equals(0L)) {
			return ResponseEntity.badRequest().build();
		}
		
		ResponseEntity<?> response;
		
		try {
			eventService.deleteEvent(id);
			response = ResponseEntity.noContent().build();
		} catch (Exception e) {
			e.printStackTrace();
			response = new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return response;
	}
	
}
