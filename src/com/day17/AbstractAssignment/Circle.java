package com.day17.AbstractAssignment;

public class Circle extends Shape {
    double r;
    public Circle(double r){ this.r=r; }
    public double calculateArea(){ return Math.PI*r*r; }
    public double calculatePerimeter(){ return 2*Math.PI*r; }
}
