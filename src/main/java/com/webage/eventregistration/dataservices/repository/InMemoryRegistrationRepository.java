package com.webage.eventregistration.dataservices.repository;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import com.webage.eventregistration.dataservices.domain.Registration;

public class InMemoryRegistrationRepository implements RegistrationRepository {

	private static List<Registration> RegistrationData = new ArrayList<>(Arrays.asList(
				new Registration(1L, 1L, 1L, LocalDate.of(2020, Month.JUNE, 5), ""),
				new Registration(2L, 2L, 2L, LocalDate.of(2020, Month.JULY, 10), ""),
				new Registration(3L, 3L, 3L, LocalDate.of(2020, Month.JULY, 21), "")

			));

	@Override
	public Collection<Registration> findAll() {
		return Collections.unmodifiableCollection(RegistrationData);
	}

	@Override
	public Optional<Registration> findById(Long id) {
		return RegistrationData.stream().filter(c -> id.equals(c.getId())).findFirst();
	}

}
