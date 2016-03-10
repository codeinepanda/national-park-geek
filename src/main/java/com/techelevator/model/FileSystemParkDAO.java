package com.techelevator.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FileSystemParkDAO implements ParkDAO {
	private List<Park> parkList;

	private BufferedReader inputReader;

	public FileSystemParkDAO(InputStream input) {
		InputStreamReader reader = new InputStreamReader(input);
		this.inputReader = new BufferedReader(reader);
	}

	@Override
	public List<Park> readAllParks() {
		List<Park> results = new ArrayList<>();
		throwAwayHeaderLine();
		String line = readNextLine();
		while (line != null) {
			String[] fields = line.split("\t");
			Park park = new Park(fields[0]);
			park.setName(fields[1]);
			park.setLocation(fields[2]);
			park.setAcreage(fields[3]);
			park.setElevation(fields[4]);
			results.add(park);
			line = readNextLine();

		}
		return results;
	}

	private void throwAwayHeaderLine() {
		readNextLine();
	}

	private String readNextLine() {
		String line = null;
		try {
			line = inputReader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return line;
	}

	@Override
	public Park findParkByCode(String parkCode) {
		Park parkFound = null;

		for (Park park : parkList) {
			if (park.getParkCode().equals(parkCode)) {
				parkFound = park;
			}

		}
		return parkFound;

	}
}
