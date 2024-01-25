package com.company;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	/* File and directory synchronizator
	    - user can pick two different directory
	    - after choose all files from directory1 which not exist in directory2 should be copy to directory2
	    - after choose all files from directory2 which not exist in directory1 should be copy to directory1
	 */
        File directory1 = new File("directory1"/*scanner.next()*/);
        File directory2 = new File("directory2"/*scanner.next()*/);

        if (directory1.exists() && directory2.exists()) {
            Synchronizator d1Tod2 = new Synchronizator(directory1, directory2);
            Synchronizator d2Tod1 = new Synchronizator(directory2, directory1);

            d1Tod2.synchronize();
            d2Tod1.synchronize();
        }

    }


}
