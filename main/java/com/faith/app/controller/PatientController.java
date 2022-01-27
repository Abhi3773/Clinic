package com.faith.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.faith.app.model.Patient;
import com.faith.app.service.IPatientService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class PatientController {

	@Autowired
	private IPatientService patientService;

	@GetMapping("/patients")
	public List<Patient> getAllPatient() {

		return patientService.getAllPatient();
	}

	@GetMapping("/patients/{patientId}")
	public Optional<Patient> getPatientById(@PathVariable Integer patientId) {

		return patientService.getPatientById(patientId);
	}

	@PostMapping("/patients")
	public void addPateint(@RequestBody Patient patient) {
		patientService.addPateint(patient);

	}

	@PutMapping("/patients")
	public void updatePatient(@RequestBody Patient patient) {

		patientService.updatePatient(patient);

	}

	@DeleteMapping("/patients/{patientId}")
	public void deletePatient(@PathVariable Integer patientId) {

		patientService.deletePatient(patientId);

	}

}
