package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);

		System.out.print("Please enter a number: ");
		String numberStr = scanner.nextLine();
		int number = Integer.parseInt(numberStr);

		int i = 1;
		int firstTerm = 0;
		int secondTerm = 1;

		if (number == 0 || number < 0) {
			System.out.println("0, 1");
		}
		else if (number == 1) {
			System.out.println("0, 1, 1");
		}
		else {
			while (firstTerm <= number) {
				System.out.print(firstTerm + ", ");

				int nextTerm = firstTerm + secondTerm;
				firstTerm = secondTerm;
				secondTerm = nextTerm;

				i++;
			}
		}

	}

}
