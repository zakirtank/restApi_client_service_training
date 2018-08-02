package com.niit.rest.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.niit.skillmap.daoservice.EmployeeService;
import com.niit.skillmap.model.Employee;



@RestController
@RequestMapping("/api/user")
public class UserController {
	@Autowired
	EmployeeService userService;
	
	@GetMapping
	public ResponseEntity<List<Employee>> userList() {
		if (userService.getallEmployee().size() != 0) {
			return new ResponseEntity<List<Employee>>(userService.getallEmployee(), HttpStatus.OK);
		} else {
			return new ResponseEntity<List<Employee>>(HttpStatus.NO_CONTENT);
		}
	}
	
	
}