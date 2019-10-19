package org.spaceappschallenge.models;

import org.spaceappschallenge.models.location.Locations;

import java.util.List;

public class OutgoingMessage {

    private List<String> descriptions;
    private Locations locations;

    public OutgoingMessage() {
    }

    public OutgoingMessage(List<String> descriptions, Locations locations) {
        this.descriptions = descriptions;
        this.locations = locations;
    }

    public OutgoingMessage( Locations locations) {
        this.locations = locations;
    }

    public List<String> getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(List<String> descriptions) {
        this.descriptions = descriptions;
    }

    public Locations getLocations() {
        return locations;
    }

    public void setLocations(Locations locations) {
        this.locations = locations;
    }
}
