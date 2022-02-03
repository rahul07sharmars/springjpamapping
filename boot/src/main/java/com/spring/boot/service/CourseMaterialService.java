package com.spring.boot.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.boot.entity.CourseMaterial;

public interface CourseMaterialService {

	public List<CourseMaterial> fetchCourseMaterial();

	public CourseMaterial saveCourseMaterial(CourseMaterial courseMaterial);

	

	public CourseMaterial deleteCourseMaterial(Long courseMaterialId);

	
	
}
