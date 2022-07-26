package com.example.demo.controller;

import com.example.demo.entity.Admin;
import com.example.demo.service.AdminService;
import com.example.demo.entity.Login;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class AdminController {
	@Autowired
	private AdminService Admin;
    
	@GetMapping("/getadmin")
	public List<Admin> getAdmin(){
		return this.Admin.getAdmin();
	}
	
	
	@PostMapping("/admin-login")
	public Admin validateAdmin(@RequestBody Login login) {
		List<Admin> admin = getAdmin();
		for(Admin u:admin){
			if((login.getMobileNumber().equals(u.getMobileNumber()))&&(login.getPassword().equals(u.getPassword()))) 
			{
				return u;
			}
		}
		return null;
	}

}
	

	

