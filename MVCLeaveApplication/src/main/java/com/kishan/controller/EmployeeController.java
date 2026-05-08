package com.kishan.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kishan.model.Employee;
import com.kishan.model.LeaveRequest;
import com.kishan.service.IEmployeeService;
import com.kishan.service.ILeaveService;

@Controller
public class EmployeeController {
	 @Autowired
	    private IEmployeeService employeeService;

	    @Autowired
	    private ILeaveService leaveService;

	    // ---------------- DASHBOARD ----------------

	    @GetMapping("/employeeDashboard")
	    public String employeeDashboard() {
	        return "employee_dashboard";
	    }

	    // ---------------- APPLY LEAVE PAGE ----------------

	    @GetMapping("/applyLeave")
	    public String showApplyLeavePage(Model model) {

	        model.addAttribute("leave", new LeaveRequest());

	        return "apply_leave";
	    }
	 // ---------------- SUBMIT LEAVE ----------------

	    @PostMapping("/applyLeave")
	    public String applyLeave(@ModelAttribute LeaveRequest leave,
	                             @RequestParam int eid,
	                             Model model) {

	        // Get Employee
	        Employee emp = employeeService.getEmployeeById(eid);

	        if (emp == null) {
	            model.addAttribute("message", "Employee Not Found ❌");
	            return "apply_leave";
	        }

	        // Set relationship + default values
	        leave.setEmployee(emp);
	        leave.setLeaveStatus("PENDING");
	        leave.setAppliedDate(LocalDateTime.now());

	        leaveService.applyLeave(leave);

	        model.addAttribute("message", "Leave Applied Successfully ✅");

	        return "employee_dashboard";
	    }
	    
	 // ---------------- VIEW LEAVE STATUS ----------------

	    @GetMapping("/leaveStatus")
	    public String leaveStatus(@RequestParam int eid, Model model) {

	        List<LeaveRequest> leaves = leaveService.getLeavesByEmployee(eid);

	        model.addAttribute("leaves", leaves);

	        return "leave_status";
	    }

}
