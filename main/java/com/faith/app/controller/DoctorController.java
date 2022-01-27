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

import com.faith.app.model.Doctor;
import com.faith.app.model.User;
import com.faith.app.service.IDoctorService;
import com.faith.app.service.IUserService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class DoctorController {
	//get instance ---- ioc
		@Autowired
		private IDoctorService doctorService;
		
		// httpMethods 
		//get all doctors
		@GetMapping("/doctors")
		public List<Doctor>getAllDoctors(){
			return doctorService.getAllDoctors();
			
		}
		
		//get doctor by id
		@GetMapping("/doctors/{doctorId}")
		public Optional<Doctor> getDoctorById(@PathVariable Integer doctorId) {
			return doctorService.getDoctorById(doctorId);
		}
		
		
		
		//inserting doctor
		@PostMapping("/doctors")
		public void addDoctor(@RequestBody Doctor doctor) {
			doctorService.addDoctor(doctor);
		}
		
		//updating update
		@PutMapping("/doctors")
		public void updateDoctor(@RequestBody Doctor doctor) {
			doctorService.updateDoctor(doctor);
		}
		
		//delete a update
		@DeleteMapping("/doctors/{doctorId}")
		public void deleteDoctor(@PathVariable Integer doctorId) {
			doctorService.deleteDoctor(doctorId);
		}
		@GetMapping("/doctors/specialisation/{specialisationId}")
		public List<Doctor> findBySpecialisationId(@PathVariable Integer specialisationId) {
			// TODO Auto-generated method stub
			return doctorService.findBySpecialisationId(specialisationId);
		}
}
