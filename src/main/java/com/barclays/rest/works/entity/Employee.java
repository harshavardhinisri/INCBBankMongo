package com.barclays.rest.works.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Employees")
public class Employee {
	@Id
	private int empId;
	private String password;
	private String email;
	private String empName;
	private String pancard;
	private String aadhar;
	private double salary;
	private Account account;
	
	public Employee() {}
	
	public Employee(int empId, String empName,String password,String pancard,String aadhar,String email, double salary, Account account ) {
		super();
		this.empId = empId;
		
		this.password = password;
		this.empName = empName;
		this.salary = salary;
		this.email = email;
		this.pancard = pancard;
		this.aadhar = aadhar;
		this.account = account;
	}

	public String getPancard() {
		return pancard;
	}

	public String getAadhar() {
		return aadhar;
	}

	public void setPancard(String pancard) {
		this.pancard = pancard;
	}

	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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
