package com.savan.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.savan.model.Employee;

/**
 * @author SAVAN
 *
 */
public class EmployeeMain {
	
	public static void main(String[] args) {
		
		//create and configure the bean
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		//retrieve configuration instance 
		Employee bean = context.getBean("emp",Employee.class);
		
		//use Configuration instance
		bean.display();
		
		//call the relevant destroy methods for graceful shutdown
		context.registerShutdownHook();
	}

}
