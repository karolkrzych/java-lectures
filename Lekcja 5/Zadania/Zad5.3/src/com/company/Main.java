package com.company;

public class Main {

	public static void main(String[] args) {
		int height = 10;
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print('*');
			}
			System.out.println('*');
		}

		/*
		 * Print to console rectangular triangle of hight 10 builded from stars
		 * Example :
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
		 * 
		 * 
		 */
	}
}
