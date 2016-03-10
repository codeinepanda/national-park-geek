package com.techelevator.model;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class FileSystemParkDAOTest {

	@Test
	public void test() {
		String parkCode = "ABC";
		String parkName = "My National Park";
		String location = "Ohio";
		String acreage = "4000 acres";
		String elevation = "15,000 ft";
		String input = "ParkCode	ParkName	State	Acreage	ElevationInFt	MilesOfTrail	NumberOfCampsites	Climate	YearFounded	AnnualVisitorCount	Quote	QuoteSource	Description	EntryFee	NumberOfAnimalSpecies\n"
				+parkCode+"\t"+parkName+"\t"+location+"\t"+acreage+"\t"+elevation;
		InputStream source = new ByteArrayInputStream(input.getBytes());
		FileSystemParkDAO parkDAO = new FileSystemParkDAO(source);
		
		List<Park> results = parkDAO.readAllParks();
		Assert.assertNotNull(results);
		Assert.assertEquals(1, results.size());
		Park park = results.get(0);
		Assert.assertEquals(parkCode, park.getParkCode());
		Assert.assertEquals(parkName, park.getName());
		Assert.assertEquals(location, park.getLocation());
	}

}
