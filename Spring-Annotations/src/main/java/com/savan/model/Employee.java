package com.savan.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author SAVAN
 *
 */
@Component
public class Employee {
	
	//property as string type
	@Value("${employee.name}")
	private String name;
	
	// property as class
	private Address address;
	
	// property as Interface
	private User user;
	
	/**
	 * @param user the user to set
	 */
	@Autowired
	@Qualifier("admin")
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * Default Constructor
	 */
	public Employee() {
	}

	/**
	 * @param address the address to set
	 */
	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}

	//Utility method to test the class
	public void test() {
		
		System.out.println("Testing This Meathod From Employee..!!");
		user.use();
		address.addressInfo();
		System.out.println("Employee name : "+name);
	}

}