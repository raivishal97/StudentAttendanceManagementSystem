package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repos.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository repo;
	
	
	public Student add(Student stud) {
		return this.repo.save(stud);
	}
	
	public List<Student> findAll(){
		return this.repo.findAll();
	}
}
