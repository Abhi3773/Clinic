package com.faith.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.faith.app.model.User;
@Repository
public interface IUserRepository extends CrudRepository<User, Integer> {
	
	@Query("FROM User WHERE userName=?1 AND password=?2")
	User findByUserNameAndPassword(String userName,String password);
	
	List<User> findByRoleId(Integer roleId);

}
