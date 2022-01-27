package com.faith.app.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Patient {
	
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer patientId;
	private String patientName;
	private String phone;
	private String address;
	private String email;
	private String bloodGroup;
	private Integer age;
	
	@OneToMany(mappedBy = "patient" ,cascade = CascadeType.ALL)
	private List<Appoinment> appoinments;
	
//	@OneToMany(mappedBy = "patient",cascade = CascadeType.ALL)
//	private List<Prescription>prescriptions;
//	
	
	

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Patient(Integer patientId, String patientName, String phone, String address, String email, String bloodGroup,
			Integer age, List<Appoinment> appoinments) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.phone = phone;
		this.address = address;
		this.email = email;
		this.bloodGroup = bloodGroup;
		this.age = age;
		this.appoinments = appoinments;
	}

	public Integer getPatientId() {
		return patientId;
	}

	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
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

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@JsonIgnore
	//@JsonManagedReference
	public List<Appoinment> getAppoinments() {
		return appoinments;
	}

	public void setAppoinments(List<Appoinment> appoinments) {
		this.appoinments = appoinments;
	}

//	@JsonIgnore
//	//@JsonManagedReference
//	public List<Prescription> getPrescriptions() {
//		return prescriptions;
//	}
//
//	public void setPrescriptions(List<Prescription> prescriptions) {
//		this.prescriptions = prescriptions;
//	}
//	

	
	
}
