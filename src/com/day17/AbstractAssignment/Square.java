package com.day17.AbstractAssignment;

public class Square extends GeometricShape {
    double side;
    public Square(double s){ this.side=s; }
    public double area(){ return side*side; }
    public double perimeter(){ return 4*side; }
}
