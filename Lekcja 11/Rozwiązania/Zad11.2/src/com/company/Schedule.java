package com.company;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Schedule {

    private Event[] events = new Event[0];

    private static DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");

    public void print() {
        this.print(events);
    }

    public void print(Event[] events) {
        for (Event e : events) {
            e.print();
        }
    }

    public void edit() throws ParseException {
        print();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick date event to edit");
        String pickedDate = scanner.nextLine();
        Date date = dateFormatter.parse(pickedDate);

        for (int i = 0; i < events.length; i++) {
            if (events[i].getDate().equals(date)) {
                events[i] = Event.build();
            }
        }
    }

    public void addEvent(Event event) {
        Event[] newEvents = new Event[events.length + 1];

        for (int i = 0; i < events.length; i++) {
            newEvents[i] = events[i];
        }

        newEvents[newEvents.length - 1] = event;
        events = newEvents;
    }

    public void addEvents(Event[] events) {
        for (Event event : events) {
            addEvent(event);
        }
    }

    public Event[] findByDate() throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Pick date:");
        String pickedDate = scanner.nextLine();
        System.out.print("before or after:");
        String beforeOrAfter = scanner.nextLine();

        boolean after = "after".equals(beforeOrAfter) ? true : false;

        return findBy(dateFormatter.parse(pickedDate), after);
    }

    private Event[] findBy(Date date, boolean after) {
        int resultCounter = 0;
        if (after) {
            for (Event e : events) {
                if (e.getDate().after(date)) {
                    resultCounter++;
                }
            }
        } else {
            for (Event e : events) {
                if (e.getDate().before(date)) {
                    resultCounter++;
                }
            }
        }

        Event[] eventsResult = new Event[resultCounter];
        if (after) {
            for (Event e : events) {
                if (e.getDate().after(date)) {
                    eventsResult[--resultCounter] = e;
                }
            }
        } else {
            for (Event e : events) {
                if (e.getDate().before(date)) {
                    eventsResult[--resultCounter] = e;
                }
            }
        }

        return eventsResult;
    }


}
