package com.faith.app.service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faith.app.model.Appoinment;
import com.faith.app.model.User;
import com.faith.app.repository.IAppoinmentRepository;
@Service
public class AppoinmentServiceImplementation implements IAppoinmentService {
	
	@Autowired
	public IAppoinmentRepository appoinmentRepository;
	
	@Override
	public List<Appoinment> getAllAppoinment() {
		
		return (List<Appoinment>)appoinmentRepository.findAll();
	}

	@Override
	public Optional<Appoinment> getAppoinmentById(Integer id) {
		
		return appoinmentRepository.findById(id);
	}

	@Override
	public void addAppoinment(Appoinment appoinment) {
	
		appoinmentRepository.save(appoinment);

	}

	@Override
	public void updateAppoinment(Appoinment appoinment) {
		
		appoinmentRepository.save(appoinment);
	}

	@Override
	public void deleteAppoinment(Integer appoinmentId) {
		appoinmentRepository.deleteById(appoinmentId);

	}

	@Override
	public List<Appoinment> getByPatientId(Integer patientId) {
		// TODO Auto-generated method stub
		return appoinmentRepository.findByPatientId(patientId);
	}

	@Override
	public List<Appoinment> getByDate(LocalDate date) {
		// TODO Auto-generated method stub
		return appoinmentRepository.findByDate(date);
	}

	@Override
	public List<Appoinment> getByDoctorId(Integer doctorId) {
		// TODO Auto-generated method stub
		return appoinmentRepository.findByDoctorId(doctorId);
	}

	@Override
	public List<Appoinment> getByStatus(String status) {
		// TODO Auto-generated method stub
		return appoinmentRepository.findByStatus(status);
	}

}
