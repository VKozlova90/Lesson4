package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(2, 6);
        Rectangle rectangle2 = new Rectangle(2, 2);
        Rectangle rectangle3 = new Rectangle(4, 8);

        System.out.println(rectangle1.calculateArea());
        System.out.println(rectangle1.printArea());
        System.out.println(rectangle1.printRectangleKind());
        System.out.println(rectangle1.isTheSameRectangle(rectangle1));
        rectangle1.printRectanglesCount();
        System.out.println(rectangle1.printClassName(true));

        System.out.println(" ");

        System.out.println(rectangle2.calculateArea());
        System.out.println(rectangle2.printArea());
        System.out.println(rectangle2.printRectangleKind());
        System.out.println(rectangle2.isTheSameRectangle(rectangle1));
        rectangle2.printRectanglesCount();
        System.out.println(rectangle2.printClassName(false));

        System.out.println(" ");

        System.out.println(rectangle3.calculateArea());
        System.out.println(rectangle3.printArea());
        System.out.println(rectangle3.printRectangleKind());
        System.out.println(rectangle3.isTheSameRectangle(rectangle2));
        rectangle3.printRectanglesCount();
        System.out.println(rectangle3.printClassName(false));


    }
}



