package com.example.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repos.UserRepository;

@Service
public class LoginService {
	@Autowired
	private UserRepository repo;
	
	
	public User add(User user) {
		return this.repo.save(user);
	}
	
	
	public Optional<User> findById(long id) {
		return this.repo.findById(id);
	}
	
	
}
