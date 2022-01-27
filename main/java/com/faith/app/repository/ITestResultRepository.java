package com.faith.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.faith.app.model.TestResult;

public interface ITestResultRepository extends CrudRepository<TestResult, Integer> {

}
