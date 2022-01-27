package com.faith.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.faith.app.model.Medicine;
@Repository
public interface IMedicineRepository extends CrudRepository<Medicine, Integer>{
	
	//@Query("FROM MEDICINE WHERE medicineName=?1")
	public Optional<Medicine> findByMedicineName(String medicineName);

}
