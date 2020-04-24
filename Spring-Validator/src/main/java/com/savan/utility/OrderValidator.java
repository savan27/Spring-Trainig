package com.savan.utility;

import java.math.BigDecimal;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.savan.model.Order;

/**
 * @author SAVAN
 *
 */
public class OrderValidator implements Validator {

	public boolean supports(Class<?> clazz) {
		return Order.class == clazz;
	}

	public void validate(Object target, Errors errors) {
		
		ValidationUtils.rejectIfEmpty(errors, "date", "date.empty");
		ValidationUtils.rejectIfEmpty(errors, "price", "price.empty");
		
		Order order = (Order) target;

		if (order.getPrice() != null && order.getPrice().compareTo(BigDecimal.ZERO) <= 0) {
			errors.rejectValue("price", "price.invalid");
		}
	}
}
