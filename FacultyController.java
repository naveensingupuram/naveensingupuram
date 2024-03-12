package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.model.faculty;
import com.example.demo.repository.FacultyRepo;

@RestController
@CrossOrigin("http://localhost:3000")
public class FacultyController {

	@Autowired
    private FacultyRepo repo;
	
	
    @PostMapping("/addf")
    faculty newUser(@RequestBody faculty newUser) {
    	System.out.println("faculty added");
        return repo.save(newUser);
    }

    @GetMapping("/freg")
    List<faculty> getAllUsers() {
    	System.out.println("fetching faculty data");
        return repo.findAll();
        
    }
	
	
}
