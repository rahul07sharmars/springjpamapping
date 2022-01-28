package com.spring.boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import com.spring.boot.entity.CourseMaterial;
import com.spring.boot.repository.CourseMaterialRepository;
@Service
public class CourseMaterialServiceImp implements CourseMaterialService{

	@Autowired
	private CourseMaterialRepository courseMaterialRepository;
	@Override
	public List<CourseMaterial> fetchCourseMaterial() {
		// TODO Auto-generated method stub
		return courseMaterialRepository.findAll();
	}

	@Override
	public CourseMaterial saveCourseMaterial(CourseMaterial courseMaterial) {
		// TODO Auto-generated method stub
		return courseMaterialRepository.save(courseMaterial);
	}
	
	
	
	

}
