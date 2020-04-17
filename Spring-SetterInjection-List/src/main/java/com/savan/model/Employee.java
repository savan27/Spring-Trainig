package com.savan.model;

import java.util.Iterator;
import java.util.List;

/**
 * @author SAVAN
 *
 */
public class Employee {
	
	private String Firstname;
	private double salary;
	private List<String> address;
	
	
	// utility method to display result
	public void display() {
		System.out.println("welcome "+ Firstname +", Your salary is = "+salary );
		
		//print address
		Iterator<String> itr = address.iterator();
		while (itr.hasNext()) {
			String address = (String) itr.next();
			System.out.println(address);
		}
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

	/**
	 * @return the address
	 */
	public List<String> getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(List<String> address) {
		this.address = address;
	}
}