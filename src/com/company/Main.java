package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(2, 6);
        System.out.println(rectangle1.calculateArea());
        System.out.println(rectangle1.printArea());
        System.out.println(rectangle1.printRectangleKind());


        //System.out.println(rectangle1.isTheSameRectangle(2,9));

        rectangle1.printRectanglesCount();
        System.out.println(Rectangle.printClassName(true));

        System.out.println(" ");

        Rectangle rectangle2 = new Rectangle(2, 2);
        System.out.println(rectangle2.calculateArea());
        System.out.println(rectangle2.printArea());
        System.out.println(rectangle2.printRectangleKind());
        //System.out.println(rectangle1.isTheSameRectangle());
        rectangle1.printRectanglesCount();
        System.out.println(Rectangle.printClassName(false));



    }
}


