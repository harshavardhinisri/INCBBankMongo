package com.barclays.rest.works.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.barclays.rest.works.contract.IEmployeeService;
import com.barclays.rest.works.entity.Employee;
import com.barclays.rest.works.repo.EmployeeRepository;

@Service
public class EmployeeService implements IEmployeeService {

	@Autowired
	private EmployeeRepository repo;
	
	@Override
	public Employee insertEmployee(Employee employee) {

		return repo.save(employee);
	}

	@Override
	public Employee verifyacholder(int empId){
		return repo.loginacholder(empId);
	}

	@Override
	public Employee findByAccID(int accId){
		return repo.findById(accId).get();
	}

	@Override
	public List<Employee> getAllEmployees() {

		return repo.findAll();
	}

	@Override
	public Employee getEmployeeById(int empId) {

		return repo.findById(empId).get();
	}

//	@Override
//	public Employee updateEmployee(Employee employee) {
//
////		return repo.findAll().get();
//		return null;
//	}

	@Override
	public String deleteEmployee(int empId) {

		repo.deleteById(empId);
		return "Employee details deleted with id: "+ empId;


	}

	@Override
	public List<Employee> getEmployeesByName(String name) {

		return null;
	}

	@Override
	public List<Employee> getEmployeesBetweenSalary(double minSal, double maxSal) {

		return null;
	}
	
}
