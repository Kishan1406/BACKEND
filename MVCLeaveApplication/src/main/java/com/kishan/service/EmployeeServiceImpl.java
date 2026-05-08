package com.kishan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kishan.model.Employee;
import com.kishan.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
	
	@Autowired
    private EmployeeRepository employeeRepository;

	@Override
	public String registerEmployee(Employee employee) {
		if (employeeRepository.findByUsername(employee.getUsername()) != null) {
            return "Username already exists";
        }

        employeeRepository.save(employee);
        return "Registration successful";
	}

	@Override
	public Employee loginEmployee(String username, String password) {
		Employee emp = employeeRepository.findByUsername(username);

        if (emp != null && emp.getPassword().equals(password)) {
            return emp; 
        }

        return null;
	}

	@Override
	public Employee getEmployeeById(int eid) {
		Employee emp =  employeeRepository.findById(eid).orElse(null);
		 Employee result = null;

		    if (emp != null) {
		        result = emp;   
		    } else {
		        result = null;  
		    }

		    return result;
	}

	@Override
	public boolean isUsernameExists(String username) {
		Employee emp = employeeRepository.findByUsername(username);
	    boolean result = false;

	    if (emp != null) {
	        result = true;   
	    } else {
	        result = false;  
	    }

	    return result;
	}

	@Override
	public String resetCredentials(int eid, String username, String password) {
		 Employee emp = employeeRepository.findById(eid).orElse(null);

	        if (emp == null) {
	            return "Employee ID not found ";
	        }

	        if (employeeRepository.findByUsername(username) != null) {
	            return "Username already taken ";
	        }

	        emp.setUsername(username);
	        emp.setPassword(password);

	        employeeRepository.save(emp);

	        return "Credentials updated successfully";
	}

}
