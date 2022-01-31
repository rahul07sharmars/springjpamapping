package com.spring.boot.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Course {

	@Id
	@SequenceGenerator(name = "course_sequence", sequenceName = "course_sequence", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "course_sequence")
	private Long courseId;
	private String title;
	private Integer credit;

	@OneToOne(mappedBy = "course"
//	            optional = false
//	after it is comp. to have courseMaterial before adding course, 
	)
	private CourseMaterial courseMaterial;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "teacher_id", referencedColumnName = "teacherId")
	private Teacher teacher;

	@ManyToMany(targetEntity = Student.class)
	@JoinTable(name = "Student_Course_Mapping", joinColumns = @JoinColumn(name = "course_id", referencedColumnName = "courseId"), inverseJoinColumns = @JoinColumn(name = "student_id", referencedColumnName = "studentId"))

	private List<Student> students;

	public void addStudent(Student student) {
		if (student == null)
			students = new ArrayList<>();
		students.add(student);
	}

	public Course(Long courseId, String title, Integer credit, CourseMaterial courseMaterial, Teacher teacher) {
		super();
		this.courseId = courseId;
		this.title = title;
		this.credit = credit;
		this.courseMaterial = courseMaterial;
		this.teacher = teacher;
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

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", title=" + title + ", credit=" + credit + ", courseMaterial="
				+ courseMaterial + ", teacher=" + teacher + "]";
	}

	public Course() {
		super();
	}

}
