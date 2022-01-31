package com.spring.boot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Course {

	@Id
	@SequenceGenerator(
            name = "course_sequence",
            sequenceName = "course_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "course_sequence"
    )
	private Long courseId;
	private String title;
	private Integer credit;
	
	 
	@OneToOne(
	            mappedBy = "course"
	    )
	private CourseMaterial courseMaterial;
	
	public Course(Long courseId, String title, Integer credit, CourseMaterial courseMaterial) {
		super();
		this.courseId = courseId;
		this.title = title;
		this.credit = credit;
		this.courseMaterial = courseMaterial;
	}
	@JsonBackReference
	public CourseMaterial getCourseMaterial() {
		return courseMaterial;
	}
	public void setCourseMaterial(CourseMaterial courseMaterial) {
		this.courseMaterial = courseMaterial;
	}
	public Long getCourseId() {
		return courseId;
	}
	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getCredit() {
		return credit;
	}
	public void setCredit(Integer credit) {
		this.credit = credit;
	}
	
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", title=" + title + ", credit=" + credit + ", courseMaterial="
				+ courseMaterial + "]";
	}
	public Course() {
		super();
	}
	
}
