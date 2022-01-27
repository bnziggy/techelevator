package com.techelevator;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Lecture {

	public static void main(String[] args) {

		Set<String> names = new HashSet<>();
		names.add("Brett");
		names.add("Jeff");
		names.add("Nick");
		names.add("Brett"); // size remains 3 - doesn't change size
		names.add("BRETT"); // is added bc case sensitivity

		System.out.println(names.size());

		if (names.contains("Jeff")) {
			System.out.println("Names contains Jeff");
		}
		for (String name : names) {
			System.out.println(name);
		}

		Set<Integer> randomNums = new HashSet<>();
		//for (int i = 0; i < 50; i++) {
		while (randomNums.size() < 50) {
			double randDouble = Math.random();
			// convert randDouble to a value between 1 and 100
			int randInt = (int)((randDouble * 100) + 1);
			if (!randomNums.add(randInt)) {
				System.out.println("Didn't re-add " + randInt);
			}
		}
		System.out.println("randomNums size is = " + randomNums.size());

		System.out.println();
		System.out.println("####################");
		System.out.println("        MAPS");
		System.out.println("####################");
		System.out.println();

		Map<String, String> stateAbbrevs = new HashMap<>();

		stateAbbrevs.put("OH", "Ohio");
		stateAbbrevs.put("KY", "Kentucky");
		stateAbbrevs.put("WV", "West Virginia");
		stateAbbrevs.put("HI", "Hawaii");
		stateAbbrevs.put("OH", "Ohio - The Heart of it All");

		String kentucky = stateAbbrevs.get("KY");
		String hawaii = stateAbbrevs.get("HI");
		String ohio = stateAbbrevs.get("OH");

		// if (hawaii.equals(null)) {  <-- Blows up with an NPE
		if (hawaii == null) {
			System.out.println("HI key not found");
		}

		System.out.println(kentucky);
		System.out.println(ohio);
		System.out.println(hawaii);


		Lecture lecture = new Lecture();
		String result = lecture.getStateName(stateAbbrevs, "OH");
		System.out.println(result);

		Set<String> stateKeys = stateAbbrevs.keySet();
		for (String stateKey : stateKeys) {
			System.out.println(stateKey + " : " + stateAbbrevs.get(stateKey));
		}

		// A map of pretend shipping statuses
		Map<Integer, String> statuses = new HashMap<>();
		statuses.put(1, "Order Received");
		statuses.put(2, "Label Printed");
		statuses.put(3, "In Transit");
		statuses.put(4,"Delivered");

	}

	public String getStateName(Map<String, String> states, String stateAbbrev) {
/*		String stateName = states.get(stateAbbrev);
		if (stateName == null) {
			stateName = "Unknown";
		}
		return stateName;
		*/

		if (states.containsKey(stateAbbrev)) {
			return states.get(stateAbbrev);
		}
		else{
			return "Unknown";
		}

	}

}
