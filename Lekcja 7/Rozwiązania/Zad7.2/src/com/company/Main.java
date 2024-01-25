package com.company;

import com.company.Human.Hobby;
import com.company.Human.Job;

public class Main {

    public static void main(String[] args) {
	/* Create outside class Human with fields name, surname, age, high, wight
	   Create inside public enums Job, Hobby and create fields for it in class Human
	   Create outside enum AnimalType and add special field in human
	   Add one methode to print on console all info about human
	   Add constructor to initialize example human
	   Use new class in Main class and use method for human to print all information
	 */

        Human human = new Human(new char[]{'A', 'R', 'T', 'U', 'R'},
                new char[]{'D', 'O', 'B', 'N', 'E', 'R'},
                (byte) 29,
                175.0f,
                90.0f,
                Job.DEV,
                Hobby.GAMES);

        human.print();
    }
}
