package com.kishan.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "leave_request")
public class LeaveRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "leave_id")
    private int leaveId;

    @Column(name = "start_date", nullable = false)
    private LocalDate startDate;

    @Column(name = "end_date", nullable = false)
    private LocalDate endDate;

    @Column(name = "reason", length = 255)
    private String reason;

    @Column(name = "leave_status")
    private String leaveStatus = "PENDING";

    @Column(name = "applied_date")
    private LocalDateTime appliedDate;

    // Relationship
    @ManyToOne
    @JoinColumn(name = "eid")
    private Employee employee;
    
    // Time stamping to calculate number of days
    public long getNumberOfDays() {
        if(startDate != null && endDate != null) {
            return ChronoUnit.DAYS.between(startDate, endDate) + 1;
        }
        return 0;
    } 
    
    public LeaveRequest() {
    		System.out.println("LEAVE REQUEST ZERO ARGUMENT CONSTRUCTOR");
    }

	public int getLeaveId() {
		return leaveId;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public String getReason() {
		return reason;
	}

	public String getLeaveStatus() {
		return leaveStatus;
	}

	public LocalDateTime getAppliedDate() {
		return appliedDate;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setLeaveId(int leaveId) {
		this.leaveId = leaveId;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public void setLeaveStatus(String leaveStatus) {
		this.leaveStatus = leaveStatus;
	}

	public void setAppliedDate(LocalDateTime appliedDate) {
		this.appliedDate = appliedDate;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "LeaveRequest [leaveId=" + leaveId + ", startDate=" + startDate + ", endDate=" + endDate + ", reason="
				+ reason + ", leaveStatus=" + leaveStatus + ", appliedDate=" + appliedDate + ", employee=" + employee
				+ "]";
	}

	
    
    
    
}
