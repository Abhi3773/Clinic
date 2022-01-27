package com.faith.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faith.app.model.TestResult;
import com.faith.app.repository.ITestRepository;
import com.faith.app.repository.ITestResultRepository;
@Service
public class TestResultServiceImplementation implements ITestResultService {
     //IOC
	@Autowired
	private ITestResultRepository testResultRepository;
	//LIst all test results
	@Override
	public List<TestResult> getTeAllTestResults() {
		return (List<TestResult>) testResultRepository.findAll();
	}
    //get Test Results ById
	@Override
	public Optional<TestResult> getUserById(Integer testResultId) {
		return testResultRepository.findById(testResultId);
	}
    //insert Test Result
	@Override
	public void addTestResults(TestResult testResults) {
		testResultRepository.save(testResults);
	}
    //update Test Result
	@Override
	public void updateTestResults(TestResult testResults) {
		testResultRepository.save(testResults);
		
	}
    //delete test Result
	@Override
	public void deleteTestResults(Integer testResultId) {
		testResultRepository.deleteById(testResultId);
		
	}

}
