package com.techelevator;

public abstract class Wall {

    //Instance variables
    private String name;
    private String color;
    private int area;


    public Wall(String name, String color) {
        this.name = name;
        this.color = color;
    }


    // Abstract get area
    public abstract int getArea();


    // Getters
    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
}
