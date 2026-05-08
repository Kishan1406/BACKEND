package com.kishan.service;

import com.kishan.model.Employee;

public interface IEmployeeService {
	
	
	 // Register Employee
    public String registerEmployee(Employee employee);

    // Login Employee
    public Employee loginEmployee(String username, String password);

    // Get Employee by ID
    public Employee getEmployeeById(int eid);

    // Check Username Exists
    public boolean isUsernameExists(String username);

    // Reset Username & Password
    public String resetCredentials(int eid, String username, String password);

}
