package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.domain.Employee;
import com.employee.service.EmployeeServiceImpl;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	private EmployeeServiceImpl employeeService;

	@GetMapping("/")
	private ResponseEntity<List<Employee>> getEmployees() {
		List<Employee> empList = employeeService.getEmployees();
		return new ResponseEntity<List<Employee>>(empList, HttpStatus.OK);
	}

}
