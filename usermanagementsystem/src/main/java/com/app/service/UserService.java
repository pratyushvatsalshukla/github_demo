package com.app.service;

import java.util.List;

import com.app.bean.Users;

public interface UserService {
	public int registerUser(Users u);
	public List<Users> getUsers();

}
