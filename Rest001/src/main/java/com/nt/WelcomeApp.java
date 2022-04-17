package com.nt;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeApp {
      @GetMapping("/welcome")
	  public String getMassesges( String name) {
		
		  return "welcome to Spring Rest App "+ name;
		  
	  }
}
