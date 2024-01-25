package com.company;

public class Figure {

    protected FigureType[] types;

    public Figure(FigureType[] types) {
        this.types = types;
    }

    public FigureType[] getTypes() {
        return types;
    }
}
