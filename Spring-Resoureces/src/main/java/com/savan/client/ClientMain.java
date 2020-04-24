package com.savan.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

/**
 * @author SAVAN
 *
 */
public class ClientMain {
	
	public static void main(String[] args) {
		
		try {
			ApplicationContext context = new ClassPathXmlApplicationContext();
			
			//reading file from class path
			Resource banner = context.getResource("classpath:data.txt");
			
			if (banner.exists()) {
				System.out.println("resource Exists...");
			}
			
			InputStream is = banner.getInputStream();
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(is));
			
			while (true) {
				
				String line = reader.readLine();
				
				if (line == null) {
					break;
				}
				
				System.out.println(line);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
