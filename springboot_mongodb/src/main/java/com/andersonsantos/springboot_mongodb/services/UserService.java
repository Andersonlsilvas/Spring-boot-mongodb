package com.andersonsantos.springboot_mongodb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andersonsantos.springboot_mongodb.Repository.UserRepository;
import com.andersonsantos.springboot_mongodb.entities.User;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	
	public List<User> findAll(){
		return userRepository.findAll();
		
	}	

}
