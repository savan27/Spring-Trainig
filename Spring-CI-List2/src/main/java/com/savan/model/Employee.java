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
	

	/**
	 * @param firstname
	 * @param salary
	 * @param address
	 */
	public Employee(String firstname, double salary, List<Address> address) {
		Firstname = firstname;
		this.salary = salary;
		this.address = address;
	}

	// utility method to display result
	public void display() {
		System.out.println("welcome "+ Firstname +", Your salary is = "+salary );
		
		//print address
		Iterator<Address> itr = address.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}