package com.faith.app.repository;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.faith.app.model.Role;

@Repository
public interface IRoleRepository extends CrudRepository<Role, Integer> {
	
	

}
