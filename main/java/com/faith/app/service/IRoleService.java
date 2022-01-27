package com.faith.app.service;

import java.util.List;
import java.util.Optional;

import com.faith.app.model.Role;

public interface IRoleService {

	
	//list all
	public List<Role>getAllRoles();
	
	//get role by id
	public Optional<Role>getRoleById(Integer id);
	
	//insert
	public void addRole(Role role);
	
	//update
	public void updateRole(Role role);
	
	//delete
	public void deleteRole(Integer id);

}
