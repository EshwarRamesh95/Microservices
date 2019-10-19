package com.employee.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.employee.config.PropertyConfiguration;
import com.employee.domain.Employee;
import com.employee.exceptions.EmployeeNotFoundException;
import com.employee.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private PropertyConfiguration config;

	@Override
	public List<Employee> getEmployees() {
		List<Employee> empList = employeeRepository.findAll();
		if (empList != null && empList.size() > 0) {
			return empList;
		} else {
			return new ArrayList<Employee>();
		}
	}

	public Employee getEmployeeById(Long id) throws EmployeeNotFoundException {
		System.out.println(config.getName());
		Optional<Employee> emp = employeeRepository.findById(id);
		if (emp.isPresent()) {
			return emp.get();
		} else {
			throw new EmployeeNotFoundException("Employee Not Found");
		}
	}

	@Override
	public Employee addorUpdateEmployee(Employee entity) {
		Optional<Employee> emp = employeeRepository.findById(entity.getEmp_id());
		if (emp.isPresent()) {
			Employee employee = emp.get();
			employee.setEmp_firstname(entity.getEmp_firstname());
			employee.setEmp_lastname(entity.getEmp_lastname());
			employee.setEmail(entity.getEmail());
			employee.setPhoneNo(entity.getPhoneNo());
			employee.setDate(entity.getDate());
			employee.setJobId(entity.getJobId());
			employee.setSalary(entity.getSalary());
			employee.setCommission_pct(entity.getCommission_pct());
			employee.setManager_id(entity.getManager_id());
			employee.setDept_id(entity.getDept_id());
			entity = employeeRepository.save(entity);
			return entity;
		} else {
			entity = employeeRepository.save(entity);
			return entity;
		}
	}

	@Override
	public void deleteEmployeeById(Long id) throws EmployeeNotFoundException {
		Optional<Employee> emp = employeeRepository.findById(id);
		if (emp.isPresent()) {
			employeeRepository.deleteById(emp.get().getEmp_id());
		} else {
			throw new EmployeeNotFoundException("Employee Not Found");
		}
	}

}
