package com.company;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static Map<String, List<Country>> countriesIndexed = new HashMap<>();
    public static Map<String, Country> nameCountryMap = new HashMap<>();
    public static List<Country> countriesList = new ArrayList<>();
    public static List<City> cities = new ArrayList<>();

    public static void main(String[] args) throws IOException {
	/* Create class City with fields name, surface, population, longitude, altitude. Add method to calculate distance between cities
        Create class Country with fields name, list of Cities
            - add method find max distance between cities in country
            - add methods to calculate and surface, population all cities in country
        Countries and Cities should be load from files
        Create map contains all created countries
        User should show all exist countries and cities in country.
        User should show max distance between cities in country, population and surface in country
	 */

        File countries = new File("countries");

        if (countries.isDirectory()) {
            File[] files = countries.listFiles();
            for (File f : files) {

                Country country = new Country(f);
                cities.addAll(country.getCities());
                nameCountryMap.put(country.getName(), country);
                countriesList.add(country);

                String firstChar = String.valueOf(country.getName().charAt(0));

                List<Country> countryListFromMap = countriesIndexed.get(firstChar);

                if (countryListFromMap == null) {
                    ArrayList<Country> newCountriesList = new ArrayList<>();
                    newCountriesList.add(country);
                    countriesIndexed.put(firstChar, newCountriesList);
                } else {
                    countryListFromMap.add(country);
                }
            }
        }

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Pick option (countries, cities, countries by char, max distance, surface, population, exit)");
            String option = scanner.nextLine();
            String country;
            switch (option) {
                case "countries":
                    System.out.println(countriesList);
                    break;
                case "cities":
                    System.out.println(cities);
                    break;
                case "countries by char":
                    System.out.println("Choose char");
                    char ch = scanner.nextLine().charAt(0);
                    System.out.println(countriesIndexed.get(String.valueOf(ch)));
                    break;
                case "max distance":
                    System.out.println("Choose country");
                    country = scanner.nextLine();
                    System.out.println(
                            "Max distance between cities in " + country + " is " + nameCountryMap.get(country)
                                    .getMaxCityDistance());
                    break;
                case "population":
                    System.out.println("Choose country");
                    country = scanner.nextLine();
                    System.out
                            .println("Population of " + country + " is " + nameCountryMap.get(country).getPopulation());
                    break;
                case "surface":
                    System.out.println("Choose country");
                    country = scanner.nextLine();
                    System.out.println("Surface of " + country + " is " + nameCountryMap.get(country).getSurface());
                    break;
                case "exit":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong option, try again");
            }

        }


    }
}
