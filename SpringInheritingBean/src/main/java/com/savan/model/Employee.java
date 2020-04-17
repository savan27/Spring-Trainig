package com.savan.model;


/**
 * @author SAVAN
 *
 */
public class Employee {
	
	private String Massage1;
	private String Massage2;
	

	/**
	 * @param massage1
	 * @param massage2
	 */
	public Employee(String massage1, String massage2) {
		Massage1 = massage1;
		Massage2 = massage2;
	}
	/**
	 * @return the massage1
	 */
	public String getMassage1() {
		System.out.println(Massage1);
		return Massage1;
	}
	/**
	 * @param massage1 the massage1 to set
	 */
	public void setMassage1(String massage1) {
		Massage1 = massage1;
	}
	/**
	 * @return the massage2
	 */
	public String getMassage2() {
		System.out.println(Massage2);
		return Massage1;
	}
	/**
	 * @param massage2 the massage2 to set
	 */
	public void setMassage2(String massage2) {
		Massage2 = massage2;
	}
}