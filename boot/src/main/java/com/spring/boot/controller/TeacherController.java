package com.spring.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.spring.boot.entity.Student;
import com.spring.boot.entity.Teacher;
import com.spring.boot.service.TeacherService;


@RestController
@RequestMapping()
public class TeacherController {

	@Autowired
	private TeacherService teacherService;
	@GetMapping("/teacher")
	private List<Teacher> fetchTeacher(){
		return teacherService.fetchTeacher();
	}
	@PostMapping("/teacher")
	private Teacher saveTeacher(@RequestBody Teacher teacher) {
		return teacherService.saveTeacher(teacher);
	}
	@DeleteMapping("/teacher/delete/{id}")
	public Teacher deleteTeacher(@PathVariable("id") Long teacherId) {
		return teacherService.deleteTeacher(teacherId);
	}
}
