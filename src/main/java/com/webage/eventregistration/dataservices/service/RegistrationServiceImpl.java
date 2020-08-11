package com.webage.eventregistration.dataservices.service;

import java.util.Collection;
import java.util.Optional;

import com.webage.eventregistration.dataservices.domain.Registration;
import com.webage.eventregistration.dataservices.repository.RegistrationRepository;

public class RegistrationServiceImpl implements RegistrationService {

	private RegistrationRepository registrationRepository;
	
	
	public RegistrationServiceImpl(RegistrationRepository registrationRepository) {
		this.registrationRepository = registrationRepository;
	}

	@Override
	public Collection<Registration> findAll() {
		return registrationRepository.findAll();
	}

	@Override
	public Optional<Registration> findById(Long id) {
		return registrationRepository.findById(id);
	}


}
