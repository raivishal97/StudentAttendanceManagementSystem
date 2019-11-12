package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Attendance;
import com.example.demo.services.AttendanceService;

@RestController
public class AttendanceController {

	
	@Autowired
	private AttendanceService service;
	
	
	@GetMapping(path = "/attendance")
	public List<Attendance> findAll() {
		return this.service.findAll();
	}
	
	@PostMapping(path = "/add", consumes = "application/json", produces = "application/json")
	public void add(Attendance entity) {
		this.service.add(entity);
	}
	
	
	@GetMapping(path="/find/{id}")
	public Attendance findAttendanceById(@PathVariable("id") long id) {
		Attendance atnd = null;
		Optional<Attendance> atdn = this.service.findById(id);
		if(atdn.isPresent()) {
			atnd = atdn.get();
		}
		return atnd;
	}
	
	
	
	
}
