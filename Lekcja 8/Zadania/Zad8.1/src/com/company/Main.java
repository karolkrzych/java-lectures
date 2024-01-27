package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
         * Create class car with fields brand, model, engine, capacity, productionYear
         * add method to print information about your car
         * add static method to build some car getting information about and next print
         * information about created car.
         */

        Scanner scanner = new Scanner(System.in);

        Car car = new Car("AUDI", "A3", "DIESEL", 4, 2015);
        car.print();

        String brand = scanner.nextLine();
        System.out.println("Your car brand is: " + brand);
        String model = scanner.nextLine();
        System.out.println("Your car model is: " + model);
        String engine = scanner.nextLine();
        System.out.println("Your car engine is: " + engine);
        String capacity = scanner.nextLine();
        System.out.println("Your car capacity is: " + capacity);
        String productionYear = scanner.nextLine();
        System.out.println("Your car productionYear is: " + productionYear);

    }
}
