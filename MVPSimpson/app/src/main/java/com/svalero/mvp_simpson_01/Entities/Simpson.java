package com.svalero.mvp_simpson_01.Entities;

import com.google.gson.annotations.SerializedName;

public class Simpson {

    /*"quote": "I live in a single room above a bowling alley...and below another bowling alley.",
            "character": "Frank Grimes",
            "image": "https://cdn.glitch.com/3c3ffadc-3406-4440-bb95-d40ec8fcde72%2FFrankGrimes.png?1497567511887",
            "characterDirection": "Left"*/


    @SerializedName("quote")
    private String quote;
    @SerializedName("character")
    private String character;
    @SerializedName("image")
    private String image;
    @SerializedName("characterDirection")
    private String characterDirection;

}
