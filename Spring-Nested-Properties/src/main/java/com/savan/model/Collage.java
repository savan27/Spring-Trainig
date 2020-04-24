package com.savan.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author SAVAN
 *
 */
@Component
public class Collage {

	private String name;
	private Employee director;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the director
	 */
	public Employee getDirector() {
		return director;
	}

	/**
	 * @param director the director to set
	 */
	@Autowired
	public void setDirector(Employee director) {
		this.director = director;
	}
}
