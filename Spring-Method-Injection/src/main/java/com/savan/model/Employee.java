package com.savan.model;


/**
 * @author SAVAN
 * 
 * Singleton Scope Bean
 *
 */
public class Employee {
	
	private Address Massage1;
	
	/**
	 * Default Constructor
	 */
	public Employee() {
		System.out.println("SingletonBean Initialize...!");
	}
	/**
	 * @return the massage1
	 */
	public Address getMassage1() {
		return Massage1;
	}
	/**
	 * @param massage1 the massage1 to set
	 */
	public void setMassage1(Address massage1) {
		Massage1 = massage1;
	}
}