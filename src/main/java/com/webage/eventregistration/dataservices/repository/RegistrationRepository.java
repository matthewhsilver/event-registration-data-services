package com.webage.eventregistration.dataservices.repository;

import java.util.Collection;
import java.util.Optional;

import com.webage.eventregistration.dataservices.domain.Registration;

public interface RegistrationRepository {

	public Collection<Registration> findAll();

	public Optional<Registration> findById(Long id);

}
