package com.codingdojo.counter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class CounterController {
	
	
	@GetMapping("/your_server")
	public String rWelcome(HttpSession session) {
		Integer count = (Integer) session.getAttribute("count");
				
		if (count == null) {
			count = 0;
		}
		else {
		// increment the count by 1 using getAttribute and setAttribute
			count += 1;
			
		}
		session.setAttribute("count", count);
		return "home.jsp";
	}
	
	@GetMapping("/double")
	public String rDouble(HttpSession session) {
		Integer count = (Integer) session.getAttribute("count");
		count += 2;
		session.setAttribute("count", count);
		return "home.jsp";
	}
	
	@GetMapping("/reset")
	public String rReset(HttpSession session) {
		session.invalidate();
		return "redirect:/your_server";
	}
	
	@GetMapping("/your_server/counter")
	public String rCounter(HttpSession session) {
		return "count.jsp";
	}

}
