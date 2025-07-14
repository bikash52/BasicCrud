package com.BasicCRUD.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.BasicCRUD.entity.User;

public interface UserRepository extends CrudRepository<User, Long>{

	//Finder methods should be abstract
	//Should start with findByVariablename
	
	Optional<User> findByEmail(String email);
	Optional<User> findByMobile(String mobile);
	Iterable<User> findByEmailOrMobile(String email, String mobile);
	Optional<User> findByEmailAndMobile(String email, String mobile);
}
