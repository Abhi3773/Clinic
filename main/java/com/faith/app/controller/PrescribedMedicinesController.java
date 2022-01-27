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

import com.faith.app.model.PrescribedMedicines;
import com.faith.app.service.IPrescribedMedicinesService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class PrescribedMedicinesController {

	@Autowired
	private IPrescribedMedicinesService iPrescribedMedicinesService;

	@GetMapping("/prescribedMedicines")
	public List<PrescribedMedicines> getAllPrescribedMedicines() {
		// TODO Auto-generated method stub
		return iPrescribedMedicinesService.getAllPrescribedMedicines();
	}

	@GetMapping("/prescribedMedicines/{id}")
	public Optional<PrescribedMedicines> getPrescribedMedicinesById(@PathVariable Integer id) {
		// TODO Auto-generated method stub
		return iPrescribedMedicinesService.getPrescribedMedicinesById(id);
	}

	@PostMapping("/prescribedMedicines")
	public void addPrescribedMedicines(@RequestBody PrescribedMedicines prescribedMedicines) {
		iPrescribedMedicinesService.addPrescribedMedicines(prescribedMedicines);

	}

	@PutMapping("/prescribedMedicines")
	public void updatePrescribedMedicines(@RequestBody PrescribedMedicines prescribedMedicines) {
		iPrescribedMedicinesService.updatePrescribedMedicines(prescribedMedicines);

	}

	@DeleteMapping("/prescribedMedicines/{id}")
	public void deletePrescribedMedicines(@PathVariable Integer id) {
		iPrescribedMedicinesService.deletePrescribedMedicines(id);;

	}

}
