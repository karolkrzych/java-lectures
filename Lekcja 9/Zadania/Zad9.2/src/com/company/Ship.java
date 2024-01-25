package com.company;

public class Ship {
  private String name;
  private int coordinateX;
  private int coordinateY;
  private int fieldsCount;
  Arrangement arrangement;

    public Ship(String name,int fieldsCount) {
        this.name = name;
        this.fieldsCount = fieldsCount;
    }

    public int getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(int coordinateX) {
        this.coordinateX = coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(int coordinateY) {
        this.coordinateY = coordinateY;
    }

    public int getFieldsCount() {
        return fieldsCount;
    }

    public Arrangement getArrangement() {
        return arrangement;
    }

    public void setArrangement(Arrangement arrangement) {
        this.arrangement = arrangement;
    }
}
