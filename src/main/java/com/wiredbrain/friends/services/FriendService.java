package com.wiredbrain.friends.services;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.wiredbrain.friends.model.Friend;

@CrossOrigin(origins = "http://localhost:4200")
public interface FriendService extends CrudRepository<Friend, Integer> {

	Iterable<Friend> findByFirstNameAndLastName(String firstName, String lastName);
	
	Iterable<Friend> findByFirstName(String firstName);
	
	Iterable<Friend> findByLastName(String lastName);
	
}
