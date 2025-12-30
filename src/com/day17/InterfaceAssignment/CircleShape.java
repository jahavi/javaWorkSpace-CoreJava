package com.day17.InterfaceAssignment;
public class CircleShape implements Shape {
    double r;
    public CircleShape(double r){ this.r=r; }
    public double getArea(){ return Math.PI*r*r; }
}
