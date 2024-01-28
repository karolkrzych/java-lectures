package com.company;

import java.util.Scanner;

public class Rectangle extends Polygon {
    public Rectangle(double base, double height) {
        super(base, height, FigureTypes.RECTANGLE);
    }

    public static double calculateSurfaceArea(double base, double height) {
        return base * height;
    }

    public void print() {
        double area = calculateSurfaceArea(base, height);
        System.out.println(area);
    }

    public static Rectangle build() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Base");
            double base = scanner.nextInt();
            System.out.println("Height");
            double height = scanner.nextInt();
            scanner.close();
            return new Rectangle(base, height);
        } catch (NullPointerException e) {
            return e;
        }
    }
}
