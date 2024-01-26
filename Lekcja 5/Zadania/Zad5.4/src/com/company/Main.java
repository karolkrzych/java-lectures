package com.company;

public class Main {

    public static void main(String[] args) {
        // Print to console chess board shape
        int height = 8, width = 8;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if ((j + i) % 2 == 0) {
                    System.err.print('0');
                } else {
                    System.err.print('#');
                }
            }
            System.err.println();
        }
    }
}
