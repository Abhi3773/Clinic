package com.faith.app.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
@Table(name="Users",uniqueConstraints={@UniqueConstraint(columnNames={"email"})})
public class User {
	
	//variables
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer userId;
	private String userName;
	private String mobileNo;
	private String address;
	private String email;
	private String password;
	private String isActive;
	
	private int roleId;
	@ManyToOne
	@JoinColumn(name="roleId",insertable=false,updatable=false)
	private Role role;
	
	@OneToMany(mappedBy = "user" ,cascade = CascadeType.ALL)
	private List<Appoinment> appoinments;
	
//	@OneToOne
//	@JoinColumn(name = "user",insertable=false,updatable=false)
	//private Doctor doctor;
	
	//default constructor
	public User() {
	
	}

	//parameterized constructor
	public User(Integer userId, String userName, String mobileNo, String address, String email, String password,
			String isActive, int roleId, Role role) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.mobileNo = mobileNo;
		this.address = address;
		this.email = email;
		this.password = password;
		this.isActive = isActive;
		this.roleId = roleId;
		this.role = role;
	}

	
	//getters and setters
	
	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	
	@JsonBackReference
	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
	
	@JsonIgnore
	@JsonManagedReference
	public List<Appoinment> getAppoinments() {
		return appoinments;
	}

	public void setAppoinments(List<Appoinment> appoinments) {
		this.appoinments = appoinments;
	}
//
//	@JsonBackReference
//	public Doctor getDoctor() {
//		return doctor;
//	}
//
//	public void setDoctor(Doctor doctor) {
//		this.doctor = doctor;
//	}

	public User(Integer userId, String userName, String mobileNo, String address, String email, String password,
			String isActive, int roleId, Role role, List<Appoinment> appoinments) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.mobileNo = mobileNo;
		this.address = address;
		this.email = email;
		this.password = password;
		this.isActive = isActive;
		this.roleId = roleId;
		this.role = role;
		this.appoinments = appoinments;
	}

	
	
	
	
	
	
	
	

}
