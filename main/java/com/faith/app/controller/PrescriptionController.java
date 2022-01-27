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

import com.faith.app.model.Prescription;
import com.faith.app.service.IPrescriptionService;
@CrossOrigin
@RestController
@RequestMapping("/api")
public class PrescriptionController {
	//get instance ---- ioc
			@Autowired
			private IPrescriptionService prescriptionService;
			// httpMethods 
			//get all prescription
			@GetMapping("/prescriptions")
		public List<Prescription> getAllPrescription() {
			return prescriptionService.getAllPrescription();
		}
	    
			//get prescription by id
			@GetMapping("/prescriptions/{prescriptionId}")
		public Optional<Prescription> getPrescriptionById(@PathVariable Integer prescriptionId) {
			return prescriptionService.getPrescriptionById(prescriptionId);
		}

			//inserting user
			@PostMapping("/prescriptions")
		public void addPrescription(@RequestBody Prescription prescription) {
			prescriptionService.addPrescription(prescription);
			
		}

			//updating prescriptions
			@PutMapping("/prescriptions")
		public void updatePrescription(@RequestBody Prescription prescription) {
			prescriptionService.updatePrescription(prescription);
			
		}

			//delete a prescriptions
			@DeleteMapping("/prescriptions/{prescriptionId}")
		public void deletePrescription(@PathVariable Integer prescriptionId) {
			prescriptionService.deletePrescription(prescriptionId);
			
		}

	}

