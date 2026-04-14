package dev.skystone;

import java.util.InputMismatchException;


public class Cylinder {
    
    public static double calcSurface(double radius, double height) {
        if(radius <= 0 || height <= 0) throw new InputMismatchException("Hiba! A megadott számok nagyobb kell legyenek, mint 0!");
        return (2*Math.PI*Math.pow(radius,2)) + (2*Math.PI*radius*height);
    }
}
