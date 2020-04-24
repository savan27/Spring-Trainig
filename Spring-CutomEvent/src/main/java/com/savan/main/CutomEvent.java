package com.savan.main;

import org.springframework.context.ApplicationEvent;

/**
 * @author SAVAN
 *
 */
public class CutomEvent extends ApplicationEvent {

	public CutomEvent(Object source) {
		super(source);
	}

	public String toString() {
		return "My CustomEvent";
	}

}
