package com.kishan.service;

import java.util.List;

import com.kishan.model.LeaveRequest;

public interface ILeaveService {
	
	// Apply Leave
    public LeaveRequest applyLeave(LeaveRequest leave);

    // Employee → View Own Leaves
    public List<LeaveRequest> getLeavesByEmployee(int eid);

    // Manager → View Pending Leaves
    public List<LeaveRequest> getPendingLeaves();

    // Approve Leave
    public String approveLeave(int leaveId);

    // Reject Leave
    public String rejectLeave(int leaveId);

    // CEO → View All Leaves
    public List<LeaveRequest> getAllLeaves();

}
