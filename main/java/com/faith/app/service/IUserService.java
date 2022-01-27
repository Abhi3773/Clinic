package com.faith.app.service;

import java.util.List;
import java.util.Optional;

import com.faith.app.model.User;

public interface IUserService {
 
	//list all
		public List<User>getAllUsers();
		
		//get user by id
		public Optional<User>getUserById(Integer userId);
		
		//insert
		public void addUser(User user);
		
		//update
		public void updateUser(User user);
		
		//delete
		public void deleteUser(Integer userId);
		
		public User findByUserNameAndPassword(String userName,String password);
		
		public List<User> findByRoleId(Integer roleId);
}
