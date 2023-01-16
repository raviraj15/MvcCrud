package com.BikkadIT.service;

import com.BikkadIT.entity.User;

public interface UserServiceI {

	public int saveUser(User user);
	
	public boolean loginCheckServiceLayer(User user);
	
}