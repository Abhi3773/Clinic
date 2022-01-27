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

import com.faith.app.model.Role;
import com.faith.app.service.IRoleService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class RoleController {

	//get instance --- ioc
	@Autowired
	private IRoleService roleService;
	
	//httpMethods
	//get all roles
	@GetMapping("/roles")
	public List<Role> getAllRoles() {
		return roleService.getAllRoles();
	}
	
	//get role by id
	@GetMapping("/roles/{id}")
	public Optional<Role> getRoleById(@PathVariable Integer id) {
		return roleService.getRoleById(id);
	}
	
	//insert
	@PostMapping("/roles")
	public void addRole(@RequestBody Role role) {
		roleService.addRole(role);
	}
	
	//update
	@PutMapping("/roles")
	public void updateRole(@RequestBody Role role) {
		roleService.updateRole(role);
	}
	
	//delete
	@DeleteMapping("/roles/{id}")
	public void deleteRole(@PathVariable Integer id) {
		roleService.deleteRole(id);
	}
}
