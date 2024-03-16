package com.andersonsantos.springboot_mongodb.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.andersonsantos.springboot_mongodb.entities.User;

@Repository
public interface UserRepository extends	MongoRepository<User, String>{
	

}
