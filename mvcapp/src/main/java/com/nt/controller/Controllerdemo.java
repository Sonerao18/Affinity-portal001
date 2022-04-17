package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controllerdemo {
	@GetMapping("show")
	public String show(Model model) {
		model.addAttribute("msg", "wlcome to web mvc");
		return "home.jsp";

	}
}
