package com.company;

public class Main {

    public static void main(String[] args) {
        // Initialize one-dimension table with random word and check this word is palindrome

        char[] word = {'K', 'A', 'J', 'A', 'K'};

        int fromEndIndex;
        int fromBeginingIndex;

        boolean isPalindrome = true;
        for (int i = 0; i < word.length; i++) {
            fromEndIndex = word.length - 1 - i;
            fromBeginingIndex = i;
            if (word[fromBeginingIndex] != word[fromEndIndex]) {
                isPalindrome = false;
                break;
            } else if (fromBeginingIndex == fromEndIndex) {
                break;
            } else {
                isPalindrome &= word[fromBeginingIndex] == word[fromEndIndex];
            }
        }

        System.out.println("isPalindrome=" + isPalindrome);


    }
}
