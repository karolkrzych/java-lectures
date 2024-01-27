package com.company;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Calculator
		 * - create menu to choice action (+ , - , * , / )
		 * - after choose action get two values and do this action
		 * - calculate values in loop always when action have correct value, stop do it
		 * when operation is wrong
		 */

		calculate();

	}

	static void calculate() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Choose operation: + - / *");

		String operation = scanner.nextLine();
		do {
			System.out.println("Choose value number one");
			int value1 = scanner.nextInt();
			System.out.println("Choose value number two");
			int value2 = scanner.nextInt();
			double result = 0;
			switch (operation) {
				case "+":
					result = value1 + value2;
					break;
				case "-":
					result = value1 - value2;
					break;
				case "/":
					result = value1 / value2;
					break;
				case "*":
					result = value1 * value2;
					break;
				default:
					return;
			}

			System.out.println("Your result is: " + result);
		} while (operation == "+" || operation == "-" || operation == "*" || operation == "/");
	}
}
