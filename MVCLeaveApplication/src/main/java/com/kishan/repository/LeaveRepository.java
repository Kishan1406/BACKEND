package com.kishan.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kishan.model.LeaveRequest;

public interface LeaveRepository extends JpaRepository<LeaveRequest, Integer> {
	
	 // Employee → View own leaves
    List<LeaveRequest> findByEmployee_Eid(int eid);

    // Manager → View pending leaves
    List<LeaveRequest> findByLeaveStatus(String leaveStatus);

}
