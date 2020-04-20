package com.savan.model;

import org.springframework.beans.factory.annotation.Required;

/**
 * @author SAVAN
 *
 */
public class EmployeeModel {
	
	private String FirstName;
	private String LastName;
	
	
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return FirstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	@Required
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	
	public String getLastName() {
		return LastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	@Required
	public void setLastName(String lastName) {
		LastName = lastName;
	}
}
