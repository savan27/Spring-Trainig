package com.savan.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.savan.model.Employee;

/**
 * @author SAVAN
 *
 */
public class EmployeeMain {
	
	public static void main(String[] args) {
		
		//create and configure the bean
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		//retrieve configuration instance 
		Employee bean = context.getBean("emp",Employee.class);
		
		//use Configuration instance
		bean.display();
		
	}

}
