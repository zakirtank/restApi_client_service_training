package com.niit.skillmap.daoimpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.transaction.Transaction;
import javax.transaction.Transactional;

import org.h2.engine.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.*;
import com.niit.skillmap.config.DBConfig;
import com.niit.skillmap.dao.EmployeeDAO;
import com.niit.skillmap.model.Employee;

import java.util.List;

@Transactional
@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	Employee emp;
	@Autowired
	private SessionFactory sessionFactory;
	
	public Employee getEmployeeById(int id)
	{
    emp=(Employee)sessionFactory.getCurrentSession();
     return emp;
	}	
public boolean addUser(Employee user) {
		
		sessionFactory.getCurrentSession().save(user) ;
		return true;
	}

	public Employee updateUser(Employee user) {
		
		sessionFactory.getCurrentSession().update(user);
        return emp;
		
	}

	
        
	
	public Employee displayEmployeeById(int id) {
		
		Employee emp=(Employee)sessionFactory.getCurrentSession().createQuery("from Employee where empId="+id).list().get(0);
		 return emp;
	}

	public boolean deleteEmployee(int id) {
		
		emp=(Employee)sessionFactory.getCurrentSession().load(Employee.class, id);
		if(null!=emp)
		{
			this.sessionFactory.getCurrentSession().delete(emp);
		}
		return false;
	}

	public List<Employee> getallEmployee() {
		return sessionFactory.getCurrentSession().createQuery("from Employee").list();
	}
	
}
