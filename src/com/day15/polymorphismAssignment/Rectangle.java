package com.day15.polymorphismAssignment;

public class Rectangle extends Shape {
    double length, width;
    public Rectangle(double l, double w){ length=l; width=w; }
    @Override
    public double calculateArea() {
        return length * width;
    }
}
