package com.auleweb.service;

import java.util.List;

import com.auleweb.model.Event;

public interface EventService {
	
	public List<Event> getAllEvents();

	Event saveOrUpdate(Event event);

	Event getEventById(Long idEvent);

	void deleteEvent(Long idEvent);

}
