package com.company;

public class Main {

    public static void main(String[] args) {
	    /* Print to console rectangular triangle of hight 10 builded from stars
	    Example :

	    *
	    **
	    ***
	    ****
	    *****
	    ******
	    *******
	    ********
	    *********
	    **********

	     */
        int hight = 10;

        for (int i = 0; i < hight; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
