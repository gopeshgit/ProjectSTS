package com.user.service;

import java.util.List;


import com.user.entities.Student;


public interface UserService {

	
	 

	  List<Student> getAllUser();

	Student saveUser(Student student);
}
