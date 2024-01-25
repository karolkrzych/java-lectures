package com.company;

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
        Map map = new Map();
        Ship s = new Ship("Destroyers", 1);
        s.setArrangement(Arrangement.HORIZONTAL);
        s.setCoordinateX(0);
        s.setCoordinateY(0);
        map.setShip(s);
        map.print();
    }
}
