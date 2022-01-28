package com.techelevator.shape;

public class ShapeApp {

    public static void main(String[] args) {
        Rectangle rec = new Rectangle();

        rec.setWidth(10);
        rec.setHeight(20);

        System.out.println(rec.getWidth());

        Rectangle rect2 = new Rectangle();

        rect2.setWidth(20);
        System.out.println(rect2.getWidth());

        System.out.println("Area of the rect is " + rec.getArea());
        System.out.println("Perimeter of the rect is " + rec.getPerimeter());

        rec.setHeight(5);

        System.out.println("After setting height to " + rec.getHeight());
        System.out.println("Area of rec is " + rec.getArea());
        System.out.println("Perimeter of rec is " + rec.getPerimeter());

        Rectangle rect3 = new Rectangle(40, 5);
        System.out.println("The area of rect3 is " + rect3.getArea());

        System.out.println("We've constructed " + Rectangle.getNumInstances() + " instances");

        int area15x20 = Rectangle.getArea(15,20);
        System.out.println("The area of 15x20 is " + area15x20);

        System.out.println("PI = " + Math.PI);
        //Math.PI = 7.0;  Won't compile because PI is final

        //Math math = new Math(); Won't compile because constructor is private
    }
}
