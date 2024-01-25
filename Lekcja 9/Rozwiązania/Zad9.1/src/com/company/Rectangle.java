package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Rectangle extends Polygon {

    public Rectangle(double a, double b) {
        super(FigureType.RECTANGLE, a, b);
    }

    protected Rectangle(double a, double b, FigureType figureType) {
        super(new FigureType[]{FigureType.RECTANGLE, figureType}, a, b);
    }

    public double surfaceArea() {
        return this.base * this.high;
    }

    public double circuit() {
        return 2 * this.base + 2 * this.high;
    }

    public void print() {
        System.out.print(
                "This object is rectangle. He is");
        for (FigureType ft : super.getTypes()) {
            System.out.print(" ");
            System.out.print(ft);

        }
        System.out.print(". He have surface area equal " + surfaceArea()
                + " and circuit equal " + circuit() + ". \n");
    }

    public static Rectangle build() {

        System.out.println("BUILD RECTANGLE");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Get base and high :");

        double a = 0.0;
        double b = 0.0;
        do {
            try {

                a = scanner.nextDouble();
                b = scanner.nextDouble();

                if (a < 0.0 && b < 0.0) {
                    throw new ImpossibleFigureException();
                }
            } catch (InputMismatchException e) {
                System.out.println("Wrong input data");
                System.out.println("Get base and high again.");
                scanner = new Scanner(System.in);
            } catch (ImpossibleFigureException e) {
                a = 0.0;
                b = 0.0;
                System.out.println(e.getMessage());
                System.out.println("Get base and high again.");
                scanner = new Scanner(System.in);
            }
        } while (a == 0.0 || b == 0.0);

        return new Rectangle(a, b);
    }
}
