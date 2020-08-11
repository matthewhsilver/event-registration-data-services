package com.webage.eventregistration.dataservices.repository;

import org.springframework.data.repository.CrudRepository;

import com.webage.eventregistration.dataservices.domain.Event;

public interface EventRepository extends CrudRepository<Event, Long> {

}
