package com.barclays.rest.works.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.annotation.Generated;

@Document(collection = "Employees")
public class Employee {
	
	private String password;
	private String email;
	private String empName;
	private String pancard;
	private String aadhar;
	private String address;
	private String phoneNumber;
	private String DOB;
	private double salary;
	private Account account;
	private boolean manager;
	
	public Employee() {}
	
	public Employee( String empName,String password,String pancard,String aadhar,String email,
					String phoneNumber, String DOB, String address ,double salary,
					Account account,boolean manager ) {
		super();
	
		
		this.password = password;
		this.empName = empName;
		this.salary = salary;
		this.email = email;
		this.pancard = pancard;
		this.aadhar = aadhar;
		this.account = account;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.DOB = DOB;
		this.manager=manager;
	}

	public boolean isManager() {
		return manager;
	}

	public void setManager(boolean manager) {
		this.manager = manager;
	}

	public String getAddress() {
		return address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getDOB() {
		return DOB;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setDOB(String DOB) {
		this.DOB = DOB;
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
