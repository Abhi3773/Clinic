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

import com.faith.app.model.Test;
import com.faith.app.model.User;
import com.faith.app.service.ITestService;
import com.faith.app.service.IUserService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class TestController {
	//get instance ---- ioc
		@Autowired
		private ITestService testService;
		// httpMethods 
		//get all Tests
		@GetMapping("/tests")
		public List<Test>getAllTests(){
			return testService.getAllTests();
			
		}
		
		//get test by id
		@GetMapping("/tests/{testId}")
		public Optional<Test> getTestById(@PathVariable Integer testId) {
			return testService.getTestById(testId);
		}
		
		
		
		//inserting user
		@PostMapping("/tests")
		public void addTest(@RequestBody Test test) {
			testService.addTest(test);
		}
		
		//updating user
		@PutMapping("/tests")
		public void updateTest(@RequestBody Test test) {
			testService.updateTest(test);
		}
		
		//delete a user
		@DeleteMapping("/tests/{testId}")
		public void deleteTest(@PathVariable Integer testId) {
			testService.deleteTest(testId);
		}
}
