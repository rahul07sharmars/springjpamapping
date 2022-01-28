package com.spring.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.entity.Course;
import com.spring.boot.repository.CourseRepository;
@Service
public class CourseServiceImp implements CourseService{

	@Autowired
	private CourseRepository courseRepository;
	@Override
	public List<Course> fetchCourse() {
		// TODO Auto-generated method stub
		return courseRepository.findAll();
	}

	@Override
	public Course saveCourse(Course course) {
		// TODO Auto-generated method stub
		return courseRepository.save(course);
	}

}
