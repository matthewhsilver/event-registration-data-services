package com.webage.eventregistration.dataservices.repository;

import org.springframework.data.repository.CrudRepository;

import com.webage.eventregistration.dataservices.domain.Registration;

public interface RegistrationRepository extends CrudRepository<Registration, Long> {

}
