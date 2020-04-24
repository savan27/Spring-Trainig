/**
 * 
 */
package com.savan.main;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author SAVAN
 *
 */
public class ClientMain {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		System.out.println("Message Form en_us : "+ context.getMessage("message", null, Locale.US));
		
		System.out.println("Message Form en_GERMAN : "+ context.getMessage("message", null, Locale.GERMANY));
		
		((AbstractApplicationContext) context).close();
	}

}
