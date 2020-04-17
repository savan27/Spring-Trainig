package com.savan.model;

/**
 * @author SAVAN
 *
 */
public class Address {
	
	private String street;
	private String city;
	private String state;
	private String country;
	
	/**
	 * @param street
	 * @param city
	 * @param state
	 * @param country
	 */
	public Address(String street, String city, String state, String country) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", state=" + state + ", country=" + country + "]";
	}
	
}
