package com.faith.app.service;

import java.util.List;
import java.util.Optional;

import com.faith.app.model.Test;

public interface ITestService {
 //list all
	public List<Test>getAllTests();
	//get user by id
	public Optional<Test>getTestById(Integer testId);
	//insert
	public void addTest(Test test);
	//update
	public void updateTest(Test test);
	//delete
	public void deleteTest(Integer testId);
}
