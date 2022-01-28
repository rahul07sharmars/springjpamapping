package com.spring.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import com.spring.boot.entity.Course;
import com.spring.boot.entity.CourseMaterial;
import com.spring.boot.service.CourseMaterialService;


@RestController
public class CourseMaterialController {

	@Autowired
	private CourseMaterialService courseMaterialService;
	
	@GetMapping("/courseMaterial")
	public List<CourseMaterial> fetchCourseMaterial() {
		return courseMaterialService.fetchCourseMaterial();
	}
	
	@PostMapping("/courseMaterial")
	public CourseMaterial saveCourseMaterial(@RequestBody CourseMaterial courseMaterial) {
		return courseMaterialService.saveCourseMaterial(courseMaterial);
	}
}
