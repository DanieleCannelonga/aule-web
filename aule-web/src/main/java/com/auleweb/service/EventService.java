package com.auleweb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.auleweb.model.Event;

@Service
public interface EventService {
	
	public List<Event> getAllEvents();

	Event saveOrUpdate(Event event);

	Optional<Event> getEventById(Long idEvent);

	void deleteEvent(Long idEvent);

}
