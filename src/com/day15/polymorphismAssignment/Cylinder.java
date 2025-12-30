package com.day15.polymorphismAssignment;

public class Cylinder extends Shape4 {
    double r,h;
    public Cylinder(double r,double h){ this.r=r; this.h=h; }
    public void draw(){ System.out.println("Drawing Cylinder"); }
    public double calculateArea(){
        return 2*Math.PI*r*(r+h);
    }
}
