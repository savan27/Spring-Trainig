package com.savan.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.savan.model.Address;
import com.savan.model.Developer;
import com.savan.model.Employee;
import com.savan.model.User;


/**
 * @author SAVAN
 *
 */
@Configuration
@ComponentScan(basePackages = "com.savan.model")
@PropertySource(value = { "spring.properties" })
public class EmployeeConfigration {
/*	
	@Bean(name = "emp")
	public Employee empBean() {		//empBena = Bean Id (default name)
		Employee emp = new Employee();
		emp.setAddress(addBean());	//setter injection
		emp.setUser(dev()); 	//setter injection on interface
		return emp;
	}
	
	@Bean
	public Address addBean() {
		return new Address();
	}
	
	@Bean
	public User dev() {		//User is Interface
		return new Developer();		//Developer is implementation Class
	}
*/
}
