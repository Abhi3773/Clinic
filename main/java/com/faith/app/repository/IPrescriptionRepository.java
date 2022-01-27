package com.faith.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.faith.app.model.Prescription;
@Repository
public interface IPrescriptionRepository extends CrudRepository<Prescription, Integer> {

}
