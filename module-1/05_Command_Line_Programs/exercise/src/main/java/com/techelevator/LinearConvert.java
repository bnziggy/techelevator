package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);

		System.out.print("Please enter the length: ");
		String lengthStr = scanner.nextLine();
		double length = Double.parseDouble(lengthStr);

		System.out.print("Is the measurement in (m)eter, or (f)eet? ");
		String measurement = scanner.nextLine();

		double meters;
		double feet;

		if (measurement.equals("f")) {
			meters = length * 0.3048;
			System.out.format("%3.2ff is %3.2fm", length, meters);
		}
		else if (measurement.equals("m")) {
			feet = length * 3.2808399;
			System.out.format("%3.2fm is %3.2ff", length, feet);
		}

	}

}
