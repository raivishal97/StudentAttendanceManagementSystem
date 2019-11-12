package com.example.demo.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.services.LoginService;

@RestController
public class UserController {

	
	@Autowired
	private LoginService service;
	
	@PostMapping(path = "/add", consumes = "application/json", produces = "application/json")
	public User add(User user) {
		return this.service.add(user);
	}
	
	
	
	
	public User findById(long userId) {
		User foundUser = null;
		Optional<User> user = this.service.findById(userId);
		
		if(user.isPresent()) {
			foundUser = user.get();
		}
		return foundUser;
	}
	
	
	@PostMapping(path = "/users/verify",consumes = "application/json", produces = "application/json")
	public int authenticate(@RequestBody User user) {
		int value=-1;
		User actualData = findById(user.getUserId());
		if(actualData.equals(user)) {
			value=1;
		}
		return value;
	}
}
