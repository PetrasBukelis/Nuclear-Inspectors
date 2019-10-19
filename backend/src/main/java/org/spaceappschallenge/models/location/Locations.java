package org.spaceappschallenge.models.location;

import java.util.List;

public class Locations {

    private NuclearPlant nuclearPlant;
    private List<RadioactiveParticle> radioactiveParticles;
    private List<RadioactiveParticle> predictiveRadioactiveParticles;

    public Locations() {}

    public Locations(NuclearPlant nuclearPlant, List<RadioactiveParticle> radioactiveParticles, List<RadioactiveParticle> predictiveRadioactiveParticles) {
        this.nuclearPlant = nuclearPlant;
        this.radioactiveParticles = radioactiveParticles;
        this.predictiveRadioactiveParticles = predictiveRadioactiveParticles;
    }

    public NuclearPlant getNuclearPlant() {
        return nuclearPlant;
    }

    public void setNuclearPlant(NuclearPlant nuclearPlant) {
        this.nuclearPlant = nuclearPlant;
    }

    public List<RadioactiveParticle> getRadioactiveParticles() {
        return radioactiveParticles;
    }

    public void setRadioactiveParticles(List<RadioactiveParticle> radioactiveParticles) {
        this.radioactiveParticles = radioactiveParticles;
    }

    public List<RadioactiveParticle> getPredictiveRadioactiveParticles() {
        return predictiveRadioactiveParticles;
    }

    public void setPredictiveRadioactiveParticles(List<RadioactiveParticle> predictiveRadioactiveParticles) {
        this.predictiveRadioactiveParticles = predictiveRadioactiveParticles;
    }
}
