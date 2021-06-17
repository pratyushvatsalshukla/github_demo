package com.app.controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.app.bean.Users;
import com.app.service.UserService;
import com.app.service.userServiceImpl;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Registration
 */
@WebServlet("/reg")
public class Registration extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Registration() {
        
    	
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Hai I am from Server....");
		String username=request.getParameter("name");
		String password=request.getParameter("pwd");
		String email=request.getParameter("em");
		Long mobile=Long.parseLong(request.getParameter("ph"));
		 
		Users u=new Users(username,password,email,mobile);
		UserService service=new userServiceImpl();
		
		int i=service.registerUser(u);
		if(i!=0)
		{
			RequestDispatcher rd = request.getRequestDispatcher("/success.html");
			rd.forward(request, response); 
		}
		else
		{
			RequestDispatcher rd = request.getRequestDispatcher("/failure.html");
			rd.forward(request, response); 
		}
			
		
		/*
		 * PrintWriter out = response.getWriter();
		 * out.println("UserName is: "+username); 
		 * out.println("Password is: "+password);
		 * out.println("Email id: "+email); 
		 * out.println("Mobile No.: "+mobile);
		 */
		 
		
			/*
			 * RequestDispatcher rd = request.getRequestDispatcher("/success.html");
			 * rd.forward(request, response); 
			 * rd.include(request, response);
			 *  response.sendRedirect("./failure.html");
			 */
		 
		  
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
