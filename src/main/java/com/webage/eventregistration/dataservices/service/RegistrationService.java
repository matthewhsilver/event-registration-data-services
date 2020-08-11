package com.webage.eventregistration.dataservices.service;

import java.util.Optional;

import com.webage.eventregistration.dataservices.domain.Registration;

public interface RegistrationService {

	public Iterable<Registration> findAll();

	public Optional<Registration> findById(Long id);

}
