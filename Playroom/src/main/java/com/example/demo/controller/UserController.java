package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;

	// Metodi Crud
	@GetMapping("/getAllUsers")
	public List<User> getAllUsers() {
		return userService.getAllUser();
	}

	@PostMapping("/addUser")
	public void addUser(@RequestBody User user) {
		userService.saveUser(user);
	}

	@DeleteMapping("/deleteMapping/{id}")
	public void deleteUser(@PathVariable("id") Long id) {
		userService.deleteUser(id);
	}

	@PutMapping("/updateUser/{id}")
	public void updateUser(@PathVariable("id") Long id, @RequestBody User user) {
		userService.update(id, user);
	}
}
