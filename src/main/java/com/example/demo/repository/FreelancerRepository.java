package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Freelancer;

import java.util.List;

public interface FreelancerRepository extends JpaRepository<Freelancer,Long>{
    boolean existsUserByEmail(String emailId);
    boolean existsUserByMobile(String mobile);
    Freelancer findById(String id);
    Freelancer findByEmail(String emailId);


}