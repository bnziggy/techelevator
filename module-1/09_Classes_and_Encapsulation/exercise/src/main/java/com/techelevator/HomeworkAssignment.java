package com.techelevator;

public class HomeworkAssignment {

    private int earnedMarks;
    private int possibleMarks;
    private String submitterName;
    private String letterGrade;


    public HomeworkAssignment(int possibleMarks, String submitterName) {
        this.possibleMarks = possibleMarks;
        this.submitterName = submitterName;
    }

    public void setEarnedMarks(int earnedMarks) {
        this.earnedMarks = earnedMarks;
    }

    public int getEarnedMarks() {
        return earnedMarks;
    }

    public int getPossibleMarks() {
        return possibleMarks;
    }

    public String getSubmitterName() {
        return submitterName;
    }

    public String getLetterGrade() {

        double percentage = (getEarnedMarks() * 100) / getPossibleMarks();

        if (percentage >= 90) {
            letterGrade = "A";
        }
        else if (percentage >= 80) {
            letterGrade = "B";
        }
        else if (percentage >= 70) {
            letterGrade = "C";
        }
        else if (percentage >= 60) {
            letterGrade = "D";
        }
        else {
            letterGrade = "F";
        }
        return letterGrade;
    }

}
