package com.kishan.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kishan.model.LeaveRequest;
import com.kishan.repository.LeaveRepository;

@Service
public class ILeaveServiceImpl implements ILeaveService {

	 @Autowired
	    private LeaveRepository leaveRepository;
	@Override
	public LeaveRequest applyLeave(LeaveRequest leave) {

		 if (leave != null) {
	            leave.setLeaveStatus("PENDING");
	            leave.setAppliedDate(LocalDateTime.now());
	            return leaveRepository.save(leave);
	        } else {
	            return null;
	        }
	}

	@Override
	public List<LeaveRequest> getLeavesByEmployee(int eid) {
		if (eid > 0) {
            return leaveRepository.findByEmployee_Eid(eid);
        } else {
            return null;
        }

 
	}

	@Override
	public List<LeaveRequest> getPendingLeaves() {
		return leaveRepository.findByLeaveStatus("PENDING");
	}

	@Override
	public String approveLeave(int leaveId) {
		LeaveRequest leave = leaveRepository.findById(leaveId).orElse(null);

        if (leave != null) {
            leave.setLeaveStatus("APPROVED");
            leaveRepository.save(leave);
            return "Leave Approved ";
        } else {
            return "Leave Not Found ";
        }
	}

	@Override
	public String rejectLeave(int leaveId) {
		LeaveRequest leave = leaveRepository.findById(leaveId).orElse(null);

        if (leave != null) {
            leave.setLeaveStatus("REJECTED");
            leaveRepository.save(leave);
            return "Leave Rejected ";
        } else {
            return "Leave Not Found ";
        }
	}

	@Override
	public List<LeaveRequest> getAllLeaves() {
		return leaveRepository.findAll();
	}

}
