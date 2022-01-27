package com.faith.app.repository;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.faith.app.model.Appoinment;
@Repository
public interface IAppoinmentRepository extends CrudRepository<Appoinment, Integer> {
	
	public List<Appoinment>findByPatientId(Integer patientId);
	
	public List<Appoinment>findByDate(LocalDate date);
	
	public List<Appoinment>findByDoctorId(Integer doctorId);
	
	public List<Appoinment>findByStatus(String status);
	

}
