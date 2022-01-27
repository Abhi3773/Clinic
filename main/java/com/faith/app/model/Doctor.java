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

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="Doctors")
public class Doctor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer doctorId;
	private Integer userId;
	private double doctorFees;
	private Integer specialisationId;
	
	@ManyToOne
	@JoinColumn(name="specialisationId",insertable = false,updatable = false)
	private Specialisation specialisation;
	
	@OneToMany(mappedBy = "doctor" ,cascade = CascadeType.ALL)
	private List<Appoinment> appoinments;
	
	@OneToOne
	@JoinColumn(name="userId",insertable = false,updatable = false)
	private User user;
	
//	@OneToMany(mappedBy = "doctor",cascade = CascadeType.ALL)
//	private List<Prescription>prescriptions;

	public Doctor() {
		
	}

	public Doctor(Integer doctorId, Integer userId, double doctorFees) {
		super();
		this.doctorId = doctorId;
		this.userId = userId;
		this.doctorFees = doctorFees;
	
	}

	public Integer getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(Integer doctorId) {
		this.doctorId = doctorId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public double getDoctorFees() {
		return doctorFees;
	}

	public void setDoctorFees(double doctorFees) {
		this.doctorFees = doctorFees;
	}

	public Integer getSpecialisationId() {
		return specialisationId;
	}

	public void setSpecialisationId(Integer specialisationId) {
		this.specialisationId = specialisationId;
	}

	@JsonBackReference
	public Specialisation getSpecialisation() {
		return specialisation;
	}

	public void setSpecialisation(Specialisation specialisation) {
		this.specialisation = specialisation;
	}

	@JsonIgnore
	//@JsonManagedReference
	public List<Appoinment> getAppoinments() {
		return appoinments;
	}

	public void setAppoinments(List<Appoinment> appoinments) {
		this.appoinments = appoinments;
	}

	//@JsonBackReference(value = "us")
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
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

	
	
	
	
	
	
	
	

}
