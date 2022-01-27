package com.faith.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faith.app.model.User;
import com.faith.app.repository.IUserRepository;
@Service
public class UserServiceImplementation implements IUserService {
     
	//IOC
	@Autowired
	private IUserRepository userRepository;
	
	//List All users
	@Override
	public List<User> getAllUsers() {
		return (List<User>) userRepository.findAll();
	}
    
	//get UserbyId
	@Override
	public Optional<User> getUserById(Integer userId) {
		return userRepository.findById(userId);
	}
     //insert user
	@Override
	public void addUser(User user) {
		userRepository.save(user);
	}
		
	//update user

	@Override
	public void updateUser(User user) {
		userRepository.save(user);
		
	}
    //delete user
	@Override
	public void deleteUser(Integer userId) {
		userRepository.deleteById(userId);

		
	}

	@Override
	public User findByUserNameAndPassword(String userName, String password) {
		// TODO Auto-generated method stub
		return userRepository.findByUserNameAndPassword(userName, password);
	}

	@Override
	public List<User> findByRoleId(Integer roleId) {
		// TODO Auto-generated method stub
		return userRepository.findByRoleId(roleId);
	}

}
 