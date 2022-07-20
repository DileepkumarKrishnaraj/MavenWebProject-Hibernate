package com.samco.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TRAINEE_DETAILS")
public class SamcoTrainee {
	
	@Id
	@Column(name = "EMP_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empId;
	@Column(name = "EMP_NAME")                   
	private String name;
	@Column(name = "EMP_EMAIL")
	private String email;
	@Column(name = "EMP_PHONE_NUMBER")
	private String phoneNum;
	@Column(name = "EMP_DATE_OF_BIRTH")
	private String dob;
	public SamcoTrainee() {
		super();
	}
	public SamcoTrainee(String name, String email, String phoneNum, String dob) {
		super();
		this.name = name;
		this.email = email;
		this.phoneNum = phoneNum;
		this.dob = dob;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	
}
