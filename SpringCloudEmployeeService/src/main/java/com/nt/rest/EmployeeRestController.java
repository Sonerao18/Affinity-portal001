package com.nt.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.consumer.AddressRestConsumer;

@RestController
@RequestMapping("/emp")
public class EmployeeRestController {
	@Autowired
	private AddressRestConsumer cosumer;
    @GetMapping("/info")
	public String getDetails() {
		return"from employee"+cosumer.callAddrsShowMsg();
	}
	
}
