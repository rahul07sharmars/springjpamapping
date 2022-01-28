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

@Entity
public class CourseMaterial {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long courseMaterialId;
	private String url;
	
	@OneToOne(//we can define cascading here 
			cascade = CascadeType.ALL,
			//fetch is available there if selected as eager, it will fetch all course data when courseMaterial is fetched
			//better if select as lazy
			fetch = FetchType.LAZY)
	
	@JoinColumn(
			name = "course_id",
			//column acting as forign key
			referencedColumnName = "courseId"
			)
	private Course course;
	public CourseMaterial(Long courseMaterialId, String url, Course course) {
		super();
		this.courseMaterialId = courseMaterialId;
		this.url = url;
		this.course = course;
	}
	public Long getCourseMaterialId() {
		return courseMaterialId;
	}
	public void setCourseMaterialId(Long courseMaterialId) {
		this.courseMaterialId = courseMaterialId;
	}
	
	public CourseMaterial() {
		super();
	}
	public CourseMaterial(Long courseMaterialId, String url) {
		super();
		this.courseMaterialId = courseMaterialId;
		this.url = url;
	}
	public String getUrl() {
		return url;
	}
	@Override
	public String toString() {
		return "CourseMaterial [courseMaterialId=" + courseMaterialId + ", url=" + url + "]";
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	
}
