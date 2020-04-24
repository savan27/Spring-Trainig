package com.savan.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.DataBinder;

import com.savan.utility.OrderValidator;

/**
 * @author SAVAN
 *
 */
public class ClientBean {
	
	@Autowired
	private Order order;
	
	public void processOrder() {
		if (validateOrder()) {
			System.out.println("Processing"+order);
		}
	}

	private boolean validateOrder() {
		DataBinder binder = new DataBinder(order);
		binder.addValidators(new OrderValidator());
		binder.validate();
		
		if (binder.getBindingResult().hasErrors()) {
			System.out.println("Error Occured");
			return false;
		}
		
		return true;
	}

}
