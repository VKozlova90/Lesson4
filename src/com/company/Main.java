package com.company;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(2,6);
        System.out.println(rectangle1.calculateArea());
        System.out.println(rectangle1.printArea());
        System.out.println(rectangle1.printRectangleKind());


        Rectangle rectangle2 = new Rectangle(2,2);
        System.out.println(rectangle2.calculateArea());
        System.out.println(rectangle2.printArea());
        System.out.println(rectangle2.printRectangleKind());

        Rectangle rectangle3 = new Rectangle(1,3);
        System.out.println(rectangle3.isTheSameRectangle());










    }
}
