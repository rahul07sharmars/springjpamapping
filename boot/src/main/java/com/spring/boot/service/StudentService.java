package com.spring.boot.service;

import java.util.List;

import com.spring.boot.entity.Student;

public interface StudentService {

	public List<Student> fetchStudent();

	public List<Student> saveAll(List<Student> studentList);

	public Student saveStudent(Student student);

	public List<Student> findStudentByFirstName(String firstName);

	public Student deleteStudent(Long studentId);

}
