package com.day17.InterfaceAssignment;
public class RectangleShape implements Shape {
    double l,w;
    public RectangleShape(double l,double w){ this.l=l; this.w=w; }
    public double getArea(){ return l*w; }
}
