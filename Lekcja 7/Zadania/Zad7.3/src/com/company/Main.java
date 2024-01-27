package com.company;

public class Main {

    public static void main(String[] args) {

        Warrior warrior1 = new Warrior("Adam", 10, 3, 3, 45);
        Warrior warrior2 = new Warrior("Artur", 11, 21, 5, 15);

        warrior1.fight(warrior2);
    }
}
