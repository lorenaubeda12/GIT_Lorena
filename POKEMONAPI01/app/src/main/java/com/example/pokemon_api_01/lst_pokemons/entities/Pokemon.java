package com.example.pokemon_api_01.lst_pokemons.entities;

import com.google.gson.annotations.SerializedName;

public class Pokemon {

    @SerializedName("name")
    private String name;
    @SerializedName("url")
    private String url;

    @Override
    public String toString() {
        return "Pokemon{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
