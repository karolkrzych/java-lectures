package com.company;

public class Main {

    public static void main(String[] args) {
        // Declare integer two-dimension table and initialize all elements by sum
        // squares of indexes and print all elements

        int table[][] = new int[5][5];

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = i * i + j * j;
                System.err.println(table[i][j]);
            }

        }
    }
}
