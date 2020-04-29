package com.savan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Logout {
	
	@ResponseBody
	@RequestMapping("/logout")
	public String logout() {
		return "You are Logout Now";
	}

}
