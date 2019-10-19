package org.spaceappschallenge.models.location;

public class City extends Location {

    private int population;

    public City(double latitude, double longitude, int population) {
        super(latitude, longitude);
        this.population = population;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}
