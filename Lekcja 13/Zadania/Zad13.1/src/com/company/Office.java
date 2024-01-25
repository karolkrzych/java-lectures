package com.company;

public interface Office {

    double countSalaryForDoctor(WorkPlace<Doctor> workPlace);

    double countSalaryForSecretary(WorkPlace<Secretary> workPlace);

    double countSalaryForRest(WorkPlace<Employee> workPlace);
}
