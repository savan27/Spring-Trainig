package com.savan.model;

import javax.inject.Inject;
import javax.inject.Named;


/**
 * @author SAVAN
 *
 */
@Named	// @ManagedBean could be used as well
public class Employee {
	
	
	private Address addrss;
	
	/**
	 * @param addrss the addrss to set
	 */
	@Inject
	public void setAddrss( @Named("add1") Address addrss) {
		this.addrss = addrss;
	}

	//utility method to print the output
	public void print() {
		System.out.println("From the Employee class");
		addrss.addressInfo();
	}

}