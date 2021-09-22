package com.barclays.rest.works.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Employees")
public class Employee {
	@Id
	private int empId;
	private String empName; 
	private double salary;
	private Account account;
	
	public Employee() {}
	
	public Employee(int empId, String empName, double salary, Account account ) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.account = account;
	}


	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
