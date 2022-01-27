package com.faith.app.service;

import java.util.List;
import java.util.Optional;

import com.faith.app.model.TestResult;

public interface ITestResultService {
 //List all
	
	public List<TestResult>getTeAllTestResults();
	//get test results 
	public Optional<TestResult>getUserById(Integer testResultId);
	//insert
	public void addTestResults(TestResult testResults);
	//update
	public void updateTestResults(TestResult testResults);
	//delete
	public void deleteTestResults(Integer testResultId);
}
