package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FizzWriter {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);

		System.out.println("What is the destination file?");
		File destinationFile = new File(userInput.nextLine()); //new File("C:\\Users\\Student\\workspace\\brett-ziegler-student-code\\module-1\\17_File_IO_Writing\\exercise\\src/test/resources/fizzbuzz.txt");//

		try (PrintWriter outputFile = new PrintWriter(destinationFile)) {
			for (int i = 1; i <= 300; i++) {
				if (i % 3 == 0 && i % 5 == 0) {
					outputFile.println("FizzBuzz");
				}
				else if (i % 3 == 0) {
					outputFile.println("Fizz");
				}
				else if (i % 5 == 0) {
					outputFile.println("Buzz");
				}
				else {
					outputFile.println(i);
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("Invalid destination file.");
		}
	}

}
