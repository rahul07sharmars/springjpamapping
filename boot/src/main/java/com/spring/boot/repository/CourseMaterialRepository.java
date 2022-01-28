package com.spring.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.boot.entity.Course;

public interface CourseMaterialRepository extends  JpaRepository<Course, Long>{

}
