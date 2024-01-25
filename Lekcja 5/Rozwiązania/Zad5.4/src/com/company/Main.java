package com.company;

public class Main {

    public static void main(String[] args) {
        // Print to console chess board shape

        char whiteBox = '□';
        char blackBox = '■';

        char[][] chessBoard = new char[10][10];

        for (int i = 0; i < chessBoard.length; i=i+2) {
            for (int j = 0; j < chessBoard[i].length; j=j+2) {
                chessBoard[i][j] = blackBox;
            }
        }

        for (int i = 0; i < chessBoard.length; i=i+2) {
            for (int j = 1; j < chessBoard[i].length; j=j+2) {
                chessBoard[i][j] = whiteBox;
            }
        }

        for (int i = 1; i < chessBoard.length; i=i+2) {
            for (int j = 0; j < chessBoard[i].length; j=j+2) {
                chessBoard[i][j] = whiteBox;
            }
        }

        for (int i = 1; i < chessBoard.length; i=i+2) {
            for (int j = 1; j < chessBoard[i].length; j=j+2) {
                chessBoard[i][j] = blackBox;
            }
        }


        for (char[] rows : chessBoard) {
            for (char element : rows) {
                System.out.print(element);
            }

        }

    }
}
