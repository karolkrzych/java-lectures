package com.company;

public class Main {

    public static void main(String[] args) {
        // Initialize one-dimension table with your name and surname and print it char by char in one line and use all loop types
        
        // ONE DIMENSION
        char[] inits = { 'K', 'A', 'R', 'O', 'L', 'K', 'R', 'Z', 'Y', 'C', 'H' };
        for (int i = 0; i < inits.length; i++) {
            System.out.println(inits[i]);
        }

        for(char letter: inits) {
            System.out.println(letter);
        }

        int whileI = 0;
        while(whileI < inits.length) {
            System.out.println(inits[whileI]);
            whileI++;
        }

        int doI = 0;
        do {
            System.out.println(inits[doI]);
            doI++;
        } while (doI < inits.length);



        // TWO DIMENSIONAL

        char[][] twoDimensional = {
            {'K', 'A', 'R', 'O', 'L'},
            {'K', 'R', 'Z', 'Y', 'C', 'H'}
        };

        for( int i = 0; i < twoDimensional.length; i++ ) {
            for(int j = 0; j < twoDimensional[i].length; j++) {
                System.out.println(twoDimensional[i][j]);
            }
        }

        for( char[] forChar:twoDimensional ) {
            for(char letter: forChar) {
                System.err.println(letter);
            }
        }

        int nameSurnameI = 0;
        int lettersI = 0;
        while (nameSurnameI < twoDimensional.length) {
            while (lettersI < twoDimensional[nameSurnameI].length) {
                System.err.println(twoDimensional[nameSurnameI][lettersI]);
                lettersI++;
            }
            lettersI = 0;
            nameSurnameI++;
        }

        int nameSurnameDo = 0;
        int lettersDo = 0;
        do {
            do {
                System.err.println(twoDimensional[nameSurnameDo][lettersDo]);
                lettersDo++;
            } while (lettersDo < twoDimensional[nameSurnameDo].length);
            lettersDo = 0;
            nameSurnameDo++;
        } while(nameSurnameDo < twoDimensional.length);

    }
}
