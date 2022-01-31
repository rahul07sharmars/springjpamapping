package com.spring.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.boot.entity.Teacher;
@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long>{

}
