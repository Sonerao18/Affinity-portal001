package com.nt.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/invoice")
public class InvoiceServiceRestController {
	@Autowired
	private GSTRestConsumer gstConsumer;
   @GetMapping("/info")
	public String showInfo() {
		return "from invoce"+gstConsumer.getdetailsFromGst();
	}
}
