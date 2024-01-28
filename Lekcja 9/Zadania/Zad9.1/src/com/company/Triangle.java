package com.company;

public class Triangle extends Polygon {
    public Triangle(double base, double height) {
        super(base, height, FigureTypes.TRIANGLE);
    }

    public double calculateSurfaceArea() {
        return base * height;
    }
}
