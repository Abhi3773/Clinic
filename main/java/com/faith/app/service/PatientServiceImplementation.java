package com.faith.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faith.app.model.Patient;
import com.faith.app.model.Role;
import com.faith.app.repository.IPatientRepository;
@Service
public class PatientServiceImplementation implements IPatientService {
	
	@Autowired
	public IPatientRepository patientRepository;
	
	@Override
	public List<Patient> getAllPatient() {
		
		return (List<Patient>) patientRepository.findAll();
	}

	@Override
	public Optional<Patient> getPatientById(Integer id) {
		
		return patientRepository.findById(id);
	}

	@Override
	public void addPateint(Patient patient) {
		patientRepository.save(patient);

	}

	@Override
	public void updatePatient(Patient patient) {

		patientRepository.save(patient);

	}

	@Override
	public void deletePatient(Integer id) {
		
		patientRepository.deleteById(id);

	}

}
