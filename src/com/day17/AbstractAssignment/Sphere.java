package com.day17.AbstractAssignment;

public class Sphere extends Shape3D {
    double r;
    public Sphere(double r){ this.r=r; }
    public double calculateVolume(){ return (4/3.0)*Math.PI*r*r*r; }
    public double calculateSurfaceArea(){ return 4*Math.PI*r*r; }
}
