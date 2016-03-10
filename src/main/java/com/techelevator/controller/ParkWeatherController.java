package com.techelevator.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.techelevator.model.ParkDAO;
import com.techelevator.model.SimpleParkDAO;

@Controller
public class ParkWeatherController {
	
@RequestMapping("/parkWeatherForecast")
public String displayParkWeather(Map<String, Object> model,
								@RequestParam("parkCode") String parkCode) {
	return "parkWeatherForecast";
}

}
