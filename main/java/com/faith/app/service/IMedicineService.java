package com.faith.app.service;

import java.util.List;
import java.util.Optional;

import com.faith.app.model.Medicine;
import com.faith.app.model.Role;

public interface IMedicineService {

	
	//list all
	public List<Medicine>getAllMedicine();
	
	//get role by id
	public Optional<Medicine>getMedicineById(Integer id);
	
	//insert
	public void addMedicine(Medicine medicine);
	
	//update
	public void updateMedicine(Medicine medicine);
	
	//delete
	public void deleteMedicine(Integer id);
	
	public Optional<Medicine>getByMedicineName(String medicineName);

}
