package com.savan.model;

/**
 * @author SAVAN
 *
 */
public class Employee {
	
	private String Firstname;
	private Address address;
	
	//Utility method to print address
	public void print() {
		address.printAddress();
	}
	
	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return Firstname;
	}
	/**
	 * @param firstname the firstname to set
	 */
	public void setFirstname(String firstname) {
		Firstname = firstname;
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
	public void setAddress(Address address) {
		this.address = address;
	}
}