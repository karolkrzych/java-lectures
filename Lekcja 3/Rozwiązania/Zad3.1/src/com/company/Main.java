package com.company;

import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        // declare int table and use arthmetical operators on int types
        System.out.println("-------------------------------------------");
        int[] arthmeticalOperatos = new int[7];
        arthmeticalOperatos[0] = 1 + 2;
        arthmeticalOperatos[1] = 2 - 1;
        arthmeticalOperatos[2] = 3 * 3;
        arthmeticalOperatos[3] = 4 / 4;
        arthmeticalOperatos[4] = 10 % 5;
        arthmeticalOperatos[5] = arthmeticalOperatos[0]++;
        arthmeticalOperatos[6] = arthmeticalOperatos[1]--;
        printTable(arthmeticalOperatos);
        // declare byte table and use bit operators on byte types
        System.out.println("-------------------------------------------");
        byte[] bitOperators = new byte[7];
        bitOperators[0] = 1 & 1;
        bitOperators[1] = 1 | 0;
        bitOperators[2] = ~1;
        bitOperators[3] = 1 ^ 1;
        bitOperators[4] = 5 >> 1;
        bitOperators[5] = 5 << 1;
        bitOperators[6] = 5 >>> 1;
        printTable(bitOperators);
        // declare boolean table and use logic operators on boolean types
        System.out.println("-------------------------------------------");
        boolean[] logicOperators = new boolean[3];
        logicOperators[0] = true && false;
        logicOperators[1] = true || false;
        logicOperators[2] = !false;
        printTable(logicOperators);
        // declare boolean table and use comperation operators on char types
        System.out.println("-------------------------------------------");
        boolean[] comperationOperators = new boolean[7];
        comperationOperators[0] = 'A' == 'A';
        comperationOperators[1] = 'A' != 'A';
        comperationOperators[3] = 'A' > 'B';
        comperationOperators[4] = 'A' < 'B';
        comperationOperators[5] = 'A' >= 'A';
        comperationOperators[6] = 'A' <= 'C';
        printTable(comperationOperators);
        System.out.println("-------------------------------------------");

    }

    public static void printTable(int table[]) {
        IntStream.range(0, table.length).mapToObj(index -> "Table[" + index + "]=" + table[index]).forEach(System.out::println);
    }

    public static void printTable(byte table[]) {
        IntStream.range(0, table.length).mapToObj(index -> "Table[" + index + "]=" + table[index]).forEach(System.out::println);
    }

    public static void printTable(boolean table[]) {
        IntStream.range(0, table.length).mapToObj(index -> "Table[" + index + "]=" + table[index]).forEach(System.out::println);
    }
}
