package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepo;

@Service
public class UserService {
	@Autowired
	private UserRepo userRepo;

	public List<User> getAllUser() {
		return userRepo.findAll();
	}

	@SuppressWarnings("deprecation")
	public void saveUser(User user) {
		userRepo.save(user);
	}

	public void deleteUser(Long id) {
		userRepo.deleteById(id);
	}

	@SuppressWarnings("deprecation")
	public void update(Long id, User user) {
		User updateUser = new User();
		updateUser = userRepo.getById(id);
		updateUser.setName(user.getName());
		updateUser.setPassword(user.getPassword());
		updateUser.setRole(user.getRole());
		userRepo.save(updateUser);
	}
}
