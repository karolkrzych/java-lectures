package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Library {

    private List<Book> books = new ArrayList<>();
    private List<Book> reservedBooks = new ArrayList<>();
    private List<Book> rentBooks = new ArrayList<>();
    private Map<String, List<Book>> booksIndex = new HashMap<>();
    private Map<String, Book> titleMapBook = new HashMap<>();
    private Map<String, Book> authorMapBook = new HashMap<>();

    private List<User> users = new ArrayList<>();

    private User loggedUser = null;

    public Library() throws FileNotFoundException, ParseException {
        File usersFile = new File("users.txt");
        File booksFile = new File("books.txt");

        if (usersFile.exists() && booksFile.exists()) {
            Scanner usersLoad = new Scanner(usersFile);
            Scanner booksLoad = new Scanner(booksFile);

            while (usersLoad.hasNext()) {
                users.add(new User(usersLoad.nextLine()));
            }

            while (booksLoad.hasNext()) {
                Book book = new Book(booksLoad.nextLine());
                if (Status.RENT.equals(book.getStatus())) {
                    rentBooks.add(book);
                } else if (Status.RESERVED.equals(book.getStatus())) {
                    reservedBooks.add(book);
                }

                books.add(book);
                titleMapBook.put(book.getTitle(), book);
                authorMapBook.put(book.getAuthor(), book);
                String firstChar = String.valueOf(book.getTitle().charAt(0));

                List<Book> booksListFromMap = booksIndex.get(firstChar);

                if (booksListFromMap == null) {
                    ArrayList<Book> newBooksList = new ArrayList<>();
                    newBooksList.add(book);
                    booksIndex.put(firstChar, newBooksList);
                } else {
                    booksListFromMap.add(book);
                }
            }
        }
    }

    public void logIn() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Login: ");
        String login = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();

        for (User u : users) {
            if (u.correctingLogIn(login, password)) {
                loggedUser = u;
                break;
            }
        }

        if (!this.isLogged()) {
            System.out.println("Wrong login or password.");
        }
    }

    public void logOut() {
        this.loggedUser = null;
    }

    public boolean isLogged() {
        return this.loggedUser != null;
    }

    private void saveUsers() throws FileNotFoundException {
        PrintWriter save = new PrintWriter(new File("users.txt"));

        for (User u : users) {
            save.println(u.saveString());
        }
        save.close();
    }

    private void saveBooks() throws FileNotFoundException {
        PrintWriter save = new PrintWriter(new File("books.txt"));

        for (Book b : books) {
            save.println(b.saveString());
        }
        save.close();
    }

    public void createUser() throws FileNotFoundException {
        if (Role.LIBRARIAN.equals(loggedUser.getRole())) {
            users.add(User.build());
            saveUsers();
        } else {
            System.out.println("Access denied");
        }
    }

    public void createBook() throws FileNotFoundException, ParseException {
        if (Role.LIBRARIAN.equals(loggedUser.getRole())) {
            books.add(Book.build());
            saveBooks();
        } else {
            System.out.println("Access denied");
        }
    }

    public void removeBook() throws FileNotFoundException {
        if (Role.LIBRARIAN.equals(loggedUser.getRole())) {
            Book book = pickBook();
            books.remove(book);
            booksIndex.get(String.valueOf(book.getTitle().charAt(0))).remove(book);
            titleMapBook.remove(book.getTitle());
            authorMapBook.remove(book.getAuthor());
            saveBooks();
        } else {
            System.out.println("Access denied");
        }
    }

    public void removeUser() throws FileNotFoundException {
        if (Role.LIBRARIAN.equals(loggedUser.getRole())) {
            User pickedUser = pickUser();
            if (pickedUser != null && !pickedUser.equals(loggedUser)) {
                users.remove(pickedUser);
            } else {
                System.out.println("User dont exist or is logged");
            }
            saveUsers();
        } else {
            System.out.println("Access denied");
        }
    }

    public void printAllBooks() {
        for (Book b : books) {
            System.out.println(b);
        }
    }

    public void printUsers() {
        if (Role.LIBRARIAN.equals(loggedUser.getRole())) {
            for (User u : users) {
                System.out.println(u);
            }
        } else {
            System.out.println("Access denied");
        }
    }

    public void printReserved() {
        if (Role.LIBRARIAN.equals(loggedUser.getRole())) {
            for (Book b : reservedBooks) {
                System.out.println(b);
            }
        } else {
            System.out.println("Access denied");
        }
    }

    public void printRent() {
        if (Role.LIBRARIAN.equals(loggedUser.getRole())) {
            for (Book b : rentBooks) {
                System.out.println(b);
            }
        } else {
            System.out.println("Access denied");
        }
    }

    public void printByChar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose char");
        List<Book> books = booksIndex.get(scanner.nextLine());

        for (Book b : books) {
            System.out.println(b);
        }
    }

    public void printExpired() {
        if (Role.LIBRARIAN.equals(loggedUser.getRole())) {
            for (Book b : rentBooks) {
                if (b.getReturnDate().after(new Date())) {
                    System.out.println(b);
                }
            }
        } else {
            System.out.println("Access denied");
        }
    }

    private Book findByTitle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose title");
        return titleMapBook.get(scanner.nextLine());
    }

    private Book findByAuthor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose author");
        return authorMapBook.get(scanner.nextLine());
    }

    private Book pickBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Want you find book by title or author");
        String option = scanner.nextLine();
        Book pickedBook;
        switch (option) {
            case "title":
                pickedBook = findByTitle();
                break;
            case "author":
                pickedBook = findByAuthor();
                break;
            default:
                System.out.println("Wrong option. Try again");
                pickedBook = null;
        }
        return pickedBook;
    }

    private User pickUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which user should be remove ?");
        String option = scanner.nextLine();
        User pickedUser = null;
        for (User u : users) {
            if (u.getLogin().equals(option)) {
                pickedUser = u;
            }
        }
        return pickedUser;
    }

    public void reservation() throws FileNotFoundException {
        if (Role.READER.equals(loggedUser.getRole())) {
            Book pickedBook = pickBook();

            if (pickedBook != null && Status.FREE.equals(pickedBook.getStatus())) {
                pickedBook.reserve();
                reservedBooks.add(pickedBook);
                saveBooks();
            } else {
                System.out.println("Book is not exist or is not free");
            }
        } else {
            System.out.println("Access denied");
        }
    }

    public void rent() throws FileNotFoundException {
        if (Role.LIBRARIAN.equals(loggedUser.getRole())) {
            Book pickedBook = pickBook();

            if (pickedBook != null && !Status.RENT.equals(pickedBook.getStatus())) {
                reservedBooks.remove(pickedBook);
                rentBooks.add(pickedBook);
                pickedBook.rent();
                saveBooks();
            } else {
                System.out.println("Book is not exist or is rented");
            }
        } else {
            System.out.println("Access denied");
        }
    }

    public String optionsList() {
        if (Role.LIBRARIAN.equals(loggedUser.getRole())) {
            return "create book, create user, remove book, remove user, show users, show books, show books by char, show books reserved, show books rented, show books expired, rent, logout, exit";
        } else if (Role.READER.equals(loggedUser.getRole())) {
            return "show all, show by char, reservation, logout, exit";
        } else {
            return "-";
        }
    }
}
