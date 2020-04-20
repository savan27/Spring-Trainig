package com.savan.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.savan.model.EmployeeModel;


/**
 * @author SAVAN
 *
 */
public class EmployeeMain {
	
	public static void main(String[] args) {

		// create and configure the bean
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		// retrieve configuration instance
		EmployeeModel emp = context.getBean("emp",EmployeeModel.class);
		
		// use Configuration instance
		System.out.println("First Name : "+emp.getFirstName());
		System.out.println("Last Name  : "+emp.getLastName());

	}

}
