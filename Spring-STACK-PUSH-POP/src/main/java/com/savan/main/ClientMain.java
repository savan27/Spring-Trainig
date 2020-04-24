package com.savan.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.expression.spel.CodeFlow.ClinitAdder;

import com.savan.configuration.ClientConfig;
import com.savan.opertion.ClientOperation;

/**
 * @author SAVAN
 *
 */
public class ClientMain {
	
	//initializing logger 
	private static final Logger logger = LogManager.getLogger(ClientMain.class);
	
	
	// execution starts here
	public static void main(String[] args) {
		
		//create and configure the bean
		ApplicationContext context = new AnnotationConfigApplicationContext(ClientConfig.class);

		boolean exit = false;
		
		do {
			
			List<Integer> list;
			int input;
			
			try {
				
				list = new ArrayList<Integer>();
				list.add(1);
				list.add(9);
				list.add(5);
				list.add(1);
				list.add(3);
				list.add(7);
				list.add(8);
				list.add(6);
				
				Scanner s = new Scanner(System.in); // Scanner Class Object
				
				System.out.println("Enter :-\n 1. Print List\n 2. Add Element\n 3. Remove Element\n 4. Insertion Sort\n 5. Exit");
				
				input = s.nextInt();
				
				// check for exit
				if (input == 5) {
					exit = true;
					logger.info("Exit Succesfull");
				}
				
				//retrieve configuration instance
				ClientOperation bean = context.getBean("clientOperation", ClientOperation.class);
				
				//use Configuration instance
				bean.execute(input, list);
				
			} catch (Exception e) {
				logger.error(" * Positive Integer Numbers Only..!!");
			}
		} while (!exit);
	}

}
