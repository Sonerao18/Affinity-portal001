package com.nt.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


 @Component
public class ContractRestConsumer {
	//autowired discovetyclient 
     @Autowired
	 private DiscoveryClient client;
     public String getDataFromContract() {
    	 //call getInstance method
    	 List<ServiceInstance> instacesList = client.getInstances("CONTRACT-SERVICE");
    	 ServiceInstance contractInstance = instacesList.get(0);
    	 URI contractServiceUri = contractInstance.getUri();
    	 String url=contractServiceUri+"/contract/data";
    	 RestTemplate rt=new RestTemplate();
    	 String responce = rt.getForObject(url, String.class);
    	return responce;
     }
}
