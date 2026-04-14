package dev.skystone;

public class Cylinder {
    
    public static double calcSurface(double radius, double height) {
        return (2*Math.PI*Math.pow(radius,2)) + (2*Math.PI*radius*height);
    }
}
