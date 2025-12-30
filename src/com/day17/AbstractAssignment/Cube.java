package com.day17.AbstractAssignment;

public class Cube extends Shape3D {
    double side;
    public Cube(double s){ this.side=s; }
    public double calculateVolume(){ return side*side*side; }
    public double calculateSurfaceArea(){ return 6*side*side; }
}
