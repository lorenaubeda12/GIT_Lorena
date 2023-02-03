package com.svalero.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity6 extends AppCompatActivity {
    ListView listaDias;
    TextView textoListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.videos44al45);
        listaDias = (ListView) findViewById(R.id.listView1);

        textoListView = (TextView) findViewById(R.id.texto9);
       //Primero con array simple
       /*  ArrayAdapter<CharSequence> adaptador = ArrayAdapter.createFromResource(this, R.array.dias_array, android.R.layout.simple_list_item_1);
        listaDias.setAdapter(adaptador);
        listaDias.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Cargar datos en el listView
                Toast.makeText(parent.getContext(), "Selecciona: " + parent.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show();
            }
        });*/

        //Segundo con arrayList
        /*ArrayList<String> listaNombres = new ArrayList<String>();
        listaNombres.add("Lorena");
        listaNombres.add("Roberto");
        listaNombres.add("Nina");
        listaNombres.add("Tinker");
        listaNombres.add("Y'stola");
        listaNombres.add("Pandora");


        ArrayAdapter<CharSequence> adaptador2 = new ArrayAdapter(this,android.R.layout.simple_list_item_1,listaNombres);
        listaDias.setAdapter(adaptador2);
        listaDias.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Cargar datos en el listView
                Toast.makeText(parent.getContext(), "Selecciona: " + parent.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show();
            }
        });*/
        
        
        //Tercero simulacion db
        ArrayList<String> listadoNombres = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            listadoNombres.add("Nombre " + i);
        }
        ArrayAdapter<CharSequence> adaptador2 = new ArrayAdapter(this,android.R.layout.simple_list_item_1,listadoNombres);
        listaDias.setAdapter(adaptador2);
        listaDias.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Cargar datos en el listView
                Toast.makeText(parent.getContext(), "Selecciona: " + parent.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show();
                textoListView.setText("Selecciona: " + parent.getItemAtPosition(position).toString());
            }
        });

    }

    public void onClick(View view) {

    }
}