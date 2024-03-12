package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.faculty;

public interface FacultyRepo extends JpaRepository<faculty,Integer>{

	//String deleteAllById(faculty a);

}
