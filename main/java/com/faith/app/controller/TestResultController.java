package com.faith.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.faith.app.model.TestResult;
import com.faith.app.model.User;
import com.faith.app.service.ITestResultService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class TestResultController {
	//get instance ---- ioc
		@Autowired
		private ITestResultService testResultService;
		// httpMethods 
		//get all TestResults
		@GetMapping("/testresults")
		public List<TestResult>getAllTestResults(){
			return testResultService.getTeAllTestResults();
			
		}
		
		//get testresult by id
		@GetMapping("/testresults{testResultId}")
		public Optional<TestResult> getTestById(@PathVariable Integer testResultId) {
			return testResultService.getUserById(testResultId);
		}
		
		
		
		//inserting testresult
		@PostMapping("/testresults")
		public void addTestResult(@RequestBody TestResult testresult) {
			testResultService.addTestResults(testresult);
		}
		
		//updating testresult
		@PutMapping("/testresults")
		public void updateUser(@RequestBody TestResult testresult) {
			testResultService.updateTestResults(testresult);
		}
		
		//delete a test result
		@DeleteMapping("/testresults{testResultId}")
		public void deleteUser(@PathVariable Integer testResultId) {
			testResultService.deleteTestResults(testResultId);
		}
}
