package com.akash.depemp.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table (value = "Employee")
public class Employee {
	@Id
	@Column (value = "EmployeeId")
	private int EmployeeId;
	
	@Column (value = "EmployeeName")
	private String EmployeeName;
	
	@Column (value = "Department")
	private String Department;
	
	@Column (value = "MailID")
	private String MailID;
	
	@Column (value = "DOJ")
	private String DOJ;
	
	public int getEmployeeId() {
		return EmployeeId;
	}
	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public String getMailID() {
		return MailID;
	}
	public void setMailID(String mailID) {
		MailID = mailID;
	}
	public String getDOJ() {
		return DOJ;
	}
	public void setDOJ(String dOJ) {
		DOJ = dOJ;
	}
	@Override
	public String toString() {
		return "Employee [EmployeeId=" + EmployeeId + ", EmployeeName=" + EmployeeName + ", Department=" + Department
				+ ", MailID=" + MailID + ", DOJ=" + DOJ + "]";
	}
	
}
