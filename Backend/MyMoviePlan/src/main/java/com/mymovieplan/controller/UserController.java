package com.mymovieplan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mymovieplan.entity.User;
import com.mymovieplan.service.UserService;

@CrossOrigin(origins="http://localhost:3001")
@RestController
//@RequestMapping("api/")
public class UserController {
	@Autowired
	private UserService userService;

	@GetMapping("users")
	public List<User> loginUser(Model model) {
		return userService.getAllUsers();
	}
}
