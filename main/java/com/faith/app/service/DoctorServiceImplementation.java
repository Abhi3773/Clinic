package com.faith.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faith.app.model.Doctor;
import com.faith.app.repository.IDoctorRepository;

@Service
public class DoctorServiceImplementation implements IDoctorService {
	// IOC
	@Autowired
	private IDoctorRepository doctorRepository;

	// List all doctors
	@Override
	public List<Doctor> getAllDoctors() {
		return (List < Doctor >) doctorRepository.findAll();
	}

	// get UserById
	@Override
	public Optional<Doctor> getDoctorById(Integer doctorId) {
		return doctorRepository.findById(doctorId);

	}

	// insert doctor
	@Override
	public void addDoctor(Doctor doctor) {
		doctorRepository.save(doctor);

	}

	// update doctor
	@Override
	public void updateDoctor(Doctor doctor) {
		doctorRepository.save(doctor);

	}

	// delete user
	@Override
	public void deleteDoctor(Integer doctorId) {
		doctorRepository.deleteById(doctorId);

	}

	@Override
	public List<Doctor> findBySpecialisationId(Integer specialisationId) {
		// TODO Auto-generated method stub
		return doctorRepository.findBySpecialisationId(specialisationId);
	}

	
	

}
