package com.smartcity.repositories;

import org.springframework.data.repository.CrudRepository;

import com.smartcity.models.User;

public interface UserRepository  extends CrudRepository<User, Long> {
	
	User findbyEmail(String email);
	

}
