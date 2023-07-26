package com.auleweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.auleweb.model.CourseEvent;

public interface CourseEventRepository extends JpaRepository<CourseEvent, Long> {

}