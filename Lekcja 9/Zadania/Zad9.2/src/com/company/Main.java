package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/* Battleship game first phase
        - create class Map with field two dimension table with chars.
        - create class Ship with fields name, represented co-ordinates middle of ship,information about arrangement (vertical, horizontal) and fieldsCount
        - create objects - 1 x aircraftCarrier(5 fields), 3 x cruisers(3 fields), 5 x destroyers(1 fields)
        - create new Exception ImpossiblePuttingException, WrongCoordinatesException and throw it when should be
        - users should give coordinates to put ship to map
        - if user set wrong coordinates catch exception, inform the user and try again.
        - if ship putting is impossible, inform user about it and try again

        Rules:
            - ship cant be put to not empty field.
            - ship cant be put if other ship is next to him

        After successfully filling map, print it.

    */

        Ship[] ships = new Ship[]{new Ship("AircraftCarrier", 5),
                new Ship("cruisers", 3),
                new Ship("cruisers", 3),
                new Ship("cruisers", 3),
                new Ship("Destroyers", 1),
                new Ship("Destroyers", 1),
                new Ship("Destroyers", 1),
                new Ship("Destroyers", 1),
                new Ship("Destroyers", 1),
        };
        int k;
        Map map = new Map();
        for (int i = 0; i < ships.length; i++) {
            Ship own = ships[i];
            //System.out.println("Choose arrangement");
            String w;
            //own.setArrangement(Arrangement.HORIZONTAL);
            try {
                Scanner c = new Scanner(System.in);
                k = c.nextInt();
                own.setCoordinateX(k);
                k = c.nextInt();
                own.setCoordinateY(k);
                if (own.getFieldsCount()!=1){
                    c = new Scanner(System.in);
                    w = c.next();
                    if ("h".equals(w)){
                        own.setArrangement(Arrangement.HORIZONTAL);
                    } else if ("v".equals(w)) {
                        own.setArrangement(Arrangement.VERTICAL);
                    } else {
                        System.out.println("choose again");
                    }
                }
                map.setShip(own);
            } catch (ImpossiblePuttingException e) {
                i=i-1;
            } catch (InputMismatchException e) {
                i=i-1;
            }
            map.print();
        }
//        Ship s = new Ship("Destroyers", 1);
//        s.setArrangement(Arrangement.HORIZONTAL);
//        s.setCoordinateX(0);
//        s.setCoordinateY(0);
//        Ship s1 = new Ship("Destroyers", 1);
//        s1.setArrangement(Arrangement.VERTICAL);
//        s1.setCoordinateX(1);
//        s1.setCoordinateY(2);
//        Ship s2 = new Ship("Destroyers", 3);
//        s2.setArrangement(Arrangement.VERTICAL);
//        s2.setCoordinateX(2);
//        s2.setCoordinateY(2);
//        try {
//            map.setShip(s);
//            map.setShip(s1);
//            map.setShip(s2);
//        } catch (ImpossiblePuttingException e) {
//            e.printStackTrace();
//        }
        //map.failed(1,2);
//        map.print();
    }
}
