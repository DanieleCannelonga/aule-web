package com.auleweb.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.auleweb.model.Event;
import com.auleweb.service.EventService;

@RestController
@RequestMapping("/events")
public class EventController {

	@Autowired
	private EventService eventService;
	
	@GetMapping
	public ResponseEntity<List<Event>> getAllEvents(){
		return ResponseEntity.ok(eventService.getAllEvents());
	}
	
	@GetMapping("/{id}")
    public ResponseEntity<Optional<Event>> eventById(@PathVariable Long id) {
        return ResponseEntity.ok(eventService.getEventById(id));
    }
	
	@PostMapping
    public ResponseEntity<Event> createEvent(@RequestBody Event event) {
		Event createdEvent = eventService.saveOrUpdate(event);
        return ResponseEntity.ok(createdEvent);
    }

	@PutMapping("/{id}")
    public ResponseEntity<Event> updateEvent(@PathVariable Long id, @RequestBody Event event) {
		event.setId(id);
        Event updatedEvent = eventService.saveOrUpdate(event);
        return ResponseEntity.ok(updatedEvent);
    }
	
	@DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEventById(@PathVariable Long id) {
		eventService.deleteEvent(id);
        return ResponseEntity.noContent().build();
    }
}
