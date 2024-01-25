package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Map {

    private char[][] map;

    private Player player1;
    private Player player2;

    public Map() {
        this.map = new char[3][3];
    }

    public Map(Player player1, Player player2) {
        this.player1 = player1;
        player1.setActive(true);
        this.player2 = player2;
        this.map = new char[][]{
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };
    }

    public void save() throws IOException {
        File savedGame = new File("game.txt");

        if (!savedGame.exists()) {
            savedGame.createNewFile();
        }

        PrintWriter save = new PrintWriter(savedGame);

        save.println(map[0]);
        save.println(map[1]);
        save.println(map[2]);

        save.println(player1.getName());
        save.println(player1.getSymbol());

        save.println(player2.getName());
        save.println(player2.getSymbol());

        save.println(getActivePlayer().getSymbol());

        save.close();
    }

    public void load() {
        File savedGame = new File("game.txt");
        Player loadedPlayer1;
        Player loadedPlayer2;

        try {
            Scanner load = new Scanner(savedGame);

            map[0] = load.nextLine().toCharArray();
            map[1] = load.nextLine().toCharArray();
            map[2] = load.nextLine().toCharArray();

            loadedPlayer1 = new Player(load.nextLine(), load.nextLine().charAt(0));
            loadedPlayer2 = new Player(load.nextLine(), load.nextLine().charAt(0));
            char activeSymbol = load.nextLine().charAt(0);

            if (loadedPlayer1.getSymbol() == activeSymbol) {
                loadedPlayer1.reverseActive();
            }
            if (loadedPlayer2.getSymbol() == activeSymbol) {
                loadedPlayer2.reverseActive();
            }

            player1 = loadedPlayer1;
            player2 = loadedPlayer2;

        } catch (FileNotFoundException e) {
            System.out.println("Can not load game");
        }
    }


    public void turn() {
        print();
        System.out.println(getActivePlayer().getName() + " your turn!");
        pickField();
        reverseActivePlayers();
    }

    public boolean isReadyToPlay() {
        return player1 != null && player2 != null;
    }

    private Player getActivePlayer() {
        return player1.isActive() ? player1 : player2;
    }

    private void reverseActivePlayers() {
        player1.reverseActive();
        player2.reverseActive();
    }


    private void pickField() {
        boolean badMove = false;
        do {

            Scanner scanner = new Scanner(System.in);
            char activeSymbol = getActivePlayer().getSymbol();
            System.out.println("Pick coordinates.");
            System.out.print("X: ");
            int x = scanner.nextInt();
            System.out.print("Y: ");
            int y = scanner.nextInt();
            try {
                if (map[x][y] == ' ') {
                    map[x][y] = activeSymbol;
                    badMove = false;
                } else {
                    throw new IOException();
                }
            } catch (IndexOutOfBoundsException | IOException e) {
                System.out.println("Move is impossible");
                badMove = true;
            }
        } while (badMove);
    }


    private void print() {
        System.out.println("--------");
        for (int i = 0; i < map.length; i++) {
            System.out.print("|");
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("--------");
    }
}
