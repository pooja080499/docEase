package com.docEase.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
	
	
	@GetMapping("/User_Dashboard")
	public String dashboard(Model model)
	{
		
		
		
		return "patient_dashboard";
	}

}
