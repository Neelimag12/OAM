package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Courses;

public interface CoursesService {
	
	List<Courses> showAllCourses();

	String deleteCourse(Integer id);

	Courses addCourse(Courses courses);

	Courses updateCourses(Courses courses);

	Courses showCourseById(Integer id);
}
