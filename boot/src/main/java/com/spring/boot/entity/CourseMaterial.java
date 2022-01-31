package com.spring.boot.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class CourseMaterial {

	@Id
	@SequenceGenerator(name = "course_material_sequence", sequenceName = "course_material_sequence", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "course_material_sequence")
	private Long courseMaterialId;
	private String url;

	@OneToOne(// we can define cascading here
			cascade = CascadeType.MERGE,
			// fetch is available there if selected as eager, it will fetch all course data
			// when courseMaterial is fetched
			// better if select as lazy
			fetch = FetchType.LAZY)

	@JoinColumn(name = "course_id",
			// column acting as forign key
			referencedColumnName = "courseId")
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })

	private Course course;

	public Long getCourseMaterialId() {
		return courseMaterialId;
	}

	public void setCourseMaterialId(Long courseMaterialId) {
		this.courseMaterialId = courseMaterialId;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@JsonManagedReference
	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public CourseMaterial(Long courseMaterialId, String url, Course course) {
		super();
		this.courseMaterialId = courseMaterialId;
		this.url = url;
		this.course = course;
	}

	public CourseMaterial() {
		super();
	}

	@Override
	public String toString() {
		return "CourseMaterial [courseMaterialId=" + courseMaterialId + ", url=" + url + ", course=" + course + "]";
	}

}
