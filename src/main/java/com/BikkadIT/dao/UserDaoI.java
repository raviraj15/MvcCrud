
package com.BikkadIT.dao;

import java.util.List;

import com.BikkadIT.entity.User;

public interface UserDaoI {

	public int saveUserToDb(User user);

	public List<User> getAllData();

	List<User> getAllDataFromDB();
}