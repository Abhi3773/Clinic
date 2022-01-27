package com.faith.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faith.app.model.PrescribedMedicines;
import com.faith.app.repository.IPatientRepository;
import com.faith.app.repository.IPrescribedMedicinesRepository;
@Service
public class PrescribedMedicinesServiceImplementation implements IPrescribedMedicinesService {

	@Autowired
	private IPrescribedMedicinesRepository prescribedMedicinesRepository;
	
	@Override
	public List<PrescribedMedicines> getAllPrescribedMedicines() {
		// TODO Auto-generated method stub
		return (List<PrescribedMedicines>) prescribedMedicinesRepository.findAll();
	}

	@Override
	public Optional<PrescribedMedicines> getPrescribedMedicinesById(Integer id) {
		// TODO Auto-generated method stub
		return prescribedMedicinesRepository.findById(id);
	}

	@Override
	public void addPrescribedMedicines(PrescribedMedicines prescribedMedicines) {
		prescribedMedicinesRepository.save(prescribedMedicines);
		
	}

	@Override
	public void updatePrescribedMedicines(PrescribedMedicines prescribedMedicines) {
		prescribedMedicinesRepository.save(prescribedMedicines);
		
	}

	@Override
	public void deletePrescribedMedicines(Integer id) {
		prescribedMedicinesRepository.deleteById(id);
		
	}

}
