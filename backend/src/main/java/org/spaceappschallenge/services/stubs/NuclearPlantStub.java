package org.spaceappschallenge.services.stubs;

import org.spaceappschallenge.models.location.NuclearPlant;

public class NuclearPlantStub {

    private static final double ASTRAVO_LATITUDE = 54.753401;
    private static final double ASTRAVO_LONGITUDE = 26.085759;

    public static NuclearPlant astravo() {
        return new NuclearPlant(ASTRAVO_LATITUDE, ASTRAVO_LONGITUDE);
    }
}
