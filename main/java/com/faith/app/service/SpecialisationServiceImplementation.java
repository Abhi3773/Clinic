package com.faith.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faith.app.model.Specialisation;
import com.faith.app.repository.ISpecialisationRepository;

@Service
public class SpecialisationServiceImplementation implements ISpecialisationService {
   
	//IOc
	@Autowired
	private ISpecialisationRepository specialisationRepository;
    //List all
	@Override
	public List<Specialisation> getAllSpecialisations() {
		
		return (List<Specialisation>) specialisationRepository.findAll();
	}
    //get user by id
	@Override
	public Optional<Specialisation> getSpecialisationById(Integer specialisationId) {
		
		return specialisationRepository.findById(specialisationId);
	}
    //insert
	@Override
	public void addSpecialisation(Specialisation specialisation) {
		specialisationRepository.save(specialisation);
		
	}
    //update
	@Override
	public void updateSpecialisation(Specialisation specialisation) {
		specialisationRepository.save(specialisation);
		
	}
    //delete
	@Override
	public void deleteSpecialisation(Integer specialisationId) {
		 specialisationRepository.deleteById(specialisationId);
		
	}


	}


