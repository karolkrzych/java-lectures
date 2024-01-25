package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        /*
        Download from user file name which should be open in program and write to console contents of it.
        Next content should be encrypt by Caesar Cipher with parameter downloaded from user and save to other file with prefix "_encrypted".
         */

        System.out.println("Get shift for Caesar Cipher");
        Scanner scanner = new Scanner(System.in);
        int shift = scanner.nextInt();
        System.out.println("Get source file name");
        File sourceFile = new File(scanner.next());
        File targetFile = new File(sourceFile.getName().replace(".txt", "_encrypted.txt"));

        if (sourceFile.exists()) {
            if (!targetFile.exists()) {
                try {
                    targetFile.createNewFile();
                } catch (IOException e) {
                    System.out.println("Can not create file " + targetFile.getName());
                    throw e;
                }
            }
            try {
                Scanner fileScanner = new Scanner(sourceFile);
                PrintWriter printWriter = new PrintWriter(targetFile);
                CaesarCipher cipher = new CaesarCipher(shift);
                while (fileScanner.hasNext()) {
                    String toEncrypt = fileScanner.next();
                    System.out.println(toEncrypt);
                    printWriter.println(cipher.encrypt(toEncrypt));
                }
                printWriter.close();
            } catch (FileNotFoundException e) {
                System.out.println("Can not open files." + e.getMessage());
            }
        }
    }
}
