package com.company;

import com.company.Human.Hobby;
import com.company.Human.Job;

public class Main {

	public static void main(String[] args) {

		Human human = new Human("Karol", "Krzych", 30, 173, 83, Job.PROGRAMMER, Hobby.GAMING, AnimalType.MAMMAL);
		human.humanInfo();
	}
}
