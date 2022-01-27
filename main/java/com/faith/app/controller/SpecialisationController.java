package com.faith.app.controller;

import java.security.PublicKey;
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

import com.faith.app.model.Specialisation;
import com.faith.app.service.ISpecialisationService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class SpecialisationController {

	// get instance---IOC
	@Autowired
	private ISpecialisationService specialisationService;

	// httpMethods
	// get all specialisation

	@GetMapping("/specialisations")
	public List<Specialisation> getAllSpecialisations() {
		return specialisationService.getAllSpecialisations();
	}

	// get specialisation by id
	@GetMapping("/specialisations/{specialisationId}")
	public Optional<Specialisation> getSpecialisationById(@PathVariable Integer specialisationId) {
		return specialisationService.getSpecialisationById(specialisationId);
	}

	// inserting specialisation

	@PostMapping("/specialisations")
	public void addSpecialisation(@RequestBody Specialisation specialisation) {
		specialisationService.addSpecialisation(specialisation);
	}

	// updating Specialisation

	@PutMapping("/specialisations")
	public void updateSpecialisation(@RequestBody Specialisation specialisation) {
		specialisationService.updateSpecialisation(specialisation);
	}

	// delete Specialisation
	@DeleteMapping("/specialisations/{specialisationId}")
	public void deleteSpecialisation(@PathVariable Integer specialisationId) {
		specialisationService.deleteSpecialisation(specialisationId);
	}

}
	

