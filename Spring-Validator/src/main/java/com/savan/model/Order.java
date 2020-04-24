package com.savan.model;

import java.math.BigDecimal;
import java.sql.Date;

/**
 * @author SAVAN
 *
 */
public class Order {
	
	private Date date;
	private BigDecimal price;
	
	
	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}
	/**
	 * @return the price
	 */
	public BigDecimal getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
}
