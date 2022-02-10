package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindAndReplace {

    public static void main(String[] args) {

        String searchWord = getSearchWord();
        String replacementWord = /*getReplacementWord();*/ "🥓";
        File userSourceFileInput = /*getSourceFile();*/ new File("C:\\Users\\Student\\workspace\\brett-ziegler-student-code\\module-1\\17_File_IO_Writing\\exercise\\src\\test\\resources\\bacon.txt");//
        File userDestinationFileInput = /*getDestinationFile();*/ new File("C:\\Users\\Student\\workspace\\brett-ziegler-student-code\\module-1\\17_File_IO_Writing\\exercise\\src\\test\\resources\\bacon-emoji.txt");//

        try (Scanner inputFile = new Scanner(userSourceFileInput);
              PrintWriter outputFile = new PrintWriter(userDestinationFileInput)) {

            while (inputFile.hasNextLine()) {
                String line = inputFile.nextLine();
                line = line.replaceAll(searchWord,replacementWord);

                outputFile.println(line);

            }

        } catch (FileNotFoundException e) {
            System.out.println("Error creating file");
        }
    }

    private static String getSearchWord() {
        Scanner userSearchInput = new Scanner(System.in);
        System.out.println("What is the search word?");
        String searchWord = userSearchInput.nextLine();

        return searchWord;
    }

    private static String getReplacementWord() {
        Scanner userReplacementInput = new Scanner(System.in);
        System.out.println("What is the replacement word?");
        String replacementWord = userReplacementInput.nextLine();

        return replacementWord;
    }

    private static File getSourceFile() {
        Scanner userFileInput = new Scanner(System.in);
        System.out.println("What is the source file?");
        File sourceFile = new File(userFileInput.nextLine());

        if (!sourceFile.exists()) {
            System.out.println("File does not exist");
            System.exit(1);
        }
        else if (!sourceFile.isFile()) {
            System.out.println("This is not a file");
            System.exit(2);
        }

        return sourceFile;
    }

    private static File getDestinationFile() {
        Scanner userDestinationInput = new Scanner(System.in);
        System.out.println("What is the destination file?");
        File destinationFile = new File(userDestinationInput.nextLine());

        return destinationFile;
    }
}
