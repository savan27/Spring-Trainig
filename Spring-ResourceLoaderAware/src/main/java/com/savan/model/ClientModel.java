package com.savan.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

/**
 * @author SAVAN
 *
 */
public class ClientModel implements ResourceLoaderAware {
	
	private ResourceLoader resourceLoader;

	public void setResourceLoader(ResourceLoader resourceLoader) {
		this.resourceLoader = resourceLoader;
	}

	public void show() {
		
		try {
			Resource banner = resourceLoader.getResource("file:/home/inex2/eclipse-workspace-Spring/Track_Record");
			
			if (banner.exists()) {
				System.out.println("resource Exists...");
			}
			
			InputStream  is = banner.getInputStream();
			
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
