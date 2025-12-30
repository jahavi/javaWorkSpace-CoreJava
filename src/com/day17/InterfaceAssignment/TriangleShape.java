package com.day17.InterfaceAssignment;
public class TriangleShape implements Shape {
    double b,h;
    public TriangleShape(double b,double h){ this.b=b; this.h=h; }
    public double getArea(){ return 0.5*b*h; }
}
