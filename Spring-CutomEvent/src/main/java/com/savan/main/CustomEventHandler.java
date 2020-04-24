/**
 * 
 */
package com.savan.main;

import org.springframework.context.ApplicationListener;

/**
 * @author SAVAN
 *
 */
public class CustomEventHandler implements ApplicationListener<CutomEvent> {

	public void onApplicationEvent(CutomEvent event) {

		System.out.println(event.toString());
	}

}
