package com.company;

public class Main {

    public static void main(String[] args) {
		//Declare and initialize 3 variables and write algorithm to print the biggest and lowest of them
        int a=20,b=15,c=31;
        int max = a, min =a;
        
        if (b > max) {
            max = b;
        } else {
            min = b;
        }

        if (c > max) {
            max = c;
        } else {
            min = c;
        }


        System.out.println(max);
        System.out.println(min);


    }
}
