package com.savan.model;


/**
 * @author SAVAN
 * 
 * Singleton Scope Bean
 *
 */
public class Employee {

	/**
	 * Default Constructor
	 */
	public Employee() {
		System.out.println("SingletonBean Initialize...!");
	}
	

	//utility method to Print result
	public void getMassage() {

		System.out.println("Massage from the original Method..");
	}
}