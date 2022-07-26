package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.User;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long>{
    boolean existsUserByEmail(String emailId);
    boolean existsUserByMobile(String mobile);
    User findById(String id);
    User findByEmail(String emailId);


}