package com.andersonsantos.springboot_mongodb.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andersonsantos.springboot_mongodb.Repository.PostRepository;
import com.andersonsantos.springboot_mongodb.entities.Post;
import com.andersonsantos.springboot_mongodb.services.exception.ObjectNotFoundException;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repo;
	
	
	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Object not fond"));
		}

	public List<Post> findByTitle(String text){
		return repo.searchTitle(text);
	}
}

