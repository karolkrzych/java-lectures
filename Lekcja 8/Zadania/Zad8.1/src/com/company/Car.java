package com.company;

import java.util.Scanner;

public class Car {
    /*
     * Create class car with fields brand, model, engine, capacity, productionYear
     * add method to print information about your car
     * add static method to build some car getting information about and next print
     * information about created car.
     */

    String brand, model, engine;
    int capacity, productionYear;
    Scanner scanner;

    public Car(String brand, String model, String engine, int capacity, int productionYear) {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
        this.capacity = capacity;
        this.productionYear = productionYear;
    }

    public void print() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Model: " + this.model);
        System.out.println("Engine: " + this.engine);
        System.out.println("Capacity: " + this.capacity);
        System.out.println("Production Year: " + this.productionYear);
    }
}
