package com.auleweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.auleweb.model.Event;

public interface EventRepository extends JpaRepository<Event, Long> {

}