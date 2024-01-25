package com.company;

public class Map {

    char[][] map = new char[10][10];

    public Map() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                map[i][j] = ' ';
            }
        }
    }

    public void print() {
        System.out.println("/----------\\");
        for (int i = 0; i < map.length; i++) {
            System.out.print('|');
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j]);
            }
            System.out.print('|');
            System.out.println();
        }
        System.out.println("\\__________/");
    }

    public void setShip(Ship s) throws ImpossiblePuttingException {
        try {
            if (s.getFieldsCount() > 0) {
                isFreeField(s, 0);
            }
            if (s.getFieldsCount() >= 3) {
                isFreeField(s, -1);
                isFreeField(s, 1);

            }
            if (s.getFieldsCount() >= 5) {
                isFreeField(s, 2);
                isFreeField(s, -2);

            }

            if (s.getFieldsCount() > 0) {
                setShipChar(s, 0);
            }
            if (s.getFieldsCount() >= 3) {
                setShipChar(s, 1);
                setShipChar(s, -1);

            }
            if (s.getFieldsCount() >= 5) {
                setShipChar(s, 2);
                setShipChar(s, -2);

            }
        } catch (IndexOutOfBoundsException e) {
            throw new ImpossiblePuttingException();
        }
    }

    private void setShipChar(Ship s, int i) throws ImpossiblePuttingException {
        if (Arrangement.HORIZONTAL.equals(s.getArrangement())) {
            if (map[s.getCoordinateX()][s.getCoordinateY() + i] != 'X' ) {
                map[s.getCoordinateX()][s.getCoordinateY() + i] = 'X';
            } else {
                throw new ImpossiblePuttingException();
            }
        } else if (Arrangement.VERTICAL.equals(s.getArrangement())) {
            if (map[s.getCoordinateX() + i][s.getCoordinateY()] != 'X' ) {
                map[s.getCoordinateX() + i][s.getCoordinateY()] = 'X';
            } else {
                throw new ImpossiblePuttingException();
            }
        }
    }
    private void isFreeField(Ship s, int i) throws ImpossiblePuttingException {
        if (Arrangement.HORIZONTAL.equals(s.getArrangement())) {
            if (!isFreeField(s.getCoordinateX(),s.getCoordinateY() + i)  ) {
                throw new ImpossiblePuttingException();
            }
        } else if (Arrangement.VERTICAL.equals(s.getArrangement())) {
            if (!isFreeField(s.getCoordinateX() + i,s.getCoordinateY())) {
               throw new ImpossiblePuttingException();
            }
        }
    }

    public boolean isFreeField(int x, int y) throws ImpossiblePuttingException {
        int freeFields = 0;
        try {
            if (map[x - 1][y - 1] != 'X') {
                freeFields += 1;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            freeFields += 1;
        }
        try {
            if (map[x + 1][y + 1] != 'X') {
                freeFields += 1;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            freeFields += 1;
        }
        try {
            if (map[x - 1][y] != 'X') {
                freeFields += 1;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            freeFields += 1;
        }
        try {
            if (map[x + 1][y] != 'X') {
                freeFields += 1;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            freeFields += 1;
        }
        try {
            if (map[x + 1][y - 1] != 'X') {
                freeFields += 1;

            }
        } catch (ArrayIndexOutOfBoundsException e) {
            freeFields += 1;
        }
        try {
            if (map[x - 1][y + 1] != 'X') {
                freeFields += 1;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            freeFields += 1;
        }
        try {
            if (map[x][y - 1] != 'X') {
                freeFields += 1;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            freeFields += 1;
        }
        try {
            if (map[x][y + 1] != 'X') {
                freeFields += 1;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            freeFields += 1;
        }
        return freeFields == 8;
    }
}