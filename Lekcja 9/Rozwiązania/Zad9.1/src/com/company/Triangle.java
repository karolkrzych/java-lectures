package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Triangle extends Polygon {

    public Triangle(double a) {
        super(FigureType.TRIANGLE, a, a * Math.sqrt(3) / 2);
    }

    public double surfaceArea() {
        return this.base * this.high / 2.0;
    }

    public double circuit() {
        return 3 * base;
    }

    public void print() {
        System.out.print(
                "This object is triangle. He is");
        for (FigureType ft : types) {
            System.out.print(" ");
            System.out.print(ft);

        }
        System.out.print(". He have surface area equal " + surfaceArea()
                + " and circuit equal " + circuit() + ". \n");
    }

    public static Triangle build() {

        System.out.println("BUILD TRIANGLE");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Get base :");

        double a = 0.0;
        do {
            try {
                a = scanner.nextDouble();

                if (a < 0.0) {
                    throw new ImpossibleFigureException();
                }
            } catch (InputMismatchException e) {
                System.out.println("Wrong input data");
                System.out.println("Get base again.");
                scanner = new Scanner(System.in);
            } catch (ImpossibleFigureException e) {
                a = 0.0;
                System.out.println(e.getMessage());
                System.out.println("Get base again.");
                scanner = new Scanner(System.in);
            }
        } while (a == 0.0);

        return new Triangle(a);
    }
}
