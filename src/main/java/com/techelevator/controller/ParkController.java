package com.techelevator.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.techelevator.model.ParkDAO;
import com.techelevator.model.SimpleParkDAO;

@Controller
public class ParkController {
	
	private ParkDAO parkDAO;
	
	public ParkController(){
		parkDAO = new SimpleParkDAO();
	}
	
	@RequestMapping("/")
	public String displayParkList(Map<String, Object> model) {
		
		model.put("listOfParks", parkDAO.readAllParks());
		return "parkList";
	}
	
	@RequestMapping("/parkDetail")
	public String displayParkDetail(Map<String, Object> model, 
									@RequestParam("parkCode") String parkCode) {
		
		model.put("park", parkDAO.findParkByCode(parkCode));
		return "parkDetail";
	}

	
	
}
