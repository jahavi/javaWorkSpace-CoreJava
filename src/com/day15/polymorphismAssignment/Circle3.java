package com.day15.polymorphismAssignment;

public class Circle3 extends Shape3 {
    double r;
    public Circle3(double r){ this.r=r; }
    public void draw(){ System.out.println("Drawing Circle"); }
    public double calculateArea(){ return Math.PI*r*r; }
}
