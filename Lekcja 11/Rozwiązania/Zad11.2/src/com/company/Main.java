package com.company;

import java.text.ParseException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/* Create class Event with fields title, description, date, author, place
	   Create class Schedule which should be contains table of Events
	    - user can create new event and add to own schedule
	    - user can create repeatable events and can pick period of it
	    - user can show all events after or before picked date
	    - user can edit created event and change all information of it
	 */

        Schedule schedule = new Schedule();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Pick option (create, create repeatable, show, show all, edit, exit)");
            String option = scanner.nextLine();

            try {
                switch (option) {
                    case "create":
                        schedule.addEvent(Event.build());
                        break;
                    case "create repeatable":
                        schedule.addEvents(Event.repeatableEvent());
                        break;
                    case "show":
                        schedule.print(schedule.findByDate());
                        break;
                    case "show all":
                        schedule.print();
                        break;
                    case "edit":
                        schedule.edit();
                        break;
                    case "exit":
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Wrong option, try again");
                }
            } catch (ParseException parseException) {
                System.out.println("Wrong date, try again.");
            }


        }
    }
}
