package com.nt.runner;

import java.util.Date;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component("ms")
public class MessageSender  {
     @Autowired
	 private JmsTemplate jt;
     @Value("${my.mq.desti-name}")
     String destination;
	@Scheduled(cron = " */1 * * * * *")
	public void send() {
		
          jt.send(destination,(session)->session.createTextMessage("MSG from provider =>"+new Date()) );
          System.out.println("massege send ");
          
         /* jt.send(destination,new MessageCreator() {
			
			@Override
			public Message createMessage(Session session) throws JMSException {
				// TODO Auto-generated method stub
				session.createTextMessage("MSG from provider =>"+new Date());
				return null;
			}
		});
	}*/
}
}
