package com.mymovieplan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mymovieplan.database.UserRepository;
import com.mymovieplan.entity.User;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepo;
	
	public List<User> getAllUsers(){
		return (List<User>) this.userRepo.findAll();
	}
	
	public List<User> findUserByName(String name){
		return this.userRepo.findByName(name);
	}
	
	public List<User> findUserByEmail(String email){
		return this.userRepo.findByEmail(email);
	}
	
	public void addUser(User user) {
		this.userRepo.save(user);
	}
}
