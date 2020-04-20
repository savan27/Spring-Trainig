package com.savan.model;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

/**
 * @author SAVAN
 *
 */
public class ReplacedEmployee implements MethodReplacer {

	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {

		System.out.println("Massage from the Replaced Method...");
		return null;
	}
	
	

}
