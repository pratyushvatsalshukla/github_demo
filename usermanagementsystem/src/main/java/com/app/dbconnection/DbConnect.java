package com.app.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnect {
	static Connection con=null;
	
	public static Connection getConnection()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
		    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","1023");
;		}
		catch(ClassNotFoundException | SQLException ce) {
			ce.printStackTrace();
		}
		
		return con;
	}
}
