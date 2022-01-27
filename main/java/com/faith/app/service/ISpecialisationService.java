package com.faith.app.service;

import java.util.List;
import java.util.Optional;

import com.faith.app.model.Specialisation;



public interface ISpecialisationService {
	//list all
		public List<Specialisation>getAllSpecialisations();
		
		//get specialisation by id
		public Optional<Specialisation>getSpecialisationById(Integer specialisationId);
		
		//insert
		public void addSpecialisation(Specialisation specialisation);
		
		//update
		public void updateSpecialisation(Specialisation specialisation);
		
		//delete
		public void deleteSpecialisation(Integer specialisationId);
		
		
		

}
