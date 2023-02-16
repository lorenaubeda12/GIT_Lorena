package com.example.pokemon_api_01.lst_pokemons.entities;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class PokemonRespuesta {
    @SerializedName("results")
    private ArrayList<Pokemon> results;

    public ArrayList<Pokemon> getResults() {
        return results;
    }

    public void setResults(ArrayList<Pokemon> results) {
        this.results = results;
    }
}
