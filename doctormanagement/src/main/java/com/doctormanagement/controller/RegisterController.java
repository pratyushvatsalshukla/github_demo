package com.doctormanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.doctormanagement.entities.Doctor;
import com.doctormanagement.entities.Login;
import com.doctormanagement.service.DoctorServiceImpl;
//import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("doctor")
public class RegisterController {

	@Autowired
	private DoctorServiceImpl service;

	@GetMapping("reg")
	// @RequestMapping(value="reg", method=RequestMethod.GET)
	public String register(Model m) {

		m.addAttribute("doctor", new Doctor());
		m.addAttribute("msg", "this is registration page");

		return "Register";

	}

	@GetMapping("save")
	public String registerDoctor(@ModelAttribute Doctor doct, Model m) {

		System.out.println("doctor id :" + doct.getDid());
		System.out.println("doctor name: " + doct.getDname());
		System.out.println("special " + doct.getSpecialization());

		int i = service.insertDoctor(doct);

		if (i != 0) {
			m.addAttribute("doctor", new Doctor());
			m.addAttribute("msg", "Registration success. Registration id is: " + i);
		}
		return "Register";

	}

	@GetMapping("loginpage")
	public String loginpage(Model m) {

		m.addAttribute("loginob", new Login());
		// m.addAttribute("msg","this is registration page");

		return "login";

	}

	@PostMapping("validatelogin")
	public String loginValidation(@ModelAttribute Login login, Model m) {
		int i = 0;

		Doctor d = service.getDoctor(login.getDid());

		if (login.getDid() == d.getDid() && login.getDname().equalsIgnoreCase(d.getDname()))
			i = 1;

		if (i != 0) {
			m.addAttribute("name", login.getDname());

		}
		return "welcome";

	}

	@GetMapping("alldoctors")
	public String getAllDoctors(Model m) {

		List<Doctor> d = service.getAllDoctor();

		m.addAttribute("list", d);
		System.out.println(d);
		return "welcome";

	}

	@GetMapping("delete")
	public String deleteDoctor(@RequestParam Integer id, Model m) {

		service.deleteDoctor(id);

		List<Doctor> d = service.getAllDoctor();

		m.addAttribute("list", d);
		System.out.println("deleted doctor id is   ------------>" + id);
		return "welcome";

	}

}
