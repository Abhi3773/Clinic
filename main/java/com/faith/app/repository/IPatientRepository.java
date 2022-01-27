package com.faith.app.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.faith.app.model.Patient;
@Repository
public interface IPatientRepository extends CrudRepository<Patient, Integer>{
	
	//custom query 
	//List<Patient>findByPatientId(Integer patientId);
	
	

}
