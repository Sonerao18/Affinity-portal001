package com.nt.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp")
public class EmployeeRestController {
	@Value("${user}")
    String userName;
	@Value("passw")
    String password;
	@GetMapping("/show")
	public String showData() {
		return "Data Collected throw config server :"+userName+" : "+password;
	}
}
