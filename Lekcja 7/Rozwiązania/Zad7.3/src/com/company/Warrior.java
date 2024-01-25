package com.company;

public class Warrior {

    char[] name;
    private int attack;
    private int defence;
    private int speed;
    private int life;

    public Warrior(char[] name, int attack, int defence, int speed, int life) {
        this.name = name;
        this.attack = attack;
        this.defence = defence;
        this.speed = speed;
        this.life = life;
    }

    private boolean isAlive() {
        return life > 0;
    }

    private int getDamage(int enemyDefence, int enemySpeed) {
        return (2 * attack - enemyDefence) * (enemySpeed * 2 < this.speed ? 2 : 1);
    }

    private void blow(int damage) {
        if (damage > 0) {
            life -= damage;
        }
    }

    public Warrior fight(Warrior enemy) {

        Warrior aggressor;
        Warrior victim;
        if (this.speed > enemy.speed) {
            aggressor = this;
            victim = enemy;
        } else {
            aggressor = enemy;
            victim = this;
        }

        Warrior handleWarrior;

        do {
            victim.blow(aggressor.getDamage(victim.getDefence(), victim.getSpeed()));

            handleWarrior = victim;
            victim = aggressor;
            aggressor = handleWarrior;
        } while (handleWarrior.isAlive());

        return aggressor.isAlive() ? aggressor : victim;

    }

    public char[] getName() {
        return name;
    }

    public void printName(){
        for (char c:name) {
            System.out.print(c);
        }
    }

    public int getAttack() {
        return attack;
    }

    public int getDefence() {
        return defence;
    }

    public int getSpeed() {
        return speed;
    }

    public int getLife() {
        return life;
    }

}
