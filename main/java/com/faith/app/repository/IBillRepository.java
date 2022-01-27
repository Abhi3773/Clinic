package com.faith.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.faith.app.model.Bill;
@Repository
public interface IBillRepository extends CrudRepository<Bill, Integer> {

}
