package com.storemanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Home {
	String message = "Welcome to Store Manager!";
	 
	@RequestMapping("/hello")
	public ModelAndView showMessage() {
		System.out.println("in controller");
 
		ModelAndView mv = new ModelAndView("Home");
		mv.addObject("message", message);
		return mv;
	}
}
