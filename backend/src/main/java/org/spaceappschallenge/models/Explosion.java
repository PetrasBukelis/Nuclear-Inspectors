package org.spaceappschallenge.models;

public class Explosion {

    private double radiationRadius;
    private double thermalRadiationRadius;

    public Explosion(double radiationRadius, double thermalRadiationRadius) {
        this.radiationRadius = radiationRadius;
        this.thermalRadiationRadius = thermalRadiationRadius;
    }

    public double getRadiationRadius() {
        return radiationRadius;
    }

    public void setRadiationRadius(double radiationRadius) {
        this.radiationRadius = radiationRadius;
    }

    public double getThermalRadiationRadius() {
        return thermalRadiationRadius;
    }

    public void setThermalRadiationRadius(double thermalRadiationRadius) {
        this.thermalRadiationRadius = thermalRadiationRadius;
    }
}
