package com.day15.polymorphismAssignment;

public class Circle4 extends Shape4 {
    double r;
    public Circle4(double r){ this.r=r; }
    public void draw(){ System.out.println("Drawing Circle"); }
    public double calculateArea(){ return Math.PI*r*r; }
}
