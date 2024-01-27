package com.company;

public class Warrior {
    /*
     * Create class Warrior with fields name, attack, defence, speed, life
     * - add constructor to initialize objects
     * - add methode fight which have one argument and return the winner from fight
     * Algorithm for fight is :
     * - always start attacking faster warrior
     * - damage equal 2 * attack - defence
     * - if speed first warrior is 2 times higher than second, first fighter can
     * attack twice
     * - fight goes on up to moment one fighter will have negative life points
     * Initialize 5 fighters and check which is the strongest
     */

    private String name;
    private int attack, defence, speed, life;

    public Warrior(String name, int attack, int defence, int speed, int life) {
        this.name = name;
        this.attack = attack;
        this.defence = defence;
        this.speed = speed;
        this.life = life;
    }

    public Warrior fight(Warrior opponent) {
        Warrior attacker, defender;

        attacker = speed > opponent.speed ? this : opponent;
        defender = speed < opponent.speed ? this : opponent;

        Warrior currentWarrior;

        do {
            attacker.dealDamage(defender.getDefence(), defender.getSpeed());

            System.out.println("Po ataku wojownika " + attacker.name + " przeciwnikowi zostało " + defender.getLife()
                    + " punktów życia!");

            currentWarrior = attacker;
            attacker = defender;
            defender = currentWarrior;

        } while (currentWarrior.isAlive());

        String whoWon = attacker.isAlive() ? attacker.name : defender.name;
        System.out.println("attacker " + attacker.getLife());
        System.out.println("defender " + defender.getLife());
        System.out.println("Zwyciężył " + whoWon);

        return attacker.isAlive() ? attacker : defender;
    }

    private void dealDamage(int opponentDef, int opponentSpd) {
        int damage;
        if (opponentDef > (2 * attack)) {
            damage = (opponentDef - (2 * attack)) * (speed > opponentSpd * 2 ? 2 : 1);
        } else {
            damage = ((2 * attack) - opponentDef) * (speed > opponentSpd * 2 ? 2 : 1);
        }
        System.out.println(damage);
        life -= damage;
    }

    private boolean isAlive() {
        return life > 0;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefence() {
        return defence;
    }

    public int getLife() {
        return life;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }
}
