package com.savan.model;

import org.springframework.stereotype.Component;

/**
 * @author SAVAN
 *
 */
@Component
public class Admin implements User {

	@Override
	public void use() {

		System.out.println("This is from Admin Class");
		
	}

}
