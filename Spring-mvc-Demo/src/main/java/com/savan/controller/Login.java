package com.savan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author SAVAN
 *
 */
@Controller
public class Login {
	
	
	@GetMapping("/login")
	public String login() {
		
		return "Login";
	}
	
}
