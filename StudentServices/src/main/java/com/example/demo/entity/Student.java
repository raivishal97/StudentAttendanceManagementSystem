package com.example.demo.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



import lombok.Data;

@Entity
@Table(name="student1297")
@Data
public class Student {

	
	@Id
	private long studentId;
	private String studentName;
}
