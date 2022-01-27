package com.faith.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faith.app.model.Test;
import com.faith.app.repository.ITestRepository;
@Service
public class TestServiceImplementation implements ITestService {
    //IOC
	@Autowired
	private ITestRepository testRepository;
	//List all users
	@Override
	public List<Test> getAllTests() {
		return (List<Test>) testRepository.findAll();
	}
    //get UserById
	@Override
	public Optional<Test> getTestById(Integer testId) {
		return testRepository.findById(testId);
	}

	@Override
	public void addTest(Test test) {
		testRepository.save(test);
	}

	@Override
	public void updateTest(Test test) {
		testRepository.save(test);
		
	}

	@Override
	public void deleteTest(Integer testId) {
		testRepository.deleteById(testId);
	}

}
