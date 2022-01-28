package com.techelevator.shape;

public class Rectangle {

    public static final String SHAPE_NAME = "Rectangle";

    public static final int NUM_SIDES = 4;

    // static - shared across all instances of Rectangles
    private static int numInstances;

    // Instance Variables - created for each instance of Rectangle
    private int width;
    private int height;

    // Constructors
    public Rectangle() {
        //System.out.println("Default constructing a Rectangle");
        //numInstances++;
        this(0,0); // Calls Rectangle(int width, int height) with zeros
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
        numInstances++;
    }

    public void setWidth(int width) {
        if (width >= 0) {
            this.width = width;
        }
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getArea() {
        return this.height * this.width;
    }

    public int getPerimeter() {
        return (this.width * 2) + (this.height * 2);
    }

    public boolean isSquare() {
        return this.width == this.height;
    }

    public static int getNumInstances() {
        return numInstances;
    }

    public static int getArea(int width, int height) {
        return width * height;
    }
}
