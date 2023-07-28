package com.auleweb.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.auleweb.model.Event;
import com.auleweb.repository.EventRepository;
import com.auleweb.service.EventService;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class EventServiceImpl implements EventService{
	
	@Autowired
	private EventRepository eventRepository;

	@Override
	public List<Event> getAllEvents() {
		return (List<Event>) eventRepository.findAll();
	}
	
	@Override
	public Optional<Event> getEventById(Long id) {
		return eventRepository.findById(id);
	}

	@Override
	public Event saveOrUpdate(Event event) {
		return eventRepository.save(event);
	}

	@Override
	public void deleteEvent(Long id) {
		eventRepository.deleteById(id);		
	}
}