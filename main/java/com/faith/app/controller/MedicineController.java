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

import com.faith.app.model.Medicine;
import com.faith.app.service.IMedicineService;
import com.faith.app.service.IRoleService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class MedicineController {

	// ioc
	@Autowired
	private IMedicineService medicineService;

	@GetMapping("/medicines")
	public List<Medicine> getAllMedicine() {
		// TODO Auto-generated method stub
		return medicineService.getAllMedicine();
	}

	@GetMapping("/medicines/{id}")
	public Optional<Medicine> getMedicineById(@PathVariable Integer id) {

		return medicineService.getMedicineById(id);
	}

	@PostMapping("/medicines")
	public void addMedicine(@RequestBody Medicine medicine) {
		medicineService.addMedicine(medicine);

	}

	@PutMapping("/medicines")
	public void updateMedicine(@RequestBody Medicine medicine) {
		medicineService.updateMedicine(medicine);

	}

	@DeleteMapping("/medicines/{id}")
	public void deleteMedicine(@PathVariable Integer id) {
		medicineService.deleteMedicine(id);

	}
	
	@GetMapping("/medicines/medicine/{medicineName}")
	public Optional<Medicine> getByMedicineName(@PathVariable String medicineName) {
		// TODO Auto-generated method stub
		return medicineService.getByMedicineName(medicineName);
	}

}
