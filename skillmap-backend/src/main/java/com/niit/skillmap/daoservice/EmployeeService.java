package com.niit.skillmap.daoservice;

import java.util.List;

import com.niit.skillmap.model.Employee;

public interface EmployeeService {

	public boolean addUser(Employee user);
	public Employee updateUser(Employee user);
	public Employee displayEmployeeById(int id);
	public boolean deleteEmployee(int id);
	public List<Employee> getallEmployee();
}
