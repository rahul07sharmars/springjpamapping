package com.spring.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.entity.Student;
import com.spring.boot.entity.Teacher;
import com.spring.boot.repository.TeacherRepository;

@Service
public class TeacherServiceImp implements TeacherService{

	@Autowired
	private TeacherRepository teacherRepository;
	@Override
	public List<Teacher> fetchTeacher() {
		// TODO Auto-generated method stub
		return teacherRepository.findAll();
	}

	@Override
	public Teacher saveTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		return teacherRepository.save(teacher);
	}

	@Override
	public Teacher deleteTeacher(Long teacherId) {
		// TODO Auto-generated method stub
		Teacher teacher=teacherRepository.findById(teacherId).get();
		teacherRepository.deleteById(teacherId);
		return teacher;
	}

}
