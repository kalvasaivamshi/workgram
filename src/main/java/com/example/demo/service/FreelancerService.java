package com.example.demo.service;


import com.example.demo.entity.Freelancer;

import java.util.List;

public interface FreelancerService {
	public List<Freelancer> getFreelancer();

	public String addFreelancer(Freelancer fl);

    Freelancer editFreelancer(Freelancer fl);

	Freelancer deleteFreelancer(long id);
}