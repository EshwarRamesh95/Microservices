package com.employee.service;

import java.util.List;

import com.employee.domain.Employee;
import com.employee.exceptions.EmployeeNotFoundException;

public interface EmployeeService {

	List<Employee> getEmployees();

	Employee getEmployeeById(Long id) throws EmployeeNotFoundException;

	Employee addorUpdateEmployee(Employee entity);

	void deleteEmployeeById(Long id) throws EmployeeNotFoundException; 
	
}
