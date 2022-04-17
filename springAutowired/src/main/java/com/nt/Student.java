package com.nt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("student")
public class Student {
  
	private int  sid;
	private String sname;
	@Autowired
	private Address addrs;
	
}
