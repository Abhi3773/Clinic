package com.faith.app.service;

import java.util.List;
import java.util.Optional;

import com.faith.app.model.Prescription;

public interface IPrescriptionService {
	//List all
	public List<Prescription>getAllPrescription();
	//get prescription by id
	public Optional<Prescription>getPrescriptionById(Integer prescriptionId);
	//insert
	public void addPrescription(Prescription prescription);
	//update
	public void updatePrescription(Prescription prescription);
	//delete
	public void deletePrescription(Integer prescriptionId);

}
