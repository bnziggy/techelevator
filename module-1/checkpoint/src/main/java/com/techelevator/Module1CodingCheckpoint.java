package com.techelevator;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Module1CodingCheckpoint {

	public static void main(String[] args) {
		//Step 4
		Reservation newReservation = new Reservation("Brett", 3);
		System.out.println(newReservation.getName());

		newReservation.calculateUsageTotal(true,true);

		System.out.println(newReservation.toString());

		List<String> reservations = new ArrayList<>();

		// Was creating try with resources / catch block but had not completed

		Scanner fileInput = new Scanner("HotelInput.csv");
		String line;
		while (fileInput.hasNextLine()) {
			line = fileInput.nextLine();
			String[] lineDate = line.split(",");

			// Add each reservation to "reservations" list
			// Iterate through list to make new reservations and calculate each total
			// Add totals to for all reservations for Overall total
		}

	}

}
