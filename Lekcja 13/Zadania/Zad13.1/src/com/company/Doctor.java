package com.company;

public class Doctor extends Employee implements Healing {

    private int healingCounter = 0;

    @Override
    public void heal(Employee employee) {
        employee.setHealthy(true);
    }

    @Override
    public int work() {
        System.out.println("Waiting for patient");
        return 1;
    }

    @Override
    public void paySalary(double money) {
        this.healingCounter = 0;
        this.money += money;
    }

    public int getHealingCounter() {
        return healingCounter;
    }
}
