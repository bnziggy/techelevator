package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);

		System.out.print("Please enter in a series of decimal values (separated by spaces): ");
		String givenNumberStr = scanner.nextLine();
		String[] givenNumbers = givenNumberStr.split(" ");
//		int[] numbers = new int[givenNumbers];


		for (int i = 0; i < givenNumbers.length; i++) {
			int numbers = Integer.parseInt(givenNumbers[i]);
			System.out.println(numbers + " in binary is " + Integer.toBinaryString(numbers));
		}



	}

}
