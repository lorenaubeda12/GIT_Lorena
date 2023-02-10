package com.svalero.myapplication.Parte2;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.svalero.myapplication.R;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    ArrayList<PersonajeVo> listaPersonajes;
    RecyclerView recyclerPersonajes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        listaPersonajes = new ArrayList<>();
        recyclerPersonajes = (RecyclerView) findViewById(R.id.idRecycler);
        recyclerPersonajes.setLayoutManager(new LinearLayoutManager(this));
        llenarPersonajes();
        AdaptadorPersonajes adapter = new AdaptadorPersonajes(listaPersonajes);
        recyclerPersonajes.setAdapter(adapter);

    }

    private void llenarPersonajes() {
        listaPersonajes.add(new PersonajeVo("Krusty", "un personaje de la serie de dibujos animados Los Simpson.", R.drawable.krusti));
        listaPersonajes.add(new PersonajeVo("Homero", "un personaje de la serie de dibujos animados Los Simpson.", R.drawable.homero));
        listaPersonajes.add(new PersonajeVo("Marge", "un personaje de la serie de dibujos animados Los Simpson.", R.drawable.marge));
        listaPersonajes.add(new PersonajeVo("Bart", "un personaje de la serie de dibujos animados Los Simpson.", R.drawable.bart));
        listaPersonajes.add(new PersonajeVo("Lisa", "un personaje de la serie de dibujos animados Los Simpson..", R.drawable.lisa));
        listaPersonajes.add(new PersonajeVo("Magie", "un personaje de la serie de dibujos animados Los Simpson..", R.drawable.magie));
        listaPersonajes.add(new PersonajeVo("Flanders", "un personaje de la serie de dibujos animados Los Simpson.", R.drawable.flanders));
        listaPersonajes.add(new PersonajeVo("Milhouse", "un personaje de la serie de dibujos animados Los Simpson..", R.drawable.milhouse));
        listaPersonajes.add(new PersonajeVo("Mr. Burns", "un personaje de la serie de dibujos animados Los Simpson.", R.drawable.burns));

    }
}
