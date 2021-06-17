package spring.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class LoginController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub
		//ModelAndView mv;
		// TODO Auto-generated method stub
				String firstname= req.getParameter("firstname");
				String lastname=req.getParameter("lastname");
				String password = req.getParameter("pass");
				String confirm = req.getParameter("confirm passw");
				ModelAndView mv;
				if(firstname.isBlank() && lastname.isBlank() && password.isBlank() && confirm.isBlank())
				{
					mv =new ModelAndView("fail");
				}
				else {
					mv= new ModelAndView("success");
				}
				
				return mv;
	}

}
