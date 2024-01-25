package com.company;

public class City {

    private String name;
    private Double surface;
    private Integer population;
    private Double longitude;
    private Double altitude;

    public String getName() {
        return name;
    }

    public Double getSurface() {
        return surface;
    }

    public Integer getPopulation() {
        return population;
    }

    public Double getLongitude() {
        return longitude;
    }

    public Double getAltitude() {
        return altitude;
    }

    public double distance(City toCity) {

        // Haversine formula
        double dlon = Math.toRadians(toCity.getLongitude()) - Math.toRadians(this.longitude);
        double dlat = Math.toRadians(toCity.getAltitude()) - Math.toRadians(this.altitude);
        double a = Math.pow(Math.sin(dlat / 2), 2)
                + Math.cos(Math.toRadians(toCity.getAltitude())) * Math.cos(Math.toRadians(this.altitude))
                * Math.pow(Math.sin(dlon / 2),2);

        double c = 2 * Math.asin(Math.sqrt(a));

        // Radius of earth in kilometers. Use 3956
        // for miles
        double r = 6371;

        // calculate the result
        return(c * r);
    }

    public String saveRecord() {
        return this.name + ";" + this.surface + ";" + this.population + ";" + this.longitude + ";" + this.altitude;
    }

    public City(String loadRecord) {
        String[] splited = loadRecord.split(";");
        this.name = splited[0];
        this.surface = Double.parseDouble(splited[1]);
        this.population = Integer.parseInt(splited[2]);
        this.longitude = Double.parseDouble(splited[3]);
        this.altitude = Double.parseDouble(splited[4]);
    }
    @Override
    public String toString() {
        return this.name;
    }
}
