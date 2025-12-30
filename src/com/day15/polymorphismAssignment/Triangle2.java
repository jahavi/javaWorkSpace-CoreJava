package com.day15.polymorphismAssignment;

public class Triangle2 extends Shape2 {
    double a,b,c;
    public Triangle2(double a,double b,double c){ this.a=a; this.b=b; this.c=c; }
    public double getArea(){
        double s=(a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
    public double getPerimeter(){ return a+b+c; }
}
