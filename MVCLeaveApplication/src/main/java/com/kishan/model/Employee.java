package com.kishan.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "eid")
    private int eid;

    @Column(name = "ename", length = 100, nullable = false)
    private String ename;

    @Column(name = "eage")
    private int eage;

    @Column(name = "eaddress", length = 255)
    private String eaddress;

    @Column(name = "username", length = 50, nullable = false, unique = true)
    private String username;

    @Column(name = "password", length = 255, nullable = false)
    private String password;

    @Column(name = "role", nullable = false)
    private String role;

    @Column(name = "created_at")
    private LocalDateTime createdAt;
    
    public Employee() {
    		System.out.println("Employee ZERO ARUGEMENT COSTRUCTER");
    }

	public int getEid() {
		return eid;
	}

	public String getEname() {
		return ename;
	}

	public int getEage() {
		return eage;
	}

	public String getEaddress() {
		return eaddress;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getRole() {
		return role;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public void setEage(int eage) {
		this.eage = eage;
	}

	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", eage=" + eage + ", eaddress=" + eaddress + ", username="
				+ username + ", role=" + role + ", createdAt=" + createdAt + "]";
	}
    
    
}
