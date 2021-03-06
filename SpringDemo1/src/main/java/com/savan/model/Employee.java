package com.savan.model;

/**
 * @author SAVAN
 *
 */
public class Employee {
	
	private String Firstname;
	private String Lastname;
	
	public void display() {
		System.out.println("welcome "+ Firstname +" "+Lastname );
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
	 * @return the lastname
	 */
	public String getLastname() {
		return Lastname;
	}
	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	
	@Override
	public String toString() {
		return "Employee [Firstname=" + Firstname + ", Lastname=" + Lastname + "]";
	}
}
