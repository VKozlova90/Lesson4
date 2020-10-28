package com.company;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2,6);
        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.printArea());
        System.out.println(rectangle.printRectangleKind());
    }
}
