package com.kishan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kishan.model.Employee;
import com.kishan.service.IEmployeeService;

@Controller
public class AuthenticationController {
	
	 @Autowired
	    private IEmployeeService employeeService;


	    // -------------------- LOAD PAGES --------------------

	    @GetMapping("/login")
	    public String loginPage() {
	        return "login";
	    }

	    @GetMapping("/register")
	    public String registerPage() {
	        return "register";
	    }
	    
	    @GetMapping("/reset")
	    public String resetPage() {
	        return "reset";
	    }

	    // -------------------- REGISTER --------------------

	    @PostMapping("/register")
	    public String registerEmployee(@ModelAttribute Employee employee, Model model) {

	        String message = employeeService.registerEmployee(employee);

	        model.addAttribute("message", message);

	        if (message.contains("exists")) {
	            return "register";
	        }

	        return "login";
	    }
	    
	 // -------------------- LOGIN --------------------

	    @PostMapping("/login")
	    public String loginEmployee(@RequestParam String username,
	                                @RequestParam String password,
	                                Model model) {

	        Employee emp = employeeService.loginEmployee(username, password);

	        if (emp == null) {
	            model.addAttribute("message", "Invalid Username or Password ❌");
	            return "login";
	        }

	        // Role based navigation
	        String role = emp.getRole();

	        if ("EMPLOYEE".equals(role)) {
	            return "redirect:/employeeDashboard";
	        } 
	        else if ("MANAGER".equals(role)) {
	            return "redirect:/managerDashboard";
	        } 
	        else {
	            return "redirect:/ceoDashboard";
	        }
	    }

	    // -------------------- RESET --------------------

	    @PostMapping("/reset")
	    public String resetCredentials(@RequestParam int eid,
	                                   @RequestParam String username,
	                                   @RequestParam String password,
	                                   Model model) {

	        String message = employeeService.resetCredentials(eid, username, password);

	        model.addAttribute("message", message);

	        if (message.contains("Successful")) {
	            return "login";
	        }

	        return "reset";
	    }
	    
    }
	
	
	        
	    
	    
