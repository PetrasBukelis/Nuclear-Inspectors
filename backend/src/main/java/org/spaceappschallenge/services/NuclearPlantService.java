package org.spaceappschallenge.services;

import org.spaceappschallenge.models.location.NuclearPlant;
import org.spaceappschallenge.services.stubs.NuclearPlantStub;
import org.springframework.stereotype.Service;

@Service
public class NuclearPlantService {

    public NuclearPlant plant() {
        return NuclearPlantStub.astravo();
    }
}
