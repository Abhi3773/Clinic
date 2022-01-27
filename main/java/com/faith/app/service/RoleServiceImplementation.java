package com.faith.app.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faith.app.model.Role;
import com.faith.app.repository.IRoleRepository;
@Service
public class RoleServiceImplementation implements IRoleService {
	
	@Autowired
	public IRoleRepository roleRepository;
	//list all
	@Override
	public List<Role> getAllRoles() {
		return (List<Role>) roleRepository.findAll();
	}

	//get user by id
	@Override
	public Optional<Role> getRoleById(Integer id) {
		return roleRepository.findById(id);
	}

	//insert
	@Override
	public void addRole(Role role) {
		roleRepository.save(role);
	}

	//update
	@Override
	public void updateRole(Role role) {
		roleRepository.save(role);
	}

	//delete
	@Override
	public void deleteRole(Integer id) {
		roleRepository.deleteById(id);
	}
	

}
