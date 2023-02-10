package com.svalero.myapplication.Parte1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.svalero.myapplication.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> listDatos;
    RecyclerView recyclerDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerDatos = (RecyclerView) findViewById(R.id.reclycler1);
     /* recyclerDatos.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));*/
        recyclerDatos.setLayoutManager(new GridLayoutManager(this, 3));
       /* recyclerDatos.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));*/
        listDatos = new ArrayList<String>();
        for (int i = 0; i <= 50; i++) {
            listDatos.add("Datos #"+ i+" ");
        }
        AdapterDatos adapter = new AdapterDatos(listDatos);
        recyclerDatos.setAdapter(adapter);
    }
}