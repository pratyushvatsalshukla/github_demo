package com.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.app.bean.Users;
import com.app.dbconnection.DbConnect;

public class UserDaoImpl implements UserDao {

	@Override
	public int insertUser(Users u){
		int i=0;
		try
		{
			Connection con=DbConnect.getConnection();
			String sql="insert into users values(?,?,?,?);";
			PreparedStatement pst= con.prepareStatement(sql);
			pst.setString(1,u.getName());
			pst.setString(2,u.getPassword());
			pst.setString(3,u.getMail());
			pst.setLong(4,u.getMobile());
			
			i=pst.executeUpdate();
			
		}
		catch(SQLException e){
			e.printStackTrace();
		}		
		return i;
	}
	@Override
	public List<Users> getAllUsers()
	{
		List<Users> u=new ArrayList<>();
		try {
			Connection con=DbConnect.getConnection();
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("Select * from users");
			while(rs.next())
			{
				u.add(new Users(rs.getString(1),rs.getString(2),rs.getString(3),rs.getLong(4)));
								
			}
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		return u;
		
	}

}
