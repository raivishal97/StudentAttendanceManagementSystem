package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Entity
@Data
@Table(name="login1297")
public class User {
	
	@Id
	private long userId;
	private String passWord;
	private String userType;
}
