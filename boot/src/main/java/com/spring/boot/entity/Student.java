package com.spring.boot.entity;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
//write the name of the table
@Table(name="student",
	uniqueConstraints = @UniqueConstraint(columnNames = "emailId", name = "emailId_unique")
		)
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long studentId;
	private String firstName;
	private String lastName;
	//write the name of column
	@Column(name="emailId",
			nullable=false)
	private String emailId;
	private String guardianName;
	private String guardianemail;
	private String gurdianMobileNumber;
	
}
