package com.faith.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.faith.app.model.Specialisation;
@Repository
public interface ISpecialisationRepository extends CrudRepository<Specialisation, Integer>{

}
