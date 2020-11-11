package com.company;

import java.util.Random;

import static com.company.Rectangle.printClassName;

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
        Rectangle.printClassName(true);

        System.out.println(" ");

        System.out.println(rectangle2.calculateArea());
        System.out.println(rectangle2.printArea());
        System.out.println(rectangle2.printRectangleKind());
        System.out.println(rectangle2.isTheSameRectangle(rectangle1));
        rectangle2.printRectanglesCount();
        Rectangle.printClassName(false);

        System.out.println(" ");

        System.out.println(rectangle3.calculateArea());
        System.out.println(rectangle3.printArea());
        System.out.println(rectangle3.printRectangleKind());
        System.out.println(rectangle3.isTheSameRectangle(rectangle2));
        rectangle3.printRectanglesCount();
        Rectangle.printClassName(true);


    }
}



