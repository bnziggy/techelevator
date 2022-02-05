package com.techelevator;

public class RectangleWall extends Wall {

    // Instance variables
    private int length;
    private int height;


    public RectangleWall(String name, String color, int length, int height) {
        super(name, color);
        this.length = length;
        this.height = height;
    }


    // getArea for rectangle
    public int getArea() {
        return this.length * this.height;
    }


    // toString method
    public String toString() {
        return getName() + " (" + getLength() + "x" + getHeight() + ") rectangle";
    }


    // Getters
    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }
}
