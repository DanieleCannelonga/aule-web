package com.auleweb.service;

import java.util.List;

import com.auleweb.model.Course;

public interface CourseService {
	
	public List<Course> getAllCourses();

	Course saveOrUpdate(Course course);

	Course getCourseById(Long idCourse);

	void deleteCourse(Long idCourse);

}