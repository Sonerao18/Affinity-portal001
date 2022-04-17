package com.nt;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShowhomeController {
@RequestMapping("/welcome")	
public String showhomePage() {
	return "home";
	
}
}
