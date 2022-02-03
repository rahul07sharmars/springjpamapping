package com.spring.boot.controller;

import com.spring.boot.entity.CourseMaterial;
import com.spring.boot.entity.Student;
import com.spring.boot.service.StudentService;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController()
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	@GetMapping("/student")
	public List<Student> fetchStudent(){
		return studentService.fetchStudent();	
	}
	@GetMapping("/student/firstname/{firstname}")
	public List<Student> findStudentByFirstName(@PathVariable("firstname") String firstName){
		return studentService.findStudentByFirstName(firstName);
	}
	@PostMapping("/student/all")
	public List<Student> saveAll(@RequestBody List<Student> studentList){
		return studentService.saveAll(studentList);
	}
	@PostMapping("/student")
	public Student save(@RequestBody Student student) {
		return studentService.saveStudent(student);
	}
	@DeleteMapping("/student/delete/{id}")
	public Student deleteStudent(@PathVariable("id") Long studentId) {
		return studentService.deleteStudent(studentId);
	}
	
}
