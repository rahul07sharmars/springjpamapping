package com.spring.boot.entity;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
//write the name of the table
@Table(name="student")
//	uniqueConstraints = @UniqueConstraint(columnNames = "emailId", name = "emailId_unique")


public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long studentId;
	private String firstName;
	private String lastName;
	//write the name of column
	@Column(name="emailId"
//			nullable=false
			)
	private String emailId;
	public Student(Long studentId, String firstName, String lastName, String emailId, String guardianName,
			String guardianEmail, String gurdianMobileNumber) {
		super();
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.guardianName = guardianName;
		this.guardianEmail = guardianEmail;
		this.gurdianMobileNumber = gurdianMobileNumber;
	}
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", firstName=" + firstName + ", lastName=" + lastName + ", emailId="
				+ emailId + ", guardianName=" + guardianName + ", guardianEmail=" + guardianEmail
				+ ", gurdianMobileNumber=" + gurdianMobileNumber + "]";
	}
	private String guardianName;
	private String guardianEmail;
	private String gurdianMobileNumber;
	public Long getStudentId() {
		return studentId;
	}
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
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
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getGuardianName() {
		return guardianName;
	}
	public void setGuardianName(String guardianName) {
		this.guardianName = guardianName;
	}
	public String getGuardianEmail() {
		return guardianEmail;
	}
	public void setGuardianEmail(String guardianEmail) {
		this.guardianEmail = guardianEmail;
	}
	public String getGurdianMobileNumber() {
		return gurdianMobileNumber;
	}
	public void setGurdianMobileNumber(String gurdianMobileNumber) {
		this.gurdianMobileNumber = gurdianMobileNumber;
	}
	
}
