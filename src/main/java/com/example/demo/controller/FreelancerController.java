package com.example.demo.controller;


import com.example.demo.entity.Freelancer;
import com.example.demo.service.FreelancerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class FreelancerController {
	@Autowired
	private FreelancerService Freelancer;
	
	@GetMapping("/getfreelancer")
	public List<Freelancer> getFreelancer(){
		return this.Freelancer.getFreelancer();
	}


	@PostMapping("/registerfreelancer")
	public String addFreelancer(@RequestBody Freelancer freelancer,HttpSession session) {
		
		return this.Freelancer.addFreelancer(freelancer);
	}
	
	
	
	@PutMapping("/editFreelancer")
	public Freelancer editFreelancer(@RequestBody Freelancer freelancer){
		this.Freelancer.editFreelancer(freelancer);
		return freelancer;
	}

	@DeleteMapping("/deleteFreelancer/{fl_id}")
	public Freelancer deleteFreelancer(@PathVariable String fl_id){
		return this.Freelancer.deleteFreelancer(Long.parseLong(fl_id));
	}
	
	

}