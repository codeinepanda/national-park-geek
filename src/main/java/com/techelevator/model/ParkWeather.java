package com.techelevator.model;

public class ParkWeather {
private String parkCode;
private String day;
private String lows;
private String high;
private String fiveDayForecast;
public String getParkCode() {
	return parkCode;
}
public void setParkCode(String parkCode) {
	this.parkCode = parkCode;
}
public String getDay() {
	return day;
}
public void setDay(String day) {
	this.day = day;
}
public String getLows() {
	return lows;
}
public void setLows(String lows) {
	this.lows = lows;
}
public String getHigh() {
	return high;
}
public void setHigh(String high) {
	this.high = high;
}
public String getFiveDayForecast() {
	return fiveDayForecast;
}
public void setFiveDayForecast(String fiveDayForecast) {
	this.fiveDayForecast = fiveDayForecast;
}


}
