package com.savan.model;


/**
 * @author SAVAN
 * 
 * Singleton Scope Bean
 *
 */
public abstract class Employee {
	
	
	//abstract method to get current instance 
	public abstract Address getAddress();
	
	/**
	 * Default Constructor
	 */
	public Employee() {
		System.out.println("SingletonBean Initialize...!");
	}
}