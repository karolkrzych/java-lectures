package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/* Calculator
	    - create menu to choice action (+ , - , * , / )
	    - after choose action get two values and do this action
	    - calculate values in loop always when action have correct value, stop do it when operation is wrong
	 */
        Scanner scanner = new Scanner(System.in);
        String operation;
        boolean run = true;

        do {
            System.out.println("Pick operation");

            operation = scanner.next();

            System.out.println("First value");
            double firstValue = scanner.nextDouble();

            System.out.println("Second value");
            double secondValue = scanner.nextDouble();
            switch (operation) {
                case "+":
                    System.out.println("Result: " + (firstValue + secondValue));
                    break;
                case "-":
                    System.out.println("Result: " + (firstValue - secondValue));
                    break;
                case "*":
                    System.out.println("Result: " + (firstValue * secondValue));
                    break;
                case "/":
                    if (secondValue != 0) {
                        System.out.println("Result: " + (firstValue / secondValue));
                    } else {
                        System.out.println("Can not divide by 0");
                    }
                    break;
                default:
                    run = false;
                    System.out.println("Undefined operation");
                    break;
            }

            System.out.println("------------------------------------------");
        } while (run);

    }
}
