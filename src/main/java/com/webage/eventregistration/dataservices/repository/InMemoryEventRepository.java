package com.webage.eventregistration.dataservices.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import com.webage.eventregistration.dataservices.domain.Event;

public class InMemoryEventRepository implements EventRepository {

	private static List<Event> EventData = new ArrayList<>(Arrays.asList(
				new Event(1L, "JAVA14", "New Features in Java 14", "This webinar will cover new features in Java 14, such as records."),
				new Event(2L, "ANG10", "Upgrading to Angular 10", "This webinar will cover how to upgrade from Angular 6 and above to Angular 10 using a real world project."),
				new Event(3L, "DEVOPS", "Introduction to DevOps", "This webinar will cover what DevOps is and some technolgoies, such as Git, Jenkins, Docker and Kubernetes.")
			));

	@Override
	public Collection<Event> findAll() {
		return Collections.unmodifiableCollection(EventData);
	}

	@Override
	public Optional<Event> findById(Long id) {
		return EventData.stream().filter(c -> id.equals(c.getId())).findFirst();
	}

}
