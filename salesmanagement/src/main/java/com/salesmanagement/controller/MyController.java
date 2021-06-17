package com.salesmanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.salesmanagement.entity.Product;

@Controller
@RequestMapping("emp")
public class MyController {
	@GetMapping("show")
	public String show(Model m) {
		System.out.println("rrrr");
		m.addAttribute("product",new Product());
		return "home";
	}
	
	@PostMapping("save")
	public String insertProduct(@ModelAttribute Product product,Model map) {
		
		
		System.out.println(product.getPname()+"  "+product.getCode());
		map.addAttribute("msg","details are reached ..");
		map.addAttribute("prodcut",new Product());
		
		return "home";
		
		
	}

}
