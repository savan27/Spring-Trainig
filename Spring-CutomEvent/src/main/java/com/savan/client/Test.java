package com.savan.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.savan.main.CustomEventPublishr;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		CustomEventPublishr bean = context.getBean("CustomEventPublishr", CustomEventPublishr.class);
		
		bean.publishEvent();
		
		((AbstractApplicationContext) context).close();
	}
	
}
