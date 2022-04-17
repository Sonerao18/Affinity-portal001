package com.nt.consumer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;



@Component
public class AddressRestConsumer {
	@Autowired
   private DiscoveryClient client;
	public String callAddrsShowMsg() {
		List<ServiceInstance> list = client.getInstances("ADDRESS-SERVICE");
		ServiceInstance si = list.get(0);
		String url=si.getUri() +"/addrs/show";
		RestTemplate rt=new RestTemplate();
		String responce = rt.getForObject(url, String.class);
		return responce;
	}
}
