package com.faith.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faith.app.model.Medicine;
import com.faith.app.model.Role;
import com.faith.app.repository.IMedicineRepository;

@Service
public class MedicineServiceImplementation implements IMedicineService {

	@Autowired
	private IMedicineRepository medicineRepository;
	
	@Override
	public List<Medicine> getAllMedicine() {
		// TODO Auto-generated method stub
		return (List<Medicine>)medicineRepository.findAll();
	}

	@Override
	public Optional<Medicine> getMedicineById(Integer id) {
		
		return medicineRepository.findById(id);
	}

	@Override
	public void addMedicine(Medicine medicine) {
		medicineRepository.save(medicine);

	}

	@Override
	public void updateMedicine(Medicine medicine) {
		medicineRepository.save(medicine);

	}

	@Override
	public void deleteMedicine(Integer id) {
		medicineRepository.deleteById(id);

	}

	@Override
	public Optional<Medicine> getByMedicineName(String medicineName) {
		// TODO Auto-generated method stub
		return medicineRepository.findByMedicineName(medicineName);
	}

	

}
