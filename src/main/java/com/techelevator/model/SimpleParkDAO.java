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
		Park parkChoice = null;
		
		for ( Park park : parkList) {
			if (park.getParkCode().equals(parkCode)){
				parkChoice = park;
			}
			
		}
		return parkChoice;
		
	}

}
