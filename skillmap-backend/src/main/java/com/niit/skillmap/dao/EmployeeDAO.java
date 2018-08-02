package com.niit.skillmap.dao;

import java.util.List;

import com.niit.skillmap.model.Employee;

public interface EmployeeDAO 
{

	public boolean addUser(Employee user);
	public Employee updateUser(Employee user);
	public Employee displayEmployeeById(int id);
	public boolean deleteEmployee(int id);
	public List<Employee> getallEmployee();
	
	
}
