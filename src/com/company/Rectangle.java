package com.company;

import java.util.Objects;

public class Rectangle {

    double x;
    double y;
    private int createdRectangles;

    public Rectangle (double x, double y){
        this.x = x;
        this.y = y;
        createdRectangles+= 1;
        }

        /*public Rectangle22 (double x){
        this.x = x;
        this.y = x;
       createdRectangles+=1;
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

    //public boolean isTheSameRectangle(Rectangle rectangle){
       // return x.equals(Rectangle.x) && y.equals(Rectangle.y);
       // }

    public String printRectanglesCount (){
        return ("Всего было создано" + " " + createdRectangles + " " + "прямоугольников");

        }
    }



