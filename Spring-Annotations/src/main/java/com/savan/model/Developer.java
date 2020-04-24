/**
 * 
 */
package com.savan.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author inex2
 *
 */
@Component
@Primary 	// less precedence then the qualifier 
public class Developer implements User {

	@Override
	public void use() {

		System.out.println("This is from Developer Class...");
		
	}

}
