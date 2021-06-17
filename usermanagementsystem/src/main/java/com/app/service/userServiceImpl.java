package com.app.service;

import java.util.List;

import com.app.bean.Users;
import com.app.dao.UserDao;
import com.app.dao.UserDaoImpl;

public class userServiceImpl implements UserService {
     
	UserDao dao=new UserDaoImpl();
	int i=0;
	@Override
	public int registerUser(Users u) {
		if(!u.getName().equalsIgnoreCase("")
				|| !u.getPassword().equalsIgnoreCase("")
				|| !u.getMail().equalsIgnoreCase("") 
				|| u.getMobile()!=0)
			{
				i=dao.insertUser(u);
			}
		
		
		return i;
	}
	@Override
	public List<Users> getUsers() {
		List<Users> list=dao.getAllUsers();
		
		return list;
	}

}
