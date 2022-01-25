package com.techelevator;

import java.util.Locale;

public class Lecture {

	public static void main(String[] args) {

		System.out.println("************************************");
		System.out.println("****** MAKING A STRING OBJECT ******");
		System.out.println("************************************");

		/* The String class gets special treatment in the Java language.  One
		 * example of this is that there is a literal representation of a
		 * String (i.e. characters appearing between two double quotes.  This
		 * is not the case for most classes */

		/* create an new instance of String using a literal */
		String name = "Brett";
		String salutation = new String(new char[] {'H', 'e','l','l','o'});
		String greetings = null;
		greetings = "Hi";

		
		System.out.println();
		System.out.println("******************************");
		System.out.println("****** MEMBER METHODS ******");
		System.out.println("******************************");
		System.out.println();


		/* Other commonly used methods:
		 *
		 * endsWith
		 * startsWith
		 * indexOf
		 * lastIndexOf
		 * length
		 * substring
		 * toLowerCase
		 * toUpperCase
		 * trim
		 */

		//					    0...+....1
		String lectureString = "This is a string for Monday";
		int length = lectureString.length();
		System.out.println(length);

		String firstFive = lectureString.substring(0, 5);
		System.out.println("First five = [" + firstFive + "]");

		lectureString = lectureString.toUpperCase();
		System.out.println(lectureString);

		String concatStr = "Hello";
		// concatStr.concat(" Goodbye"); // Concatenation the long way
		concatStr = concatStr + " Goodbye";
		concatStr = concatStr + 5;
		System.out.println(concatStr);

		for (int i = 0; i < concatStr.length(); i++) {
			System.out.println(concatStr.charAt(i));
		}

		int indexOfIs = lectureString.indexOf("IS");
		System.out.println("indexOfIs = " + indexOfIs);
		int indexOfSecondIs = lectureString.indexOf("IS", 3);
		System.out.println("indexOfSecondIs = " + indexOfSecondIs);
		System.out.println("Index of XYZ = " + lectureString.indexOf("XYZ")); //Will return -1

		String sentence = "The quick brown fox said Hello";
		if (sentence.toUpperCase().contains("HELLO")) {
			// String contains Hello, or hello, or HeLLo
		}

		if (sentence.startsWith("The")) {
			System.out.println("Sentence starts with the");
		}

		sentence = sentence.replace("brown", "green");
		System.out.println("Sentence after replacement = " + sentence);
		sentence = sentence.replace("e", "");
		System.out.println("Sentence without e's = " + sentence);

		System.out.println();
		System.out.println("**********************");
		System.out.println("****** EQUALITY ******");
		System.out.println("**********************");
		System.out.println();

        char[] helloArray = new char[] { 'H', 'e', 'l', 'l', 'o' };
        String hello1 = new String(helloArray);
        String hello2 = new String(helloArray);

		/* Double equals will compare to see if the two variables, hello1 and
		 * hello2 point to the same object in memory. Are they the same object? */
		if (hello1 == hello2) {
			System.out.println("They are equal!");
		} else {
			System.out.println(hello1 + " is not equal to " + hello2);
		}

		String hello3 = hello1;
		if (hello1 == hello3) {
			System.out.println("hello1 is the same reference as hello3");
		}

		/* So, to compare the values of two objects, we need to use the equals method.
		 * Every object type has an equals method */
		if (hello1.equals(hello2)) {
			System.out.println("They are equal!");
		} else {
			System.out.println(hello1 + " is not equal to " + hello2);
		}


	}
}
