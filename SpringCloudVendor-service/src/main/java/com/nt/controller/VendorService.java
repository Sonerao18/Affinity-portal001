package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vendor")
public class VendorService {
	@Autowired
	private ContractRestConsumer consumer; 
    @GetMapping("/info")
	public String GetInfo() {
		 return "from vendor =>"+consumer.getDataFromContract();
	}
}
