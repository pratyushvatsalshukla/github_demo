package com.doctormanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.doctormanagement.entities.Doctor;
import com.doctormanagement.service.DoctorServiceImpl;
//import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("doctor")
public class RegisterController {
	
	@Autowired
	private DoctorServiceImpl service;
	
	@GetMapping("reg")
	//@RequestMapping(value="reg", method=RequestMethod.GET)
	public String register(Model m) {
		
		m.addAttribute("doctor",new Doctor());
		m.addAttribute("msg","this is registration page");
		
		return "Register";
		
	}
	
	@GetMapping("save")
	public String registerDoctor(@ModelAttribute Doctor doct,Model m ) {
		
		System.out.println("doctor id :"+doct.getDid());
		System.out.println("doctor name: "+doct.getDname());
		System.out.println("special "+doct.getSpecialization());
		
		int i=service.insertDoctor(doct);
		
		if(i!=0) {
		m.addAttribute("doctor",new Doctor());
		m.addAttribute("msg","Registration success. Registration id is: "+i);
		}
		return "Register";
		
		
	}
	
	
	
	

}
