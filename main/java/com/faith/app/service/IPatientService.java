package com.faith.app.service;

import java.util.List;
import java.util.Optional;

import com.faith.app.model.Patient;
import com.faith.app.model.Role;

public interface IPatientService {
	
	
	
	//list all
	public List<Patient>getAllPatient();
	
	//get role by id
	public Optional<Patient>getPatientById(Integer patientId);
	
	//insert
	public void addPateint(Patient patient);
	
	//update
	public void updatePatient(Patient patient);
	
	//delete
	public void deletePatient(Integer patientId);


}
