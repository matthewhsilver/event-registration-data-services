package com.webage.eventregistration.dataservices.repository;

import java.util.Collection;
import java.util.Optional;

import com.webage.eventregistration.dataservices.domain.Event;

public interface EventRepository {

	public Collection<Event> findAll();
	
	public Optional<Event> findById(Long id);
	
}
