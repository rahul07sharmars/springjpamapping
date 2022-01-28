package com.spring.boot.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class CourseMaterial {

	@Id
	private Long courseMaterialId;
	private String url;
	
	@OneToOne
	@JoinColumn(
			name = "course_id",
			//column acting as forign key
			referencedColumnName = "courseId"
			)
	private Course course;
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
