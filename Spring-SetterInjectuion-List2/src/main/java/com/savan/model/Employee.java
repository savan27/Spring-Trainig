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
	private List<Address> address;
	

	// utility method to display result
	public void display() {
		System.out.println("welcome "+ Firstname +", Your salary is = "+salary );
		
		//print address
		Iterator<Address> itr = address.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
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
	public List<Address> getAddress() {
		return address;
	}


	/**
	 * @param address the address to set
	 */
	public void setAddress(List<Address> address) {
		this.address = address;
	}
}