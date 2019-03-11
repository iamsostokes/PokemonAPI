package com.detroitlabs.pokemonapi.service;

import com.detroitlabs.pokemonapi.model.Nidorina;
import com.detroitlabs.pokemonapi.model.Pokemon;
import com.detroitlabs.pokemonapi.model.Volbeat;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;



@Component
public class PokemonService {

    public Pokemon fetchNidorino() {
        System.setProperty("http.agent", "nidorino");
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(
                "https://pokeapi.co/api/v2/" +
                        "pokemon/nidorino/", Pokemon.class);

    }

    public Nidorina fetchNidorina() {
        System.setProperty("http.agent", "nidorina");
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("https://pokeapi.co/api/v2/" +
                "pokemon/nidorina/", Nidorina.class);
    }

    public Volbeat fetchVolbeat() {
        System.setProperty("http.agent", "volbeat");
        RestTemplate restTemplate = new RestTemplate();
        return  restTemplate.getForObject( "https://pokeapi.co/api/v2/" +
                "pokemon/volbeat/", Volbeat.class);
    }
}


