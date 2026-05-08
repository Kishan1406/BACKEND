package com.kishan.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kishan.model.LeaveRequest;
import com.kishan.service.ILeaveService;

@Controller
public class ManagerController {
	
	@Autowired
	private ILeaveService leaveService;
	
	// Manager Dashboard
	@GetMapping("/managerDashboard")
    public String managerDashboard(Model model) {

        List<LeaveRequest> pendingLeaves = leaveService.getPendingLeaves();

        model.addAttribute("pendingLeaves", pendingLeaves);

        return "manager_dashboard";
    }


    // Approve Leave
    @PostMapping("/approve")
    public String approveLeave(@RequestParam int leaveId, Model model) {

        String message = leaveService.approveLeave(leaveId);

        model.addAttribute("message", message);

        return "redirect:/managerDashboard";
    }

    // Reject Leave
    @PostMapping("/reject")
    public String rejectLeave(@RequestParam int leaveId, Model model) {

        String message = leaveService.rejectLeave(leaveId);

        model.addAttribute("message", message);

        return "redirect:/managerDashboard";
    }

}
