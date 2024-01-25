package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Trapeze extends Polygon {

    private double secondBase;

    public Trapeze(double a, double b, double h) {
        super(FigureType.TRAPEZE, a, h);
        this.secondBase = b;
    }

    public void print() {
        System.out.print(
                "This object is trapeze. He is");
        for (FigureType ft : super.getTypes()) {
            System.out.print(" ");
            System.out.print(ft);

        }
        System.out.print(". He have surface area equal " + surfaceArea()
                + " and circuit equal " + circuit() + ". \n");
    }

    public double surfaceArea() {
        return ((this.base + this.secondBase) * this.high) / 2.0;
    }

    public double circuit() {

        double aToPitagoras = (this.base - this.secondBase) / 2.0;
        double bToPitagoras = this.high;
        double cToPitagoras = Math.sqrt(Math.pow(aToPitagoras, 2.0) + Math.pow(bToPitagoras, 2.0));

        return this.base + this.secondBase + 2 * cToPitagoras;
    }

    public static Trapeze build() {

        System.out.println("BUILD RECTANGLE");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Get base, second base and high :");

        double a = 0.0;
        double b = 0.0;
        double h = 0.0;
        do {
            try {

                a = scanner.nextDouble();
                b = scanner.nextDouble();
                h = scanner.nextDouble();

                if (a < 0.0 && b < 0.0 && h < 0.0) {
                    throw new ImpossibleFigureException();
                }
            } catch (InputMismatchException e) {
                System.out.println("Wrong input data");
                System.out.println("Get base, second base and high again.");
                scanner = new Scanner(System.in);
            } catch (ImpossibleFigureException e) {
                a = 0.0;
                b = 0.0;
                h = 0.0;
                System.out.println(e.getMessage());
                System.out.println("Get base, second base and high again.");
                scanner = new Scanner(System.in);
            }
        } while (a == 0.0 || b == 0.0 || h == 0.0);

        return new Trapeze(a, b, h);
    }
}
