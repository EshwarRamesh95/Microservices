package com.employee.controller;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.domain.Employee;
import com.employee.exceptions.EmployeeNotFoundException;
import com.employee.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/")
	private ResponseEntity<List<Employee>> getEmployees() {
		List<Employee> empList = employeeService.getEmployees();
		return new ResponseEntity<List<Employee>>(empList, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	private ResponseEntity<Employee> getEmployeeById(@PathVariable Long id) throws EmployeeNotFoundException {
		Employee emp = employeeService.getEmployeeById(id);
		return new ResponseEntity<Employee>(emp, HttpStatus.OK);
	}

	@PostMapping("/")
	private ResponseEntity<Employee> addEmployee(@RequestBody @Valid @NotNull Employee employee) {
		Employee emp = employeeService.addorUpdateEmployee(employee);
		return new ResponseEntity<Employee>(emp, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	private void deleteEmployeeById(@PathVariable Long id) throws EmployeeNotFoundException{
		employeeService.deleteEmployeeById(id);
	}

}
