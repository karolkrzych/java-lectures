package com.company;

public class Main {

    public static void main(String[] args) {
        /*
         * - Decare and initialize variable char with some arithmetic char (+,-,*,/)
         * - Declare and initialize int one dimension table with random values
         * - Write methods to sum all table elements if char is +, subtract if char is -
         * and the same rule for * and /
         */

        char operation = '*';
        int[] values = { 10, 2, 1, 22, 11, 4 };
        calculate(values, operation);
    }

    static int calculate(int[] values, char operation) {
        int result = values[0];
        switch (operation) {
            case '+':
                for (int value : values) {
                    result += value;
                }
                break;
            case '-':
                for (int value : values) {
                    result -= value;
                }
                break;
            case '/':
                for (int value : values) {
                    result /= value;
                }
                break;
            case '*':
                for (int value : values) {
                    result *= value;
                }
                break;
            default:
                break;
        }
        System.err.println(result);
        return result;

    }
}
