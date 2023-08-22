package com.user.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import com.user.entities.Student;
import com.user.repositories.UserRepository;

public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository userRepository;

	@Override
	public Student saveUser(Student student) {
		
		//generate unique userId
	String randomUserId=UUID.randomUUID().toString();
		student.setId(randomUserId);
		return userRepository.save(student);
	}
	@Override
	public List<Student> getAllUser() {
		return userRepository.findAll();
	}
	}

	
	


