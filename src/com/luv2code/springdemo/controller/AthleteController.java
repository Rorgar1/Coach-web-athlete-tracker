package com.luv2code.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/athlete")
public class AthleteController {
	
	@RequestMapping("/list")
	public String listAthletes(Model theModel) {
		
		return "list-athletes";
	}

}
