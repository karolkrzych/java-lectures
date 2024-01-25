package com.company;

public class Main {

    public static void main(String[] args) {
        //Declare integer two-dimension table and initialize all elements by sum squares of indexes and print all elements

        int[][] twoDimensionTable = new int[10][10];

        for (int i = 0; i < twoDimensionTable.length; i++) {
            for (int j = 0; j < twoDimensionTable[i].length; j++) {
                twoDimensionTable[i][j] = i * i + j * j;
                System.out.print(twoDimensionTable[i][j]+"|");
            }
            System.out.println();
        }

    }
}
