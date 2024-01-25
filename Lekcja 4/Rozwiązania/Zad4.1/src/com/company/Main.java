package com.company;

public class Main {

    public static void main(String[] args) {
		/*Declare int variable with random value between 1 to 1000 and check:
	        - this value is divisible by 3 and print this information (use switch)
	        - this value is bigger or smaller than 213 and print this information (use if else)
	        - if value is smaller devide it by 2 if bigger multiple it by 2 and print new value (use operator ?)
	        - how many characters does it consist of result '?'
         */

        int randomInt = 545;
        int restFromDivisionBy3 = randomInt % 3;

        switch (restFromDivisionBy3) {
            case 0:
                System.out.println("randomInt=" + randomInt + " is divisible by 3 ");
                break;
            default:
                System.out.println("randomInt=" + randomInt + " is not divisible by 3");
                break;
        }

        if (randomInt > 213) {
            System.out.println("randomInt=" + randomInt + " is bigger than 213");
        } else {
            System.out.println("randomInt=" + randomInt + " is smaller than 213");
        }

        double resultOfOperation = randomInt > 213 ? randomInt * 2.0 : randomInt / 2.0;
        System.out.println("After operation randomInt=" + randomInt + " equale " + resultOfOperation);

        if (resultOfOperation < 10.0) {
            System.out.println("resultOfOperation=" + resultOfOperation + " have 1 char");
        } else if (resultOfOperation < 100.0) {
            System.out.println("resultOfOperation=" + resultOfOperation + " have 2 chars");
        } else if (resultOfOperation < 1000.0) {
            System.out.println("resultOfOperation=" + resultOfOperation + " have 3 chars");
        } else {
            System.out.println("resultOfOperation=" + resultOfOperation + " have 4 chars");
        }

    }
}
