package com.company;

public class Main {

    public static void main(String[] args) {
        // calculate triangle field where a=31 and h=6
        byte triangleField = (31 * 6) / 2;
        System.out.println("triangleField=" + triangleField);
        // calculate trapeze field where a=13.21, b=213.56 and h=18
        double trapezeField = ((13.21 + 213.56) * 18.0) / 2.0;
        System.out.println("trapezeField=" + trapezeField);
        // calculate factorial of 6
        short factorialOf6 = 1 * 2 * 3 * 4 * 5 * 6;
        System.out.println("factorialOf6=" + factorialOf6);
        // calculate circle field where r=100
        double circleField = 3.14 * 100.0 * 100.0;
        System.out.println("circleField=" + circleField);
        // calculate the rest of division from 123,90/11,08
        double restOfDivision = 23.90 % 11.08;
        System.out.println("restOfDivision=" + restOfDivision);
        // check if 121 is completly divisible by 11
        boolean isDivisible = 121 % 11 == 0;
        System.out.println("isDivisible=" + isDivisible);
        // which value is bigger ? 1 and 1/3 or 1 and 1/2
        double oneAndOneByThree = (1.0 + 1.0 / 3.0);
        double oneAndOneByTwo = (1.0 + 1.0 / 2.0);
        boolean oneAndOneByThreeIsBiggerThanoneAndOneByTwo = oneAndOneByThree > oneAndOneByTwo;
        System.out.println("oneAndOneByThreeIsBiggerThanoneAndOneByTwo=" + oneAndOneByThreeIsBiggerThanoneAndOneByTwo);
        // calculate delta value for function f(x)= 2x^2 + 12x + 5
        short delta = 12 * 12 - 4 * 2 * 5;
        System.out.println("delta=" + delta);
        // how value in integer is for first later of your name (use cast)
        int valueOfFirstCharFromMyName = (int) 'A';
        System.out.println("valueOfFirstCharFromMyName=" + valueOfFirstCharFromMyName);
        // how value are sum of all chars in your name (use cast)
        short sumOfMyName = (short) ('A' + 'R' + 'T' + 'U' + 'R');
        System.out.println("sumOfMyName=" + sumOfMyName);

    }
}
