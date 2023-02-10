package com.svalero.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.svalero.myapplication.Interfaz.JsonPlaceHolderApi;
import com.svalero.myapplication.Model.Posts;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewResult = findViewById(R.id.GsonTextView);
        getPosts();
    }

    private void getPosts() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://jsonplaceholder.typicode.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        JsonPlaceHolderApi jsonPlaceHolderApi = retrofit.create(JsonPlaceHolderApi.class);
        Call<List<Posts>> call = jsonPlaceHolderApi.getPosts();
        call.enqueue(new Callback<List<Posts>>() {
            @Override
            public void onResponse(Call<List<Posts>> call, Response<List<Posts>> response) {
                if (!response.isSuccessful()) {
                    textViewResult.setText("Codigo: " + response.code());
                    return;
                }
                List<Posts> postsList = response.body();
                for (Posts posts : postsList) {
                    String content = "";
                    content += "USERID: " + posts.getUserId() + "\n";
                    content += "ID: " + posts.getId() + "\n";
                    content += "TITLE: " + posts.getTitle() + "\n";
                    content += "BODY: " + posts.getBody() + "\n";
                    textViewResult.append(content);

                }
            }

            @Override
            public void onFailure(Call<List<Posts>> call, Throwable t) {
                textViewResult.setText(t.getMessage());
            }
        });
    }
}