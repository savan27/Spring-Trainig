package com.savan.main;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

import com.savan.model.Collage;
import com.savan.model.Employee;

/**
 * @author SAVAN
 *
 */
public class ClinentMain {

	public static void main(String[] args) {
		
		BeanWrapper employee = new BeanWrapperImpl(new Employee());
		employee.setPropertyValue("empName", "savan");
		employee.setPropertyValue("age", "22");
		
		BeanWrapper collage = new BeanWrapperImpl(new Collage());
		collage.setPropertyValue("name", "VVP");
		collage.setPropertyValue("director", employee.getWrappedInstance());
		
		String name = (String) collage.getPropertyValue("director.empName");
		
		System.out.println(name);
		
	}
	
}
