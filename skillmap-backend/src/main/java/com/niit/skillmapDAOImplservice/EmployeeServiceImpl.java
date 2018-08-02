package com.niit.skillmapDAOImplservice;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.skillmap.daoimpl.EmployeeDAOImpl;
import com.niit.skillmap.daoservice.EmployeeService;
import com.niit.skillmap.dao.EmployeeDAO;
import com.niit.skillmap.daoimpl.*;
import com.niit.skillmap.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService
{
	
@Autowired
EmployeeDAO emp;

	public boolean addUser(Employee user) {
		return emp.addUser(user);
	}

	public Employee updateUser(Employee user) {
		// TODO Auto-generated method stub
		return null;
	}

	public Employee displayEmployeeById(int id) {
		return emp.displayEmployeeById(id);
	}

	public boolean deleteEmployee(int id) {
		return emp.deleteEmployee(id);
	}

	public List<Employee> getallEmployee() {
		return emp.getallEmployee();	
	}

}
