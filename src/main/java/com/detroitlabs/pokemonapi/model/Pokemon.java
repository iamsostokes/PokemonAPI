package com.detroitlabs.pokemonapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Pokemon {

    private String name;
    private String weight;
    private String height;
    private String base_experience;
    private NidorinoSprite nidorinoSprite = new NidorinoSprite();
    private NidorinoTypes nidorinoTypes = new NidorinoTypes();



    @JsonProperty("sprites")
    public NidorinoSprite getNidorinoSprite() {
        return nidorinoSprite;
    }

    @JsonProperty("sprites")
    public void setNidorinoSprite(NidorinoSprite nidorinoSprite) {
        this.nidorinoSprite = nidorinoSprite;
    }

    @JsonProperty("type")
    public NidorinoTypes getNidorinoTypes() {
        return nidorinoTypes;
    }

    @JsonProperty("type")
    public void setNidorinoTypes(NidorinoTypes nidorinoTypes) {
        this.nidorinoTypes = nidorinoTypes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getBase_experience() {
        return base_experience;
    }

    public void setBase_experience(String base_experience) {
        this.base_experience = base_experience;
    }
}
