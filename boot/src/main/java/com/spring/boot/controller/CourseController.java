package com.spring.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.spring.boot.entity.Course;
import com.spring.boot.service.CourseService;

@RestController
public class CourseController {

	@Autowired
	private CourseService courseService;
	@GetMapping("/course")
	public List<Course> fetchCourse() {
		return courseService.fetchCourse();
	}
	@PostMapping("/course")
	public Course saveCourse(@RequestBody Course course) {
		return courseService.saveCourse(course);
	}
}
