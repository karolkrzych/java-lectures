package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Circle extends Figure {

    private double radius;

    public Circle(double r) {
        super(new FigureType[]{FigureType.CIRCLE});
        this.radius = r;
    }

    public double surfaceArea() {
        return Math.PI * radius * radius;
    }

    public double circuit() {
        return 2 * Math.PI * radius;
    }

    public void print() {
        System.out.print(
                "This object is circle. He is");
        for (FigureType ft : types) {
            System.out.print(" ");
            System.out.print(ft);

        }
        System.out.print(". He have surface area equal " + surfaceArea()
                + " and circuit equal " + circuit() + ". \n");
    }

    public static Circle build() {

        System.out.println("BUILD CIRCLE");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Get radius :");

        double r = 0.0;

        do {
            try {
                r = scanner.nextDouble();

                if (r < 0.0) {
                    throw new ImpossibleFigureException();
                }
            } catch (InputMismatchException e) {
                System.out.println("Wrong input data");
                System.out.println("Get radius again.");
                scanner = new Scanner(System.in);
            } catch (ImpossibleFigureException e) {
                r = 0.0;
                System.out.println(e.getMessage());
                System.out.println("Get radius again.");
                scanner = new Scanner(System.in);
            }
        } while (r == 0.0);

        return new Circle(r);
    }
}
