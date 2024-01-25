package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Square extends Rectangle {

    public Square(double a) {
        super(a, a, FigureType.SQUARE);
    }

    public void print() {
        System.out.print(
                "This object is square. He is");
        for (FigureType ft : types) {
            System.out.print(" ");
            System.out.print(ft);

        }
        System.out.print(". He have surface area equal " + surfaceArea()
                + " and circuit equal " + circuit() + ". \n");
    }

    public static Square build() {

        System.out.println("BUILD SQUARE");
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

        return new Square(a);
    }

}
