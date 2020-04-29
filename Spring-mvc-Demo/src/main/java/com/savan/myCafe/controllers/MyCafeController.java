package com.savan.myCafe.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author SAVAN
 *
 */
@Controller
public class MyCafeController {
	
	// return the WelcomePage
	@RequestMapping("/cafe")
	public String showWelcomePage() {
		return "welcomw-page";
	}
	
	//processing the order
	@PostMapping("/processOrder")
	public String processOrder(HttpServletRequest req , Model model) {
		
		//handle the data entered from user 
		String userEnteredValue = req.getParameter("foodType");
		
		// adding the captured value to model
		model.addAttribute("userOrder", userEnteredValue);
		
		//set user data tom model and send
		return "processOrder";
	}

}
