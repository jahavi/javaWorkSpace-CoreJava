package com.day15.polymorphismAssignment;

public class Triangle extends Shape {
    double base, height;
    public Triangle(double b, double h){ base=b; height=h; }
    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}
