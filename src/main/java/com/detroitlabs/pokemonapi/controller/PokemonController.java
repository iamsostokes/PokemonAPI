package com.detroitlabs.pokemonapi.controller;

import com.detroitlabs.pokemonapi.model.*;
import com.detroitlabs.pokemonapi.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PokemonController {

    @Autowired
    PokemonService pokemonService;

    @RequestMapping("/")
    public String displayPokemon(ModelMap modelMap) {
        Pokemon pokemon = pokemonService.fetchNidorino();
        Nidorina pokemon1 = pokemonService.fetchNidorina();
        Volbeat volbeat = pokemonService.fetchVolbeat();

        NidorinoSprite nidorinoSprite = pokemon.getNidorinoSprite();
        NidorinaSprite nidorinaSprite = pokemon1.getNidorinaSprite();
        VolbeatSprite volbeatSprite = volbeat.getVolbeatSprite();

        modelMap.put("nidorinoSprite", nidorinoSprite);
        modelMap.put("name", pokemon.getName());
        modelMap.put("weight", pokemon.getWeight());
        modelMap.put("height", pokemon.getHeight());
        modelMap.put("type", pokemon.getNidorinoTypes());
        modelMap.put("experience", pokemon.getBase_experience());

        modelMap.put("name1", pokemon1.getName());
        modelMap.put("weight1", pokemon1.getWeight());
        modelMap.put("height1", pokemon1.getHeight());
        modelMap.put("experience1", pokemon1.getBase_experience());
        modelMap.put("nidorinaSprite", nidorinaSprite);

        modelMap.put("name2", volbeat.getName());
        modelMap.put("weight2", volbeat.getWeight());
        modelMap.put("height2", volbeat.getHeight());
        modelMap.put("experience2", volbeat.getBase_experience());
        modelMap.put("volbeatSprite", volbeatSprite);

        return "home";
    }
}
