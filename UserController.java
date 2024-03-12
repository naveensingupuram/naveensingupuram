package com.example.demo.controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.repository.UserRepository;
import com.example.demo.model.User;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("http://localhost:3000")
public class UserController {

	@Autowired(required = true)
	private UserRepository repo;

    @PostMapping("/user")
    User newUser(@RequestBody User newUser) {
    	System.out.println("student added");
        return repo.save(newUser);
    }

    @GetMapping("/users")
    List<User> getAllUsers() {
    	System.out.println("fetching all");
        return repo.findAll();
        
    }

//    @GetMapping("/user/{id}")
//    User getUserById(@PathVariable Long id) {
//        return userRepository.findById(id)
//                .orElseThrow(() -> new UserNotFoundException(id));
//    }
//
//    @PutMapping("/user/{id}")
//    User updateUser(@RequestBody User newUser, @PathVariable Long id) {
//        return userRepository.findById(id)
//                .map(user -> {
//                    user.setUsername(newUser.getUsername());
//                    user.setName(newUser.getName());
//                    user.setEmail(newUser.getEmail());
//                    return userRepository.save(user);
//                }).orElseThrow(() -> new UserNotFoundException(id));
//    }
//
//    @DeleteMapping("/user/{id}")
//    String deleteUser(@PathVariable Long id){
//        if(!userRepository.existsById(id)){
//            throw new UserNotFoundException(id);
//        }
//        userRepository.deleteById(id);
//        return  "User with id "+id+" has been deleted success.";
//    }

//    @PostMapping("/userLogin")
//	public String loginUser(@RequestParam("student_Name") String student_Name,@RequestParam("Password") String Password,User user ) {
//		String student_Name1=user.getStudent_Name();
//		Optional<User> userdata=repo.findByName(student_Name1);
//		
//		if(user.getPassword().equals(userdata.get().getPassword())) {
//			return "home";
//		}
//		else {
//		return "error";
//		}
//		
//		
//	}
    
    


}