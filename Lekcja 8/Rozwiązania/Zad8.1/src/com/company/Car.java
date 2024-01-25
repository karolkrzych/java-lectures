package com.company;

public class Car {

    private String brand;
    private String model;
    private String engine;
    private double capacity;
    private int productionYear;

    public Car(String brand, String model, String engine, double capacity, int productionYear) {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
        this.capacity = capacity;
        this.productionYear = productionYear;
    }

    public void print() {
        System.out.println("Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engine='" + engine + '\'' +
                ", capacity=" + capacity +
                ", productionYear=" + productionYear +
                '}');
    }
}
