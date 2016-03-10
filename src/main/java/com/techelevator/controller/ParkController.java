package com.techelevator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ParkController {
	
	@RequestMapping("/")
	public String displayParkList() {
		return "parkList";
	}
	
}
