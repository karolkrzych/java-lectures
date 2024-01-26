package com.company;

public class Main {

    public static void main(String[] args) {
        // Declare and initialize table with random chars and count how many char
        // duplicates exist in this table and write information about it
        char[] word = { 'A', 'D', 'A', 'M', 'A', 'A', 'D' };

        for (int i = 0; i < word.length; i++) {
            int counter = 0;
            char currentLetter = word[i];

            for (int j = 0; j < word.length - i; j++) {
                if (currentLetter == word[j]) {
                    counter++;
                }
            }
            System.err.println(currentLetter + " " + counter);
        }

    }
}
