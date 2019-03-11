package com.detroitlabs.pokemonapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties()
public class Volbeat extends Pokemon{

    private VolbeatSprite volbeatSprite = new VolbeatSprite();

    @JsonProperty("sprites")
    public VolbeatSprite getVolbeatSprite() {
        return volbeatSprite;
    }

    @JsonProperty("Sprites")
    public void setVolbeatSprite(VolbeatSprite volbeatSprite) {
        this.volbeatSprite = volbeatSprite;
    }
}
