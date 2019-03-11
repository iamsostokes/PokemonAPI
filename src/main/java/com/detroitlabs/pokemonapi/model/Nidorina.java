package com.detroitlabs.pokemonapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties()
public class Nidorina extends Pokemon {


    private NidorinaSprite nidorinaSprite = new NidorinaSprite();

    @JsonProperty("sprites")
    public NidorinaSprite getNidorinaSprite() {
        return nidorinaSprite;
    }

    @JsonProperty("sprites")
    public void setNidorinaSprite(NidorinaSprite nidorinaSprite) {
        this.nidorinaSprite = nidorinaSprite;
    }


}
