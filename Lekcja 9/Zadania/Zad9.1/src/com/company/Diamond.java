package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Diamond extends Polygon {

    public Diamond(double a, double h) {
        super(FigureType.DIAMOND, a, h);
    }

    public double surfaceArea() {
        return this.base * this.high;
    }

    public double circuit() {
        return 4 * this.base;
    }

    public void print() {
        System.out.print(
                "This object is diamond. He is");
        for (FigureType ft : types) {
            System.out.print(" ");
            System.out.print(ft);

        }
        System.out.print(". He have surface area equal " + surfaceArea()
                + " and circuit equal " + circuit() + ". \n");
    }

    public static Diamond build() {

        System.out.println("BUILD DIAMOND");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Get base and high :");

        double a = 0.0;
        double h = 0.0;
        do {
            try {

                a = scanner.nextDouble();
                h = scanner.nextDouble();

                if (a < 0.0 && h < 0.0 && h >= a) {
                    throw new ImpossibleFigureException();
                }
            } catch (InputMismatchException e) {
                System.out.println("Wrong input data");
                System.out.println("Get base and high again.");
                scanner = new Scanner(System.in);
            } catch (ImpossibleFigureException e) {
                a = 0.0;
                h = 0.0;
                System.out.println(e.getMessage());
                System.out.println("Get base and high again.");
                scanner = new Scanner(System.in);
            }
        } while (a == 0.0 || h == 0.0);

        return new Diamond(a, h);
    }
}
