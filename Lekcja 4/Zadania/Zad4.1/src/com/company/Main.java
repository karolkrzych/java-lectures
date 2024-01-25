package com.company;

public class Main {

    public static void main(String[] args) {

		int number = 123;
		int restOfDivision = number % 3;
		switch (restOfDivision) {
			case 0:
				System.out.println("Reszta z dzielenia wynosi 0");
				break;
			default:
				System.out.println("Reszta z dzielenia wynosi: " + restOfDivision);
				break;
		}
		
		if(number > 213) {
			System.out.println("Liczba jest większa niż 213");
		} else {
			System.out.println("Liczba jest mniejsza lub równa 213");
		}

		int result = number > 213 ? number / 2 : number * 2;
		System.out.println(result);


		

		/*Declare int variable with random value between 1 to 1000 and check:
	        - this value is divisible by 3 and print this information (use switch)
	        - this value is bigger or smaller than 213 and print this information (use if else)
	        - if value is smaller devide it by 2 if bigger multiple it by 2 and print new value (use operator ?)
	        - how many characters does it consist of result '?'
         */
    }


}
