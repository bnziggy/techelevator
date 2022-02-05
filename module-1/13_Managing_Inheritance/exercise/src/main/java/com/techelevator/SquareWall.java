package com.techelevator;

public class SquareWall  extends RectangleWall {

    // Instance variable
    private int sideLength;

    //Constructor
    public SquareWall(String name, String color, int sideLength) {
        super(name, color, sideLength, sideLength);
        this.sideLength = sideLength;
    }

    //toString method
    public String toString() {
        return getName() + " (" + getSideLength() + "x" + getSideLength() + ") square";
    }

    // Getter
    public int getSideLength() {
        return sideLength;
    }
}
