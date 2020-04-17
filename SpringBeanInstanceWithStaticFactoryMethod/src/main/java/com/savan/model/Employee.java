package com.savan.model;

/**
 * @author SAVAN
 *
 */
public class Employee {

	private static Employee Employee = null;

	/**
	 * Default Constructor
	 */
	private Employee() {
		System.out.println("Inside Private Constructor");
	}
	
	/**
	 * Static Factor method
	 */
	public static Employee getInstance() {
		if (Employee == null) {
			Employee = new Employee();
		}
		return Employee;
	}

	/**
	 * Method to display result
	 */
	public void display() {
		System.out.println("welcome");
	}
		
	
}
