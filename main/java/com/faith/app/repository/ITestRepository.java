package com.faith.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.faith.app.model.Test;
@Repository
public interface ITestRepository extends CrudRepository<Test, Integer> {

}
