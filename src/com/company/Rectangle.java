package com.company;

public class Rectangle {

    double x;
    double y;

    public Rectangle (double x, double y){
        this.x = x;
        this.y = y;
        }

    public double calculateArea (){
        return x*y;
    }
    public String printArea (){
        return ("Площадь прямоугольника:" + calculateArea());
    }
    public String printRectangleKind(){
        if (x==y) {
            return ("Это квадрат");
        }
        else {
            return ("Это прямоугольник");
        }
    }

    }

