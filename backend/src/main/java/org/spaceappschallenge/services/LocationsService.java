package org.spaceappschallenge.services;

import org.spaceappschallenge.models.location.Locations;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class LocationsService {

    @Resource
    private NuclearPlantService nuclearPlantService;

    @Resource
    private RadioactiveParticleService radioactiveParticleService;

    public Locations locations() {
        return new Locations(nuclearPlantService.plant(),
                radioactiveParticleService.radioactiveParticles(),
                radioactiveParticleService.predictiveRadioactiveParticles());
    }
}
