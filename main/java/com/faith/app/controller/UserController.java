package com.faith.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.faith.app.model.User;
import com.faith.app.service.IUserService;
@CrossOrigin
@RestController
@RequestMapping("/api")
public class UserController {

	//get instance ---- ioc
	@Autowired
	private IUserService userService;
	
	// httpMethods 
	//get all users
	@GetMapping("/users")
	public List<User>getAllUsers(){
		return userService.getAllUsers();
		
	}
	
	//get user by id
	@GetMapping("/users/{userId}")
	public Optional<User> getUserById(@PathVariable Integer userId) {
		return userService.getUserById(userId);
	}
	
	
	
	//inserting user
	@PostMapping("/users")
	public void addUser(@RequestBody User user) {
		userService.addUser(user);
	}
	
	//updating user
	@PutMapping("/users")
	public void updateUser(@RequestBody User user) {
		userService.updateUser(user);
	}
	
	//delete a user
	@DeleteMapping("/users/{userId}")
	public void deleteUser(@PathVariable Integer userId) {
		userService.deleteUser(userId);
	}
	
	//Custom find User by Username and Password
		@GetMapping("/users/namepassword/{userName}&{password}")
		public ResponseEntity<User>getUserByUserNameAndPassword(
			@PathVariable ("userName") String userName,
			@PathVariable ("password") String password) {
				
			System.out.println("User name Password ...."+ userName + password);
			
			//Declare Responsibility
			ResponseEntity<User> response = null;
			User user =userService.findByUserNameAndPassword(userName, password);
			
			if(user==null) {
				response = new ResponseEntity<>(user,HttpStatus.NOT_FOUND);
			}else {
				response= new ResponseEntity<User>(user,HttpStatus.OK);
			}
			return response;
		}
		
	@GetMapping("/users/role/{roleId}")
	public List<User> findByRoleId(@PathVariable Integer roleId) {
			// TODO Auto-generated method stub
			return userService.findByRoleId(roleId);
		}
}
