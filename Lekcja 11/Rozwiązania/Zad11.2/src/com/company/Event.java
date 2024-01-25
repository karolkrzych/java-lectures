package com.company;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Event {

    private String title;
    private String description;
    private Date date;
    private String author;
    private String place;

    private static final DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");

    public Event(String title, String description, Date date, String author, String place) {
        this.title = title;
        this.description = description;
        this.date = date;
        this.author = author;
        this.place = place;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getAuthor() {
        return author;
    }

    public String getPlace() {
        return place;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void print() {
        System.out.println("Title: " + this.title +
                " Description: " + this.description +
                " Date: " + dateFormatter.format(date) +
                " Author: " + this.author +
                " Place: " + this.place);
    }

    public static Event build() throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Title: ");
        String title = scanner.nextLine();
        System.out.print("Description: ");
        String description = scanner.nextLine();
        System.out.print("Date: ");
        String dateString = scanner.nextLine();
        System.out.print("Author: ");
        String author = scanner.nextLine();
        System.out.print("Place: ");
        String place = scanner.nextLine();

        return new Event(title, description, dateFormatter.parse(dateString), author, place);
    }

    public static Event[] repeatableEvent()
            throws ParseException {
        Scanner scanner = new Scanner(System.in);
        int calendarType;
        System.out.println("What period changes event ? (day, month, year");
        String period = scanner.nextLine();
        switch (period) {
            case "day":
                calendarType = Calendar.DATE;
                break;
            case "month":
                calendarType = Calendar.MONTH;
                break;
            case "year":
                calendarType = Calendar.YEAR;
                break;
            default:
                System.out.println("Wrong answer, default period is month");
                calendarType = Calendar.MONTH;
        }

        System.out.println("How much events want you create ?");
        int amount = scanner.nextInt();

        Event event = build();
        Event[] events = new Event[amount + 1];
        events[0] = event;

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(event.getDate());

        for (int i = 1; i <= amount; i++) {
            calendar.add(calendarType, 1);

            Event newEvent = new Event(event.getTitle(),
                    event.getDescription(),
                    calendar.getTime(),
                    event.getAuthor(),
                    event.getPlace());
            events[i] = newEvent;
        }
        return events;
    }


}
