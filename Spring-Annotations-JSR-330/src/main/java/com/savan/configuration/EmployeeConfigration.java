package com.savan.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

import com.savan.model.Address;
import com.savan.model.Employee;

/**
 * @author SAVAN
 *
 */
@Configuration
@ComponentScan(basePackages = "com.savan.model")
public class EmployeeConfigration {
	
	@Bean
	public Employee empBena() {
		Employee emp = new Employee();
		return emp;
	}
	
	@Bean(name = "add1")
	public Address addBena() {
		return new Address();
	}
	
	@Bean
	public Address addBena1() {
		return new Address();
	}

}
