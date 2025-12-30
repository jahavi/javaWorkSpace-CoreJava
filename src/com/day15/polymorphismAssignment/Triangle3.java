package com.day15.polymorphismAssignment;

public class Triangle3 extends Shape3 {
    double b,h;
    public Triangle3(double b,double h){ this.b=b; this.h=h; }
    public void draw(){ System.out.println("Drawing Triangle"); }
    public double calculateArea(){ return 0.5*b*h; }
}
