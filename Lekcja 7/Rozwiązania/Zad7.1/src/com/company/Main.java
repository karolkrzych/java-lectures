package com.company;

public class Main {

    public static void main(String[] args) {
        /* Create outside class Point with three dimension axis x,y,z
           Add constructor to initialize it
           Add methode to count distance between two different points
           Initialize two points in main and check how long distance divide it
         */

        Point firstPoint = new Point(1,1,1);
        Point secondPoint = new Point(5,3,11);

        System.out.println(firstPoint.distance(secondPoint));
    }


}
