package com.techelevator.model;

public class Park {
	

	private String visitorCount;
	private String parkCode;
	private String name;
	private String description;
	private String location;
	private String climate;
	private String quote;
	private String quoteSource;
	private String entryFee;
	private String numberOfAnimalSpecies;
	private String yearFounded;
	private String milesOfTrail;
	private String acreage;
	private String elevation;
	private String campsites; 

	
	public String getClimate() {
		return climate;
	}

	public void setClimate(String climate) {
		this.climate = climate;
	}

	public String getQuote() {
		return quote;
	}

	public void setQuote(String quote) {
		this.quote = quote;
	}

	public String getQuoteSource() {
		return quoteSource;
	}

	public void setQuoteSource(String quoteSource) {
		this.quoteSource = quoteSource;
	}

	public String getEntryFee() {
		return entryFee;
	}

	public void setEntryFee(String entryFee) {
		this.entryFee = entryFee;
	}

	public String getNumberOfAnimalSpecies() {
		return numberOfAnimalSpecies;
	}

	public void setNumberOfAnimalSpecies(String numberOfAnimalSpecies) {
		this.numberOfAnimalSpecies = numberOfAnimalSpecies;
	}

	public String getYearFounded() {
		return yearFounded;
	}

	public void setYearFounded(String yearFounded) {
		this.yearFounded = yearFounded;
	}

	public String getMilesOfTrail() {
		return milesOfTrail;
	}

	public void setMilesOfTrail(String milesOfTrail) {
		this.milesOfTrail = milesOfTrail;
	}

	public String getAcreage() {
		return acreage;
	}

	public void setAcreage(String acreage) {
		this.acreage = acreage;
	}

	public String getElevation() {
		return elevation;
	}

	public void setElevation(String elevation) {
		this.elevation = elevation;
	}

	public String getCampsites() {
		return campsites;
	}

	public void setCampsites(String campsites) {
		this.campsites = campsites;
	}

	public Park(String parkCode){
		this.parkCode = parkCode;
	}
	
	public String getParkCode() {
		return parkCode;
	}
	public void setParkCode(String parkCode) {
		this.parkCode = parkCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getVisitorCount() {
		return visitorCount;
	}

	public void setVisitorCount(String visitorCount) {
		this.visitorCount = visitorCount;
	}


}
