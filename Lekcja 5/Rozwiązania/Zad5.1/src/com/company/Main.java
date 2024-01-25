package com.company;

public class Main {

    public static void main(String[] args) {
        // Initialize tables one-dimension and two-dimension with your name and surname and print it char by char in one line and use all loop types

        char[] oneDimensionTable = {'A', 'R', 'T', 'U', 'R', ' ', 'D', 'O', 'B', 'N', 'E', 'R'};
        char[][] twoDimensionTable = {
                {'A', 'R', 'T', 'U', 'R', ' '},
                {'D', 'O', 'B', 'N', 'E', 'R'}
        };

        System.out.println("For with indexes one dimension");
        for (int i = 0; i < oneDimensionTable.length; i++) {
            System.out.print(oneDimensionTable[i]);
        }
        System.out.println();

        System.out.println("For each one dimension");
        for (char element : oneDimensionTable) {
            System.out.print(element);
        }
        System.out.println();


        System.out.println("While one dimension");
        int whileCounterOneDimension = 0;
        while (whileCounterOneDimension < oneDimensionTable.length) {
            System.out.print(oneDimensionTable[whileCounterOneDimension]);
            ++whileCounterOneDimension;
        }
        System.out.println();

        System.out.println("Do while one dimension");
        int doWhileCounterOneDimension = 0;
        do {
            System.out.print(oneDimensionTable[doWhileCounterOneDimension]);
            ++doWhileCounterOneDimension;
        } while (doWhileCounterOneDimension < oneDimensionTable.length);
        System.out.println();

        System.out.println("-------------------------------------------");
        System.out.println("For with indexes two dimension");
        for (int i = 0; i < twoDimensionTable.length; i++) {
            for (int j = 0; j < twoDimensionTable[i].length; j++) {
                System.out.print(twoDimensionTable[i][j]);
            }
            System.out.println();
        }

        System.out.println("For each two dimension");
        for (char[] rows : twoDimensionTable) {
            for (char element : rows) {
                System.out.print(element);
            }
            System.out.println();
        }


        System.out.println("While two dimension");
        int rowsWhile = 0;
        int columnsWhile = 0;
        while (rowsWhile < twoDimensionTable.length) {
            while (columnsWhile < twoDimensionTable[rowsWhile].length) {
                System.out.print(twoDimensionTable[rowsWhile][columnsWhile]);
                ++columnsWhile;
            }
            columnsWhile = 0;
            System.out.println();
            ++rowsWhile;
        }

        System.out.println("Do while two dimension");
        int rowsDoWhile = 0;
        int columnsDoWhile = 0;
        do {
            do {
                System.out.print(twoDimensionTable[rowsDoWhile][columnsDoWhile]);
                ++columnsDoWhile;
            } while (columnsDoWhile < twoDimensionTable[rowsDoWhile].length);
            columnsDoWhile = 0;
            System.out.println();
            ++rowsDoWhile;
        } while (rowsDoWhile < twoDimensionTable.length);


    }
}
