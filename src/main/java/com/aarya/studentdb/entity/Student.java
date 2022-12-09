package com.aarya.studentdb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student3")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column 
	private Integer studRollNo;
	@Column
	private String studName;
	@Column
	private String address;
	@Column
	private String studClass;
	
	public Student(String studName, String address, String studClass) {
		super();
		this.studName = studName;
		this.address = address;
		this.studClass = studClass;
	}
	public Student() {
		super();
	}
	public Integer getStudRollNo() {
		return studRollNo;
	}
	public void setStudRollNo(Integer studRollNo) {
		this.studRollNo = studRollNo;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getStudClass() {
		return studClass;
	}
	public void setStudClass(String studClass) {
		this.studClass = studClass;
	}
	@Override
	public String toString() {
		return "Student [studRollNo=" + studRollNo + ", studName=" + studName + ", address=" + address + ", studClass="
				+ studClass + "]";
	}
	
	
}
