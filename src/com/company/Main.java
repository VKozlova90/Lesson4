package com.company;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(2,6);
        System.out.println(rectangle1.calculateArea());
        System.out.println(rectangle1.printArea());
        System.out.println(rectangle1.printRectangleKind());
        System.out.println(rectangle1.printRectanglesCount());


        Rectangle rectangle2 = new Rectangle(2,2);
        System.out.println(rectangle2.calculateArea());
        System.out.println(rectangle2.printArea());
        System.out.println(rectangle2.printRectangleKind());
        System.out.println(rectangle2.printRectanglesCount());

        //System.out.println (rectangle1.isTheSameRectangle (rectangle2));



    }
}
