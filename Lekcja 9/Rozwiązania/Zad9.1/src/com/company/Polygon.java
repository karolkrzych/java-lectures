package com.company;

public class Polygon extends Figure {

    protected double base;
    protected double high;

    public Polygon(FigureType figureType, double base, double high) {
        super(new FigureType[]{FigureType.POLYGON, figureType});
        this.base = base;
        this.high = high;
    }

    public Polygon(FigureType[] figureTypes, double base, double high) {
        super(addToFigureType(figureTypes, FigureType.POLYGON));
        this.base = base;
        this.high = high;
    }

    protected static FigureType[] addToFigureType(FigureType[] table, FigureType figureType) {
        FigureType[] newTable = new FigureType[table.length];

        for (int i = 0; i < table.length; i++) {
            newTable[i] = table[i];
        }

        newTable[newTable.length - 1] = figureType;
        return newTable;
    }


}
