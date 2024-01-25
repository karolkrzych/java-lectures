package com.company;

public class Main {

    public static void main(String[] args) {
        // calculate triangle field where a=31 and h=6
        System.out.println(triangleField(1.0, 1.0));
        // calculate trapeze field where a=13.21, b=213.56 and h=18
        System.out.println(trapezeField(13.21, 213.56, 18));
        // calculate factorial of 6
        System.out.println(calculateFactorial(6));
        // calculate circle field where r=100
        System.out.println(calculateCircleField(100.0));
        // calculate the rest of division from 123,90/11,08
        System.out.println(calculateRestOfDivision(23.90, 11.08));
        // check if 121 is completly divisible by 11
        System.out.println(checkIfCompletelyDivisable(121, 11));
        // which value is bigger ? 1 and 1/3 or 1 and 1/2
        System.out.println(checkBigger(1.33, 1.5));
        // calculate delta value for function f(x)= 2x^2 + 12x + 5
        System.out.println(calculateDelta(2, 12, 5));
        // how value in integer is for first later of your name (use cast)
        System.out.println(charToInt('K'));
        // how value are sum of all chars in your name (use cast)
        System.out.println(charSum("KAROL"));

    }
    
    public static double triangleField(double a, double h) {
        return a * h / 2.0; 
    }
    
    public static double trapezeField(double a, double b, double h) {
        return ((a + b) * h) / 2.0; 
    }

    public static double calculateFactorial(int number) {
        long factorial = 1;
        for (int i =2; i <= number;  i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static double calculateCircleField(double radius) {
        return 3.14 * radius * radius;
    }

    public static double calculateRestOfDivision(double a, double b) {
        return a % b;
    }

    public static boolean checkIfCompletelyDivisable(double a, double b) {
        return a % b == 0d;
    }

    public static double checkBigger(double a, double b) {
        return a > b ? a : b;
    }

    public static double calculateDelta(int a, int b, int c) {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public static int charToInt(char letter) {
        return (int) letter;
    }

    public static double charSum(String letters) {
        char[] charArray = letters.toCharArray();
        double sum = 0;
        for(int i = 0; i < charArray.length; i++) {
            sum += (double) charArray[i];
        }
        return sum;
    }
}