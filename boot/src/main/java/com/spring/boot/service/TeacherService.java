package com.spring.boot.service;

import java.util.List;

import com.spring.boot.entity.Teacher;

public interface TeacherService {

	public List<Teacher> fetchTeacher();

	public Teacher saveTeacher(Teacher teacher);

}
