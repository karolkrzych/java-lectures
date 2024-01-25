package com.company;

public class Main {

    public static void main(String[] args) {
	/* Create class Warrior with fields name, attack, defence, speed, life
	    - add constructor to initialize objects
        - add methode fight which have one argument and return the winner from fight
            Algorithm for fight is :
            - always start attacking faster warrior
            - damage equal 2 * attack - defence
            - if speed first warrior is 2 times faster than second, first fighter can attack twice
            - fight goes on up to moment one fighter will have negative life points
       Initialize 5 fighters and check which is the strongest
	 */

        Warrior warrior1 = new Warrior(new char[]{'W', '1'}, 10, 5, 60, 1000);
        Warrior warrior2 = new Warrior(new char[]{'W', '2'}, 100, 5, 121, 100);

        System.out.print("Winner is ");
        warrior1.fight(warrior2).printName();
    }
}
