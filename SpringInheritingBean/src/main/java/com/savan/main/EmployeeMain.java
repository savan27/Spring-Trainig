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
		Employee EmpBean = context.getBean("emp",Employee.class);
		EmpBean.getMassage1();
		EmpBean.getMassage2();
		
		//Child Class
		Address AddBean = context.getBean("add",Address.class);
		AddBean.getMassage1();
		AddBean.getMassage2();
		AddBean.getMassage3();
		
	}

}
