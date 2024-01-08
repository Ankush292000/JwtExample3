package com.jwt.exmple.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.jwt.exmple.model.User;
@Service
public class UserService {

	private List<User> store = new ArrayList<>();
	
	public UserService() {
		store.add(new User(UUID.randomUUID().toString(),"Ankush Boraste","A@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(),"sanket Boraste","B@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(),"Ram Boraste","C@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(),"Durgesh Boraste","d@gmail.com"));
	}
	
	public List<User> getUsers(){
		return this.store;
	}
}
