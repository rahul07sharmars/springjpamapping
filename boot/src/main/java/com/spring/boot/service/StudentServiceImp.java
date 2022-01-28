package com.spring.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.entity.Student;
import com.spring.boot.repository.StudentRepository;
@Service
public class StudentServiceImp implements StudentService{

	@Autowired
	private StudentRepository studentRepository;
	@Override
	public List<Student> fetchStudent() {
		
		return studentRepository.findAll();
	}

	@Override
	public List<Student> saveAll(List<Student> studentList) {
		// TODO Auto-generated method stub
//		for (Student student : studentList) {
//			
//		}
		return studentRepository.saveAll(studentList);
	}

	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		System.out.println(student.toString());
		return studentRepository.save(student);
	}

	@Override
	public List<Student> findStudentByFirstName(String firstName) {
		// TODO Auto-generated method stub
		return null;
	}

}
