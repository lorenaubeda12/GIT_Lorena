package com.example.retrofit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.retrofit.Adapter.RVRetrofitAdapter;
import com.example.retrofit.networking.RetrofitClient;
import com.example.retrofit.networking.productResult;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvProducts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvProducts = findViewById(R.id.rvProducts);

        getProducts();
    }


    public void getProducts(){
        Call<List<productResult>> apiCall = RetrofitClient.getInstance().getApis().getProducts();
        apiCall.enqueue(new Callback<List<productResult>>() {
            @Override
            public void onResponse(Call<List<productResult>> call, retrofit2.Response<List<productResult>> response) {
                if (response.isSuccessful()){
                    List<productResult> productsResults = response.body();
                    Toast.makeText(MainActivity.this, "Got Products", Toast.LENGTH_SHORT).show();
                    setAdapter(productsResults);
                }
            }

            @Override
            public void onFailure(Call<List<productResult>> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void setAdapter(List<productResult> productsResults) {
        rvProducts.setLayoutManager(new LinearLayoutManager(this));
        RVRetrofitAdapter rvRetrofitAdapter = new RVRetrofitAdapter(this, productsResults);
        rvProducts.setAdapter(rvRetrofitAdapter);
    }
}