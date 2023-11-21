package com.deloitte.springboot.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "department")
public class Department {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 @Column(name = "department_id")
 private Long departmentId;
 @Column(name = "department_name")
 private String departmentName;
 
 
public Department(Long departmentId, String departmentName) {
	super();
	this.departmentId = departmentId;
	this.departmentName = departmentName;
}

public Department() {
	
}
public Long getDepartmentId() {
	return departmentId;
}
public void setDepartmentId(Long departmentId) {
	this.departmentId = departmentId;
}
public String getDepartmentName() {
	return departmentName;
}
public void setDepartmentName(String departmentName) {
	this.departmentName = departmentName;
}


}

