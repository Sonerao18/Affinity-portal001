package com.nt.service;

import org.springframework.stereotype.Service;

@Service("wservice")
public class WishServiceImpl  implements IwishService{

	public String wishmassege() {
		  
		return "good evening sonerao";
	}

	

}
