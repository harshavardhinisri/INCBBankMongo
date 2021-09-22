package com.barclays.rest.works.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.barclays.rest.works.entity.Employee;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, Integer> {

	// you can build custom queries here

    @Query("{'Employee.account:{'accId':?0}}")
    Optional<Employee> findByAccID(int accId);


}
