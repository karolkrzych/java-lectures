package com.company;

import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        // declare int table and use arthmetical operators on int types
        int intTable[] = new int[2];
        intTable[0] = 1;
        intTable[1] = 2;
        int intResult = intTable[0] + intTable[1];
        printTable(intTable);
        // declare byte table and use bit operators on byte types
        byte byteTable[] = new byte[2];
        byteTable[0] = (byte) 123;
        byteTable[1] = (byte) -123;
        // byte byteResult = byteTable[0] ^ byteTable[1];
        printTable(byteTable);
        // declare boolean table and use logic operators on boolean types
        boolean boolTable[] = new boolean[2];
        boolTable[0] = true;
        boolTable[1] = false;
        boolean boolResult1 = boolTable[0] && boolTable[1]; 
        printTable(boolTable);
        // declare boolean table and use comperation operators on char types
        boolean boolTable2[] = new boolean[2];
        boolTable2[0] = true;
        boolTable2[1] = false;
        boolean boolResult2 = boolTable2[0] != boolTable2[1]; 
        printTable(boolTable2);
    }

    public static void printTable(int table[]) {
        IntStream.range(0,table.length).mapToObj(index -> "Table[" + index + "]=" + table[index]).forEach(System.out::println);
    }
    public static void printTable(byte table[]) {
        IntStream.range(0,table.length).mapToObj(index -> "Table[" + index + "]=" + table[index]).forEach(System.out::println);
    }
    public static void printTable(boolean table[]) {
        IntStream.range(0,table.length).mapToObj(index -> "Table[" + index + "]=" + table[index]).forEach(System.out::println);
    }
}
