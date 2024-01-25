package com.company;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Country {

    public String name;
    public List<City> cities = new ArrayList<>();

    public Country(File file) throws IOException {
        if (file.exists() && file.isFile()) {
            this.name = file.getName();

            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                cities.add(new City(scanner.nextLine()));
            }
        } else {
            throw new IOException("Problem with load file");
        }
    }

    public String getName() {
        return name;
    }

    public List<City> getCities() {
        return cities;
    }

    public Integer getPopulation() {
        int sum = 0;
        for (City c : cities) {
            sum += c.getPopulation();
        }
        return sum;
    }

    public Double getSurface() {
        double sum = 0;
        for (City c : cities) {
            sum += c.getSurface();
        }
        return sum;
    }

    public double getMaxCityDistance() {
        double max = 0;
        for (City source : cities) {
            for (City target : cities) {
                double dist = source.distance(target);
                max = max > dist ? max : dist;
            }

        }
        return max;
    }

    public void print() {
        System.out.println(cities);
    }

    @Override
    public String toString() {
        return this.name + " with cities " + cities;
    }
}
