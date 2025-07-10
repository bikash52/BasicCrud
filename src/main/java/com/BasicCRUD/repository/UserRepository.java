package com.BasicCRUD.repository;

import org.springframework.data.repository.CrudRepository;

import com.BasicCRUD.entity.User;

public interface UserRepository extends CrudRepository<User, Long>{

}
