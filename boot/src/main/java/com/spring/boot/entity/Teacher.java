package com.spring.boot.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;

@Entity

public class Teacher {

	@Id
	@SequenceGenerator(name = "teacher_sequence", sequenceName = "teacher_sequence", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "teacher_sequence")
	private Long teacherId;
	private String firstName;
	private String lastName;

//	@OneToMany(
//			cascade = CascadeType.MERGE,
//			fetch = FetchType.LAZY
//	)
//	@JoinColumn( name = "teacher_id", referencedColumnName = "teacherId")
//	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
//	private List<Course> course;

	@Override
	public String toString() {
		return "Teacher [teacherId=" + teacherId + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

//	public Teacher(Long teacherId, String firstName, String lastName, List<Course> course) {
//		super();
//		this.teacherId = teacherId;
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.course = course;
//	}

	public Long getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(Long teacherId) {
		this.teacherId = teacherId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Teacher(Long teacherId, String firstName, String lastName) {
		super();
		this.teacherId = teacherId;
		this.firstName = firstName;
		this.lastName = lastName;
	}

//	public List<Course> getCourse() {
//		return course;
//	}
//
//	public void setCourse(List<Course> course) {
//		this.course = course;
//	}

}
