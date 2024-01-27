package com.company;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Declare and initialize new two dimension table witch chars.
		 * Fill all table some white characters and one char should be X
		 * Using keys W,S,A,D do algorithm to moving this character X inside table.
		 */

		char[][] table = new char[5][5];

		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				table[i][j] = '|';
			}
		}

		int row = 2;
		int column = 3;

		table[row][column] = 'X';

		Scanner scanner = new Scanner(System.in);
		do {
			String input = scanner.next();
			switch (input) {
				case "w":
					if (row - 1 >= 0) {
						System.out.println(row);
						System.out.println(column);
						table[row][column] = '|';
						table[--row][column] = 'X';
					}
					break;
				case "s":
					if (row + 1 < 5) {
						table[row][column] = '|';
						table[++row][column] = 'X';
					}
					break;
				case "a":
					if (column - 1 >= 0) {
						table[row][column] = '|';
						table[row][--column] = 'X';
					}
					break;
				case "d":
					if (column + 1 < 5) {
						table[row][column] = '|';
						table[row][++column] = 'X';
					}
					break;
				default:
					break;
			}

			for (int i = 0; i < table.length; i++) {
				for (int j = 0; j < table[i].length; j++) {
					System.out.print(table[i][j]);
				}
				System.out.println();
			}

		} while (true);

	}

}
