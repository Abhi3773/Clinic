package com.faith.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.faith.app.model.PrescribedMedicines;
@Repository
public interface IPrescribedMedicinesRepository extends CrudRepository<PrescribedMedicines, Integer> {

}
