package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Initialize one-dimension table with random word and check this word is
        // palindrome

        String word = "kajak";
        char charArray[] = word.toCharArray();
        char reverse[] = new char[charArray.length];

        for (int i = charArray.length - 1; i >= 0; i--) {
            reverse[i] = charArray[charArray.length - i - 1];
        }

        if (Arrays.equals(charArray, reverse)) {
            System.err.println("Słowo jest palindromem");
        } else {
            System.err.println("Słowo nie jest palindromem");
        }
    }
}
