package com.company;

public class Polygon extends Figure {

    protected double base;
    protected double height;

    public Polygon(double base, double height, FigureTypes figureType) {
        super(new FigureTypes[] { FigureTypes.POLYGON, figureType });
        this.base = base;
        this.height = height;
    }

}
