package com.user.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.entities.Student;

public interface UserRepository extends JpaRepository<Student, String> {

}
