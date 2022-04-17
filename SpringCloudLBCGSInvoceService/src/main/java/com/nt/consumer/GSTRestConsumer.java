package com.nt.consumer;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
@Component
public class GSTRestConsumer {
     @Autowired
	private LoadBalancerClient client;
     public String getdetailsFromGst() {
    	 // get service instace by using setvice id 
    	 ServiceInstance gstServiceInstance = client.choose("GST-SERVICE");
    	  // read uri from SI
    	 URI uri=gstServiceInstance.getUri();
    	 String path=uri+"/gst/data";
    	 // use Rest templete
    	 RestTemplate rt=new RestTemplate();
    	 // make http calls 
    	 String responce = rt.getForObject(uri, String.class);
    	 
    	 return responce;
     }
	  
}
