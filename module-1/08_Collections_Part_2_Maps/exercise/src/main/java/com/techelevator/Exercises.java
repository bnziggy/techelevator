package com.techelevator;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Exercises {

	/*
	 * Given the name of an animal, return the name of a group of that animal
	 * (e.g. "Elephant" -> "Herd", "Rhino" - "Crash").
	 *
	 * The animal name should be case insensitive so "elephant", "Elephant", and
	 * "ELEPHANT" should all return "herd".
	 *
	 * If the name of the animal is not found, null, or empty, return "unknown".
	 *
	 * Rhino -> Crash
	 * Giraffe -> Tower
	 * Elephant -> Herd
	 * Lion -> Pride
	 * Crow -> Murder
	 * Pigeon -> Kit
	 * Flamingo -> Pat
	 * Deer -> Herd
	 * Dog -> Pack
	 * Crocodile -> Float
	 *
	 c
	 *
	 */
	public String animalGroupName(String animalName) {	//manually input all info
		Map<String, String> animalGroups = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);

		animalGroups.put("Rhino", "Crash");
		animalGroups.put("Giraffe", "Tower");
		animalGroups.put("Elephant", "Herd");
		animalGroups.put("Lion", "Pride");
		animalGroups.put("Crow", "Murder");
		animalGroups.put("Pigeon", "Kit");
		animalGroups.put("Flamingo", "Pat");
		animalGroups.put("Deer", "Herd");
		animalGroups.put("Dog", "Pack");
		animalGroups.put("Crocodile", "Float");

		if (animalName == null) {
			return "unknown";
		}

		if (!animalGroups.containsKey(animalName)) {
			return "unknown";
		}

		return animalGroups.get(animalName);
	}

	/*
	 * Given an String item number (a.k.a. SKU), return the discount percentage if the item is on sale.
	 * If the item is not on sale, return 0.00.
	 *
	 * If the item number is empty or null, return 0.00.
	 *
	 * "KITCHEN4001" -> 0.20
	 * "GARAGE1070" -> 0.15
	 * "LIVINGROOM"	-> 0.10
	 * "KITCHEN6073" -> 0.40
	 * "BEDROOM3434" -> 0.60
	 * "BATH0073" -> 0.15
	 *
	 * The item number should be case insensitive so "kitchen4001", "Kitchen4001", and "KITCHEN4001"
	 * should all return 0.20.
	 *
	 * isItOnSale("kitchen4001") → 0.20
	 * isItOnSale("") → 0.00
	 * isItOnSale("GARAGE1070") → 0.15
	 * isItOnSale("dungeon9999") → 0.00
	 *
	 */
	public double isItOnSale(String itemNumber) {
		Map<String, Double> items = new HashMap<>();

		items.put("KITCHEN4001", 0.20);
		items.put("GARAGE1070", 0.15);
		items.put("LIVINGROOM", 0.10);
		items.put("BEDROOM3434", 0.60);
		items.put("BATH0073", 0.15);

		if (itemNumber == null) {
			return 0.0;
		}

		if (items.containsKey(itemNumber.toUpperCase())) {
			return items.get(itemNumber.toUpperCase());
		}
		return 0.0;

	}

	/*
	 * Modify and return the given Map as follows: if "Peter" has more than 0 money, transfer half of it to "Paul",
	 * but only if Paul has less than $10s.
	 *
	 * Note, monetary amounts are specified in cents: penny=1, nickel=5, ... $1=100, ... $10=1000, ...
	 *
	 * robPeterToPayPaul({"Peter": 2000, "Paul": 99}) → {"Peter": 1000, "Paul": 1099}
	 * robPeterToPayPaul({"Peter": 2000, "Paul": 30000}) → {"Peter": 2000, "Paul": 30000}
	 *
	 */
	public Map<String, Integer> robPeterToPayPaul(Map<String, Integer> peterPaul) {
		int peterAmount = peterPaul.get("Peter");
		int paulAmount = peterPaul.get("Paul");

		if (peterAmount > 0 && paulAmount < 1000) {
			if (peterAmount % 2 != 0) {
				peterAmount = peterAmount / 2;
				paulAmount = paulAmount + peterAmount;
				peterAmount++;
			}
			else if (peterAmount > 0 && paulAmount < 1000) {
				peterAmount = peterAmount / 2;
				paulAmount = paulAmount + peterAmount;
			}
		}

		peterPaul.put("Peter", peterAmount);
		peterPaul.put("Paul", paulAmount);
		return peterPaul;
	}

	/*
	 * Modify and return the given Map as follows: if "Peter" has $50 or more, AND "Paul" has $100 or more,
	 * then create a new "PeterPaulPartnership" worth a combined contribution of a quarter of each partner's
	 * current worth.
	 *
	 * peterPaulPartnership({"Peter": 50000, "Paul": 100000}) → {"Peter": 37500, "Paul": 75000, "PeterPaulPartnership": 37500}
	 * peterPaulPartnership({"Peter": 3333, "Paul": 1234567890}) → {"Peter": 3333, "Paul": 1234567890}
	 *
	 * Note, monetary amounts are specified in cents: penny=1, nickel=5, ... $1=100, ... $10=1000, ...
	 */
	public Map<String, Integer> peterPaulPartnership(Map<String, Integer> peterPaul) {
		double peterAmount = peterPaul.get("Peter");
		double paulAmount = peterPaul.get("Paul");

		if (peterAmount >= 5000 && paulAmount >= 10000) {
			double contribution = (peterAmount * 0.25) + (paulAmount * 0.25);
			peterAmount = peterAmount * 0.75;
			paulAmount = paulAmount * 0.75;

			peterPaul.put("Peter", (int)peterAmount);
			peterPaul.put("Paul", (int)paulAmount);
			peterPaul.put("PeterPaulPartnership", (int)contribution);
			return peterPaul;
		}
		return peterPaul;
	}

	/*
	 * Given an array of non-empty Strings, return a Map<String, String> where for every different String in the array,
	 * there is a key of its first character with the value of its last character.
	 *
	 * beginningAndEnding(["code", "bug"]) → {"b": "g", "c": "e"}
	 * beginningAndEnding(["man", "moon", "main"]) → {"m": "n"}
	 * beginningAndEnding(["muddy", "good", "moat", "good", "night"]) → {"g": "d", "m": "t", "n": "t"}
	 */
	public Map<String, String> beginningAndEnding(String[] words) {
		Map<String, String> begAndEnd = new HashMap<>();

		for (String word : words) {
			begAndEnd.put(word.substring(0, 1), word.substring(word.length() - 1));
		}
		return begAndEnd;
	}

	/*
	 * Given an array of Strings, return a Map<String, Integer> with a key for each different String, with the value the
	 * number of times that String appears in the array.
	 *
	 * ** A CLASSIC **
	 *
	 * wordCount(["ba", "ba", "black", "sheep"]) → {"ba" : 2, "black": 1, "sheep": 1 }
	 * wordCount(["a", "b", "a", "c", "b"]) → {"b": 2, "c": 1, "a": 2}
	 * wordCount([]) → {}
	 * wordCount(["c", "b", "a"]) → {"b": 1, "c": 1, "a": 1}
	 *
	 */
	public Map<String, Integer> wordCount(String[] words) {
		Map<String, Integer> wordsCounted = new HashMap<>();

		for (String word : words) {
			if (wordsCounted.containsKey(word)) {
				int count = wordsCounted.get(word);
				count++;
				wordsCounted.put(word, count);
			}
			else {
				wordsCounted.put(word, 1);
			}
		}
		return wordsCounted;
	}

	/*
	 * Given an array of int values, return a Map<Integer, Integer> with a key for each int, with the value the
	 * number of times that int appears in the array.
	 *
	 * ** The lesser known cousin of the the classic wordCount **
	 *
	 * intCount([1, 99, 63, 1, 55, 77, 63, 99, 63, 44]) → {1: 2, 44: 1, 55: 1, 63: 3, 77: 1, 99:2}
	 * intCount([107, 33, 107, 33, 33, 33, 106, 107]) → {33: 4, 106: 1, 107: 3}
	 * intCount([]) → {}
	 *
	 */
	public Map<Integer, Integer> integerCount(int[] ints) {
		Map<Integer, Integer> intCounts = new HashMap<>();

		for (int number : ints) {
			if (intCounts.containsKey(number)) {
				int count = intCounts.get(number);
				count++;
				intCounts.put(number, count);
			}
			else {
				intCounts.put(number, 1);
			}
		}
		return intCounts;
	}

	/*
	 * Given an array of Strings, return a Map<String, Boolean> where each different String is a key and value
	 * is true only if that String appears 2 or more times in the array.
	 *
	 * wordMultiple(["a", "b", "a", "c", "b"]) → {"b": true, "c": false, "a": true}
	 * wordMultiple(["c", "b", "a"]) → {"b": false, "c": false, "a": false}
	 * wordMultiple(["c", "c", "c", "c"]) → {"c": true}
	 *
	 */
	public Map<String, Boolean> wordMultiple(String[] words) {
		Map<String, Boolean> multiples = new HashMap<>();

		for (String word : words) {
			if (multiples.containsKey(word)) {
				multiples.put(word, true);
			}
			else {
				multiples.put(word, false);
			}

			/*if (multiples.get(word) == true) {
				return multiples;
			}*/
		}
		return multiples;
	}

	/*
	 * Given two Maps, Map<String, Integer>, merge the two into a new Map, Map<String, Integer> where keys in Map2,
	 * and their int values, are added to the int values of matching keys in Map1. Return the new Map.
	 *
	 * Unmatched keys and their int values in Map2 are simply added to Map1.
	 *
	 * consolidateInventory({"SKU1": 100, "SKU2": 53, "SKU3": 44} {"SKU2":11, "SKU4": 5})
	 * 	 → {"SKU1": 100, "SKU2": 64, "SKU3": 44, "SKU4": 5}
	 *
	 */
	public Map<String, Integer> consolidateInventory(Map<String, Integer> mainWarehouse,
			Map<String, Integer> remoteWarehouse) {

		Map<String, Integer> totalInventory = new HashMap<>();

		for (String main : mainWarehouse.keySet()) {
			totalInventory.put(main, mainWarehouse.get(main));
		}

		for (String remote : remoteWarehouse.keySet()) {
			if (totalInventory.containsKey(remote)) {
				totalInventory.put(remote, totalInventory.get(remote) + remoteWarehouse.get(remote));
			}
			else {
				totalInventory.put(remote, remoteWarehouse.get(remote));
			}
		}
		return totalInventory;
	}

	/*
	 * Just when you thought it was safe to get back in the water --- last2Revisited!!!!
	 *
	 * Given an array of Strings, for each String, the count of the number of times that a subString length 2 appears
	 * in the String and also as the last 2 chars of the String, so "hixxxhi" yields 1.
	 *
	 * We don't count the end subString, but the subString may overlap a prior position by one.  For instance, "xxxx"
	 * has a count of 2, one pair at position 0, and the second at position 1. The third pair at position 2 is the
	 * end subString, which we don't count.
	 *
	 * Return Map<String, Integer>, where the key is String from the array, and its last2 count.
	 *
	 * last2Revisited(["hixxhi", "xaxxaxaxx", "axxxaaxx"]) → {"hixxhi": 1, "xaxxaxaxx": 1, "axxxaaxx": 2}
	 *
	 */
	public Map<String, Integer> last2Revisited(String[] words) {
		Map<String, Integer> revistedTwo = new HashMap<>();

		for (String word : words) {
			if (word.length() <= 2) {
				revistedTwo.put(word, 0);
			}
			String lastTwo = word.substring(word.length() - 2);
			int count = 0;

			for (int i = 0; i < word.length() - 2; i++) {
				if (word.substring(i, i + 2).equals(lastTwo)) {
					count++;
					revistedTwo.put(word, count);
				}
			}
		}
		return revistedTwo;
	}

}
