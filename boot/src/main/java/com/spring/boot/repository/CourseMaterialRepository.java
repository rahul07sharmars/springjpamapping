package com.spring.boot.repository;

import java.util.*;
import com.spring.boot.entity.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CourseMaterialRepository extends  JpaRepository<CourseMaterial, Long>{

	public List<CourseMaterial> findAll();
}
