package com.bank.bank.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class AdminController {
	
	@GetMapping ("admin")
	public ModelAndView AdminA() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("Bank/Admin");
		return modelAndView;
	}
}
