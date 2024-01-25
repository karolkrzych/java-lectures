package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/* Declare and initialize new two dimension table witch chars.
	   Fill all table some white characters and one char should be X
	   Using keys W,S,A,D do algorithm to moving this character X inside table.
	 */

        Scanner scanner = new Scanner(System.in);
        int cursorX = 0;
        int cursorY = 0;
        char[][] map = new char[10][10];
        while (true) {
            map = setCursor(map, cursorX, cursorY);
            print(map);
            String move = scanner.nextLine();
            switch (move) {
                case "W":
                    cursorX = move(cursorX, 0, map.length, move);
                    break;
                case "S":
                    cursorX = move(cursorX, 0, map.length, move);
                    break;
                case "A":
                    cursorY = move(cursorY, 0, map[0].length, move);
                    break;
                case "D":
                    cursorY = move(cursorY, 0, map[0].length, move);
                    break;
                default:
                    System.out.println("Wrong input");
                    break;
            }
        }
    }

    public static int move(int value, int min, int max, String direction) {
        if (("S".equals(direction)  || "D".equals(direction)) && value < max - 1) {
            return ++value;
        } else if (("W".equals(direction) || "A".equals(direction)) && value > min) {
            return --value;
        } else {
            System.out.println("Move is impossible");
            return value;
        }
    }


    public static char[][] setCursor(char[][] table, int x, int y) {

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = ' ';
            }
        }
        table[x][y] = 'X';
        return table;
    }

    public static void print(char[][] table) {
        System.out.println("/----------\\");
        for (int i = 0; i < table.length; i++) {
            System.out.print('|');
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j]);
            }
            System.out.print('|');
            System.out.println();
        }
        System.out.println("\\__________/");
    }
}
