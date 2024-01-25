package com.company;

public class Secretary extends Employee implements Office {

    private int salaryCounted = 0;


    @Override
    public int work() {
        System.out.println("Do coffee");
        return 1;
    }

    @Override
    public double countSalaryForDoctor(WorkPlace<Doctor> workPlace) {
        return workPlace.getEmployee().getHealingCounter() * workPlace.getEmployee().getSalaryPerHour() * 0.1
                + workPlace.getSalary();
    }

    @Override
    public double countSalaryForSecretary(WorkPlace<Secretary> workPlace) {
        return workPlace.getEmployee().getSalaryCounted()*10+ workPlace.getSalary();
    }

    @Override
    public double countSalaryForRest(WorkPlace<Employee> workPlace) {
        return workPlace.getSalary();
    }

    @Override
    public void paySalary(double money) {
        this.money+=money;
    }

    public int getSalaryCounted() {
        return salaryCounted;
    }
}
