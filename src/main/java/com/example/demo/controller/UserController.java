package com.example.demo.controller;

import com.example.demo.entity.Login;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {
	@Autowired
	private UserService User;
	
	@GetMapping("/getuser")
	public List<User> getUser(){
		return this.User.getUser();
	}


	@PostMapping("/signup")
	public String addUser(@RequestBody User user,HttpSession session) {
		//user.setRole("user");
		return this.User.addUser(user);
	}
	
	
	@PostMapping("/login")
	public User validateUser(@RequestBody Login login) {
		List<User> user = getUser();
		for(User u:user){
			if((login.getMobileNumber().equals(u.getMobileNumber()))&&(login.getPassword().equals(u.getPassword()))) 
			{
				return u;
			}
		}
		return null;
	}
	
	@PutMapping("/editUser")
	public User editUser(@RequestBody User user){
		this.User.editUser(user);
		return user;
	}

	@DeleteMapping("/deleteUser/{id}")
	public User deleteUser(@PathVariable String id){
		return this.User.deleteUser(Long.parseLong(id));
	}
	
	

}