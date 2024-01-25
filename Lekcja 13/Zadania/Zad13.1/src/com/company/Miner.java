package com.company;

public class Miner extends Employee {

    @Override
    public int work() {
        System.out.println("Mining");
        return 8;
    }

    @Override
    public void paySalary(double money) {
        this.money += money;
    }
}
