package com.learn.integration;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;

public class SpringIntegrationInterChannelExample {
    private MessageChannel orderConfirmationChannel;
    
    public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        SpringIntegrationInterChannelExample springIntExample = (SpringIntegrationInterChannelExample) context.getBean("springIntChannelExample");
        springIntExample.postOrder();
    }
    
    public void postOrder() {
        Order emp = new Order(1);
        Message<Order> msg = MessageBuilder.withPayload(emp).build();        
        orderConfirmationChannel.send(msg);
    }

    public void setOrderConfirmationChannel(MessageChannel orderConfirmationChannel) {
        this.orderConfirmationChannel = orderConfirmationChannel;
    }     
}
