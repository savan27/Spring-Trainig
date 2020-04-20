package com.savan.model;

/**
 * @author SAVAN
 * 
 * Prototype Scope Bean
 *
 */
public class Address {
	
	private String Massage1;
	
	/**
	 * Default Constructor
	 */
	public Address() {
		System.out.println("PrototypedBean initialized...!");
	}
	/**
	 * @return the massage1
	 */
	public String getMassage1() {
		return Massage1;
	}
	/**
	 * @param massage1 the massage1 to set
	 */
	public void setMassage1(String massage1) {
		Massage1 = massage1;
	}
	
	//utility method to return address
	public Address getAddress(){
		return this;
	}
}
