package com.company;

public class Rectangle {

    private static boolean printInRussian;
    double x;
    double y;

    static private int createdRectangles;

    private final static String RUSSIAN_CLASS_NAME = "Прямоугольник";
    private final static String ENGLISH_CLASS_NAME = "Rectangle";


    public Rectangle (double x, double y){
        this.x = x;
        this.y = y;
        createdRectangles++;
        }

    /*public Rectangle (double x){
        this.x = x;
        this.y = x;
       createdRectangles++;
    }
*/
    public double calculateArea (){
        return x*y;
    }
    public String printArea (){
        return "Площадь прямоугольника:" + calculateArea();
    }
    public String printRectangleKind(){
        if (x==y) {
            return "Это квадрат";
        }
        else {
            return "Это прямоугольник";
        }
    }

    /*public boolean isTheSameRectangle(Rectangle rectangle){
       return x==rectangle.x && y==rectangle.y;
        }
*/
    public void printRectanglesCount (){
        System.out.println ("Всего было создано " + createdRectangles + " прямоугольник(а)");

        }
        public static String printClassName (boolean printInRussian){

            if (Rectangle.printInRussian =true) {
               return "Прямоугольник";
               }

        else {
               return "Rectangle";
                }
        }
    }




