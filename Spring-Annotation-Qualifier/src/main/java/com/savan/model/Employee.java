package com.savan.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @author SAVAN
 *
 */
public class Employee {
	@Autowired
	@Qualifier("add1")
	private Address address;

	//Utility method to print address
	
	public void printcity() {
		System.out.println("City "+address.getCity());
	}
	
	public void printstate() {
		System.out.println("state "+address.getState());
	}
}