package com.spring.boot.service;

import java.util.List;

import com.spring.boot.entity.Course;

public interface CourseService {

	public List<Course> fetchCourse();

	public Course saveCourse(Course course);

	public Course deleteCourse(Long courseId);

}
