package com.faith.app.model;

import java.time.LocalDate;
import java.util.Date;

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
import javax.persistence.Transient;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="Appoinments")
public class Appoinment {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer appoinmentId;
	
	
	private Integer patientId;
	private Integer doctorId;
	private Integer receptionistId;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate date;
	private Integer tokenNo;
	private String status;
	
	@ManyToOne
	@JoinColumn(name="patientId ",insertable = false,updatable = false)
	private Patient patient;
	
	
	@ManyToOne
	@JoinColumn(name="doctorId",insertable = false,updatable = false )
	private Doctor doctor;
	
	@ManyToOne
	@JoinColumn(name="receptionistId ",insertable = false,updatable = false )
	private User user;
	
	@OneToOne
	private Prescription prescription;
	

	public Appoinment() {
	
	}

	public Appoinment(Integer appoinmentId, Integer patientId, Integer doctorId, Integer receptionistId, LocalDate date,
			Integer tokenNo, String status, Patient patient, Doctor doctor, User user) {
		super();
		this.appoinmentId = appoinmentId;
		this.patientId = patientId;
		this.doctorId = doctorId;
		this.receptionistId = receptionistId;
		this.date = date;
		this.tokenNo = tokenNo;
		this.status = status;
		this.patient = patient;
		this.doctor = doctor;
		this.user = user;
		
	}

	public Integer getAppoinmentId() {
		return appoinmentId;
	}

	public void setAppoinmentId(Integer appoinmentId) {
		this.appoinmentId = appoinmentId;
	}

	public Integer getPatientId() {
		return patientId;
	}

	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}

	public Integer getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(Integer doctorId) {
		this.doctorId = doctorId;
	}

	public Integer getReceptionistId() {
		return receptionistId;
	}

	public void setReceptionistId(Integer receptionistId) {
		this.receptionistId = receptionistId;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Integer getTokenNo() {
		return tokenNo;
	}

	public void setTokenNo(Integer tokenNo) {
		this.tokenNo = tokenNo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	//@JsonBackReference
	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	//@JsonBackReference(value = "d")
	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	@JsonBackReference(value = "u")
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@JsonIgnore
	@JsonBackReference
	public Prescription getPrescription() {
		return prescription;
	}

	public void setPrescription(Prescription prescription) {
		this.prescription = prescription;
	}
	
	

	
	

}
