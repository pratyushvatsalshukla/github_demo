package com.app.dao;

import java.util.List;

import com.app.bean.Users;

public interface UserDao {
	public int insertUser(Users u);
	public List<Users> getAllUsers();
}
