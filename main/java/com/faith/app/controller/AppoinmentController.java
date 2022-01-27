package com.faith.app.controller;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.faith.app.model.Appoinment;

import com.faith.app.service.IAppoinmentService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class AppoinmentController {
	
	@Autowired
	private IAppoinmentService appoinmentService;
	
	@GetMapping("/appoinments")
	public ResponseEntity<List<Appoinment>> ListAllAppoinments(){
		return new ResponseEntity<List<Appoinment>>(appoinmentService.getAllAppoinment(),HttpStatus.OK);
	}
	
	@GetMapping("/appoinments/{appoinmentId}")
	public Optional<Appoinment>getByAppoinmentById(@PathVariable Integer id){
		return appoinmentService.getAppoinmentById(id);
	}
	
	@PostMapping("/appoinments")
	public void addAppoinment(@RequestBody Appoinment appoinment) {
		appoinmentService.addAppoinment(appoinment);
	}
	
	@PutMapping("/appoinments")
	public void updateAppoinment(@RequestBody Appoinment appoinment) {
		appoinmentService.updateAppoinment(appoinment);
	}
	
	@DeleteMapping("/appoinments/{appoinmentId}")
	public void deleteAppoinment(@PathVariable Integer appoinmentId){
		appoinmentService.deleteAppoinment(appoinmentId);
		
	}
	
	@GetMapping("/appoinments/appoinment/s/p/{patientId}")
	public List<Appoinment> getByPatientId(@PathVariable Integer patientId) {
		// TODO Auto-generated method stub
		return appoinmentService.getByPatientId(patientId);
	}

	@GetMapping("/appoinments/appoinment/s/p/d/{date}")
	public List<Appoinment> getByDate(@PathVariable LocalDate date) {
		// TODO Auto-generated method stub
		return appoinmentService.getByDate(date);
	}

	@GetMapping("/appoinments/appoinment/s/p/d/doc/{doctorId}")
	public List<Appoinment> getByDoctorId(@PathVariable Integer doctorId) {
		// TODO Auto-generated method stub
		return appoinmentService.getByDoctorId(doctorId);
	}

	@GetMapping("/appoinments/appoinment/s/{status}")
	public List<Appoinment> getByStatus(@PathVariable String status) {
		// TODO Auto-generated method stub
		return appoinmentService.getByStatus(status);
	}
	
	
}
