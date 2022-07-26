package com.example.demo.service;


import com.example.demo.entity.User;

import java.util.List;

public interface UserService {
	public List<User> getUser();

	public String addUser(User user);

    User editUser(User user);

	User deleteUser(long id);
}