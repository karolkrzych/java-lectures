package com.company;

public class Main {

    public static void main(String[] args) {
		/*Declare and initialize char variable reprezented one of two boolean variable (0 is false and 1 is true)
         and next use it by switch instruction to print information about it */

        char myChar = '0';

        switch (myChar) {
            case '0':
                System.out.println("My char is " + myChar + " and equal false");
                break;
            case '1':
                System.out.println("My char is " + myChar + " and equal true");
                break;
        }
    }
}
