package com.example.retrofit.networking;


import com.google.gson.annotations.SerializedName;

public class productResult {
    @SerializedName("id")
    int id;
    @SerializedName("title")
    String title;
    @SerializedName("description")
    String description;
    @SerializedName("image") //Estos son los nombres de los campos que se encuentran en la base de datos
    String productImage;
    @SerializedName("category")
    String category;
    @SerializedName("price")
    double price;

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getProductImage() {
        return productImage;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }
}
