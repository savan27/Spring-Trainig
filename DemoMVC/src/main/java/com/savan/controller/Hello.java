package com.savan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author SAVAN
 *
 */
@Controller
public class Hello {
	
	@ResponseBody
	@RequestMapping("/index")
	public String display() {
		System.out.println("inside display method");
		return "inside display method";
	}
}
