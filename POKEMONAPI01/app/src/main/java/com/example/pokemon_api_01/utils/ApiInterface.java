package com.example.pokemon_api_01.utils;

import com.example.pokemon_api_01.lst_pokemons.entities.Pokemon;
import com.example.pokemon_api_01.lst_pokemons.entities.PokemonRespuesta;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET("pokemon")
    Call<PokemonRespuesta> getPokemons(@Query("limit") int limit , @Query("offset") int offset);

//https://pokeapi.co/api/v2/pokemon?offset=0&limit=20
/*
    @GET("movie/{movie_id}")
    Call<Movie> getMovieDetails(@Path("movie_id") int movieId,
                @Query("api_key") String apiKey, @Query("append_to_response") String credits);
*/
}
