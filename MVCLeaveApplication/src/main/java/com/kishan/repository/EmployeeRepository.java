package com.kishan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kishan.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	//Login
	Employee findByUsernameAndPassword(String username, String password);
	
	// Check if username exists
    Employee findByUsername(String username);

}
