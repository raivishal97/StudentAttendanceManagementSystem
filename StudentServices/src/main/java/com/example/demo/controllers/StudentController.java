package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.services.StudentService;

@RestController
@RequestMapping("stud")
public class StudentController {
	@Autowired
	private StudentService service;
	
	
	
	@PostMapping(path = "/student", produces = "application/json", consumes = "application/json")
	public Student add(@RequestBody Student stud) {
		return this.service.add(stud);
	}
	
	@GetMapping(path = "/students")
	public List<Student> findAll(){
		return this.service.findAll();
	}

}
