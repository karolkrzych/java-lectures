package com.company;

import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, ParseException {
	/* Library
	    Create class Book with fields name, author, create date, status (enum RESERVED, RENTED, FREE), return date
	    Create class User with full_name, password, role (enum READER, LIBRARIAN)
	        - all user should log in to system
	        - reader can search books and reserve the book
	        - after that librarian should rent this book
	        - librarian can print all books which should be return
	        - librarian can add new books and remove old
	        - librarian can register new user and remove old
        Create class Library with list of all books and list od users
            - add method to find book by name
            - add method to find book by author
            - add method to print books by one char
            - add method to log in
            - users should be loaded from file
            - books should be loaded from file
            - books should be save always after change status
	 */
        Library library = null;
        try {
            library = new Library();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (ParseException parseException) {
            parseException.printStackTrace();
        }

        Scanner scanner = new Scanner(System.in);
        while (true) {

            if (library.isLogged()) {
                System.out.println(
                        "Pick option (" + library.optionsList() + ")");
                String option = scanner.nextLine();
                switch (option) {
                    case "create book":
                        library.createBook();
                        break;
                    case "create user":
                        library.createUser();
                        break;
                    case "remove book":
                        library.removeBook();
                        break;
                    case "remove user":
                        library.removeUser();
                        break;
                    case "show users":
                        library.printUsers();
                        break;
                    case "show books":
                        library.printAllBooks();
                        break;
                    case "show books by char":
                        library.printByChar();
                        break;
                    case "show books rented":
                        library.printRent();
                        break;
                    case "show books reserved":
                        library.printReserved();
                        break;
                    case "show books expired":
                        library.printExpired();
                        break;
                    case "reservation":
                        library.reservation();
                        break;
                    case "rent":
                        library.rent();
                        break;
                    case "logout":
                        library.logOut();
                        break;
                    case "exit":
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Wrong option, try again");
                }
            } else {
                System.out.println("Please log in.");
                library.logIn();
            }

        }
    }
}
