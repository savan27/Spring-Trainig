package com.savan.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.savan.model.Address;
import com.savan.model.Employee;

/**
 * @author SAVAN
 *
 */
public class EmployeeMain {
	
	public static void main(String[] args) {
		
		//create and configure the bean
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		//Parent Class
		Employee EmpBean = context.getBean("singletonBean",Employee.class);

		//create two prototypeBean instance
		Address add1 = EmpBean.getAddress();
		Address add2 = EmpBean.getAddress();
		System.out.println(add1);
		System.out.println(add2);
		
		//Compare both the objects
		System.out.println("Id Add1 and Add2 are sme : "+(add1 == add2));
		
	}

}
