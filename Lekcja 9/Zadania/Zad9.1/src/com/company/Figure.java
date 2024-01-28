package com.company;

public class Figure {

    protected FigureTypes[] types;

    public Figure(FigureTypes[] types) {
        this.types = types;
    }

    public FigureTypes[] getTypes() {
        return this.types;
    }

}
