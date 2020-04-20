package com.savan.model;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author SAVAN
 *
 */
public class Employee {
	@Autowired
	private Address address;

	//Utility method to print address
	public void print() {
		address.printAddress();
	}

	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	@Autowired(required = false)
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}