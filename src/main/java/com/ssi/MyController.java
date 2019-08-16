package com.ssi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
	
	@GetMapping("/")
	public String showHome() {
		return "home";
	}
	@GetMapping("trial")
	public String showTrial() {
		return "trial";
	}
}
