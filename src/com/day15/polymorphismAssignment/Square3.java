package com.day15.polymorphismAssignment;

public class Square3 extends Shape3 {
    double side;
    public Square3(double s){ this.side=s; }
    public void draw(){ System.out.println("Drawing Square"); }
    public double calculateArea(){ return side*side; }
}
