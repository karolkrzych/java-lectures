package com.company;

public class Main {

    public static void main(String[] args) {
        //Declare and initialize 3 variables and write algorithm to print the bigest and lowest of them
        int x = 7;
        int y = 4;
        int z = 2787;
        int min;
        int max;

        if (z > 5000) {

        } else if (z <= 5000) {

        }

        //Methode 1
        min = 0;
        max = 0;
        if (x > y && x > z) {
            max = x;
        } else if (y > x && y > z) {
            max = y;
        } else if (z > y && z > x) {
            max = z;
        }
        if (x < y && x < z) {
            min = x;
        } else if (y < x && y < z) {
            min = y;
        } else if (z < x && z < y) {
            min = z;
        }
        System.out.println("(Methode 1) Max to: " + max + " Min to: " + min);



        //Methode 2
        min = x;
        max = x;
        if (max < y) {
            max = y;
        } else {
            min = y;
        }

        if (max < z) {
            max = z;
        } else {
            min = z;
        }
        System.out.println("(Methode 2) Max to: " + max + " Min to: " + min);




        //Methode 3
        min = x;
        max = x;
        if (max < y) {
            max = y;
            if (max < z) {
                max = z;
            }
            if (min > z) {
                min = z;
            }
        } else {
            min = y;
            if (min > z) {
                min = z;
            }
            if (max < z) {
                max = z;
            }
        }
        System.out.println("(Methode 3) Max to: " + max + " Min to: " + min);


    }
}
