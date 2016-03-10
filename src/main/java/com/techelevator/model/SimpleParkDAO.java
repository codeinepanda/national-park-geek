package com.techelevator.model;

import java.util.ArrayList;
import java.util.List;

public class SimpleParkDAO implements ParkDAO{

	private List<Park> parkList;
	
	public SimpleParkDAO() {
		parkList = new ArrayList<Park>();
		
		Park park = new Park("GNP");
		park.setName("Glacier National Park");
		park.setDescription("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc nec nulla lectus. Donec tristique risus non placerat varius. Etiam eleifend enim sed nulla sagittis imperdiet. Maecenas augue lectus, feugiat a lacus at, faucibus varius sem. In imperdiet aliquet luctus. Nulla et massa tortor. Cras consequat rutrum dolor. Sed sed condimentum quam. Duis euismod varius velit, finibus semper diam suscipit a. Vestibulum vestibulum, mi eu vestibulum pulvinar, ");
		park.setLocation("Montana");
		park.setAcreage("5000000 million billions");
		park.setCampsites("3");
		park.setClimate("Beautiful");
		park.setElevation("17456 feet");
		park.setEntryFee("Free");
		park.setMilesOfTrail("4277 miles");
		park.setNumberOfAnimalSpecies("42 animal species");
		park.setQuote("For score and seven years ago cyber monkeys attacked these lands");
		park.setQuoteSource("Thomas Jefferson");
		park.setYearFounded("200 BC");
		park.setVisitorCount("0");
		parkList.add(park);		
		
		park = new Park("GCNP");
		park.setName("Grand Canyon National Park");
		park.setDescription("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc nec nulla lectus. Donec tristique risus non placerat varius. Etiam eleifend enim sed nulla sagittis imperdiet. Maecenas augue lectus, feugiat a lacus at, faucibus varius sem. In imperdiet aliquet luctus. Nulla et massa tortor. Cras consequat rutrum dolor. Sed sed condimentum quam. Duis euismod varius velit, finibus semper diam suscipit a. Vestibulum vestibulum, mi eu vestibulum pulvinar, ");
		park.setLocation("Arizona");
		parkList.add(park);
		
		park = new Park("CVNP");
		park.setName("Cuyahoga Valley National Park");
		park.setDescription("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc nec nulla lectus. Donec tristique risus non placerat varius. Etiam eleifend enim sed nulla sagittis imperdiet. Maecenas augue lectus, feugiat a lacus at, faucibus varius sem. In imperdiet aliquet luctus. Nulla et massa tortor. Cras consequat rutrum dolor. Sed sed condimentum quam. Duis euismod varius velit, finibus semper diam suscipit a. Vestibulum vestibulum, mi eu vestibulum pulvinar, ");
		park.setLocation("Ohio");
		parkList.add(park);


	}
	
	@Override
	public List<Park> readAllParks() {
		return parkList;
	}

	@Override
	public Park findParkByCode(String parkCode) {
		// TODO Auto-generated method stub
		Park parkFound = null;
		
		for ( Park park : parkList) {
			if (park.getParkCode().equals(parkCode)){
				parkFound = park;
			}
			
		}
		return parkFound;
		
	}

}
