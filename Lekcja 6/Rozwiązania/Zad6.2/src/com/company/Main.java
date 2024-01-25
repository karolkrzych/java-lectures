package com.company;

public class Main {

    public static void main(String[] args) {
	/* - Declare and initialize variable char with some arithmetic char (+,-,*,/)
	   - Declare and initialize int one dimension table with random values
       - Write methods to sum all table elements if char is +, subtract if char is - and the same rule for * and /
	 */

        char action = '-';
        long[] table = {564, 456, 4881, 158463};

        switch (action) {
            case '*':
                System.out.println("Result for " + action + ": " + multiply(table));
                break;
            case '-':
                System.out.println("Result for " + action + ": " + subtract(table));
                break;
        }
    }

    static long multiply(long[] table) {
        long result = 1;
        for (int i = 0; i < table.length; i++) {
            result *= table[i];
            //result = result * table[i];
        }
        return result;
    }

    static long subtract(long[] table) {
        long result = 0;
        for (int i = 0; i < table.length; i++) {
            result -= table[i];
            //result = result - table[i];
        }
        return result;
    }
}
