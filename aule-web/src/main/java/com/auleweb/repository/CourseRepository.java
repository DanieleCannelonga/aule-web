package com.auleweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.auleweb.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
	
}