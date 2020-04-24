package com.savan.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.savan.model.ClientModel;

/**
 * @author SAVAN
 *
 */
public class ClientMain {
	
public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
			
		ClientModel bena = context.getBean("clientModel", ClientModel.class);
		
		bena.show();
		
	}

}
