package com.bank.bank.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bank.bank.bank.entity.BankDetails;
import com.bank.bank.bank.service.BankService;

@Controller
public class BankController {
	
	
	@Autowired
	BankService bankService;

	@GetMapping("welcome")
	public ModelAndView welcomeA() {
		ModelAndView modelAndView = new ModelAndView();
		BankDetails bankDetails = new BankDetails();
		
		modelAndView.addObject("bankDetails", bankDetails);
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
	
	@PostMapping("savebank")
	public ModelAndView savebank(BankDetails bankDetails) {
		ModelAndView modelAndView=new ModelAndView();

		BankDetails bankDetails1 = new BankDetails();
		bankDetails1 = bankService.saveBank(bankDetails);
		modelAndView.addObject("bankDetails", bankDetails1);
		modelAndView.setViewName("Bank/Welcome");
		return modelAndView;
		
		
	}	
}
