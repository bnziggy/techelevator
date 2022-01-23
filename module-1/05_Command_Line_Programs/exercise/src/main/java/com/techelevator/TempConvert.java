package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);

		System.out.print("Please enter a temperature: ");
		String temperature = scanner.nextLine();
		double tempDouble = Double.parseDouble(temperature);

		System.out.print("Please enter if Celsius (C) or Fahrenheit(F): ");
		String celsiusOrFahrenheit = scanner.nextLine();

		double temperatureFahrenheit;
		double temperatureCelsius;


		if (celsiusOrFahrenheit.equals("F")) {
			temperatureCelsius = (tempDouble - 32) / 1.8;
//			System.out.println(tempDouble + "F is " + temperatureCelsius + "C");
			System.out.format("%3.0fF is %3.0fC", tempDouble, temperatureCelsius);
		}
		else if (celsiusOrFahrenheit.equals("C")) {
			temperatureFahrenheit = tempDouble * 1.8 + 32;
//			System.out.println(tempDouble + "C is" + temperatureFahrenheit + "F");
			System.out.format("%3.0fC is %3.0fF", tempDouble, temperatureFahrenheit);
		}

	}

}
