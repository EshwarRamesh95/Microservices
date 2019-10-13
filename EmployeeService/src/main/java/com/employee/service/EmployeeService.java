package com.employee.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.employee.domain.Employee;

public interface EmployeeService {

	List<Employee> getEmployees(); 
	
}
