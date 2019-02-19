package com.spring.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.entity.Employee;
import com.spring.repo.EmployeeRepo;

@RestController
@CrossOrigin(origins = "*")
public class EmployeeController {
	@Autowired
	EmployeeRepo emp;
	@RequestMapping("/getAllEmployees")
	public List<Employee>getAllEmployees() {
		System.out.println("........"+emp.findAll());
		return emp.findAll();
	}

}
