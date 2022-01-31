package com.spring.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.spring.boot.entity.Teacher;
import com.spring.boot.service.TeacherService;


@RestController
@RequestMapping("/teacher")
public class TeacherController {

	@Autowired
	private TeacherService teacherService;
	@GetMapping()
	private List<Teacher> fetchTeacher(){
		return teacherService.fetchTeacher();
	}
	@PostMapping()
	private Teacher saveTeacher(@RequestBody Teacher teacher) {
		return teacherService.saveTeacher(teacher);
	}
}
