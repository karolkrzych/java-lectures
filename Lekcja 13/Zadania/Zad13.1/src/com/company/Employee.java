package com.company;

public abstract class Employee implements Working{

    protected String name;
    protected String surname;
    protected boolean healthy;
    protected double money;
    protected double salaryPerHour;

    public abstract void paySalary(double money);

    public void setHealthy(boolean healthy) {
        this.healthy = healthy;
    }

    public double getSalaryPerHour() {
        return salaryPerHour;
    }
}
