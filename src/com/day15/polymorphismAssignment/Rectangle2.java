package com.day15.polymorphismAssignment;

public class Rectangle2 extends Shape2 {
    double l,w;
    public Rectangle2(double l,double w){ this.l=l; this.w=w; }
    public double getArea(){ return l*w; }
    public double getPerimeter(){ return 2*(l+w); }
}
