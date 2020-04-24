package com.savan.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.savan.configuration.EmployeeConfigration;
import com.savan.model.Employee;

/**
 * @author SAVAN
 *
 */
public class EmployeeMain {
	
	public static void main(String[] args) {
		
		//create and configure the bean
		ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfigration.class);
		
		//retrieve configuration instance 
		Employee bean = context.getBean("employee",Employee.class);

		//use Configuration instance
		bean.test();
		
		// closing Context 
		((AnnotationConfigApplicationContext)context).close();
	}

}
