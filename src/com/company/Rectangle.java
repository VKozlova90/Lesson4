package com.company;

public class Rectangle {

    double x;
    double y;

    static private int createdRectangles;

    private final static String RUSSIAN_CLASS_NAME = "Прямоугольник";
    private final static String ENGLISH_CLASS_NAME = "Rectangle";
    private Rectangle rectangle;


    public Rectangle(double x, double y) {
        this.x = x;
        this.y = y;
        createdRectangles++;
    }

    public Rectangle(double x) {
        this.x = x;
        this.y = x;
        createdRectangles++;
    }

    public double calculateArea() {
        return x * y;
    }

    public String printArea() {
        return "Площадь прямоугольника:" + calculateArea();
    }

    public String printRectangleKind() {
        if (x == y) {
            return "Это квадрат";
        }
        else {
            return "Это прямоугольник";
        }
    }

    public boolean isTheSameRectangle(Rectangle rectangle) {
        //this.rectangle = rectangle;
        return this.x == rectangle.x && this.y == rectangle.y;
    }

    public void printRectanglesCount() {
        System.out.println("Всего было создано " + createdRectangles + " прямоугольник(а)");

    }

    public static void printClassName(boolean printInRussian) {

        if (printInRussian) {
            System.out.println(RUSSIAN_CLASS_NAME);
        }
        else  {
            System.out.println(ENGLISH_CLASS_NAME);
        }
    }
}




