package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nt.service.WishServiceImpl;

@Controller
public class MyHomeController {
	@Autowired
  private	WishServiceImpl wservice;
	@RequestMapping("/")
public String showHomePage() {
	return"home";
}    @RequestMapping("/wish")
	public String showViewMassege(Model model) {
		
		String result=wservice.wishmassege();
		model.addAttribute("wmsg",result);
		return "display";
		
	}
	
}
