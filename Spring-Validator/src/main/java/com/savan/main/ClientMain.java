package com.savan.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.savan.config.ClientConfig;
import com.savan.model.ClientBean;

/**
 * @author SAVAN
 *
 */
public class ClientMain {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ClientConfig.class);
		
		ClientBean bean = context.getBean(ClientBean.class);
		
		bean.processOrder();
		
	}

}
