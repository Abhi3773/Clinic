package com.faith.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.faith.app.model.Prescription;
import com.faith.app.repository.IPrescriptionRepository;
@Service
public class PrescriptionServiceImplementation implements IPrescriptionService {
    //IOC
	@Autowired
	private IPrescriptionRepository prescriptionRepository;
	//List all prescriptions
	@Override
	public List<Prescription> getAllPrescription() {
		return (List<Prescription>)prescriptionRepository.findAll();
	} 
    //get prescriptionById
	@Override
	public Optional<Prescription> getPrescriptionById(Integer prescriptionId) {
		return prescriptionRepository.findById(prescriptionId);
	}
    //insert Prescription
	@Override
	public void addPrescription(Prescription prescription) {
		prescriptionRepository.save(prescription);
	}
    //update prescription
	@Override
	public void updatePrescription(Prescription prescription) {
		prescriptionRepository.save(prescription);
		
	}
    //delelte prescription
	@Override
	public void deletePrescription(Integer prescriptionId) {
	    prescriptionRepository.deleteById(prescriptionId);
		
	}
	
}
