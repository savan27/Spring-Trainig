/**
 * 
 */
package com.savan.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.savan.model.Collage;
import com.savan.model.Employee;

/**
 * @author inex2
 *
 */
@Configuration
@ComponentScan(basePackages = "com.savan.model")
public class Config {
	
	@Bean
	public Collage collage() {
		Collage collage = new Collage();
		collage.setDirector(employee());
		return collage;
	}
	
	@Bean
	public Employee employee() {
		return new Employee();
	}

}
