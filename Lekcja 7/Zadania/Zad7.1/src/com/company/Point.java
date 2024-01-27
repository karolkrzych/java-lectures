package com.company;

public class Point {
    /* Create outside class Point with three dimension axis x,y,z
           Add constructor to initialize it
           Add methode to count distance between two different points
           Initialize two points in main and check how long distance divide it
         */

    int x, y, z;

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int countDistance() {
        return Math.abs(x) + Math.abs(y);
    }
}
