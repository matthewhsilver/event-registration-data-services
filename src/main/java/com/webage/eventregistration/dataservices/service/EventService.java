package com.webage.eventregistration.dataservices.service;

import java.util.Optional;

import com.webage.eventregistration.dataservices.domain.Customer;
import com.webage.eventregistration.dataservices.domain.Event;

public interface EventService {

	public Iterable<Event> findAll();

	public Optional<Event> findById(Long id);
	
	public Event saveEvent(Event event);
	
	public void deleteEvent(Long id);

}
