package com.faith.app.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Specialisation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer specialisationId;
	private String specialisationName;
	
	@OneToMany(mappedBy = "specialisation",cascade = CascadeType.ALL)
	private List<Doctor> doctors;

	
	
	public Specialisation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Specialisation(Integer specialisationId, String specialisationName, List<Doctor> doctors) {
		super();
		this.specialisationId = specialisationId;
		this.specialisationName = specialisationName;
		this.doctors = doctors;
	}

	public Integer getSpecialisationId() {
		return specialisationId;
	}

	public void setSpecialisationId(Integer specialisationId) {
		this.specialisationId = specialisationId;
	}

	public String getSpecialisationName() {
		return specialisationName;
	}

	public void setSpecialisationName(String specialisationName) {
		this.specialisationName = specialisationName;
	}

	@JsonManagedReference
	public List<Doctor> getDoctors() {
		return doctors;
	}

	public void setDoctors(List<Doctor> doctors) {
		this.doctors = doctors;
	}
	
	
	
	
	
	

}
