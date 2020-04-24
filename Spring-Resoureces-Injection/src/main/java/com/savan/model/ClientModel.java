package com.savan.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.InputStreamSource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

/**
 * @author SAVAN
 *
 */
public class ClientModel {
	
	
	private Resource resource;

	/**
	 * @return the resource
	 */
	public Resource getResource() {
		return resource;
	}

	/**
	 * @param resource the resource to set
	 */
	public void setResource(Resource resource) {
		this.resource = resource;
	}




	public void show() {
		
		try {
			
		    InputStream is = resource.getInputStream();
			
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
