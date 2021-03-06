package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.nt.runner.MessageSender;

@SpringBootApplication

@EnableScheduling
public class SpringCloudJmsProducerApplication {
 
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringCloudJmsProducerApplication.class, args);
	//	MessageSender msgsndr = ctx.getBean("ms",MessageSender.class);
	//	msgsndr.send();
	}

}
