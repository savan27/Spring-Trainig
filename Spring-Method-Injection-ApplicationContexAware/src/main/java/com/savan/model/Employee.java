package com.savan.model;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author SAVAN
 * 
 * Singleton Scope Bean
 *
 */
public class Employee implements ApplicationContextAware {

	private Address address;
	private ApplicationContext context;
	
	/**
	 * Default Constructor
	 */
	public Employee() {
		System.out.println("SingletonBean Initialize...!");
	}
	

	//utility method to get instance of prototype bean
	public Address getAddress() {

		address = context.getBean("prototypeBean",Address.class);
		return address;
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.context= applicationContext;
	}
}