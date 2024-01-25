package com.company;

import java.util.Scanner;

public class Player {

    private String name;
    private char symbol;
    private boolean active = false;

    public Player(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public void reverseActive() {
        active = !active;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public char getSymbol() {
        return symbol;
    }

    public static Player build() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Set your name");
        String name = scanner.next();
        System.out.println("Set your symbol");
        String symbol = scanner.next();

        return new Player(name, symbol.charAt(0));
    }
}
