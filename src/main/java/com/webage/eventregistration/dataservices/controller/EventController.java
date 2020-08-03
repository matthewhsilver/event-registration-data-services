package com.webage.eventregistration.dataservices.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webage.eventregistration.dataservices.domain.Event;
import com.webage.eventregistration.dataservices.service.EventService;

@RestController
@RequestMapping("/events")
public class EventController {

	@Autowired
	private EventService eventService;

	@GetMapping
	public Collection<Event> findAllEvents() {
		return eventService.findAll();
	}

	@GetMapping("/{id}")
	public ResponseEntity<Event> findEventById(@PathVariable("id") Long id) {
		return ResponseEntity.of(eventService.findById(id));
	}

}
