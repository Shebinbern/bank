package com.bank.bank.bank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BankController {

	@GetMapping("welcome")
	public ModelAndView welcomeA() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("Bank/Welcome");
		return modelAndView;
	}
	@GetMapping("thankyou")
	public ModelAndView ThankYou() {
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("Bank/Thankyou");
		return modelAndView;
		}
	@GetMapping("successfully")
	public ModelAndView Successfully() {
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("Bank/Successfully");
		return modelAndView;
		}
	}
