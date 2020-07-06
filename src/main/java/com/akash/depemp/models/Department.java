package com.akash.depemp.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table (value = "Department")
public class Department {
	@Id
	@Column (value = "DepartmentID")
	private int DepartmentID;
	
	@Column (value = "DepartmentName")
	private String DepartmentName;
	
	public int getDepartmentID() {
		return DepartmentID;
	}
	public void setDepartmentID(int departmentID) {
		DepartmentID = departmentID;
	}
	public String getDepartmentName() {
		return DepartmentName;
	}
	public void setDepartmentName(String departmentName) {
		DepartmentName = departmentName;
	}
	@Override
	public String toString() {
		return "Department [DepartmentID=" + DepartmentID + ", DepartmentName=" + DepartmentName + "]";
	}
}
