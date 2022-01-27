package com.faith.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.faith.app.model.Doctor;
@Repository
public interface IDoctorRepository extends CrudRepository<Doctor, Integer> {
	
	//@Query("FROM Doctor WHERE specialisationId=?1")
	List<Doctor> findBySpecialisationId(Integer specialisationId);

}
