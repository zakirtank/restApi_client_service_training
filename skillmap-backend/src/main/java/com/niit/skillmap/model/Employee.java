package com.niit.skillmap.model;
import java.io.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Employee {
	
	@Id
	private int empId;
	private String empName;
	@Column(unique=true)
	private String empEmail ;
	private String empPassword;
	private String empAddress;
	private String empMobileno;
	private String empRole;
	private boolean status;
	
	
	
	public Employee()
	{
		
	}



	public int getEmpId() {
		return empId;
	}



	public void setEmpId(int empId) {
		this.empId = empId;
	}



	public String getEmpName() {
		return empName;
	}



	public void setEmpName(String empName) {
		this.empName = empName;
	}



	public String getEmpEmail() {
		return empEmail;
	}



	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}



	public String getEmpPassword() {
		return empPassword;
	}



	public void setEmpPassword(String empPassword) {
		this.empPassword = empPassword;
	}



	public String getEmpAddress() {
		return empAddress;
	}



	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}



	public String getEmpMobileno() {
		return empMobileno;
	}



	public void setEmpMobileno(String empMobileno) {
		this.empMobileno = empMobileno;
	}



	public String getEmpRole() {
		return empRole;
	}



	public void setEmpRole(String empRole) {
		this.empRole = empRole;
	}



	public boolean isStatus() {
		return status;
	}



	public void setStatus(boolean status) {
		status = status;
	}

 
	
	
	
	

}
