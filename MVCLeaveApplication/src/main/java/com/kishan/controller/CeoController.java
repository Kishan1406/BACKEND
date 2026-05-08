package com.kishan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.kishan.model.LeaveRequest;
import com.kishan.service.ILeaveService;

@Controller

public class CeoController {

	@Autowired
    private  ILeaveService leaveService ;

    // CEO Dashboard (Load All Leaves Automatically)
    @GetMapping("/ceoDashboard")
    public String ceoDashboard(Model model) {

        List<LeaveRequest> allLeaves = leaveService.getAllLeaves();

        model.addAttribute("allLeaves", allLeaves);

        return "ceo_dashboard";   // JSP name
    }

    
	

}
