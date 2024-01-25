package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/* Create class car with fields brand, model, engine, capacity, productionYear
        add method to print information about your car
        add static method to build some car getting information about and next print information about created car.
	 */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Brand: ");
        String brand = scanner.nextLine();
        System.out.println("Model: ");
        String model = scanner.nextLine();
        System.out.println("Engine: ");
        String engine = scanner.nextLine();
        System.out.println("Capacity: ");
        double capacity = scanner.nextDouble();
        System.out.println("Production year: ");
        int productionYear = scanner.nextInt();

        Car myCar = new Car(brand, model, engine, capacity, productionYear);

        myCar.print();

    }
}
