package com.kishan.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "manager_action")
public class ManagerAction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "action_id")
    private int actionId;

    @Column(name = "action", nullable = false)
    private String action;

    @Column(name = "reason", length = 255)
    private String reason;

    @Column(name = "action_time")
    private LocalDateTime actionTime;

    // Relationship with LeaveRequest
    @ManyToOne
    @JoinColumn(name = "leave_id")
    private LeaveRequest leaveRequest;

    // Relationship with Manager (Employee)
    @ManyToOne
    @JoinColumn(name = "manager_id")
    private Employee manager;
    
    public ManagerAction() {
		System.out.println(" MANAGER ZERO ARGUMENT CONSTRUCTOR");
	}

	public int getActionId() {
		return actionId;
	}

	public String getAction() {
		return action;
	}

	public String getReason() {
		return reason;
	}

	public LocalDateTime getActionTime() {
		return actionTime;
	}

	public LeaveRequest getLeaveRequest() {
		return leaveRequest;
	}

	public Employee getManager() {
		return manager;
	}

	public void setActionId(int actionId) {
		this.actionId = actionId;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public void setActionTime(LocalDateTime actionTime) {
		this.actionTime = actionTime;
	}

	public void setLeaveRequest(LeaveRequest leaveRequest) {
		this.leaveRequest = leaveRequest;
	}

	public void setManager(Employee manager) {
		this.manager = manager;
	}

	@Override
	public String toString() {
		return "ManagerAction [actionId=" + actionId + ", action=" + action + ", reason=" + reason + ", actionTime="
				+ actionTime + ", leaveRequest=" + leaveRequest + ", manager=" + manager + "]";
	}
    
    
}