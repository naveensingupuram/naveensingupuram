package com.example.demo.repository;

import com.example.demo.model.User;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {

//	Optional<User> findByname(String student_Name1);
//
//	Optional<User> findByName(String student_Name1);

	//Optional<User> findById(String student_Name);
}