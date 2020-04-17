package com.savan.model;

/**
 * @author SAVAN
 *
 */
public class Employee {
	
	private String Firstname;
	private double salary;
	
	// utility method to display result
	public void display() {
		System.out.println("welcome "+ Firstname +", Your salary is = "+salary );
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
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}
}