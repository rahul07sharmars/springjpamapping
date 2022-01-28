package com.spring.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.boot.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long>{

}
