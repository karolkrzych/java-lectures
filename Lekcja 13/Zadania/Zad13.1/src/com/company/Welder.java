package com.company;

public class Welder extends Employee {

    @Override
    public int work() {
        System.out.println("Welding");
        return 5;
    }

    @Override
    public void paySalary(double money) {

    }
}
