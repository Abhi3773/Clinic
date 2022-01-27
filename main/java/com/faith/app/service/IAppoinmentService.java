package com.faith.app.service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.faith.app.model.Appoinment;
import com.faith.app.model.User;

public interface IAppoinmentService {
	
	
	
	//Get All User
		public List<Appoinment>getAllAppoinment();
		//Get User By Id
		public Optional<Appoinment>getAppoinmentById(Integer id);
	    //Insert
		public void addAppoinment(Appoinment appoinment);
		
		//Update
		public void updateAppoinment(Appoinment appoinment);
		
		//Delete User
		public void deleteAppoinment(Integer appoinmentId);
		
		//custom
		public List<Appoinment>getByPatientId(Integer patientId);
		
		public List<Appoinment>getByDate(LocalDate date);
		
		public List<Appoinment>getByDoctorId(Integer doctorId);
		
		public List<Appoinment>getByStatus(String status);
		
		
		
}
