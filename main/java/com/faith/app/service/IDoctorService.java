package com.faith.app.service;

import java.util.List;
import java.util.Optional;

import com.faith.app.model.Doctor;

public interface IDoctorService {
	//List all
	public List<Doctor>getAllDoctors();
	
	//get doctor by id
	public Optional<Doctor>getDoctorById(Integer doctorId);
	//insert
	public void addDoctor(Doctor doctor);
	
	//update
	public void updateDoctor(Doctor doctor);
	//delete
	public void deleteDoctor(Integer doctorId);
	
	public List<Doctor> findBySpecialisationId(Integer specialisationId);

}
