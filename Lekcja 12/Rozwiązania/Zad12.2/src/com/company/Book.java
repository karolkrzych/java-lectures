package com.company;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Book {

    private String title;
    private String author;
    private Date createDate;
    private Status status;
    private Date returnDate;

    private final static DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    public Book(String book) throws ParseException {
        String[] splited = book.split(";");
        this.title = splited[0];
        this.author = splited[1];
        this.createDate = dateFormat.parse(splited[2]);
        this.status = Status.valueOf(splited[3]);
        this.returnDate = "-".equals(splited[4]) ? null : dateFormat.parse(splited[4]);
    }

    public Book(String title, String author, Date createDate, Status status, Date returnDate) {
        this.title = title;
        this.author = author;
        this.createDate = createDate;
        this.status = status;
        this.returnDate = returnDate;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public Status getStatus() {
        return status;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public String saveString() {
        return this.title + ";" + this.author + ";" + dateFormat.format(this.createDate) + ";" + this.status + ";"
                + (this.returnDate == null ? "-" : dateFormat.format(this.returnDate));
    }

    public static Book build() throws ParseException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Title: ");
        String title = scanner.nextLine();
        System.out.print("Author: ");
        String author = scanner.nextLine();
        System.out.print("Create date: ");
        Date createDate = dateFormat.parse(scanner.nextLine());
        Status status = Status.FREE;
        Date returnDate = null;

        return new Book(title, author, createDate, status, returnDate);
    }

    public void reserve() {
        System.out.println(this.title + " " + this.author + " reserved");
        this.status = Status.RESERVED;
    }

    public void rent() {
        System.out.println(this.title + " " + this.author + " rent");
        this.status = Status.RENT;
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, 4 * 7);
        this.returnDate = calendar.getTime();
    }

    @Override
    public String toString() {
        return "Title: \t" + title +
                "\t Author: " + author +
                "\t Create date: \t " + dateFormat.format(createDate) +
                "\t Status: \t" + status +
                "\t Return date: \t" + (this.returnDate == null ? "-" : dateFormat.format(this.returnDate));
    }
}
