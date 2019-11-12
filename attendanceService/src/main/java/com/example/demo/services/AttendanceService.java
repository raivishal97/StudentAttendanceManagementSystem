package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Attendance;
import com.example.demo.repos.AttendanceRepository;

@Service
public class AttendanceService {

	@Autowired
	private AttendanceRepository repo;
	
	
	
	
	
	
	public void add(Attendance entity) {
		this.repo.save(entity);
	}
	
	
	
	public List<Attendance> findAll(){
		return this.repo.findAll();
	}
	
	public Optional<Attendance> findById(long id) {
		return this.repo.findById(id);
	}
	
}
