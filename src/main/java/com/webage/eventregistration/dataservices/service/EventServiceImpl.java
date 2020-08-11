package com.webage.eventregistration.dataservices.service;

import java.util.Optional;

import com.webage.eventregistration.dataservices.domain.Event;
import com.webage.eventregistration.dataservices.repository.EventRepository;

public class EventServiceImpl implements EventService {

	private EventRepository eventRepository;
	
	
	public EventServiceImpl(EventRepository eventRepository) {
		this.eventRepository = eventRepository;
	}


	@Override
	public Iterable<Event> findAll() {
		return eventRepository.findAll();
	}


	@Override
	public Optional<Event> findById(Long id) {
		return eventRepository.findById(id);
	}


	@Override
	public Event saveEvent(Event event) {
		return eventRepository.save(event);
	}


	@Override
	public void deleteEvent(Long id) {
		eventRepository.deleteById(id);
	}
	
}
