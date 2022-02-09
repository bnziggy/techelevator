package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.LineNumberReader;
import java.util.Scanner;

public class WordSearch {

	public static void main(String[] args) {

		File inputFile = getFileInputFromUser();
		String inputWord = getWordToSearchFromUser();
		String caseSense = getCaseSense();
		int wordLine = 0;

		try(Scanner fileScanner = new Scanner(inputFile)) {
			while (fileScanner.hasNextLine()) {
				String line = fileScanner.nextLine();
				wordLine++;
				if (caseSense.equals("N")) {
					if (line.toLowerCase().contains(inputWord.toLowerCase())) {
						System.out.println(wordLine + ") " + line);
					}
				}
				if (caseSense.equals("Y")) {
					if (line.contains(inputWord)) {
						System.out.println(wordLine + ") " + line);
					}
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}



		}
	private static File getFileInputFromUser() {
		Scanner userInput = new Scanner(System.in);
		System.out.println("What is the fully qualified name of the file that should be searched?");
		String path = userInput.nextLine();

		File inputFile = new File(path);
		if (inputFile.exists() == false) {
			System.out.println("File does not exist");
			System.exit(1);
		}
		else if (inputFile.isFile() == false) {
			System.out.println("This is not a file");
			System.exit(1);
		}

		return inputFile;
	}


	private static String getWordToSearchFromUser() {
		Scanner userInput = new Scanner(System.in);
		System.out.println("What is the search word you are looking for?");
		String word = userInput.nextLine();

		return word;
	}

	private static String getCaseSense() {
		Scanner caseSense = new Scanner(System.in);
		System.out.println("Should the search be case sensitive? (Y\\N)");
		String yOrN = caseSense.nextLine();

		return yOrN;
	}

}
