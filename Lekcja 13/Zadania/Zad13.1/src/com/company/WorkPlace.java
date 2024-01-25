package com.company;

public class WorkPlace<T extends Employee> {

    private T employee;
    private int workingHours = 0;

    public WorkPlace(T employee) {
        this.employee = employee;
    }

    public void doResponsibilities() {
        this.workingHours += this.employee.work();
    }

    public double getSalary() {
        return this.workingHours * employee.getSalaryPerHour();
    }

    public T getEmployee() {
        return employee;
    }
}
