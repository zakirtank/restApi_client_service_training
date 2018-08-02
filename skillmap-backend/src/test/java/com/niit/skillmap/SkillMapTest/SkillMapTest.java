package com.niit.skillmap.SkillMapTest;
import java.util.List;

import com.niit.skillmap.config.DBConfig;
import com.niit.skillmap.dao.EmployeeDAO;
import com.niit.skillmap.daoimpl.EmployeeDAOImpl;
import com.niit.skillmap.daoservice.EmployeeService;
import com.niit.skillmap.model.Employee;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertEquals;

import org.hibernate.SessionFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import javax.swing.Spring;
import org.junit.runner.RunWith;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;



@SpringJUnitConfig(classes=DBConfig.class)
@RunWith(SpringRunner.class)
public class SkillMapTest {

    @Autowired
    EmployeeService employeeDAO;
	@Before
	public void setup()
	{
		
	}
	
	@After
	public void tearDow()
	{
		
		
	}
	@Test
	public void getAll()
	{
		
		assertEquals(3, employeeDAO.getallEmployee().size());
	}
	@Ignore
	@Test
	public void insertemp()
	{
		Employee emp=new Employee();
		emp.setEmpId(5);
		emp.setEmpName("Sam");
		emp.setEmpEmail("SamNeel@gmail.com");
		emp.setEmpPassword("12126");
		emp.setEmpAddress("Anjar Kachchh");
		emp.setEmpMobileno("98999");
		emp.setEmpRole("Hr");
		emp.setStatus(true);
		assertEquals(true,employeeDAO.addUser(emp));
		
			
		
	}
	
	@Ignore
	@Test
	public void viewempbyid()
	{
		assertEquals("Zabin",employeeDAO.displayEmployeeById(3).getEmpName());
		
	}
	
	@Ignore
	@Test
	public void viewempdata()
	{
		assertEquals(4,employeeDAO.getallEmployee().size());
	}
	
	@Ignore
	@Test
	public void delempdata()
	{
		assertEquals(false,employeeDAO.deleteEmployee(3));
		System.out.println("success");
	}
	
	@Ignore
	@Test
	public void updateemp() {
        Employee emp=new Employee();
       
		emp.setEmpId(3);
		emp.setEmpName("Sam");
		emp.setEmpEmail("SamNeel@gmail.com");
		emp.setEmpPassword("12126");
		emp.setEmpAddress("Anjar Kachchh");
		emp.setEmpMobileno("55555");
		emp.setEmpRole("Hr");
		emp.setStatus(true);
		assertEquals(true,employeeDAO.updateUser(emp));
        
	}
}
