package com.webage.eventregistration.dataservices.service;

import java.util.Collection;
import java.util.Optional;

import com.webage.eventregistration.dataservices.domain.Registration;

public interface RegistrationService {

	public Collection<Registration> findAll();

	public Optional<Registration> findById(Long id);

}
