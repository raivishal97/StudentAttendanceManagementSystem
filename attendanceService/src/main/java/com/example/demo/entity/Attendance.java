package com.example.demo.entity;

import java.time.LocalDate;

import javax.persistence.Entity;

import org.springframework.data.annotation.Id;

@Entity
public class Attendance {

	@Id
	private long dummyId;
	private long id;
	private LocalDate absentDate;
}
