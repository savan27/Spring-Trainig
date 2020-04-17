package com.savan.model;

/**
 * @author SAVAN
 *
 */
public class Employee {

	/**
	 * Default Constructor
	 */
	private Employee() {
		System.out.println("Inside Private Constructor");
	}
	
	/**
	 * Instance Factory method
	 */
	public static Employee getInstance() {
		return new Employee();
	}

	/**
	 * Method to display result
	 */
	public void display() {
		System.out.println("welcome");
	}
		
	
}
