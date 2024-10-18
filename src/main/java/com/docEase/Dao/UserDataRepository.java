package com.docEase.Dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.docEase.entities.User;

public interface UserDataRepository extends CrudRepository<User,Integer>{
	
	
	@Query("Select u from User u where u.email=:email")
	public User getUserByUserName(@Param("email") String email);

}
