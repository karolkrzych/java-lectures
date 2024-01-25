package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
		/* Tic-tac toe game
        - declare and initialize two dimension table 3x3
        - gamers could pick own character
        - gamers could pick coordinates to set own character
        - gamers could set only free fields
        - if one gamer write word "save", program could save to file current map
        - if one gamer write word "load", program could load last saved game
        - if one gamer write word "exit" program could be close
	 */

        Map map = new Map();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("What next ? (new, play, save, load, exit)");

            String command = scanner.next();

            switch (command) {
                case "new":
                    System.out.println("Player 1");
                    Player player1 = Player.build();
                    System.out.println("Player 2");
                    Player player2 = Player.build();
                    if (player1.getSymbol() == player2.getSymbol()) {
                        System.out.println("Can start game. Players have the same symbols");
                    } else {
                        map = new Map(player1, player2);
                    }
                    break;
                case "play":
                    if (map.isReadyToPlay()) {
                        map.turn();
                    } else {
                        System.out.println("Can not play. Please load or create new game");
                    }
                    break;
                case "save":
                    if (map.isReadyToPlay()) {
                        map.save();
                    } else {
                        System.out.println("Can not save. Please load or create new game");
                    }
                    break;
                case "load":
                    map.load();
                    break;
                case "exit":
                    System.exit(0);
                    break;
            }
        }
    }
}
