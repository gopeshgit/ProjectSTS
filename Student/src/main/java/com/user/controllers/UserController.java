package com.user.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.entities.Student;
import com.user.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	
	@Autowired
	private UserService userService;
	
	//create
	@PostMapping
	public ResponseEntity<Student>createUser(@RequestBody Student user){
		Student user1 = userService.saveUser(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(user1);
	}
	
	
	
	//all user get
	@GetMapping
	public ResponseEntity<List<Student>> getAllUser(){
		List<Student> allUser= userService.getAllUser();
		return ResponseEntity.ok(allUser);
	}
	
	
	

}

