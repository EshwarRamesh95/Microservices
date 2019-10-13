package com.employee.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {

	@Id
	@Column(name = "employee_id")
	private Long emp_id;

	@Column(name = "first_name")
	private String emp_firstname;

	@Column(name = "last_name")
	private String emp_lastname;

	@Column(name = "email")
	private String email;

	@Column(name = "phone_number")
	private String phoneNo;

	@Column(name = "hire_date")
	private Date date;

	@Column(name = "job_id")
	private String jobId;

	@Column(name = "salary")
	private Long salary;

	@Column(name = "commission_pct")
	private Long commission_pct;

	@Column(name = "manager_id")
	private Long manager_id;

	@Column(name = "department_id")
	private Long dept_id;

	public Long getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(Long emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_firstname() {
		return emp_firstname;
	}

	public void setEmp_firstname(String emp_firstname) {
		this.emp_firstname = emp_firstname;
	}

	public String getEmp_lastname() {
		return emp_lastname;
	}

	public void setEmp_lastname(String emp_lastname) {
		this.emp_lastname = emp_lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}

	public Long getCommission_pct() {
		return commission_pct;
	}

	public void setCommission_pct(Long commission_pct) {
		this.commission_pct = commission_pct;
	}

	public Long getManager_id() {
		return manager_id;
	}

	public void setManager_id(Long manager_id) {
		this.manager_id = manager_id;
	}

	public Long getDept_id() {
		return dept_id;
	}

	public void setDept_id(Long dept_id) {
		this.dept_id = dept_id;
	}

}
