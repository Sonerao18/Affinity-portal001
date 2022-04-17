package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyHomeController {
	@RequestMapping("/")
public String showHomePage() {
	return"home";
}
	
}
