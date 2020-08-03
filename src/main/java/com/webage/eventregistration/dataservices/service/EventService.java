package com.webage.eventregistration.dataservices.service;

import java.util.Collection;
import java.util.Optional;

import com.webage.eventregistration.dataservices.domain.Event;

public interface EventService {

	public Collection<Event> findAll();

	public Optional<Event> findById(Long id);

}
