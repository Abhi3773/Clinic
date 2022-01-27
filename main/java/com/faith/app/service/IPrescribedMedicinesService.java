package com.faith.app.service;

import java.util.List;
import java.util.Optional;

import com.faith.app.model.PrescribedMedicines;


public interface IPrescribedMedicinesService {

	//list all
	public List<PrescribedMedicines>getAllPrescribedMedicines();
	
	//get role by id
	public Optional<PrescribedMedicines>getPrescribedMedicinesById(Integer id);
	
	//insert
	public void addPrescribedMedicines(PrescribedMedicines prescribedMedicines);
	
	//update
	public void updatePrescribedMedicines(PrescribedMedicines prescribedMedicines);
	
	//delete
	public void deletePrescribedMedicines(Integer id);
}
